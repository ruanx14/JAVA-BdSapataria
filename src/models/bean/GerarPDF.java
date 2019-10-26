package models.models;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class GerarPDF {
    private int idVendas,idCliente;
    String nome,cpf,bairro,rua;
    double total;
    private ArrayList IDS = new ArrayList();
    private ArrayList tipoSapato = new ArrayList();
    private ArrayList preco = new ArrayList();
    private ArrayList QTDS = new ArrayList();
    
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public int getIdCliente(){
        return idCliente;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public double getTotal(){
        return total;
    }
    public ArrayList getTipoSapato() {
        return tipoSapato;
    }

    public void setTipoSapato(ArrayList tipoSapato) {
        this.tipoSapato = tipoSapato;
    }

    public ArrayList getPreco() {
        return preco;
    }

    public void setPreco(ArrayList preco) {
        this.preco = preco;
    }
  
    public ArrayList getIDS() {
        return IDS;
    }

    public void setIDS(ArrayList IDS) {
        this.IDS = IDS;
    }

    public ArrayList getQTDS() {
        return QTDS;
    }

    public void setQTDS(ArrayList QTDS) {
        this.QTDS = QTDS;
    }
    public void setIdVendas(int idVendas){
        this.idVendas = idVendas;
    }
    public int getIdVendas(){
        return idVendas;
    }
    
    public void adicionarInformacoes(int idVenda,int idCliente,String nome,String bairro,String rua, String cpf,double total, ArrayList idSapatos, ArrayList qtd,ArrayList tipoSapato, ArrayList Preco){
       setIdVendas(idVenda);
       setIdCliente(idCliente);
       setCpf(cpf); 
       setNome(nome);
       setBairro(bairro);
       setRua(rua);
       setTotal(total);
       setIDS(idSapatos);
       setQTDS(qtd);
       setTipoSapato(tipoSapato);
       setPreco(Preco);  
    }
    public void gerarPDF(File local) throws FileNotFoundException, DocumentException{
        Document pdf = new Document();
        PdfWriter.getInstance(pdf, new FileOutputStream(local+".pdf"));
        pdf.open();
        pdf.addTitle("INFORMAÇÕES EM DOCUMENTO");
        pdf.addAuthor("Sapataria BICHO DE PÉ"); 
        pdf.add(new Paragraph("                                       SAPATARIA BICHO DE PÉ           "));
        pdf.add(new Paragraph("\n                  INFORMAÇÕES DA VENDA: \n"));
        pdf.add(new Paragraph("Identificação do Cliente: "+ getIdCliente()+"\n"));
        pdf.add(new Paragraph("Identificação da Venda: "+String.valueOf(getIdVendas())+"\n\n"));
        pdf.add(new Paragraph("                    INFORMAÇÕES DO CLIENTE: \n"));
        pdf.add(new Paragraph("Nome do Cliente: "+ getNome()));
        pdf.add(new Paragraph("CPF do Cliente: "+ getCpf()));
        pdf.add(new Paragraph("Endereço do Cliente: "+getBairro()+", "+getRua()));
        pdf.add(new Paragraph("\n                  INFORMAÇÕES DA COMPRA: \n"));
        for(int i=0;i<tipoSapato.size();i++){
        pdf.add(new Paragraph(i+".--"+"|ID SAPATO: "+String.valueOf(IDS.get(i))+" | Tipo do Sapato: "+String.valueOf(tipoSapato.get(i))+" | Quantidade: ["+String.valueOf(QTDS.get(i))+"]  | PREÇO: ["+String.valueOf(preco.get(i))+"]"));
//        pdf.add(new Paragraph(String.valueOf(tipoSapato.get(i))));
//        pdf.add(new Paragraph(String.valueOf(QTDS.get(i))));
//        pdf.add(new Paragraph(String.valueOf(IDS.get(i))));
//        pdf.add(new Paragraph(String.valueOf(preco.get(i))));
        }
        pdf.add(new Paragraph("\n                                                                                        Preço total da venda: "+getTotal()));
        pdf.close();
    }
    
}
