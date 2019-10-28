package models.bean;


public class Vendas_Sapatos {
    private int idSapatos,idVendas,qtdPedidos;

    public void setQtdPedidos(int qtdPedidos){
        this.qtdPedidos = qtdPedidos;
    }
    public int getQtdPedidos(){
        return qtdPedidos;
    }
    public int getIdSapatos() {
        return idSapatos;
    }
  
    public void setIdSapatos(int idSapatos) {
        this.idSapatos = idSapatos;
    }
  
    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }   
   
}
