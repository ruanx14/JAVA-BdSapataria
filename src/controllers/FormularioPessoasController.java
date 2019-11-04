package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.BdSapataria;
import views.FormularioPessoas;
import models.bean.Pessoas;
import models.dao.PessoaDAO;


public class FormularioPessoasController {
    
    private FormularioPessoas telaView;
    
    public FormularioPessoasController(FormularioPessoas telaView){
        this.telaView = telaView;
        this.telaView.jCadastrarPessoa(new JCadastrarPessoa());
        this.telaView.jLimpar(new JLimpar());
        this.telaView.jVoltarMenu(new JVoltarMenu());
        this.telaView.setVisible(true);
    }
    
    private class JCadastrarPessoa implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
              Pessoas pessoa = new Pessoas();
              pessoa.setNome(telaView.getJtfNome());
              pessoa.setCpf(telaView.getCpf());
              pessoa.setBairro(telaView.getJtfBairro());
              pessoa.setEstado(telaView.getEstado());
              pessoa.setGenero(telaView.getGenero());
              pessoa.setTelefone(telaView.getTelefone());
              pessoa.setRua(telaView.getJtfRua());
              if(pessoa.getBairro().isEmpty() || pessoa.getRua().isEmpty() || pessoa.getNome().isEmpty()){
              //if(pessoa.getRua()instanceof String)
              //validation for CPF missing
                    JOptionPane.showMessageDialog(null,"Há campos vazios, trate de os preencher!");
              }else{
                   PessoaDAO pessoadao = new PessoaDAO();
                   pessoadao.adicionarPessoa(pessoa); 
              }
        }
    }
    private class JLimpar implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
           telaView.setJtfBairro("");
           telaView.setJtfNome("");
           telaView.setJtfRua("");
           telaView.setJtfCpf("");
           telaView.setJtfTelefone("");
        }   
    }
    private class JVoltarMenu implements ActionListener{
       public void actionPerformed(ActionEvent ae) {
            new BdSapatariaController(new BdSapataria());    
            telaView.dispose();
       } 
    }
}
