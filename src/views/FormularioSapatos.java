package views;

import models.models.Sapatos;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
@Ruan Barroso
@Aluno do CETAM - Projeto Linguagem Programação III
@ruanx14@gmail.com 
*/
public class FormularioSapatos extends javax.swing.JFrame {
    Sapatos s1 = new Sapatos();
    
    public FormularioSapatos() {
        initComponents();
        //setIcon();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfValor = new javax.swing.JTextField();
        jtfQtdEstoque = new javax.swing.JTextField();
        jCadastrarSapatos = new javax.swing.JButton();
        jVoltarMenu2 = new javax.swing.JButton();
        jcbTamanho = new javax.swing.JComboBox<>();
        jcbMarca = new javax.swing.JComboBox<>();
        jcbGenero = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fundoSapatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jtfValor.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jtfValor.setText("00.00");
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });
        getContentPane().add(jtfValor);
        jtfValor.setBounds(660, 413, 120, 40);

        jtfQtdEstoque.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jtfQtdEstoque.setText("0");
        getContentPane().add(jtfQtdEstoque);
        jtfQtdEstoque.setBounds(660, 240, 270, 53);

        jCadastrarSapatos.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jCadastrarSapatos.setText("> Cadastrar Sapato <");
        jCadastrarSapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarSapatosActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarSapatos);
        jCadastrarSapatos.setBounds(550, 460, 271, 41);

        jVoltarMenu2.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jVoltarMenu2.setText("> Voltar <");
        jVoltarMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarMenu2ActionPerformed(evt);
            }
        });
        getContentPane().add(jVoltarMenu2);
        jVoltarMenu2.setBounds(840, 460, 143, 41);

        jcbTamanho.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30-31", "32-33", "34-35", "36-37", "38-39", "40-41", "42-43", "44-45" }));
        getContentPane().add(jcbTamanho);
        jcbTamanho.setBounds(660, 180, 270, 52);

        jcbMarca.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas", "Nike", "Fila", "Tryon", "Havaianas", "Coca-cola", "Sem marca" }));
        getContentPane().add(jcbMarca);
        jcbMarca.setBounds(660, 300, 270, 50);

        jcbGenero.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(jcbGenero);
        jcbGenero.setBounds(660, 360, 270, 50);

        jcbTipo.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Percata", "Sandalia", "Salto alto", "Sapatilha", "Bota", "Tenis", "Sapato Social" }));
        getContentPane().add(jcbTipo);
        jcbTipo.setBounds(660, 120, 270, 54);

        jbLimpar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbLimpar.setText("> Limpar < ");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(380, 460, 161, 41);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel2.setText("Tipo de Sapato: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 130, 283, 47);

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel3.setText("Tamanho: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 190, 185, 47);

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel4.setText("Quantidade em estoque:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 250, 419, 47);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel5.setText("Marca: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 300, 128, 47);

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel6.setText("Genero Sapato: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 350, 280, 47);

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel7.setText("Preco do Sapato: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 410, 309, 47);

        fundoSapatos.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        fundoSapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundosSapatos.png"))); // NOI18N
        getContentPane().add(fundoSapatos);
        fundoSapatos.setBounds(0, 0, 1060, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarMenu2ActionPerformed
        BdSapataria bd = new BdSapataria();
        bd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jVoltarMenu2ActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
       
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jCadastrarSapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarSapatosActionPerformed
        s1.setTamanho(jcbTamanho.getSelectedItem().toString());
        s1.setMarca(jcbMarca.getSelectedItem().toString());
        s1.setValor(Double.parseDouble(jtfValor.getText()));
        s1.setQtdEstoque(Integer.parseInt(jtfQtdEstoque.getText()));
        s1.setTipoSapato(jcbTipo.getSelectedItem().toString());
        s1.setGeneroSapato(jcbGenero.getSelectedItem().toString());
        if(s1.getQtdEstoque()>0 && s1.getValor()>0){
            s1.cadastrarSapatos();
        }
        else{
            JOptionPane.showMessageDialog(null, "VALORES INVALIDOS ");
        }
    }//GEN-LAST:event_jCadastrarSapatosActionPerformed
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
      limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

  
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
            java.util.logging.Logger.getLogger(FormularioSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioSapatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioSapatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoSapatos;
    private javax.swing.JButton jCadastrarSapatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jVoltarMenu2;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JComboBox<String> jcbTamanho;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField jtfQtdEstoque;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
    public void limpar(){
    jtfQtdEstoque.setText("");
    jtfValor.setText(""); 
    }
    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../SapatariaImagens/icone.png")));
    }
}
