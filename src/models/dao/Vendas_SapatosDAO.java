package models.dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.bean.Vendas_Sapatos;

public class Vendas_SapatosDAO {
    Conexao conexao = new Conexao();
    
    public void cadastrarVendas(Vendas_Sapatos obj){
    Connection conn = conexao.conectar();
    try{
     PreparedStatement pst = conn.prepareStatement("insert into Vendas_Sapatos(idVendas,idSapatos,qtdPedidos) values (?,?,?)");
        pst.setInt(1,obj.getIdVendas());
        pst.setInt(2,obj.getIdSapatos());
        pst.setInt(3,obj.getQtdPedidos());
     pst.execute();
     }
     catch(SQLException ex){
     System.out.println("Erro: "+ ex.getMessage());
    }
    conexao.fechar();
    }
}
