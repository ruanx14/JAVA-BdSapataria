package controllers;
import views.VisualizarVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import views.BdSapataria;
import models.dao.VendasDAO;

public class VisualizarVendasController {
    private VisualizarVendas view;
    VendasDAO vendaModel;
    public VisualizarVendasController(VisualizarVendas view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jDataVenda(new ProcurarPorData());
        this.view.jPorNome(new ProcurarCliente());
        this.view.setVisible(true);
    }
    private class JVoltarMenu implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new BdSapatariaController(new BdSapataria());    
            view.dispose();
        } 
    }
    private class JExibirTodos implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            vendaModel = new VendasDAO();
            ArrayList listaTodos = vendaModel.pesquisarVendas("select p.idpessoas,v.idvendas, v.dataVenda, p.nome, p.CPF, s.tipoSapato, vs.qtdPedidos from vendas v join vendas_sapatos vs on v.idvendas=vs.idvendas join pessoas p on p.idpessoas=v.Pessoas_idPessoas join sapatos s on vs.idsapatos = s.idsapatos group by v.idvendas order by v.idvendas desc");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
        } 
    }
    private class ProcurarPorID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            vendaModel = new VendasDAO();
            ArrayList listaTodos = vendaModel.pesquisarVendas("select p.idpessoas,v.idvendas, v.dataVenda, p.nome, p.CPF, s.tipoSapato, vs.qtdPedidos from vendas v join vendas_sapatos vs on v.idvendas=vs.idvendas join pessoas p on p.idpessoas=v.Pessoas_idPessoas join sapatos s on vs.idsapatos = s.idsapatos where v.idvendas="+view.getIdVenda()+" order by v.idvendas desc");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
        } 
    }
    private class ProcurarPorData implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            vendaModel = new VendasDAO();
            ArrayList listaTodos = vendaModel.pesquisarVendas("select p.idpessoas,v.idvendas, v.dataVenda, p.nome, p.CPF, s.tipoSapato, vs.qtdPedidos from vendas v join vendas_sapatos vs on v.idvendas=vs.idvendas join pessoas p on p.idpessoas=v.Pessoas_idPessoas join sapatos s on vs.idsapatos = s.idsapatos where v.dataVenda='"+view.getDataVenda()+"' order by v.idvendas desc");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
        } 
    }
    private class ProcurarCliente implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            vendaModel = new VendasDAO();
            ArrayList listaTodos = vendaModel.pesquisarVendas("select p.idpessoas,v.idvendas, v.dataVenda, p.nome, p.CPF, s.tipoSapato, vs.qtdPedidos from vendas v join vendas_sapatos vs on v.idvendas=vs.idvendas join pessoas p on p.idpessoas=v.Pessoas_idPessoas join sapatos s on vs.idsapatos = s.idsapatos where p.nome like '%"+view.getNomeTipo()+"%' or s.tipoSapato like '%"+view.getNomeTipo()+"%' group by v.idvendas order by v.idvendas desc");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
        } 
    }
    public Vector retornarLinhas(ArrayList<ArrayList<String>> objetos){
        Vector linhas = new Vector();
        Vector linha = null;
        for(int i=0;i<objetos.size();i++){
             for(int j=0;j<objetos.get(i).size();j++){
                 linha = new Vector();
                 linha.add(objetos.get(i).get(0));
                 linha.add(objetos.get(i).get(1));
                 linha.add(objetos.get(i).get(2));
                 linha.add(objetos.get(i).get(3));
                 linha.add(objetos.get(i).get(4));
                 linha.add(objetos.get(i).get(5));
                 linha.add(objetos.get(i).get(6));
             }
             linhas.add(linha);
        }
       return linhas;
    }
    
    public Vector retornarColunas(){
        Vector colunas = new Vector();
            colunas.add("IDCliente");
            colunas.add("IDVendas");
            colunas.add("Nome Cliente");
            colunas.add("CPF Cliente");
            colunas.add("Tipo Sapato");
            colunas.add("Data da Venda");
            colunas.add("Quantidade de Pedido por Sapato");
        return colunas;
    }
}
