package views;

import java.awt.event.ActionListener;


public class AtualizarPessoas extends javax.swing.JFrame {

    public AtualizarPessoas() {
        initComponents();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNome = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jbCadastrarPessoa = new javax.swing.JButton();
        jbVoltarMenu = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfNome.setToolTipText("");
        getContentPane().add(jtfNome);
        jtfNome.setBounds(143, 81, 568, 40);

        jtfBairro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfBairro);
        jtfBairro.setBounds(142, 252, 571, 40);

        jbCadastrarPessoa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbCadastrarPessoa.setText("> Atualizar dados < ");
        jbCadastrarPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jbCadastrarPessoa);
        jbCadastrarPessoa.setBounds(370, 430, 247, 37);

        jbVoltarMenu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbVoltarMenu.setText("> Voltar < ");
        jbVoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltarMenu);
        jbVoltarMenu.setBounds(620, 430, 143, 37);

        jcbEstado.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "SP", "RJ", "SC", "MT", "MS", "PA", "AP", "RO", "AC", "RM", "BA", "PE", "PI", "SE", "MA", " ", " " }));
        getContentPane().add(jcbEstado);
        jcbEstado.setBounds(482, 374, 143, 35);

        jcbGeneros.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jcbGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        getContentPane().add(jcbGeneros);
        jcbGeneros.setBounds(144, 374, 235, 35);

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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Rua: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(66, 315, 58, 29);

        jtfRua.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfRua);
        jtfRua.setBounds(142, 310, 571, 40);

        jlFundo.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundosAlterarPessoas.png"))); // NOI18N
        getContentPane().add(jlFundo);
        jlFundo.setBounds(0, -20, 890, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String getTelefone(){
        return jftTelefone.getText();
    }
    public String getCpf(){
        return jftCpf.getText();
    }
    public String getEstado(){
        return String.valueOf(jcbEstado.getSelectedItem());
    }
    public String getGenero(){
        return String.valueOf(jcbGeneros.getSelectedItem());
    }
    public String getJtfNome(){
        return jtfNome.getText();
    }
    public String getJtfBairro(){
        return jtfBairro.getText();
    }
    public String getJtfRua(){
        return jtfRua.getText();
    }
    
    public void setJtfNome(String nome){
        jtfNome.setText(nome);
    }
    public void setJtfBairro(String bairro){
        jtfBairro.setText(bairro);
    }
    public void setJtfRua(String rua){
        jtfRua.setText(rua);
    }
     public void setJtfTelefone(String telefone){
        jftTelefone.setText(telefone);
    }
    public void setJtfCpf(String cpf){
        jftCpf.setText(cpf);
    }
    public void setJcbGenero(String genero){
        //jcbGeneros.
    }
    public void setJcbEstado(String estado){
        //jcbGeneros.
    }
    
   //
    public void atualizarPessoa(ActionListener evt){
        jbCadastrarPessoa.addActionListener(evt);
    }
    
    private void jbVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarMenuActionPerformed
        dispose();
    }//GEN-LAST:event_jbVoltarMenuActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCadastrarPessoa;
    private javax.swing.JButton jbVoltarMenu;
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
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables

    
}