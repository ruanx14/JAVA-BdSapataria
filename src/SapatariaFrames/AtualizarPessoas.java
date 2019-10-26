package SapatariaFrames;
/*
@Ruan Barroso
@Aluno do CETAM - Projeto Linguagem Programação III
@ruanx14@gmail.com
*/
import SapatariaInfo.Pessoas;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class AtualizarPessoas extends javax.swing.JFrame {
    Pessoas p1 = new Pessoas();
    Pessoas p2 = new Pessoas();
    String tt;
    int idCliente;
    
    public AtualizarPessoas() {
        initComponents();
        //setIcon();
        jtfID.setText(String.valueOf(idCliente));
        jtfID.setEnabled(false);
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
        jlNome = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jftTelefone = new javax.swing.JFormattedTextField();
        jftCpf = new javax.swing.JFormattedTextField();
        jbVerificarID = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfNome.setToolTipText("");
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(143, 81, 568, 40);

        jtfBairro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfBairro);
        jtfBairro.setBounds(142, 252, 571, 40);

        jCadastrarPessoa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jCadastrarPessoa.setText("> Atualizar dados < ");
        jCadastrarPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarPessoa);
        jCadastrarPessoa.setBounds(370, 430, 245, 45);

        jVoltarMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jVoltarMenu.setText("> Voltar < ");
        jVoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jVoltarMenu);
        jVoltarMenu.setBounds(620, 430, 141, 45);

        jcbEstado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "SP", "RJ", "SC", "MT", "MS", "PA", "AP", "RO", "AC", "RM", "BA", "PE", "PI", "SE", "MA", " ", " " }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbEstado);
        jcbEstado.setBounds(482, 374, 143, 39);

        jcbGeneros.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(jcbGeneros);
        jcbGeneros.setBounds(144, 374, 235, 39);

        jlNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlNome.setText("Nome: ");
        getContentPane().add(jlNome);
        jlNome.setBounds(48, 86, 77, 29);

        jlTelefone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlTelefone.setText("Telefone: ");
        getContentPane().add(jlTelefone);
        jlTelefone.setBounds(18, 144, 107, 29);

        jlBairro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlBairro.setText("Bairro: ");
        getContentPane().add(jlBairro);
        jlBairro.setBounds(47, 257, 77, 29);

        jlGenero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlGenero.setText("Genero: ");
        getContentPane().add(jlGenero);
        jlGenero.setBounds(30, 368, 167, 47);

        jlCpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlCpf.setText("CPF: ");
        jlCpf.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jlCpf);
        jlCpf.setBounds(60, 200, 62, 43);

        jlEstado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlEstado.setText("Estado: ");
        getContentPane().add(jlEstado);
        jlEstado.setBounds(389, 377, 89, 29);

        try {
            jftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftTelefone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jftTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jftTelefone);
        jftTelefone.setBounds(143, 139, 568, 40);

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jftCpf);
        jftCpf.setBounds(143, 200, 571, 40);

        jbVerificarID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbVerificarID.setText("VERIFICAR ID");
        jbVerificarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarIDActionPerformed(evt);
            }
        });
        getContentPane().add(jbVerificarID);
        jbVerificarID.setBounds(170, 430, 190, 45);

        jtfID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfID);
        jtfID.setBounds(70, 430, 90, 37);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Rua: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(66, 315, 58, 29);

        jtfRua.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfRua);
        jtfRua.setBounds(142, 310, 571, 40);

        jlFundo.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundosAlterarPessoas.png"))); // NOI18N
        getContentPane().add(jlFundo);
        jlFundo.setBounds(0, -20, 890, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarMenuActionPerformed
        dispose();
       
    }//GEN-LAST:event_jVoltarMenuActionPerformed

    private void jCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarPessoaActionPerformed
      p1.setIdPessoas(getIdCliente());
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
          if((jtfNome.getText().length()<1)||(jtfBairro.getText().length()<1)||(jtfRua.getText().length()<1)){
           JOptionPane.showMessageDialog(null,"Dados não inseridos para atualização");
           limpar(); 
           dispose();
          }else{
              p1.updateSelecionado();
              limpar();
              dispose();
          }
           }
    }//GEN-LAST:event_jCadastrarPessoaActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
       
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jftTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftTelefoneActionPerformed

    private void jbVerificarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarIDActionPerformed
       verificarDados();
    }//GEN-LAST:event_jbVerificarIDActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarPessoa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jVoltarMenu;
    private javax.swing.JButton jbVerificarID;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbGeneros;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JFormattedTextField jftTelefone;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFundo;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables

    public void limpar(){
    jftCpf.setText("");
    jtfBairro.setText("");
    jtfRua.setText("");
    jtfNome.setText("");
    jftTelefone.setText("");
    jtfID.setText("");
    }
    private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../SapatariaImagens/icone.png")));
    } 
    public void setIdCliente(int id){
        this.idCliente = id;
    }
    public int getIdCliente(){
        return idCliente;
    }
    public void verificarDados(){
       p1.setIdPessoas(getIdCliente());
       p2 = p1.selecionarPessoasPeloId(p1);
       jtfID.setText(String.valueOf(getIdCliente()));
       jftCpf.setText(p2.getCpf());
       jtfBairro.setText(p2.getBairro());
       jtfRua.setText(p2.getRua());
       jtfNome.setText(String.valueOf(p2.getNome()));
       jftTelefone.setText(p2.getTelefone());
       jcbEstado.setSelectedItem(p2.getEstado());
       jcbGeneros.setSelectedItem(p2.getGenero());
       
    }
}