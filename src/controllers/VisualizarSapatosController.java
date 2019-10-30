package controllers;

import views.VisualizarSapatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import views.BdSapataria;
import views.AtualizarSapatos;

import models.bean.Sapatos;
import models.dao.SapatosDAO;

public class VisualizarSapatosController {
    private VisualizarSapatos view;
    SapatosDAO sapatos;
    public VisualizarSapatosController(VisualizarSapatos view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarDados(new JAlterarDados());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jPorNome(new ProcurarSapato());
        this.view.setVisible(true);
    }
    
    private class JVoltarMenu implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new BdSapatariaController(new BdSapataria());    
            view.dispose();
        } 
    }
    private class JAlterarDados implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new AtualizarSapatosController(new AtualizarSapatos());
        } 
    }
    private class JExibirTodos implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(sapatos.pesquisarSapatosTotal("select count(*) from sapatos"));
        } 
    }
    private class ProcurarPorID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos where idSapatos="+view.getIdSapato());
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(sapatos.pesquisarSapatosTotal("select count(*) from sapatos where idSapatos="+view.getIdSapato()));
        } 
    }
    private class ProcurarSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            sapatos = new SapatosDAO();
            Vector listaTodos = sapatos.pesquisarSapatos("select * from sapatos where marca like '"+view.getMarcaTipo()+"'"+"or tipoSapato like '"+view.getMarcaTipo()+"'");
            view.setAlterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(sapatos.pesquisarSapatosTotal("select count(*) from sapatos where marca like '"+view.getMarcaTipo()+"'"+"or tipoSapato like '"+view.getMarcaTipo()+"'"));
        } 
    }
    public Vector retornarLinhas(Vector objetos){
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
    public Vector retornarColunas(){
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
}
