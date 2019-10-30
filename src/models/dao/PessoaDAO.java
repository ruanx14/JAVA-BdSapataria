package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import models.bean.Pessoas;
import conexao.Conexao;
import javax.swing.JOptionPane;

public class PessoaDAO {
    Conexao conexao = new Conexao();
    public void adicionarPessoa(Pessoas pessoa){
        Connection conn = conexao.conectar();
        try{
        PreparedStatement pst = conn.prepareStatement("Insert into pessoas(nome, telefone, bairro, rua, genero, CPF, estado) values (?,?,?,?,?,?,?)");
        pst.setString(1,pessoa.getNome());
        pst.setString(2,pessoa.getTelefone());
        pst.setString(3,pessoa.getBairro());
        pst.setString(4,pessoa.getRua());
        pst.setString(5,pessoa.getGenero());
        pst.setString(6,pessoa.getCpf());
        pst.setString(7,pessoa.getEstado());
        if(pst.execute()){
            JOptionPane.showMessageDialog(null,"Cliente não foi inserido!");
        }else{
            JOptionPane.showMessageDialog(null,"Cliente Inserido com sucesso!");
        }
        }catch(SQLException ex){
            System.out.println("Erro:"+ex.getMessage());
        }
        conexao.fechar();
    }
    public Vector pesquisarPessoas(String sql){
        Connection conn = conexao.conectar();
        Vector todasPessoas = new Vector();
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                do{
                     Pessoas pessoa = new Pessoas();
                     pessoa.setNome(rs.getString("nome"));
                     pessoa.setIdPessoas(rs.getInt("idPessoas"));
                     pessoa.setEstado(rs.getString("estado"));
                     pessoa.setBairro(rs.getString("bairro"));
                     pessoa.setGenero(rs.getString("genero"));
                     pessoa.setCpf(rs.getString("CPF"));
                     pessoa.setTelefone(rs.getString("telefone"));
                     pessoa.setRua(rs.getString("rua"));
                     todasPessoas.add(pessoa);
                    }while(rs.next());
                } 
            }catch(SQLException ex){
                System.out.println("Erro no pesquisarPessoas: "+ex.getMessage());
            }
        conexao.fechar();
        return todasPessoas;
    }
    
    public int pesquisarPessoasTotal(String sql){
        int numero = 0;
        Connection conn = conexao.conectar();
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                numero = rs.getInt("count(*)");
            }
        }catch(SQLException ex){
            System.out.println("Erro na quantidade: "+ex.getMessage());
        }      
        conexao.fechar();
        return numero;
    }
}
