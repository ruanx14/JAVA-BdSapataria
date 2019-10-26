package models.models;
/*
@Ruan Barroso e Flávia Valle
@Alunos do CETAM - Projeto Exercicio Pratico - Banco de dados III
@ruanx14@gmail.com || flaviafollowill@gmail.com 
*/
import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Pessoas {
private int idPessoas;
private String genero;
private String nome;
private String telefone;
private String bairro;
private String rua;
private String cpf;
private String estado;

Conexao conecta = new Conexao();

    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
         return rua;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
    if(cpf.length()>14){
            System.out.println("CPF GRANDE");
    }
    else if(cpf.length()<14){
            System.out.println("CPF CURTO");
    }
    else{
          this.cpf = cpf;  
    }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(int idPessoas) {
        this.idPessoas = idPessoas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

public void cadastrarPessoas(){
   conecta.abrirBdcon();
try{
    PreparedStatement pst = conecta.con.prepareStatement("insert into pessoas (nome,telefone,bairro,rua,genero,cpf,estado) values (?,?,?,?,?,?,?)");
    pst.setString(1,getNome());
    pst.setString(2,getTelefone());
    pst.setString(3,getBairro());
    pst.setString(4,getRua());
    pst.setString(5,getGenero());
    pst.setString(6,getCpf());
    pst.setString(7,getEstado());
    pst.execute();
    JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso.");
}
catch(SQLException ex){
    System.out.println("Erro: "+ex.getMessage());
    JOptionPane.showMessageDialog(null, "Falha: "+ ex.getMessage());
}
   conecta.fecharBdcon();
}

public Pessoas selecionarPessoas(Pessoas p2){
        conecta.abrirBdcon();
        try {
            String sql = "select * from pessoas where cpf =?";
            PreparedStatement pstm = conecta.con.prepareStatement(sql);
	    pstm.setString(1, p2.getCpf());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
            do{
                 p2.setNome(rs.getString("nome"));
                 p2.setIdPessoas(rs.getInt("IdPessoas")); 
                 p2.setTelefone(rs.getString("telefone"));
                 p2.setBairro(rs.getString("bairro"));
                 p2.setRua(rs.getString("rua"));
                 p2.setGenero(rs.getString("genero"));
                 p2.setCpf(rs.getString("cpf"));
                 p2.setEstado(rs.getString("estado"));
                }while (rs.next());
            }else{
                 p2.setNome("");
                 p2.setCpf("");
                 p2.setTelefone("");
                 p2.setBairro("");
                 p2.setRua("");
                 JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
            }
        rs.close();
        pstm.close();
        }catch (SQLException ex){
                      
            System.out.println("Erro ao procurar valor: "+ex.getMessage());

        }
       conecta.fecharBdcon();
       return p2;
}   
public Pessoas selecionarPessoasPeloId(Pessoas p2){
        conecta.abrirBdcon();
        try {
            String sql = "select * from pessoas where idPessoas=?";
            PreparedStatement pstm = conecta.con.prepareStatement(sql);
	    pstm.setInt(1, p2.getIdPessoas());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
            do{
                 p2.setNome(rs.getString("nome"));
                 p2.setIdPessoas(rs.getInt("IdPessoas")); 
                 p2.setTelefone(rs.getString("telefone"));
                 p2.setBairro(rs.getString("bairro"));
                 p2.setRua(rs.getString("rua"));
                 p2.setGenero(rs.getString("genero"));
                 p2.setEstado(rs.getString("estado"));
                 p2.setCpf(rs.getString("cpf"));
                }while (rs.next());
            }else{
                 p2.setNome("");
                 p2.setCpf("");
                 p2.setTelefone("");
                 p2.setBairro("");
                 p2.setRua("");
                 JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
            }
        rs.close();
        pstm.close();
        }catch (SQLException ex){
                      
            System.out.println("Erro ao procurar valor: "+ex.getMessage());

        }
       conecta.fecharBdcon();
       return p2;
}
   public void updateSelecionado(){
       conecta.abrirBdcon();
       try{
           PreparedStatement pst = conecta.con.prepareStatement("update pessoas set nome=?,telefone=?,bairro=?,rua=?,genero=?,cpf=?,estado=? where idPessoas=?");
           pst.setString(1,getNome());
           pst.setString(2,getTelefone());
           pst.setString(3,getBairro());
           pst.setString(4,getRua());
           pst.setString(5,getGenero());
           pst.setString(6,getCpf());
           pst.setString(7,getEstado());
           pst.setInt(8,getIdPessoas());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Atualização do cliente concluída! ");
       }catch(SQLException ex){
           System.out.println("ErrO: "+ ex.getMessage());
       }
       conecta.fecharBdcon();
   }

}
