package models.dao;

import models.bean.Vendas;
import conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Vector;
import javax.swing.JOptionPane;


public class VendasDAO {
    Conexao conexao = new Conexao();
    
    public int adicionarVenda(Vendas venda){
        Connection conn = conexao.conectar();
        int idGerado = 0; 
        try{
        PreparedStatement ps = conn.prepareStatement("insert into Vendas(Pessoas_idPessoas,dataVenda,formaPagamento,total) values (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,venda.getIdPessoas());
        ps.setString(2, venda.getDataVenda());
        ps.setString(3, venda.getFormaPagamento());
        ps.setDouble(4, venda.getTotal());
        if(ps.execute()){
            JOptionPane.showMessageDialog(null,"Venda não foi cadastrada!");
        }else{
            JOptionPane.showMessageDialog(null,"Venda concluída com sucesso!");
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            idGerado = rs.getInt(1);
        }
        }catch(SQLException e){
            System.out.println("Erro:"+e.getMessage());
        }
        return idGerado;
    }
    
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
