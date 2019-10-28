package controllers;
import views.VisualizarVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.BdSapataria;

public class VisualizarVendasController {
    private VisualizarVendas view;
    public VisualizarVendasController(VisualizarVendas view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jDataVenda(new ProcurarPorData());
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
    private class ProcurarPorData implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
    private class ProcurarCliente implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
}
