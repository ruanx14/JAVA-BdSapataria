package models.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import models.bean.Sapatos;
import javax.swing.JOptionPane;

public class SapatosDAO {
    Conexao conexao = new Conexao();
    public void atualizarSapato(Sapatos sapatos){
        Connection conn = conexao.conectar();
        try{
            PreparedStatement pst = conn.prepareStatement("update sapatos set tipoSapato=?, generoSapato=?, marca=?,tamanho=?,qtdEstoque=?,valor=? where idSapatos=?");
            pst.setString(1, sapatos.getTipoSapato());
            pst.setString(2, sapatos.getGeneroSapato());
            pst.setString(3, sapatos.getMarca());
            pst.setString(4, sapatos.getTamanho());
            pst.setInt(5, sapatos.getQtdEstoque());
            pst.setDouble(6, sapatos.getValor());
            pst.setInt(7, sapatos.getIdSapatos());
            if(pst.executeUpdate()==1){
                JOptionPane.showMessageDialog(null, "Atualização concluída!");
            }
        }catch(SQLException ex){
            System.out.println("Erro: "+ex.getMessage());
        }
        conexao.fechar();
    }
    public void adicionarSapato(Sapatos sapato){
        Connection conn = conexao.conectar();
        try{
        PreparedStatement pst = conn.prepareStatement("insert into sapatos(tamanho, marca, generoSapato, tipoSapato, qtdEstoque, valor) values (?,?,?,?,?,?)");    
        pst.setString(1,sapato.getTamanho());
        pst.setString(2,sapato.getMarca());
        pst.setString(3,sapato.getGeneroSapato());
        pst.setString(4,sapato.getTipoSapato());
        pst.setInt(5,sapato.getQtdEstoque());
        pst.setDouble(6,sapato.getValor());
        if(pst.execute()){
            JOptionPane.showMessageDialog(null,"Houve erros na inserção do sapato");
        }else{
            JOptionPane.showMessageDialog(null,"Sapato cadastrado com sucesso");    
        }
        }catch(SQLException ex){
            System.out.println("Erro:"+ex.getMessage());
        }
        conexao.fechar();
    }
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
    public void atualizarSapato(int id, int qtd){
        Connection conn = conexao.conectar();
        try{
        PreparedStatement pst = conn.prepareStatement("update sapatos set qtdEstoque=qtdEstoque-? where idSapatos=?");
        pst.setInt(1,qtd);
        pst.setInt(2,id);
        pst.executeUpdate();    
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar: "+ex.getMessage());
        }
        conexao.fechar();
    }
    public int qtdEstoque(int id){
        Connection conn = conexao.conectar();
        int qtd = 0;
        try{
        PreparedStatement pst = conn.prepareStatement("select qtdEstoque from sapatos where idSapatos=?");
        pst.setInt(1,id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            qtd = rs.getInt("qtdEstoque");
        }
        }catch(SQLException ex){
            System.out.println("Erro ao pesquisar: "+ex.getMessage());
        }
        conexao.fechar();
        return qtd;
    }
    
    
}
