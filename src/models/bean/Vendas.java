package models.bean;

public class Vendas {
     private int idVendas;
     private int idPessoas;
     private String dataVenda;
     private String formaPagamento;
     private double total;
      
     
     
    public Vendas(){
        
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
    public int getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(int idPessoas) {
        this.idPessoas = idPessoas;
    }

}




