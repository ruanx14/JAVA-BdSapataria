package models.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/*
@Ruan Barroso e Flávia Valle
@Alunos do CETAM - Projeto Exercicio Pratico - Banco de dados III
@ruanx14@gmail.com || flaviafollowill@gmail.com 
*/

public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela (ArrayList lin , String[] col){
    setLinhas(lin);
    setColunas(col);
    }
    public ArrayList getLinhas(){
         return linhas;
    }
    public void setLinhas (ArrayList dados){
        linhas=dados;
    }
    
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLim,int numCol){
        Object[] linha = (Object[])getLinhas().get(numLim);
        return linha[numCol];    
    }
}
