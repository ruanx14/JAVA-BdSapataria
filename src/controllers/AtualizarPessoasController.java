package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarPessoas;

public class AtualizarPessoasController {
    private AtualizarPessoas view;
    public AtualizarPessoasController(AtualizarPessoas view){
        this.view = view;
        this.view.atualizarPessoa(new AtualizarPessoa());
        //
        this.view.setVisible(true);
    }
    private class AtualizarPessoa implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
}
