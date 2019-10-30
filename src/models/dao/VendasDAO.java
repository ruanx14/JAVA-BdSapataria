package models.dao;

import models.bean.Vendas;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Vector;


public class VendasDAO {
    Conexao conexao = new Conexao();
    public Vector pesquisarVendas(String sql){
        Connection conn = conexao.conectar();
        Vector pesquisas = new Vector();
        try{
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            do{
//            Vendas venda = new Vendas(
//            rs.getInt("idVendas"),
//            rs.getInt("Pessoas_idPessoas"),
//            rs.getString("dataVenda"),
//            rs.getString("formaPagamento"),
//            rs.getDouble("valor")
//            );    
            //pesquisas.add(venda);
            }while(rs.next());
        }    
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar"+ex.getMessage());
        }
        conexao.fechar();
        return pesquisas;
    }
}
