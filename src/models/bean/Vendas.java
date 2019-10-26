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
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Vendas {
    private int idVendas;
     private int idSapatos;
     private int idPessoas;
     private String cpf;
     private String dataVenda;
     private String formaPagamento;
     private double total;
     private int qtdPedido;
     Conexao conecta = new Conexao();

    public void setQtdPedido(int qtdPedido){
        this.qtdPedido = qtdPedido;
    }
    public int getQtdPedido(){
        return qtdPedido;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
       this.formaPagamento = formaPagamento;
    }
              
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
     this.total = total;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
       this.idVendas = idVendas;
    }
    public int getIdSapatos() {
        return idSapatos;
    }

    public void setIdSapatos(int idSapatos) {
        this.idSapatos = idSapatos;
    }

    public String getCpf() {
       return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
  }  

    public int getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(int idPessoas) {
        this.idPessoas = idPessoas;
    }

public void cadastrarVenda(){
conecta.abrirBdcon();
try{
  PreparedStatement pst = conecta.con.prepareStatement("insert into vendas (Pessoas_IdPessoas,dataVenda,formaPagamento,total) values (?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
  pst.setInt(1,getIdPessoas());
  pst.setString(2,getDataVenda());
  pst.setString(3,getFormaPagamento());
  pst.setDouble(4,getTotal());
  pst.executeUpdate();
  ResultSet rs = pst.getGeneratedKeys();
  rs.next();
  int idGerado = rs.getInt(1);
  setIdVendas(idGerado);
  JOptionPane.showMessageDialog(null, "Compra realizada com sucesso.");
  JOptionPane.showMessageDialog(null,"Parabéns!");
}
catch(SQLException ex){
       System.out.println("Erro: "+ ex.getMessage());
       JOptionPane.showMessageDialog(null, "Falha: "+ ex.getMessage());
}
conecta.fecharBdcon();
}
/*public Vendas selecionarVendas(Vendas v3){
        conecta.abrirBdcon();
        try {
            String sql = "select * from sapatos where idSapatos =?";
            PreparedStatement pstm = conecta.con.prepareStatement(sql);
	    pstm.setInt(1, v3.getIdVendas());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
            do{
                 v3.setIdVendas(rs.getInt("idVendas"));
              }while (rs.next());
            }else{
                 v3.setIdVendas(0);
                 JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
               
            }  
        rs.close();
        pstm.close();
        }catch (SQLException ex){    
            System.out.println("Erro ao procurar valor: "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
        }
       conecta.fecharBdcon();
       return v3;
}     */
}




