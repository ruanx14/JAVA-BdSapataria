package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.AtualizarSapatos;
import models.bean.Sapatos;
import models.dao.SapatosDAO;

public class AtualizarSapatosController {
    private AtualizarSapatos view;
    private int idSapato;
    
    public AtualizarSapatosController(AtualizarSapatos tela, Sapatos sapato){
        view = tela;
        view.atualizarSapato(new AtualizarSapato());
        view.setQtdEstoque(String.valueOf(sapato.getQtdEstoque()));
        view.setValor(String.valueOf(sapato.getValor()));
        view.setTamanho(sapato.getTamanho());
        view.setTipoSapato(sapato.getTipoSapato());
        view.setGenero(sapato.getGeneroSapato());
        view.setMarca(sapato.getMarca());
        idSapato = sapato.getIdSapatos();
        //object local sapato could catch = sapato;
        view.setVisible(true);
    }
    private class AtualizarSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            Sapatos sapato = new Sapatos(
            idSapato,
            view.getTamanho(),
            view.getMarca(),
            view.getTipo(),
            view.getGenero(),
            view.getQtdEstoque(),
            view.getValor()
            );
            //missing 2 validations
                SapatosDAO modelSapato = new SapatosDAO();
                modelSapato.atualizarSapato(sapato);
                view.dispose();  
            }
    }
}
