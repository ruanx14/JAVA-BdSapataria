package views;

import Conexao.Conexao;
import models.models.ModeloTabela;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;



public class VisualizarPessoas extends javax.swing.JFrame {
        Conexao conecta = new Conexao();
        int vt;
        AtualizarPessoas ap;
        int idCliente=0;
   
    public VisualizarPessoas() {
        initComponents();
        //setIcon();
        jtfQuantidadeTotal.setEnabled(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfQuantidadeTotal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jbExibirTudo = new javax.swing.JButton();
        jtfSapato = new javax.swing.JTextField();
        jlSapato = new javax.swing.JLabel();
        jbSapato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbAlterar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        jbProcurarTudo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jftfCpf = new javax.swing.JFormattedTextField();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jtfQuantidadeTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuantidadeTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jtfQuantidadeTotal);
        jtfQuantidadeTotal.setBounds(980, 490, 111, 38);

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtVendas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 1120, 442);

        jbExibirTudo.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbExibirTudo.setText("Exibir todos clientes");
        jbExibirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 491, 278, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jtfSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(136, 12, 83, 25);

        jlSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlSapato.setText("ID DO CLIENTE: ");
        getContentPane().add(jlSapato);
        jlSapato.setBounds(20, 15, 112, 19);

        jbSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbSapato.setText("Procurar");
        jbSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jbSapato);
        jbSapato.setBounds(229, 11, 93, 27);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Quantidade de clientes: ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 490, 322, 32);

        jbAlterar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbAlterar.setText("Alterar dados");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(60, 540, 220, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("NOME CLIENTE/BAIRRO");
        getContentPane().add(jlNada);
        jlNada.setBounds(338, 15, 163, 19);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(502, 12, 133, 25);

        jbVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbVoltar.setText("> Voltar <");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(960, 530, 130, 30);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Pesquisar");
        jbProcurarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(645, 11, 103, 27);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("CPF DO CLIENTE: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(752, 15, 123, 19);

        jButton1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1026, 11, 103, 27);

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jftfCpf);
        jftfCpf.setBounds(880, 10, 140, 20);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoVisualizarAll.png"))); // NOI18N
        FUNDO.setMaximumSize(new java.awt.Dimension(1120, 800));
        getContentPane().add(FUNDO);
        FUNDO.setBounds(-30, -30, 2420, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExibirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirTudoActionPerformed
    preencherTabela("select * from pessoas");
    preencherValorTotal("select count(*) from pessoas");
    
    }//GEN-LAST:event_jbExibirTudoActionPerformed

    private void jbSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSapatoActionPerformed
      preencherTabela("select * from pessoas where idPessoas="+jtfSapato.getText());
      limpar();
    }//GEN-LAST:event_jbSapatoActionPerformed

    private void jtfQuantidadeTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuantidadeTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuantidadeTotalActionPerformed

    private void jtfSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSapatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSapatoActionPerformed

    private void jbProcurarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarTudoActionPerformed
    preencherTabela("select * from pessoas where nome like'%"+jtfOutros.getText()+"%' or bairro like '%"+jtfOutros.getText()+"%'");
    preencherValorTotal("select count(*) from pessoas where nome like '%"+jtfOutros.getText()+"%' or bairro like '%"+jtfOutros.getText()+"%'");
    }//GEN-LAST:event_jbProcurarTudoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    preencherTabela("select * from pessoas where cpf='"+jftfCpf.getText()+"'");
    preencherValorTotal("select count(*) from pessoas where cpf like '"+jftfCpf.getText()+"'");
    }//GEN-LAST:event_jButton1ActionPerformed
    public int getIdCliente(){
        int idCliente = Integer.parseInt(jtVendas.getValueAt(jtVendas.getSelectedRow(),0).toString());
        return idCliente;
    }
    
    
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
      if(ap==null){  
      ap = new AtualizarPessoas();
      }else{
      ap.setVisible(true);
      }
      ap.setIdCliente(getIdCliente());  
      ap.verificarDados();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jftfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfCpfActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarPessoas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbProcurarTudo;
    private javax.swing.JButton jbSapato;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JLabel jlNada;
    private javax.swing.JLabel jlSapato;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables

 
 public void preencherTabela(String sql){
        ArrayList<Object> dados = new ArrayList<>();
        String [] colunas = new String[]{"ID do cliente","Nome do cliente","Telefone","Bairro","Rua","Genero","CPF","Estado"};
        conecta.abrirBdcon();
        conecta.executaSql(sql);
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("idPessoas"),conecta.rs.getString("nome"),conecta.rs.getString("telefone"),conecta.rs.getString("bairro"),conecta.rs.getString("rua"),conecta.rs.getString("genero"),conecta.rs.getString("cpf"),conecta.rs.getString("estado")});
            }while(conecta.rs.next()); 
        }
        catch(SQLException ex){
            System.out.println("Erro ao preencher tabela  "+sql+" "+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jtVendas.setModel(modelo);     
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
   public void limpar(){
       jtfQuantidadeTotal.setText("");
   }
   
  private void setIcon() {
   setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../SapatariaImagens/icone.png")));
  }
  
  
  
  public boolean verifTabela(){
      if(jtVendas.getRowCount()==0){
          return true;
      }else{
          return false;
      }
  }
}


