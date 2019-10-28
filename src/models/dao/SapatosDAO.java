package models.dao;

public class SapatosDAO {
    /*
    
public void cadastrarSapatos(){
   conecta.abrirBdcon();
   try{
       PreparedStatement pst = conecta.con.prepareStatement("insert into sapatos (tamanho,marca,valor,qtdEstoque,generoSapato,tipoSapato) values (?,?,?,?,?,?)");
       pst.setString(1,getTamanho());
       pst.setString(2,getMarca());
       pst.setDouble(3,getValor());
       pst.setInt(4,getQtdEstoque());
       pst.setString(5,getGeneroSapato());
       pst.setString(6,getTipoSapato());
       pst.execute();
       JOptionPane.showMessageDialog(null, "Cadastro de sapato concluído");
   }
   catch(SQLException ex){
       System.out.println("Erro: "+ ex.getMessage());
       JOptionPane.showMessageDialog(null, "Falha: "+ ex.getMessage());
   }
   conecta.fecharBdcon();        
}

public Sapatos selecionarSapatos(Sapatos p3){
        conecta.abrirBdcon();
        try {
            String sql = "select * from sapatos where idSapatos =?";
            PreparedStatement pstm = conecta.con.prepareStatement(sql);
	    pstm.setInt(1, p3.getIdSapatos());
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
            do{
                 p3.setTipoSapato(rs.getString("tipoSapato"));
                 p3.setValor(rs.getDouble("valor"));
                 p3.setIdSapatos(rs.getInt("idSapatos"));
                 p3.setTamanho(rs.getString("tamanho"));
                 p3.setMarca(rs.getString("marca"));
                 p3.setGeneroSapato(rs.getString("generoSapato"));
                 p3.setQtdEstoque(rs.getInt("qtdEstoque"));
              }while (rs.next());
            }else{
                 p3.setValor(0);
                 p3.setQtdEstoque(0);
                 JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
               
            }  
        rs.close();
        pstm.close();
        }catch (SQLException ex){    
            System.out.println("Erro ao procurar valor: "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "NÃO EXISTE REFÊRENCIA DE DADO NA TABELA");
        }
       conecta.fecharBdcon();
       return p3;
}     
    public void updateSelecionado(){
    conecta.abrirBdcon();
    try{
        PreparedStatement pst = conecta.con.prepareStatement("update sapatos set tipoSapato=?,tamanho=?,qtdEstoque=?,marca=?,generoSapato=?,valor=? where idSapatos=?");
        pst.setString(1,getTipoSapato());
        pst.setString(2,getTamanho());
        pst.setInt(3,getQtdEstoque());
        pst.setString(4,getMarca());
        pst.setString(5,getGeneroSapato());
        pst.setDouble(6,getValor());
        pst.setInt(7,getIdSapatos());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Atualizaçao de dados do sapato concluida!");
    }catch(SQLException ex){
        System.out.println("Erro: "+ ex.getMessage());
    }
    conecta.fecharBdcon();
    }
 
}
    */
}
