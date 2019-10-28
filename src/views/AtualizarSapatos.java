package views;

import java.awt.event.ActionListener;


public class AtualizarSapatos extends javax.swing.JFrame {
    public AtualizarSapatos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfValor = new javax.swing.JTextField();
        jtfQtdEstoque = new javax.swing.JTextField();
        jbAtualizarDados = new javax.swing.JButton();
        jVoltarMenu = new javax.swing.JButton();
        jcbTamanho = new javax.swing.JComboBox<>();
        jcbMarca = new javax.swing.JComboBox<>();
        jcbGenero = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jbVerifID = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfValor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfValor.setText("00.00");
        getContentPane().add(jtfValor);
        jtfValor.setBounds(359, 379, 116, 35);

        jtfQtdEstoque.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfQtdEstoque.setText("0");
        getContentPane().add(jtfQtdEstoque);
        jtfQtdEstoque.setBounds(359, 215, 280, 43);

        jbAtualizarDados.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbAtualizarDados.setText("> Atualizar dados <");
        getContentPane().add(jbAtualizarDados);
        jbAtualizarDados.setBounds(287, 425, 241, 37);

        jVoltarMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jVoltarMenu.setText("> Voltar <");
        jVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jVoltarMenu);
        jVoltarMenu.setBounds(546, 425, 137, 37);

        jcbTamanho.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30-31", "32-33", "34-35", "36-37", "38-39", "40-41", "42-43", "44-45" }));
        getContentPane().add(jcbTamanho);
        jcbTamanho.setBounds(359, 162, 100, 35);

        jcbMarca.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas", "Nike", "Fila", "Tryon", "Havaianas", "Coca-cola", "Sem marca" }));
        getContentPane().add(jcbMarca);
        jcbMarca.setBounds(359, 272, 280, 38);

        jcbGenero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(jcbGenero);
        jcbGenero.setBounds(359, 328, 280, 35);

        jcbTipo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Percata", "Sandalia", "Salto alto", "Sapatilha", "Bota", "Tenis", "Sapato Social" }));
        getContentPane().add(jcbTipo);
        jcbTipo.setBounds(359, 107, 280, 37);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Tipo de Sapato: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(35, 112, 177, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Tamanho: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(35, 168, 115, 29);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Quantidade em estoque:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(35, 222, 266, 29);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Marca: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(35, 281, 79, 29);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Genero Sapato: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(35, 331, 177, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Preco do Sapato: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(35, 382, 193, 29);

        jtfID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfID);
        jtfID.setBounds(35, 425, 77, 33);

        jbVerifID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbVerifID.setText("Verificar ID");
        getContentPane().add(jbVerifID);
        jbVerifID.setBounds(118, 426, 163, 34);

        FUNDO.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundosAlterarSapatos.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, 0, 840, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    public void atualizarSapato(ActionListener evt){
        jbAtualizarDados.addActionListener(evt);
    }
    
    private void jVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarMenuActionPerformed
        dispose();
    }//GEN-LAST:event_jVoltarMenuActionPerformed

  
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
            java.util.logging.Logger.getLogger(AtualizarSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AtualizarSapatos().setVisible(true);
                
            }
         
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jVoltarMenu;
    private javax.swing.JButton jbAtualizarDados;
    private javax.swing.JButton jbVerifID;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbTamanho;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfQtdEstoque;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables

}
