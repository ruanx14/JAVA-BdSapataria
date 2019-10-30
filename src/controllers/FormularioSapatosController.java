package controllers;
import views.FormularioSapatos;
import controllers.BdSapatariaController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.BdSapataria;
import models.bean.Sapatos;
import models.dao.SapatosDAO;

public class FormularioSapatosController {
    private FormularioSapatos view;
    public FormularioSapatosController(FormularioSapatos view){
        this.view = view;
        this.view.jLimpar(new JLimpar());
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jCadastrarSapatos(new JAdicionarSapato());
        this.view.setVisible(true);
    }
    private class JAdicionarSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            Sapatos sapato = new Sapatos(
            view.getTamanho(),
            view.getMarca(),
            view.getGenero(),
            view.getTipo(),
            view.getQtdEstoque(),
            view.getValor()
            );
            SapatosDAO sapatos = new SapatosDAO();
            sapatos.adicionarSapato(sapato);
        }
        
    }
    private class JLimpar implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            //limpar
        }
        
    }
    private class JVoltarMenu implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            new BdSapatariaController(new BdSapataria());    
            view.dispose();
        }
        
    }
}

