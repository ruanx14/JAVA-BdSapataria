package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarPessoas;
import models.bean.Pessoas;
import models.dao.PessoaDAO;
import views.VisualizarPessoas;

public class AtualizarPessoasController {
    private AtualizarPessoas view;
    private int idPessoas;
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
        idPessoas = pessoa.getIdPessoas();
        this.view.setVisible(true);
    }
    private class AtualizarPessoa implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            Pessoas pessoa = new Pessoas();
            pessoa.setIdPessoas(idPessoas);
            pessoa.setNome(view.getJtfNome());
            pessoa.setCpf(view.getCpf());
            pessoa.setRua(view.getJtfRua());
            pessoa.setBairro(view.getJtfBairro());
            pessoa.setEstado(view.getEstado());
            pessoa.setGenero(view.getGenero());
            pessoa.setTelefone(view.getTelefone());
            PessoaDAO pessoaModel = new PessoaDAO();
            //validacoes
            pessoaModel.atualizarPessoa(pessoa);
            view.dispose();
        }
        
    }
}
