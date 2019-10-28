package controllers;
import views.VisualizarPessoas;
import views.BdSapataria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarPessoas;

public class VisualizarPessoasController {
    private VisualizarPessoas view;
    public VisualizarPessoasController(VisualizarPessoas view){
        this.view = view;
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarDados(new JAlterarDados());
        this.view.jExibirTudo(new JExibirTodos());
        this.view.jPorID(new ProcurarPorID());
        this.view.jPorCPF(new ProcurarPorCPF());
        this.view.jPorNome(new ProcurarCliente());
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
            new AtualizarPessoasController(new AtualizarPessoas());
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
    private class ProcurarPorCPF implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
    private class ProcurarCliente implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        } 
    }
    
}
