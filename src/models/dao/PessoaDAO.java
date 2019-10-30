package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import models.bean.Pessoas;
import conexao.Conexao;

public class PessoaDAO {
    Conexao conexao = new Conexao();
    
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
                     todasPessoas.add(pessoa);
                    }while(rs.next());
                } 
            }catch(SQLException ex){
                System.out.println("Erro no pesquisarPessoas: "+ex.getMessage());
            }
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
