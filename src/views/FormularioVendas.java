package views;

import Conexao.Conexao;
import models.models.ModeloTabela;
import models.models.Pessoas;
import models.models.Sapatos;
import models.models.Vendas;
import models.models.GerarPDF;
import models.models.Vendas_Sapatos;
import com.itextpdf.text.DocumentException;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/*
@Ruan Barroso
@Aluno do CETAM - Projeto Exercicio Praticos com Bando de Dados
@ruanx14@gmail.com
*/

public class FormularioVendas extends javax.swing.JFrame {
    Vendas v1 = new Vendas();
    Pessoas p1 = new Pessoas();
    Sapatos s1 = new Sapatos();
    Pessoas p2 = new Pessoas();
    Sapatos s2 = new Sapatos();
    Vendas_Sapatos vs = new Vendas_Sapatos();
    Vendas v2 = new Vendas();
    GerarPDF gpdf = new GerarPDF();
    double preco;
    Conexao conecta = new Conexao();
        FormularioVendas fv = null;
        BdSapataria bds = null;
        int vt;
        int ci =0;
        int qtdEstoque=0;
    
     
    public FormularioVendas() {
        initComponents();
        //setIcon();
        jtfPrecoTotal.setEnabled(false);
        jtfRetornoNome.setEnabled(false);
        jtfRetornoNomeSapato.setEnabled(false);
        jtfRetornoMarca.setEnabled(false);
        jtfRetornoTamanho.setEnabled(false);
        jtfRetornoQtdEstoque.setEnabled(false);
        jtfRetornoRua.setEnabled(false);
        jtfQuantidadeTotal.setEnabled(false);
        desligarBotao();
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfRetornoNomeSapato = new javax.swing.JTextField();
        jtfRetornoNome = new javax.swing.JTextField();
        jtfPrecoTotal = new javax.swing.JTextField();
        jCadastrarVenda = new javax.swing.JButton();
        jVoltarMenu3 = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jcbFormaPagamento = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jtfRetornoMarca = new javax.swing.JTextField();
        jtfRetornoTamanho = new javax.swing.JTextField();
        jlCpf = new javax.swing.JLabel();
        jlDataVenda = new javax.swing.JLabel();
        jlFormaPagamento = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jtfRetornoQtdEstoque = new javax.swing.JTextField();
        jftCpf = new javax.swing.JFormattedTextField();
        jftfDataVenda = new javax.swing.JFormattedTextField();
        jtfRetornoRua = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCarrinho = new javax.swing.JTable();
        jbApagar = new javax.swing.JButton();
        jtfQuantidadeTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbsetQtd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtfSapato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbExibirTudo = new javax.swing.JButton();
        jtfOutros = new javax.swing.JTextField();
        jlText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTudo = new javax.swing.JTable();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jtfRetornoNomeSapato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoNomeSapato);
        jtfRetornoNomeSapato.setBounds(10, 310, 187, 23);

        jtfRetornoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfRetornoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRetornoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfRetornoNome);
        jtfRetornoNome.setBounds(10, 270, 187, 23);

        jtfPrecoTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jtfPrecoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecoTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jtfPrecoTotal);
        jtfPrecoTotal.setBounds(102, 198, 162, 38);

        jCadastrarVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCadastrarVenda.setText("> Completar Venda <");
        jCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarVenda);
        jCadastrarVenda.setBounds(120, 380, 177, 25);

        jVoltarMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jVoltarMenu3.setText("> Voltar <");
        jVoltarMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarMenu3ActionPerformed(evt);
            }
        });
        getContentPane().add(jVoltarMenu3);
        jVoltarMenu3.setBounds(300, 380, 97, 25);

        jbClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbClientes.setText("Pesquisar");
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jbClientes);
        jbClientes.setBounds(314, 98, 95, 37);

        jcbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartao Mastercard", "Cartao Visa", "Cartao Bradesco", "Cartao Itau", "Cartao da Loja", "Boleto Bancario - Parcelado", "Dinheiro - A vista" }));
        jcbFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFormaPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbFormaPagamento);
        jcbFormaPagamento.setBounds(176, 243, 233, 23);

        jbLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbLimpar.setText("> Limpar <");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(10, 380, 103, 25);

        jtfRetornoMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoMarca);
        jtfRetornoMarca.setBounds(10, 350, 187, 23);

        jtfRetornoTamanho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoTamanho);
        jtfRetornoTamanho.setBounds(210, 350, 182, 23);

        jlCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCpf.setText("CPF Cliente");
        getContentPane().add(jlCpf);
        jlCpf.setBounds(10, 98, 82, 37);

        jlDataVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDataVenda.setText("Data/Venda");
        getContentPane().add(jlDataVenda);
        jlDataVenda.setBounds(10, 161, 79, 17);

        jlFormaPagamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFormaPagamento.setText("Forma de Pagamento: ");
        getContentPane().add(jlFormaPagamento);
        jlFormaPagamento.setBounds(10, 246, 156, 17);

        jlTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTotal.setText("Valor Total: ");
        getContentPane().add(jlTotal);
        jlTotal.setBounds(10, 206, 82, 17);

        jtfRetornoQtdEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoQtdEstoque);
        jtfRetornoQtdEstoque.setBounds(210, 270, 182, 23);

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jftCpf);
        jftCpf.setBounds(102, 97, 206, 37);

        try {
            jftfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfDataVenda.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jftfDataVenda);
        jftfDataVenda.setBounds(102, 153, 197, 38);

        jtfRetornoRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoRua);
        jtfRetornoRua.setBounds(210, 310, 182, 23);

        jtCarrinho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Sapato", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtCarrinho);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(420, 110, 213, 260);

        jbApagar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbApagar.setText("Apagar");
        jbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jbApagar);
        jbApagar.setBounds(540, 380, 79, 25);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfQuantidadeTotal);
        jtfQuantidadeTotal.setBounds(534, 82, 99, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Total de sapatos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 82, 110, 23);

        jbsetQtd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbsetQtd.setText("Alterar Qtd");
        jbsetQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsetQtdActionPerformed(evt);
            }
        });
        getContentPane().add(jbsetQtd);
        jbsetQtd.setBounds(420, 380, 101, 25);

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Procurar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 20, 87, 25);

        jbSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSalvar.setText("Adicionar ao carrinho");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(1000, 380, 167, 25);

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1050, 20, 109, 25);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 16)); // NOI18N
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(680, 20, 40, 27);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tipo do Sapato/Marca");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 20, 140, 17);

        jbExibirTudo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbExibirTudo.setText("Exibir todos sapatos");
        jbExibirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(660, 380, 159, 25);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 16)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(960, 20, 85, 27);

        jlText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlText.setText("ID");
        getContentPane().add(jlText);
        jlText.setBounds(660, 20, 13, 20);

        jtTudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTudo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 50, 510, 320);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoCadastroVendas.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, 0, 1180, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarMenu3ActionPerformed
        BdSapataria dd = new BdSapataria();
        dd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jVoltarMenu3ActionPerformed
    public void alterarRetorno(Object d){
        this.preco = (double)d;
    }
    public Object mostrarRetorno(){
        return this.preco;
    }
    public void mudarCampo(){
         jtfPrecoTotal.setText("Preço: "+mostrarRetorno() );
    }
    private void jCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarVendaActionPerformed
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
    }
    }//GEN-LAST:event_jCadastrarVendaActionPerformed
    public void updateQuantidade(int a,int b){
     conecta.abrirBdcon();
     try{
     PreparedStatement pst = conecta.con.prepareStatement("update sapatos set qtdEstoque=(qtdEstoque-?) where idSapatos=?");
     pst.setInt(1,a);
     pst.setInt(2,b);
     pst.executeUpdate();
    }catch(SQLException ex){
        System.out.println("Erro: "+ex.getMessage());
    }
    conecta.fecharBdcon();
    
   }


    private void jtfPrecoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecoTotalActionPerformed
       
    }//GEN-LAST:event_jtfPrecoTotalActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
    p1.setCpf(jftCpf.getText());
    p2 = p1.selecionarPessoas(p1);
    v1.setIdPessoas(p2.getIdPessoas());
    if(p2.getCpf()!=null){
        jtfRetornoNomeSapato.setText(p2.getGenero());
        jtfRetornoMarca.setText(p2.getTelefone());
        jtfRetornoTamanho.setText(p2.getBairro());
        jtfRetornoRua.setText(p2.getRua());
        jtfRetornoNome.setText(p2.getNome());
        jtfRetornoQtdEstoque.setText(p2.getEstado());
        }else {
            limpar();
        }        
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jtfRetornoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRetornoNomeActionPerformed
       
    }//GEN-LAST:event_jtfRetornoNomeActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
       limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jcbFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFormaPagamentoActionPerformed

    private void jbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbApagarActionPerformed
    DefaultTableModel tc = (DefaultTableModel) jtCarrinho.getModel();
    tc.removeRow(jtCarrinho.getSelectedRow());
    ci--;
    verificarSapato();
    if(temLinhas()){
    verifPreco();
    }else{
        jtfPrecoTotal.setText("0.0");
    }
    }//GEN-LAST:event_jbApagarActionPerformed

    private void jbsetQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsetQtdActionPerformed
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
    
    }//GEN-LAST:event_jbsetQtdActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarItem();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        preencherTabela("select * from sapatos where tipoSapato='"+jtfOutros.getText()+"' or marca='"+jtfOutros.getText()+"'");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        preencherTabela("select * from sapatos where idSapatos="+jtfSapato.getText());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbExibirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirTudoActionPerformed
        preencherTabela("select * from sapatos");
    }//GEN-LAST:event_jbExibirTudoActionPerformed
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
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jCadastrarVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jVoltarMenu3;
    private javax.swing.JButton jbApagar;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbsetQtd;
    private javax.swing.JComboBox<String> jcbFormaPagamento;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JFormattedTextField jftfDataVenda;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataVenda;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlText;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTable jtCarrinho;
    private javax.swing.JTable jtTudo;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfPrecoTotal;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfRetornoMarca;
    private javax.swing.JTextField jtfRetornoNome;
    private javax.swing.JTextField jtfRetornoNomeSapato;
    private javax.swing.JTextField jtfRetornoQtdEstoque;
    private javax.swing.JTextField jtfRetornoRua;
    private javax.swing.JTextField jtfRetornoTamanho;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables

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
   private void setIcon() {
   setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../SapatariaImagens/icone.png")));
   }
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
