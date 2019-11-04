package models.dao;

import models.bean.Vendas;
import conexao.Conexao;
import java.awt.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            System.out.println("Erro: "+e.getMessage());
        }
        return idGerado;
    }
    
    public ArrayList<ArrayList<String>> pesquisarVendas(String sql){
        Connection conn = conexao.conectar();
        ArrayList<ArrayList<String>> lista = new ArrayList();
        try{
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery(); 
            
        if(rs.next()){
            do{
                ArrayList<String> obj = new ArrayList();
                obj.add(String.valueOf(rs.getInt("p.idPessoas")));
                obj.add(String.valueOf(rs.getInt("v.idVendas")));
                obj.add(rs.getString("p.nome"));
                obj.add(rs.getString("p.cpf"));
                obj.add(rs.getString("s.tipoSapato"));
                obj.add(rs.getString("v.dataVenda"));
                obj.add(rs.getString(String.valueOf("vs.qtdPedidos")));
                lista.add(obj);
            }while(rs.next());
        }    
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar: "+ex.getMessage());
        }
        conexao.fechar();
        return lista;
    }
}
