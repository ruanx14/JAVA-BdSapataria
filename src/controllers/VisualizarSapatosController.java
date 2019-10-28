package controllers;

import views.VisualizarSapatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.BdSapataria;
import views.AtualizarSapatos;

public class VisualizarSapatosController {
    private VisualizarSapatos view;
    public VisualizarSapatosController(VisualizarSapatos view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarDados(new JAlterarDados());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jPorNome(new ProcurarSapato());
        //
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
            
        } 
    }
    private class ProcurarPorID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
    private class ProcurarSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
}
