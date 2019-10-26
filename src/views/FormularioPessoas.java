package views;
/*
@Ruan Barroso
@Aluno do CETAM - Projeto Exercicios práticos - Banco de Dados III
@ruanx14@gmail.com 
*/
import models.models.Pessoas;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class FormularioPessoas extends javax.swing.JFrame {
    Pessoas p1 = new Pessoas();
    String tt;
    
    public FormularioPessoas() {
        initComponents();
        //setIcon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNome = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jCadastrarPessoa = new javax.swing.JButton();
        jVoltarMenu = new javax.swing.JButton();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbGeneros = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jftTelefone = new javax.swing.JFormattedTextField();
        jftCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfNome.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jtfNome.setToolTipText("");
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(428, 134, 571, 40);

        jtfBairro.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        getContentPane().add(jtfBairro);
        jtfBairro.setBounds(428, 305, 571, 50);

        jCadastrarPessoa.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jCadastrarPessoa.setText("> Cadastrar < ");
        jCadastrarPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarPessoa);
        jCadastrarPessoa.setBounds(628, 517, 187, 41);

        jVoltarMenu.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jVoltarMenu.setText("> Voltar < ");
        jVoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jVoltarMenu);
        jVoltarMenu.setBounds(829, 517, 143, 41);

        jcbEstado.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "SP", "RJ", "SC", "MT", "MS", "PA", "AP", "RO", "AC", "RM", "BA", "PE", "PI", "SE", "MA", " ", " " }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbEstado);
        jcbEstado.setBounds(839, 441, 143, 53);

        jcbGeneros.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jcbGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(jcbGeneros);
        jcbGeneros.setBounds(438, 441, 235, 53);

        jbLimpar.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jbLimpar.setText("> Limpar < ");
        jbLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(459, 517, 155, 41);

        jlNome.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlNome.setText("Nome: ");
        getContentPane().add(jlNome);
        jlNome.setBounds(227, 134, 117, 47);

        jlTelefone.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlTelefone.setText("Telefone");
        getContentPane().add(jlTelefone);
        jlTelefone.setBounds(227, 189, 137, 47);

        jlBairro.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlBairro.setText("Bairro: ");
        getContentPane().add(jlBairro);
        jlBairro.setBounds(227, 310, 115, 47);

        jlGenero.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlGenero.setText("Genero: ");
        getContentPane().add(jlGenero);
        jlGenero.setBounds(227, 439, 167, 47);

        jlCpf.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlCpf.setText("CPF: ");
        getContentPane().add(jlCpf);
        jlCpf.setBounds(227, 244, 140, 43);

        jlEstado.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jlEstado.setText("Estado: ");
        getContentPane().add(jlEstado);
        jlEstado.setBounds(703, 444, 132, 47);

        try {
            jftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftTelefone.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        getContentPane().add(jftTelefone);
        jftTelefone.setBounds(428, 182, 571, 50);

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jftCpf);
        jftCpf.setBounds(428, 244, 571, 50);

        jLabel3.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jLabel3.setText("Rua: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(227, 365, 85, 47);

        jtfRua.setFont(new java.awt.Font("Arial", 0, 33)); // NOI18N
        getContentPane().add(jtfRua);
        jtfRua.setBounds(428, 365, 571, 45);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoPessoas.PNG"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, -40, 1170, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarMenuActionPerformed
        BdSapataria fp = new BdSapataria();
        fp.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_jVoltarMenuActionPerformed

    private void jCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarPessoaActionPerformed
      p1.setNome(jtfNome.getText());
      p1.setBairro(jtfBairro.getText());
      p1.setRua(jtfRua.getText());
      p1.setCpf(jftCpf.getText());
      p1.setGenero(jcbGeneros.getSelectedItem().toString());
      p1.setTelefone(jftTelefone.getText());
      p1.setEstado(jcbEstado.getSelectedItem().toString());
      if((jftCpf.getText().length()>14)&&(jftCpf.getText().length()<14)){
            JOptionPane.showMessageDialog(null,"Dados Invalidos");
      }
      else{
           p1.cadastrarPessoas();
           limpar(); 
      }
       
    }//GEN-LAST:event_jCadastrarPessoaActionPerformed
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
      limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
       
    }//GEN-LAST:event_jcbEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jCadastrarPessoa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jVoltarMenu;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbGeneros;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JFormattedTextField jftTelefone;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables

    public void limpar(){
    jftCpf.setText("");
    jtfBairro.setText("");
    jtfRua.setText("");
    jtfNome.setText("");
    jftTelefone.setText("");
    }
    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../SapatariaImagens/icone.png")));
    } 
}