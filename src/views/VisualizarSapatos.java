package views;

import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class VisualizarSapatos extends javax.swing.JFrame {
   
    public VisualizarSapatos() {
        initComponents();  
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
        jbVoltar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbProcurarTudo = new javax.swing.JButton();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1072, 629));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
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
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 490, 180, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(110, 10, 83, 25);

        jlSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlSapato.setText("ID SAPATO:");
        getContentPane().add(jlSapato);
        jlSapato.setBounds(20, 11, 94, 24);

        jbSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbSapato.setText("Procurar");
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
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(800, 550, 143, 41);

        jbAlterar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbAlterar.setText("Alterar dados");
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(220, 490, 210, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("Marca ou tipo de sapato: ");
        getContentPane().add(jlNada);
        jlNada.setBounds(360, 10, 177, 20);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(540, 10, 133, 25);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Procurar");
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(686, 11, 93, 27);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoVisualizarAll.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, -10, 1100, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String objClicado(){
        return String.valueOf(jtVendas.getValueAt(jtVendas.getSelectedRow(), 0));
    }
    public String getIdSapato(){
        return jtfSapato.getText();
    }       
    public String getMarcaTipo(){
        return jtfOutros.getText();
    }
    public void setQuantidadeTotal(int qtd){
        jtfQuantidadeTotal.setText(String.valueOf(qtd));
    }
    public void setAlterarTabela(Vector linhas, Vector colunas){
        DefaultTableModel modelo = new DefaultTableModel(linhas,colunas);
        jtVendas.setModel(modelo);
    }
     public void jVoltarMenu(ActionListener evt){
        jbVoltar.addActionListener(evt);
    }
    public void jAlterarDados(ActionListener evt){
        jbAlterar.addActionListener(evt);
    }
    public void jExibirTudo(ActionListener evt){
        jbExibirTudo.addActionListener(evt);
    }
    public void jPorNome(ActionListener evt){
        jbProcurarTudo.addActionListener(evt);
    }
    public void jPorID(ActionListener evt){
        jbSapato.addActionListener(evt);
    }
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

}

