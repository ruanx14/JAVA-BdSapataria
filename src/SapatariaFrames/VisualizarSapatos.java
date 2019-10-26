package SapatariaFrames;

import SapatariaInfo.Conexao;
import SapatariaInfo.ModeloTabela;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
@Ruan Barroso
@Aluno do CETAM - Projeto Exercicio Praticos com Bando de Dados
@ruanx14@gmail.com || 
*/

public class VisualizarSapatos extends javax.swing.JFrame {
        Conexao conecta = new Conexao();
        int vt;
        AtualizarSapatos as;

 
   
    public VisualizarSapatos() {
        initComponents();
        //setIcon();
        jtfQuantidadeTotal.setEnabled(false);
        //setSize(1090,630);
        
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
        jbVoltar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbProcurarTudo = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1070, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jtfQuantidadeTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuantidadeTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jtfQuantidadeTotal);
        jtfQuantidadeTotal.setBounds(910, 500, 85, 38);

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtVendas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 44, 1020, 442);

        jbExibirTudo.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbExibirTudo.setText("Exibir tudo");
        jbExibirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 492, 180, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jtfSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(110, 10, 83, 25);

        jlSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlSapato.setText("ID SAPATO:");
        getContentPane().add(jlSapato);
        jlSapato.setBounds(20, 11, 94, 24);

        jbSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbSapato.setText("Procurar");
        jbSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jbSapato);
        jbSapato.setBounds(200, 10, 93, 27);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Quantidade de sapatos:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 500, 322, 32);

        jbVoltar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbVoltar.setText("> Voltar <");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(850, 540, 143, 41);

        jbAlterar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbAlterar.setText("Alterar dados");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(220, 492, 210, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("Marca ou tipo de sapato: ");
        getContentPane().add(jlNada);
        jlNada.setBounds(360, 10, 177, 20);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(540, 10, 133, 25);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Procurar");
        jbProcurarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(686, 11, 93, 27);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoVisualizarAll.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, -10, 1100, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExibirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirTudoActionPerformed
    preencherTabela("select * from sapatos");
    preencherValorTotal("select count(*) from sapatos");
    
    }//GEN-LAST:event_jbExibirTudoActionPerformed

    private void jbSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSapatoActionPerformed
      preencherTabela("select * from sapatos where idSapatos="+jtfSapato.getText());
      limpar();
    }//GEN-LAST:event_jbSapatoActionPerformed

    private void jtfQuantidadeTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuantidadeTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuantidadeTotalActionPerformed

    private void jtfSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSapatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSapatoActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
    dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbProcurarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarTudoActionPerformed
    preencherTabela("select * from sapatos where marca='"+jtfOutros.getText()+"' or tipoSapato='"+jtfOutros.getText()+"'");
    preencherValorTotal("select count(*) from sapatos where marca='"+jtfOutros.getText()+"' or tipoSapato='"+jtfOutros.getText()+"'");
    }//GEN-LAST:event_jbProcurarTudoActionPerformed
    public Object retornarId(){
        return jtVendas.getValueAt(jtVendas.getSelectedRow(),0);
    }
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
      if(as==null){
      as = new AtualizarSapatos();
      }
      if((int)retornarId()!=0){
      as.setVisible(true);
      }else{
      JOptionPane.showMessageDialog(null,"Nenhum Selecionado");    
      }  
      as.alterarId(retornarId());
      as.verificarDados();
    }//GEN-LAST:event_jbAlterarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarSapatos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbProcurarTudo;
    private javax.swing.JButton jbSapato;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlNada;
    private javax.swing.JLabel jlSapato;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables

 
 public void preencherTabela(String sql){
        ArrayList<Object> dados = new ArrayList<>();
        String [] colunas = new String[]{"idSapatos","tipoSapato","valor","qtdEstoque", "generoSapato","tamanho","marca"};
        conecta.abrirBdcon();
        conecta.executaSql(sql);
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("idSapatos"),conecta.rs.getString("tipoSapato"),conecta.rs.getDouble("valor"),conecta.rs.getInt("qtdEstoque"),conecta.rs.getString("generoSapato"),conecta.rs.getString("tamanho"),conecta.rs.getString("marca")});
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
   
}


