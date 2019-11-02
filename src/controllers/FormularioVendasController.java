package controllers;

import com.itextpdf.text.DocumentException;
import views.FormularioVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.BdSapataria;
import models.bean.Pessoas;
import models.bean.Sapatos;
import models.bean.Vendas;
import models.bean.Vendas_Sapatos;
import models.dao.PessoaDAO;
import models.dao.SapatosDAO;
import models.dao.VendasDAO;
import models.dao.Vendas_SapatosDAO;
import models.bean.GerarPDF;
import views.VisualizarVendas;

public class FormularioVendasController {
    //variaveis globais
    private FormularioVendas view;
    SapatosDAO sapatos;
    DefaultTableModel tabela;
    
    //variáveis para o pdf
    Pessoas pessoaPdf;
    
    
    public FormularioVendasController(FormularioVendas view){
        this.view = view;
        //listeners nos botoes das view
        this.view.jAdicionarCarrinho(new JAdicionarCarrinho());
        this.view.jCadastrarVenda(new JCadastrarVenda());
        this.view.jLimpar(new JLimpar());
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarQuantidadeSapato(new AlterarQuantidadeSapato());
        this.view.jApagarSapatoCarrinho(new ApagarSapatoCarrinho());
        this.view.jExibirSapatos(new ExibirSapatos());
        this.view.jPesquisarCPF(new PesquisarCPF());
        this.view.jPesquisarID(new PesquisarID());
        this.view.jPesquisaMarca(new PesquisarMarca());
        this.view.setVisible(true);
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        this.view.alterarData(formatador.format(data));
        tabela = view.retornarTabelaModel();
    }
    
    //Tratativas das listeners
    private class JLimpar implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            view.setRetornoBairro("");
            view.setRetornoEstado("");
            view.setRetornoGenero("");
            view.setRetornoNome("");
            view.setRetornoRua("");
            view.setRetornoTelefone("");
        }
        
    }
    private class JCadastrarVenda implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
                //pegando models de venda
                VendasDAO vendasModel = new VendasDAO();
                //informacoes de venda
                Vendas venda = new Vendas();
                venda.setIdPessoas(pessoaPdf.getIdPessoas());
                venda.setDataVenda(view.jftfData());
                venda.setFormaPagamento(view.jcbForma());
                venda.setTotal(Double.parseDouble(view.jftfPreco()));
                //cadastrando e retornando id gerado
                int idGerado = vendasModel.adicionarVenda(venda);
                //pegando models de vendas_sapatos
                Vendas_SapatosDAO vendasMulti = new Vendas_SapatosDAO();
                //informacoes de vendas_sapatos
                for(int i=0;i<tabela.getRowCount();i++){
                    Vendas_Sapatos vendasSapatos = new Vendas_Sapatos();
                    vendasSapatos.setIdVendas(idGerado);
                    vendasSapatos.setQtdPedidos(Integer.parseInt(tabela.getValueAt(i, 3).toString()));
                    vendasSapatos.setIdSapatos(Integer.parseInt(tabela.getValueAt(i, 0).toString()));
                    vendasMulti.cadastrarVendas(vendasSapatos);
                }
                
                //pdf 
                JFileChooser pdf = new JFileChooser();
                pdf.showSaveDialog(view);
                File local = pdf.getSelectedFile();
                GerarPDF gerar = new GerarPDF(
                pessoaPdf.getIdPessoas(),
                idGerado,
                pessoaPdf.getNome(),
                pessoaPdf.getCpf(),
                pessoaPdf.getBairro(),
                pessoaPdf.getRua(),
                venda.getDataVenda(),
                String.valueOf(venda.getTotal()),
                venda.getFormaPagamento(),
                retornarLista(0),
                retornarLista(1),
                retornarLista(2),
                retornarLista(3)
                );
                try {
                    gerar.gerarPDF(local);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FormularioVendasController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(FormularioVendasController.class.getName()).log(Level.SEVERE, null, ex);
                }
                //atualizar qtdEstoque
                //redirecionando
                new VisualizarVendasController(new VisualizarVendas());
                view.dispose();

        }
        
    }
    private class JVoltarMenu implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
           new BdSapatariaController(new BdSapataria());    
            view.dispose();
        }
        
    }
    private class JAdicionarCarrinho implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            ArrayList carrinhosItem = view.retornarClicado();
            view.adicionarLinhaCarrinho(tabela,carrinhosItem);
            infoCarrinho();
        }
        
    }
    private class AlterarQuantidadeSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            String num = JOptionPane.showInputDialog(null,"Quantos pares você deseja deste?");
            view.alterarLinhaCarrinho(tabela,num, view.retornarLinhaCarrinho(),3);
            //validar maior que a do estoque
            infoCarrinho();
        }
        
    }
    private class ApagarSapatoCarrinho implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            //JOptionPane.showConfirmDialog(null,"Certeza que deseja apagar este?");
            view.apagarLinhaCarrinho(tabela, view.retornarLinhaCarrinho());
            infoCarrinho();
        }
        
    }
    private class ExibirSapatos implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos");
            view.alterarModeloTabela(retornarLinhas(listaTodos), retornarColunas());
        }
        
    }
    private class PesquisarCPF implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
                PessoaDAO pessoaModel = new PessoaDAO();
                Vector<Pessoas> pessoa = pessoaModel.pesquisarPessoas("select * from pessoas where cpf='"+view.getCpfCliente()+"'");
                for(Pessoas obj : pessoa){
                    view.setRetornoBairro(obj.getBairro());
                    view.setRetornoEstado(obj.getEstado());
                    view.setRetornoGenero(obj.getGenero());
                    view.setRetornoNome(obj.getNome());
                    view.setRetornoRua(obj.getRua());
                    view.setRetornoTelefone(obj.getTelefone());
                    pessoaPdf = obj;
                }
        }   
    }
    private class PesquisarID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos where idSapatos="+view.jtfSapato());
            view.alterarModeloTabela(retornarLinhas(listaTodos), retornarColunas());
        }
        
    }
    private class PesquisarMarca implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos where marca like '%"+view.jtfMarcaTipo()+"%' or tipoSapato like '%"+view.jtfMarcaTipo()+"%'");
            view.alterarModeloTabela(retornarLinhas(listaTodos), retornarColunas());
        }  
    }
    private Vector retornarLinhas(Vector objetos){
        Vector<Sapatos> todosResultados = objetos;
        Vector linhas = new Vector();
        for(Sapatos sapatos : todosResultados){
            Vector linha = new Vector();
            linha.add(sapatos.getIdSapatos());
            linha.add(sapatos.getTamanho());
            linha.add(sapatos.getMarca());  
            linha.add(sapatos.getTipoSapato());
            linha.add(sapatos.getGeneroSapato());
            linha.add(sapatos.getQtdEstoque());
            linha.add(sapatos.getValor());
            linhas.add(linha);
        }  
        return linhas;
    }
    private Vector retornarColunas(){
        Vector colunas = new Vector();
            colunas.add("IDSapatos");
            colunas.add("Tamanho");
            colunas.add("Marca");
            colunas.add("Tipo do Sapato");
            colunas.add("Genero Sapato");
            colunas.add("Quantidade estoque");
            colunas.add("Valor");
        return colunas;
    }
    private String totalSapatos(){
       tabela = view.retornarTabelaModel();
       int total = 0;
       for(int i=0;i<tabela.getRowCount();i++){
           total += Integer.parseInt(String.valueOf(tabela.getValueAt(i, 3)));
       }
       return String.valueOf(total);
    }
    
    private String precoSapatos(){
        tabela = view.retornarTabelaModel();
       double preco, linhas, som;
       som = 0;
       for(int i=0;i<tabela.getRowCount();i++){
            preco = Double.parseDouble(tabela.getValueAt(i,3).toString());
            linhas = Double.parseDouble(tabela.getValueAt(i,2).toString());
            som += linhas*preco;   
        }
       return String.valueOf(som);
    }
    private void infoCarrinho(){
        view.setTotalPreco(precoSapatos());
        view.setTotalQuantidade(totalSapatos());
    }
    private ArrayList retornarLista(int coluna){
        ArrayList lista = new ArrayList();
        for(int i=0;i<tabela.getRowCount();i++){
            lista.add(tabela.getValueAt(i,coluna));
        }
        return lista;
    }
    
    
}

