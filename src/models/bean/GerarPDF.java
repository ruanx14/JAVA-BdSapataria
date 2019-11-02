package models.bean;
        
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class GerarPDF {
    int idCliente, idVenda;
    String nomeCliente, cpfCliente, bairro, rua;
    String valorTotal, dataVenda,formaPagamento;
    
    ArrayList idSapatos,quantidades,sapatos,precos = new ArrayList();
    
    public GerarPDF(int idCliente, int idVenda, String nomeCliente, String cpfCliente, String bairro, String rua, String dataVenda, String valorTotal,String formaPagamento, ArrayList idSapatos, ArrayList sapatos, ArrayList precos, ArrayList quantidades){
       this.idCliente = idCliente;
       this.idVenda = idVenda;
       this.nomeCliente = nomeCliente;
       this.cpfCliente = cpfCliente;
       this.bairro = bairro;
       this.rua = rua;
       this.dataVenda = dataVenda;
       this.valorTotal = valorTotal;
       this.formaPagamento = formaPagamento;
       this.idSapatos = idSapatos;
       this.sapatos = sapatos;
       this.precos = precos;
       this.quantidades = quantidades;
    }
    public void gerarPDF(File local) throws FileNotFoundException, DocumentException{
        Document pdf = new Document();
        PdfWriter.getInstance(pdf, new FileOutputStream(local+".pdf"));
        pdf.open();
        pdf.addTitle("INFORMAÇÕES EM DOCUMENTO");
        pdf.addAuthor("Sapataria BICHO DE PÉ"); 
        pdf.add(new Paragraph("                                       SAPATARIA BICHO DE PÉ           "));
        pdf.add(new Paragraph("Data da venda: "+dataVenda));
        pdf.add(new Paragraph("\n                      INFORMAÇÕES DA VENDA:\n"));
        pdf.add(new Paragraph("Identificação do Cliente: "+ idCliente+"\n"));
        pdf.add(new Paragraph("Identificação da Venda: "+idVenda+"\n"));
        pdf.add(new Paragraph("Método de pagamento: "+formaPagamento+"\n\n"));
        pdf.add(new Paragraph("                    INFORMAÇÕES DO CLIENTE:\n"));
        pdf.add(new Paragraph("Nome do Cliente: "+ nomeCliente));
        pdf.add(new Paragraph("CPF do Cliente: "+ cpfCliente));
        pdf.add(new Paragraph("Endereço do Cliente: "+bairro+", "+rua));
        pdf.add(new Paragraph("\n                  INFORMAÇÕES DA COMPRA: \n"));
        for(int i=0;i<sapatos.size();i++){
        pdf.add(new Paragraph("*"+"|ID SAPATO: "+String.valueOf(idSapatos.get(i))+" | Tipo do Sapato: "+String.valueOf(sapatos.get(i))+" | Quantidade: ["+String.valueOf(quantidades.get(i))+"]  | PREÇO: ["+String.valueOf(precos.get(i))+"]"));
//        pdf.add(new Paragraph(String.valueOf(tipoSapato.get(i))));
//        pdf.add(new Paragraph(String.valueOf(QTDS.get(i))));
//        pdf.add(new Paragraph(String.valueOf(IDS.get(i))));
//        pdf.add(new Paragraph(String.valueOf(preco.get(i))));
        }
        pdf.add(new Paragraph("\n                                                                                        Preço total da venda: "+valorTotal));
        pdf.close();
    }
    
}
