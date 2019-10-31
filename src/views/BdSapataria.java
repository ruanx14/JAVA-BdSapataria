package views;

import java.awt.event.ActionListener;

import views.*;
import controllers.*;

public class BdSapataria extends javax.swing.JFrame {
    Ajuda hp = null;
    public BdSapataria() {
       initComponents();
    }
    public void telaCadastrarPessoa(ActionListener listener){
        jbCadastrarPessoas.addActionListener(listener);
    }
    public void telaCadastrarSapatos(ActionListener listener){
        jbCadastrarSapatos.addActionListener(listener);
    }
    public void telaCadastrarVendas(ActionListener listener){
        jbCadastrarVendas.addActionListener(listener);
    }
    
     public void telaVisualizarPessoas(ActionListener listener){
        jbPessoas.addActionListener(listener);
    }
    public void telaVisualizarSapatos(ActionListener listener){
        jbSapatos.addActionListener(listener);
    }
    public void telaVisualizarVendas(ActionListener listener){
        jbVendas.addActionListener(listener);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        Guias = new javax.swing.JTabbedPane();
        Guias1 = new javax.swing.JPanel();
        jbCadastrarVendas = new javax.swing.JButton();
        jbCadastrarSapatos = new javax.swing.JButton();
        jbCadastrarPessoas = new javax.swing.JButton();
        Guias2 = new javax.swing.JPanel();
        jbPessoas = new javax.swing.JButton();
        jbSapatos = new javax.swing.JButton();
        jbVendas = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();
        jmMenu = new javax.swing.JMenuBar();
        jmCadastrar = new javax.swing.JMenu();
        jmiCadastrarPessoas = new javax.swing.JMenuItem();
        jmiCadastrarSapatos = new javax.swing.JMenuItem();
        jmiCadastrarVendas = new javax.swing.JMenuItem();
        jmVisualizar = new javax.swing.JMenu();
        jmVisualizarVendas = new javax.swing.JMenuItem();
        jmiVisualizarSapatos = new javax.swing.JMenuItem();
        jmiVisualizarPessoas = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setPreferredSize(new java.awt.Dimension(1050, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ModeloLeft.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, -10, 360, 600);

        Guias.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        Guias1.setBackground(new java.awt.Color(204, 204, 204));

        jbCadastrarVendas.setBackground(new java.awt.Color(204, 204, 204));
        jbCadastrarVendas.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbCadastrarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarVendas.png"))); // NOI18N
        jbCadastrarVendas.setText("              Cadastrar Vendas");
        jbCadastrarVendas.setActionCommand("Cadastrar Pessoas");
        jbCadastrarVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrarVendas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbCadastrarVendas.setPreferredSize(new java.awt.Dimension(650, 210));

        jbCadastrarSapatos.setBackground(new java.awt.Color(204, 204, 204));
        jbCadastrarSapatos.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbCadastrarSapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarSapatos.png"))); // NOI18N
        jbCadastrarSapatos.setText("              Cadastrar Sapatos");
        jbCadastrarSapatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbCadastrarSapatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbCadastrarPessoas.setBackground(new java.awt.Color(204, 204, 204));
        jbCadastrarPessoas.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbCadastrarPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrarPessoas.png"))); // NOI18N
        jbCadastrarPessoas.setText("              Cadastrar Pessoas");
        jbCadastrarPessoas.setActionCommand("Cadastrar Pessoas");
        jbCadastrarPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrarPessoas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbCadastrarPessoas.setPreferredSize(new java.awt.Dimension(650, 210));

        javax.swing.GroupLayout Guias1Layout = new javax.swing.GroupLayout(Guias1);
        Guias1.setLayout(Guias1Layout);
        Guias1Layout.setHorizontalGroup(
            Guias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCadastrarPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addComponent(jbCadastrarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jbCadastrarSapatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Guias1Layout.setVerticalGroup(
            Guias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Guias1Layout.createSequentialGroup()
                .addComponent(jbCadastrarPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastrarSapatos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastrarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Guias.addTab("Menu de Cadastro", Guias1);

        Guias2.setBackground(new java.awt.Color(204, 204, 204));

        jbPessoas.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visualizarPessoas.png"))); // NOI18N
        jbPessoas.setText("Visualizar Pessoas                  ");
        jbPessoas.setToolTipText("");
        jbPessoas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbPessoas.setPreferredSize(new java.awt.Dimension(650, 210));

        jbSapatos.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbSapatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visualizarSapatos.png"))); // NOI18N
        jbSapatos.setText("Visualizar Sapatos                  ");
        jbSapatos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbSapatos.setMinimumSize(new java.awt.Dimension(650, 210));
        jbSapatos.setPreferredSize(new java.awt.Dimension(650, 210));

        jbVendas.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jbVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visualizarVendas.png"))); // NOI18N
        jbVendas.setText("Visualizar Vendas                  ");
        jbVendas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout Guias2Layout = new javax.swing.GroupLayout(Guias2);
        Guias2.setLayout(Guias2Layout);
        Guias2Layout.setHorizontalGroup(
            Guias2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Guias2Layout.createSequentialGroup()
                .addGroup(Guias2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSapatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Guias2Layout.setVerticalGroup(
            Guias2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Guias2Layout.createSequentialGroup()
                .addComponent(jbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSapatos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Guias.addTab("Menu de Exibição", Guias2);

        getContentPane().add(Guias);
        Guias.setBounds(390, 20, 620, 530);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoBdSapataria.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(-110, 0, 1190, 690);

        jmMenu.setBackground(new java.awt.Color(255, 255, 255));

        jmCadastrar.setText("Cadastrar");

        jmiCadastrarPessoas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadastrarPessoas.setText("Cadastrar Pessoas");
        jmiCadastrarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarPessoasActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadastrarPessoas);

        jmiCadastrarSapatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadastrarSapatos.setText("Cadastrar Sapatos");
        jmiCadastrarSapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarSapatosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadastrarSapatos);

        jmiCadastrarVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmiCadastrarVendas.setText("Cadastrar Vendas");
        jmiCadastrarVendas.setToolTipText("");
        jmiCadastrarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarVendasActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiCadastrarVendas);

        jmMenu.add(jmCadastrar);

        jmVisualizar.setText("Visualizar");

        jmVisualizarVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jmVisualizarVendas.setText("Visualizar Vendas");
        jmVisualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVisualizarVendasActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmVisualizarVendas);

        jmiVisualizarSapatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        jmiVisualizarSapatos.setText("Visualizar Sapatos");
        jmiVisualizarSapatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVisualizarSapatosActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiVisualizarSapatos);

        jmiVisualizarPessoas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jmiVisualizarPessoas.setText("Visualizar Pessoas");
        jmiVisualizarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVisualizarPessoasActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiVisualizarPessoas);

        jmMenu.add(jmVisualizar);

        jmAjuda.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAjuda.add(jMenuItem1);

        jmMenu.add(jmAjuda);

        setJMenuBar(jmMenu);

        getAccessibleContext().setAccessibleParent(jbCadastrarVendas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarPessoasActionPerformed
       new FormularioPessoasController(new FormularioPessoas());
    }//GEN-LAST:event_jmiCadastrarPessoasActionPerformed
   
    private void jmVisualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVisualizarVendasActionPerformed
       new VisualizarVendasController(new VisualizarVendas());
    }//GEN-LAST:event_jmVisualizarVendasActionPerformed

    private void jmiCadastrarSapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarSapatosActionPerformed
        new FormularioSapatosController(new FormularioSapatos());
    }//GEN-LAST:event_jmiCadastrarSapatosActionPerformed

    private void jmiCadastrarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarVendasActionPerformed
       new FormularioVendasController(new FormularioVendas());
    }//GEN-LAST:event_jmiCadastrarVendasActionPerformed

    private void jmiVisualizarSapatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVisualizarSapatosActionPerformed
       new VisualizarSapatosController(new VisualizarSapatos());  
    }//GEN-LAST:event_jmiVisualizarSapatosActionPerformed

    private void jmiVisualizarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVisualizarPessoasActionPerformed
       new VisualizarPessoasController(new VisualizarPessoas());  
    }//GEN-LAST:event_jmiVisualizarPessoasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     if(hp==null){
            hp = new Ajuda();
        }
        hp.setVisible(true);  
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BdSapataria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BdSapataria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BdSapataria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BdSapataria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BdSapataria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JTabbedPane Guias;
    private javax.swing.JPanel Guias1;
    private javax.swing.JPanel Guias2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbCadastrarPessoas;
    private javax.swing.JButton jbCadastrarSapatos;
    private javax.swing.JButton jbCadastrarVendas;
    private javax.swing.JButton jbPessoas;
    private javax.swing.JButton jbSapatos;
    private javax.swing.JButton jbVendas;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenuBar jmMenu;
    private javax.swing.JMenu jmVisualizar;
    private javax.swing.JMenuItem jmVisualizarVendas;
    private javax.swing.JMenuItem jmiCadastrarPessoas;
    private javax.swing.JMenuItem jmiCadastrarSapatos;
    private javax.swing.JMenuItem jmiCadastrarVendas;
    private javax.swing.JMenuItem jmiVisualizarPessoas;
    private javax.swing.JMenuItem jmiVisualizarSapatos;
    // End of variables declaration//GEN-END:variables

}