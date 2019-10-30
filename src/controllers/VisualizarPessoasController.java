package controllers;

import views.VisualizarPessoas;
import views.BdSapataria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarPessoas;

import models.dao.PessoaDAO;
import models.bean.Pessoas;


import java.util.Vector;



public class VisualizarPessoasController {
    private VisualizarPessoas view;
    PessoaDAO pessoa;
    
    public VisualizarPessoasController(VisualizarPessoas view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarDados(new JAlterarDados());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jPorCPF(new ProcurarPorCPF());
        this.view.jPorNome(new ProcurarCliente());
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
            new AtualizarPessoasController(new AtualizarPessoas());
        } 
    }
    private class JExibirTodos implements ActionListener{
        public void actionPerformed(ActionEvent ae) { 
            pessoa = new PessoaDAO();
            Vector listaTodos = pessoa.pesquisarPessoas("Select * from pessoas");
            view.alterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(pessoa.pesquisarPessoasTotal("Select count(*) from pessoas"));
        } 
    }
    private class ProcurarPorID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            pessoa = new PessoaDAO();
            Vector listaTodos = pessoa.pesquisarPessoas("Select * from pessoas where idPessoas="+view.getIdPessoa());
            view.alterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(pessoa.pesquisarPessoasTotal("select count(*) from pessoas where idPessoas="+view.getIdPessoa()));
        } 
    }
    private class ProcurarPorCPF implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            pessoa = new PessoaDAO();
            Vector listaTodos = pessoa.pesquisarPessoas("Select * from pessoas where cpf='"+view.getCpf()+"'");
            view.alterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(pessoa.pesquisarPessoasTotal("select count(*) from pessoas where cpf='"+view.getCpf()+"'"));
        } 
    }
    private class ProcurarCliente implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            pessoa = new PessoaDAO();
            Vector listaTodos = pessoa.pesquisarPessoas("Select * from pessoas where nome like '%"+view.getNomeCliente()+"%' or bairro='"+view.getNomeCliente()+"'");
            view.alterarTabela(retornarLinhas(listaTodos), retornarColunas());
            view.setQuantidadeTotal(pessoa.pesquisarPessoasTotal("select count(*) from pessoas where nome like '%"+view.getNomeCliente()+"%' or bairro='"+view.getNomeCliente()+"'"));
        } 
    }
    
    public Vector retornarLinhas(Vector objetos){
        Vector<Pessoas> todosResultados = objetos;
        Vector linhas = new Vector();
        for(Pessoas pessoa : todosResultados){
            Vector linha = new Vector();
            linha.add(pessoa.getIdPessoas());
            linha.add(pessoa.getNome());
            linha.add(pessoa.getCpf());
            linha.add(pessoa.getEstado());
            linha.add(pessoa.getBairro());
            linha.add(pessoa.getTelefone());
            linha.add(pessoa.getGenero());
            linhas.add(linha);
        }  
        return linhas;
    }
    public Vector retornarColunas(){
        Vector colunas = new Vector();
            colunas.add("IDCliente");
            colunas.add("nome");
            colunas.add("cpf");
            colunas.add("estado");
            colunas.add("bairro");
            colunas.add("telefone");
            colunas.add("genero");
        return colunas;
    }
    
}
