package models.bean;

public class Vendas {
     private int idVendas;
     private int idSapatos;
     private int idPessoas;
     private String cpf;
     private String dataVenda;
     private String formaPagamento;
     private double total;
     private int qtdPedido;
     

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

}




