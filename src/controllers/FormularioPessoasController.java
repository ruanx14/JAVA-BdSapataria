package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controllers.BdSapatariaController;
import views.BdSapataria;
import views.FormularioPessoas;


public class FormularioPessoasController {
    
    private FormularioPessoas telaView;
    
    public FormularioPessoasController(FormularioPessoas telaView){
        this.telaView = telaView;
        this.telaView.jCadastrarPessoa(new JCadastrarPessoa());
        this.telaView.jLimpar(new JLimpar());
        this.telaView.jVoltarMenu(new JVoltarMenu());
        //
        this.telaView.setVisible(true);
    }
    
    private class JCadastrarPessoa implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
              //chamar model para cadastrar. 
        }
    }
    private class JLimpar implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
           telaView.setJtfBairro("");
           telaView.setJtfNome("");
           telaView.setJtfRua("");
           //Cpf
           //Telefone}
        }   
    }
    private class JVoltarMenu implements ActionListener{
       public void actionPerformed(ActionEvent ae) {
            new BdSapatariaController(new BdSapataria());    
            telaView.dispose();
       } 
    }
}
