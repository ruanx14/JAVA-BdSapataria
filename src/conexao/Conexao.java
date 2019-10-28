package conexao;
/*
@Ruan Barroso
@Aluno do CETAM - Projeto Exercicio Pratico - Banco de dados III
@ruanx14@gmail.com 
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conexao {
    public Connection con;
    public Statement stm;
    private Connection oConn;
    private Statement sStm;
    public ResultSet rs;
    
    public Connection abrirBdcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bdSapataria?autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url,"root","root");
            System.out.println("Conexão efetuada com sucesso.");
            return con;
        }
        catch(Exception e){
            System.out.println("Erro ao abrir conexao com o banco: "+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public void executaSql(String sql){
        try{
            java.sql.Statement stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        }
        catch(Exception e){
            System.out.println("Erro ao executar SQL.");
        }
    }
    
    public void fecharBdcon(){
        try{
            con.close();
            System.out.println("Conexao finalizada com sucesso");
        } 
        catch(Exception e){
            System.out.println("Erro ao fechar conexao com o banco."+e.getMessage());
        }
    }
    
}
