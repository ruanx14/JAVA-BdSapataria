package views;

import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class VisualizarVendas extends javax.swing.JFrame {
   
    public VisualizarVendas() {
        initComponents();    
        jtfQuantidadeTotal.setEnabled(false);
    }
    public void setAlterarQuantidade(int qtd){
        jtfQuantidadeTotal.setText(String.valueOf(qtd));
    }
    public String getIdVenda(){
        return jtfSapato.getText();
    }
    public String getDataVenda(){
        return jtfDataVenda.getText();
    }
    public String getNomeTipo(){
        return jtfOutros.getText();
    }
    public void setLabel(String txt){
        jLabel1.setText(txt);
    }
    public void setAlterarTabela(Vector linhas, Vector colunas){
        DefaultTableModel modelo = new DefaultTableModel(linhas,colunas);
        jtVendas.setModel(modelo);
    }
    public void jVoltarMenu(ActionListener evt){
        jbVoltar.addActionListener(evt);
    }
    public void jExibirTudo(ActionListener evt){
        jbExibirTudo.addActionListener(evt);
    }
    public void jPorNome(ActionListener evt){
        jbProcurarTudo.addActionListener(evt);
    }
    public void jPorID(ActionListener evt){
        jbVenda.addActionListener(evt);
    }
    public void jDataVenda(ActionListener evt){
        jbDataVenda.addActionListener(evt);
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
        jbVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbProcurarTudo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbDataVenda = new javax.swing.JButton();
        jtfDataVenda = new javax.swing.JFormattedTextField();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 625));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
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
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 492, 207, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(132, 12, 56, 25);

        jlVendas.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlVendas.setText("ID VENDA:");
        getContentPane().add(jlVendas);
        jlVendas.setBounds(20, 11, 94, 24);

        jbVenda.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbVenda.setText("Procurar");
        getContentPane().add(jbVenda);
        jbVenda.setBounds(198, 11, 93, 27);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Quantidade de vendas:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 490, 360, 32);

        jbVoltar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbVoltar.setText("> Voltar <");
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(850, 540, 143, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("Nome do cliente/Tipo do Sapato");
        getContentPane().add(jlNada);
        jlNada.setBounds(299, 15, 222, 19);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(527, 12, 113, 25);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Pesquisar");
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(650, 11, 103, 27);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("Data da Venda:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(765, 15, 104, 19);

        jbDataVenda.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbDataVenda.setText("Pesquisar");
        getContentPane().add(jbDataVenda);
        jbDataVenda.setBounds(982, 11, 103, 27);

        try {
            jtfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfDataVenda);
        jtfDataVenda.setBounds(876, 12, 96, 20);

        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoVisualizarAll.png"))); // NOI18N
        jlFundo.setPreferredSize(new java.awt.Dimension(1110, 610));
        getContentPane().add(jlFundo);
        jlFundo.setBounds(0, 0, 1120, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbDataVenda;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbProcurarTudo;
    private javax.swing.JButton jbVenda;
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

}


