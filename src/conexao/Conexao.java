package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
 

    
public class Conexao {
    Connection conexao;
    public Connection conectar(){
        try{
            String host = "jdbc:mysql://localhost/bdsapataria?useSSL=false";
            String user = "root";
            String password = "root";
            conexao = DriverManager.getConnection(host, user, password);
            System.out.println("Conectado");
            return conexao;
        }catch(Exception ex){
            System.out.println("Erro ao conectar: "+ex.getMessage());
            return null;
        }
    }
    public void fechar(){
        try{
            System.out.println("Desconectado");
            conexao.close();
        }catch(Exception ex){
            System.out.println("Erro ao fechar o banco."+ex.getMessage());
        }
    }
}
