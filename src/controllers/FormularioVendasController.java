package controllers;
import views.FormularioVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.BdSapataria;

public class FormularioVendasController {
    private FormularioVendas view;
    public FormularioVendasController(FormularioVendas view){
        this.view = view;
        //listeners nos botoes das view
        this.view.jAdicionarCarrinho(new JAdicionarCarrinho());
        this.view.jCadastrarVenda(new JCadastrarVenda());
        this.view.jLimpar(new JLimpar());
        this.view.jVoltarMenu(new JVoltarMenu());
        this.view.jAlterarQuantidadeSapato(new AlterarQuantidadeSapato());
        this.view.jApagarSapatoCarrinho(new ApagarSapatoCarrinho());
        this.view.jExibirSapatos(new ExibirSapatos());
        this.view.jPesquisarCPF(new PesquisarCPF());
        this.view.jPesquisarID(new PesquisarID());
        this.view.jPesquisaMarca(new PesquisarMarca());
        //
        this.view.setVisible(true);
    }
    
    //Tratativas das listeners
    private class JLimpar implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class JCadastrarVenda implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class JVoltarMenu implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
           new BdSapatariaController(new BdSapataria());    
            view.dispose();
        }
        
    }
    private class JAdicionarCarrinho implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class AlterarQuantidadeSapato implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class ApagarSapatoCarrinho implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class ExibirSapatos implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class PesquisarCPF implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }   
    }
    private class PesquisarID implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    private class PesquisarMarca implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    
}

/*
##desligar botoes de cliente 

        jtfPrecoTotal.setEnabled(false);
        jtfRetornoNome.setEnabled(false);
        jtfRetornoNomeSapato.setEnabled(false);
        jtfRetornoMarca.setEnabled(false);
        jtfRetornoTamanho.setEnabled(false);
        jtfRetornoQtdEstoque.setEnabled(false);
        jtfRetornoRua.setEnabled(false);
        jtfQuantidadeTotal.setEnabled(false);
##limpar 

    public void limpar (){
    jtfRetornoNome.setText("");  
    jtfRetornoNomeSapato.setText("");
    jtfPrecoTotal.setText("");
    jftfDataVenda.setText("");
    jftCpf.setText("");
    jtfRetornoMarca.setText("");
    jtfRetornoTamanho.setText("");
    jtfRetornoQtdEstoque.setText("");
    jtfQuantidadeTotal.setText("");
    jtfRetornoRua.setText("");
   }
   
##outros 
 
   public void preencherTabela(String sql){
   ArrayList<Object> dados = new ArrayList<>();
   String [] colunas = new String[]{"idSapatos","Tipo Sapato","Quantidade/Estoque","Genero","Tamanho","Preço","Marca"};
   conecta.abrirBdcon();
   conecta.executaSql(sql);
   try {
   conecta.rs.first();
    do {
    dados.add(new Object[]{conecta.rs.getInt("idSapatos"),conecta.rs.getString("tipoSapato"),conecta.rs.getInt("qtdEstoque"),conecta.rs.getString("generoSapato"),conecta.rs.getString("tamanho"),conecta.rs.getDouble("valor"),conecta.rs.getString("marca")});
    }while(conecta.rs.next()); 
    }
    catch(SQLException ex){
    System.out.println("Erro ao preencher tabela  "+sql+" "+ex.getMessage());
    }
    ModeloTabela modelo = new ModeloTabela(dados, colunas);
    jtTudo.setModel(modelo);     
    jtTudo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    conecta.fecharBdcon();     
 }
 
 public void preencherValorTotal(String sql){
     int valorTotal=0;
     conecta.abrirBdcon();
     conecta.executaSql(sql);
     try{
       conecta.rs.first();
       valorTotal = conecta.rs.getInt("count(*)");
     }
     catch(SQLException e){
         System.out.println("Erro ao pegar valor total."+ e.getMessage());
     }
     jtfQuantidadeTotal.setText(Integer.toString(valorTotal));
    
 }
   private void salvarItem(){
       Object id = jtTudo.getValueAt(jtTudo.getSelectedRow(),0);
       int idC=0;
       Object tipo = jtTudo.getValueAt(jtTudo.getSelectedRow(),1);
       Object preco = jtTudo.getValueAt(jtTudo.getSelectedRow(),5);
       DefaultTableModel tc = (DefaultTableModel) jtCarrinho.getModel();
       idC = Integer.parseInt(id.toString());
       if(verifId(idC)){
       tc.addRow(new Object[]{id,tipo,preco,1});
       verifPreco();
       verificarSapato();
       }else{
           JOptionPane.showMessageDialog(null,"Produto ja esta no carrinho");
       }
       ligarBotao();
   }
   
   private double verificarSapato(){
   int cont=0;
   for(int i=0;i<=jtCarrinho.getRowCount()-1;i++){
   cont+=Integer.parseInt(jtCarrinho.getValueAt(i,3).toString());  
   }
   jtfQuantidadeTotal.setText(Integer.toString(cont));        
   return cont;
   }
   public double verifPreco(){
       double qtd,pre,som=0; 
         String c = jtCarrinho.getValueAt(0,0).toString();
        qtd = Double.parseDouble(jtCarrinho.getValueAt(0,3).toString());
        preco = Double.parseDouble(jtCarrinho.getValueAt(0,2).toString());
        som = qtd*preco;
        double linhas=0;
        som=0;
        for(int i=0;i<jtCarrinho.getRowCount();i++){
            preco = Double.parseDouble(jtCarrinho.getValueAt(i,3).toString());
            linhas = Double.parseDouble(jtCarrinho.getValueAt(i,2).toString());
            som +=linhas*preco;
            
        }
        jtfPrecoTotal.setText(String.valueOf(som));
        return som;
   }
 
   public boolean verifId(int idV){
      int idd=0,a=0;
       for(int i=0;i<jtCarrinho.getRowCount();i++){
          idd = Integer.parseInt(jtCarrinho.getValueAt(i,0).toString());
          if(idV==idd){ 
            a++;   
          }
   }
   if(a>0){
        return false;
   }else{
       return true;
   }
}
   public boolean ligarBotao(){
       jbsetQtd.setEnabled(true);
       return true;
   }
   public boolean desligarBotao(){
       jbsetQtd.setEnabled(false);
       return false;
   }
   public boolean temLinhas(){
       if(jtCarrinho.getRowCount()>0){
           return true;
       }else{
           return false;
       }
   }
     
}
##outros2
   private int verificarQtdSapato(int a){
       conecta.abrirBdcon();
       conecta.executaSql("select * from sapatos where idSapatos='"+a+"'");
       try{
       conecta.rs.first();       
       qtdEstoque = conecta.rs.getInt("qtdEstoque");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Erro: "+ e.getMessage());
       }    
       conecta.fecharBdcon();
       return qtdEstoque;
   }   

  if(temLinhas()){
    int qtd=0,id=0;
    Object qtdO = jtCarrinho.getValueAt(jtCarrinho.getSelectedRow(),3);
    Object idO = jtCarrinho.getValueAt(jtCarrinho.getSelectedRow(),0);
    qtd = Integer.parseInt(qtdO.toString()); 
    id = Integer.parseInt(idO.toString());
       
        int qtdN = 1;
        qtdN = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo valor para quantidade"));
          if(qtdN>verificarQtdSapato(id)){
          JOptionPane.showMessageDialog(null,"Quantidade maior que a do estoque");  
          }else if(qtdN==0){
          JOptionPane.showMessageDialog(null,"Quantidade minima 1");
          }else{
          jtCarrinho.setValueAt(qtdN,jtCarrinho.getSelectedRow(),3); 
          }
          ligarBotao();
    verifPreco();
    verificarSapato();
    }else{
        JOptionPane.showMessageDialog(null,"Não tem sapatos selecionados");
    }
    
  DefaultTableModel tc = (DefaultTableModel) jtCarrinho.getModel();
    tc.removeRow(jtCarrinho.getSelectedRow());
    ci--;
    verificarSapato();
    if(temLinhas()){
    verifPreco();
    }else{
        jtfPrecoTotal.setText("0.0");
    }



##outros33

 JFileChooser pdf = new JFileChooser();
    pdf.showSaveDialog(this);
    File local = pdf.getSelectedFile();
    v1.setFormaPagamento(jcbFormaPagamento.getSelectedItem().toString());
    v1.setDataVenda(jftfDataVenda.getText());
    v1.setTotal(Double.parseDouble(jtfPrecoTotal.getText()));
    //if((v1.getTotal()==0)||(v1.getDataVenda().equals(null))){
    if(v1.getDataVenda().equals(null)){
    JOptionPane.showMessageDialog(null,"Campos Nulos");
    }else{
    v1.cadastrarVenda();
    vs.setIdVendas(v1.getIdVendas());
    ArrayList<Object> Sapatos = new ArrayList<>();
    ArrayList<Object> Quantidades = new ArrayList<>();
    ArrayList<Object> TipoSapato = new ArrayList<>();
    ArrayList<Object> Preco = new ArrayList<>();
    for(int i=0;i<jtCarrinho.getRowCount();i++){
    Sapatos.add(jtCarrinho.getValueAt(i,0));
    Quantidades.add(jtCarrinho.getValueAt(i,3));
    TipoSapato.add(jtCarrinho.getValueAt(i,1));
    Preco.add(jtCarrinho.getValueAt(i,2));
    vs.setIdSapatos((int) Sapatos.get(i));
    vs.setQtdPedidos((int) Quantidades.get(i));
    vs.cadastrarVendas();
    updateQuantidade((int)Quantidades.get(i),(int)Sapatos.get(i));
    }
    gpdf.adicionarInformacoes(vs.getIdVendas(),p2.getIdPessoas(),p2.getNome(),p2.getBairro(),p2.getRua(),p2.getCpf(),v1.getTotal(),Sapatos,Quantidades,TipoSapato,Preco);
        try {
        gpdf.gerarPDF(local);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: "+ex.getMessage());
        } catch (DocumentException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
    limpar();
    BdSapataria dd = new BdSapataria();
    dd.setVisible(true);
    dispose();


*/
