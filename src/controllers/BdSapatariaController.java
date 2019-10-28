package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controllers.*;
import views.*;

public class BdSapatariaController {
    private BdSapataria view;
    public BdSapatariaController(BdSapataria view){
        this.view = view;
        this.view.telaCadastrarPessoa(new TelaCadastraPessoa());
        this.view.telaCadastrarSapatos(new TelaCadastraSapato());
        this.view.telaCadastrarVendas(new TelaCadastraVenda());
        
        this.view.telaVisualizarPessoas(new TelaVisualizarPessoas());
        this.view.telaVisualizarSapatos(new TelaVisualizarSapatos());
        this.view.telaVisualizarVendas(new TelaVisualizarVendas());
        this.view.setVisible(true);
    }
    
    private class TelaCadastraPessoa implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            new FormularioPessoasController(new FormularioPessoas());
            view.dispose();
        }
    
    }
     private class TelaCadastraSapato implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            new FormularioSapatosController(new FormularioSapatos());
            view.dispose();
        }
    
    }
      private class TelaCadastraVenda implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new FormularioVendasController(new FormularioVendas());
            view.dispose();
        }
    
    }
      
      private class TelaVisualizarPessoas implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            new VisualizarPessoasController(new VisualizarPessoas());
            view.dispose();
        }
    
    }
     private class TelaVisualizarSapatos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            new VisualizarSapatosController(new VisualizarSapatos());
            view.dispose();
        }
    
    }
      private class TelaVisualizarVendas implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new VisualizarVendasController(new VisualizarVendas());
            view.dispose();
        }
    
    }
}
