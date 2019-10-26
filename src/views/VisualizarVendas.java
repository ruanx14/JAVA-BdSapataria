package views;

import Conexao.Conexao;
import models.models.ModeloTabela;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;


/*
@Ruan Barroso
@Aluno do CETAM - Projeto Exercicio Praticos com Bando de Dados
@ruanx14@gmail.com 
*/


public class VisualizarVendas extends javax.swing.JFrame {
        Conexao conecta = new Conexao();
        int vt;

 
   
    public VisualizarVendas() {
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
        jlVendas = new javax.swing.JLabel();
        jbSapato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbProcurarTudo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfDataVenda = new javax.swing.JFormattedTextField();
        jlFundo = new javax.swing.JLabel();

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
        jtfQuantidadeTotal.setBounds(961, 492, 85, 38);

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtVendas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 44, 1050, 442);

        jbExibirTudo.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbExibirTudo.setText("Exibir tudo");
        jbExibirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 492, 207, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jtfSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(132, 12, 56, 25);

        jlVendas.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlVendas.setText("ID VENDA:");
        getContentPane().add(jlVendas);
        jlVendas.setBounds(20, 11, 94, 24);

        jbSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbSapato.setText("Procurar");
        jbSapato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSapatoActionPerformed(evt);
            }
        });
        getContentPane().add(jbSapato);
        jbSapato.setBounds(198, 11, 93, 27);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Quantidade de vendas:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(621, 495, 322, 32);

        jbVoltar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbVoltar.setText("> Voltar <");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(916, 541, 143, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("Nome do cliente/Tipo do Sapato");
        getContentPane().add(jlNada);
        jlNada.setBounds(299, 15, 222, 19);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(527, 12, 113, 25);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Pesquisar");
        jbProcurarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(650, 11, 103, 27);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("Data da Venda:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(765, 15, 104, 19);

        jButton1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(982, 11, 103, 27);

        try {
            jtfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfDataVenda);
        jtfDataVenda.setBounds(876, 12, 96, 20);

        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoVisualizarAll.png"))); // NOI18N
        getContentPane().add(jlFundo);
        jlFundo.setBounds(0, 0, 1110, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExibirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirTudoActionPerformed
    preencherTabela("select v.idVendas,s.tipoSapato,p.nome,v.dataVenda,v.formaPagamento,v.total,vs.qtdPedidos,s.valor from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas");
    preencherValorTotal("select count(*) from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas");
    
    }//GEN-LAST:event_jbExibirTudoActionPerformed

    private void jbSapatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSapatoActionPerformed
      preencherTabela("select v.idVendas,s.tipoSapato,p.nome,v.dataVenda,v.formaPagamento,v.total,vs.qtdPedidos,s.valor from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas where v.idVendas="+jtfSapato.getText());
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
     preencherTabela("select v.idVendas,s.tipoSapato,p.nome,v.dataVenda,v.formaPagamento,v.total,vs.qtdPedidos,s.valor from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas where s.tipoSapato like '%"+jtfOutros.getText()+"%' or p.nome like '%"+jtfOutros.getText()+"%'");
     preencherValorTotal("select count(*) from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas where s.tipoSapato like '%"+jtfOutros.getText()+"%' or p.nome like '%"+jtfOutros.getText()+"%'");
    
 
    }//GEN-LAST:event_jbProcurarTudoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    preencherTabela("select v.idVendas,s.tipoSapato,p.nome,v.dataVenda,v.formaPagamento,v.total,vs.qtdPedidos,s.valor from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas where v.dataVenda='"+jtfDataVenda.getText()+"'");
    preencherValorTotal("select count(*) from vendas v join vendas_sapatos vs on v.idVendas=vs.idVendas join sapatos s on s.idSapatos=vs.idSapatos join pessoas p on p.idPessoas = v.Pessoas_idPessoas where v.dataVenda='"+jtfDataVenda.getText()+"'");
    
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbProcurarTudo;
    private javax.swing.JButton jbSapato;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlFundo;
    private javax.swing.JLabel jlNada;
    private javax.swing.JLabel jlVendas;
    private javax.swing.JTable jtVendas;
    private javax.swing.JFormattedTextField jtfDataVenda;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables

 
 public void preencherTabela(String sql){
        ArrayList<Object> dados = new ArrayList<>();
        String [] colunas = new String[]{"IdVendas","Tipo do sapato","Cliente","Data da venda","Forma de Pagamento","Total/Venda","Quantidade Comprada","Preco Unitario"};
        conecta.abrirBdcon();
        conecta.executaSql(sql);
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("idVendas"),conecta.rs.getString("tipoSapato"),conecta.rs.getString("nome"),conecta.rs.getString("dataVenda"),conecta.rs.getString("formaPagamento"),conecta.rs.getDouble("total"),conecta.rs.getInt("qtdPedidos"),conecta.rs.getDouble("valor")});
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


