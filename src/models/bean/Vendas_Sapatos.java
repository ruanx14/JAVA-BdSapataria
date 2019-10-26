package models.models;

import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
@Ruan Barroso e Flávia Valle
@Alunos do CETAM - Projeto Exercicio Pratico - Banco de dados III
@ruanx14@gmail.com || flaviafollowill@gmail.com 
*/
public class Vendas_Sapatos {
    Conexao conecta = new Conexao();
    
    private int idSapatos,idVendas,qtdPedidos;

    public void setQtdPedidos(int qtdPedidos){
        this.qtdPedidos = qtdPedidos;
    }
    public int getQtdPedidos(){
        return qtdPedidos;
    }
    public int getIdSapatos() {
        return idSapatos;
    }
  
    public void setIdSapatos(int idSapatos) {
        this.idSapatos = idSapatos;
    }
  
    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }
    public void cadastrarVendas(){
    conecta.abrirBdcon();
    try{
     PreparedStatement pst = conecta.con.prepareStatement("insert into Vendas_Sapatos(idVendas,idSapatos,qtdPedidos) values (?,?,?)");
     pst.setInt(1,getIdVendas());
     pst.setInt(2,getIdSapatos());
     pst.setInt(3,getQtdPedidos());
     pst.execute();
     }
     catch(SQLException ex){
     System.out.println("Erro: "+ ex.getMessage());
     JOptionPane.showMessageDialog(null, "Falha: "+ ex.getMessage());
    }
    conecta.fecharBdcon();
    }      
   
}
