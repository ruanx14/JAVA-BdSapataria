package models.bean;
/*
@Ruan Barroso
@Alunos do CETAM - Projeto Exercicio Pratico - Banco de dados III
@ruanx14@gmail.com 
*/

public class Pessoas {
private int idPessoas;
private String genero;
private String nome;
private String telefone;
private String bairro;
private String rua;
private String cpf;
private String estado;

 
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
}