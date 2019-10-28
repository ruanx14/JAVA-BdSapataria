package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarSapatos;

public class AtualizarSapatosController {
    private AtualizarSapatos view;
    
    public AtualizarSapatosController(AtualizarSapatos tela){
        view = tela;
        view.atualizarSapato(new AtualizarSapato());
        //
        view.setVisible(true);
    }
    private class AtualizarSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
}
