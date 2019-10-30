package models.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import models.bean.Sapatos;

public class SapatosDAO {
    Conexao conexao = new Conexao();
    
    
    public Vector pesquisarSapatos(String sql){
        Connection conn = conexao.conectar();
        Vector pesquisas = new Vector();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        if(rs.next()){
            do{
            Sapatos sapatos = new Sapatos(
               rs.getInt("idSapatos"),
               rs.getString("tamanho"),
               rs.getString("marca"),
               rs.getString("tipoSapato"),
               rs.getString("generoSapato"),
               rs.getInt("qtdEstoque"),
               rs.getDouble("valor")
            );
                System.out.println(rs.getString("marca"));
            pesquisas.add(sapatos);    
            }while(rs.next());
        }
        }catch(SQLException ex){
            System.out.println("Erro no procurar sapatos "+ex.getMessage());
        }
        conexao.fechar();
        return pesquisas;
    }
    
    public int pesquisarSapatosTotal(String sql){
        Connection conn = conexao.conectar();
        int numero = 0;
        try{
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){    
            numero = rs.getInt("count(*)");
        }
        }catch(SQLException ex){
            System.out.println("Erro no procurar sapatos "+ex.getMessage());
        }
        conexao.fechar();
        return numero;
    }
    
}
