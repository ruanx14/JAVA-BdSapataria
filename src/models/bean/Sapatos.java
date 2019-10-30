package models.bean;

public class Sapatos {
    private int idSapatos;
    private String tamanho;
    private String marca;
    private double valor;
    private int qtdEstoque;
    private String generoSapato;
    private String tipoSapato;
    
    public Sapatos(int idSapatos,String tamanho, String marca, String tipoSapato, String generoSapato, int qtdEstoque, double valorSapato){
        this.idSapatos = idSapatos;
        this.tamanho = tamanho;
        this.marca = marca;
        this.tipoSapato = tipoSapato;
        this.generoSapato = generoSapato;
        this.qtdEstoque = qtdEstoque;
        valor = valorSapato;
    }
    public Sapatos(String tamanho, String marca, String generoSapato, String tipoSapato, int qtdEstoque, double valor){
        this.tamanho = tamanho;
        this.marca = marca;
        this.generoSapato = generoSapato;
        this.tipoSapato = tipoSapato;
        this.qtdEstoque = qtdEstoque;
        this.valor = valor;
    }
    public String getTipoSapato() {
        return tipoSapato;
    }

    public void setTipoSapato(String tipoSapato) {
        this.tipoSapato = tipoSapato;
    }
   
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

       public String getMarca() {
        return marca;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdSapatos() {
        return idSapatos;
    }

    public void setIdSapatos(int idSapatos) {
        this.idSapatos = idSapatos;
    }
  
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
         this.valor = valor;
    } 
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public String getGeneroSapato() {
        return generoSapato;
    }

    public void setGeneroSapato(String generoSapato) {
        this.generoSapato = generoSapato;
    }
}
