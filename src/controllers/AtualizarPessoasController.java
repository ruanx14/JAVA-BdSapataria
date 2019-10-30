package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarPessoas;
import models.bean.Pessoas;
import views.VisualizarPessoas;

public class AtualizarPessoasController {
    private AtualizarPessoas view;
    
    public AtualizarPessoasController(AtualizarPessoas view, Pessoas pessoa){
        //controller recebendo a view
        this.view = view;
        //método do listener
        this.view.atualizarPessoa(new AtualizarPessoa());     
        //campos alterados
        this.view.setJtfNome(pessoa.getNome());
        this.view.setJcbEstado(pessoa.getEstado());
        this.view.setJcbGenero(pessoa.getGenero());
        this.view.setJtfCpf(pessoa.getCpf());
        this.view.setJtfRua(pessoa.getRua());
        this.view.setJtfTelefone(pessoa.getTelefone());   
        this.view.setJtfBairro(pessoa.getBairro());
        this.view.setVisible(true);
    }
    private class AtualizarPessoa implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
}
