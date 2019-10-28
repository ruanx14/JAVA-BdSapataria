/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.dao;

/**
 *
 * @author Ruan
 */
public class VendasDAO {
    /*
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
