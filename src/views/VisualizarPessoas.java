package views;

import java.awt.event.ActionListener;

public class VisualizarPessoas extends javax.swing.JFrame {

    public VisualizarPessoas() {
        initComponents();
        
    }
    //
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
    public void jPorCPF(ActionListener evt){
        jbCPF.addActionListener(evt);
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
        jbAlterar = new javax.swing.JButton();
        jlNada = new javax.swing.JLabel();
        jtfOutros = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        jbProcurarTudo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbCPF = new javax.swing.JButton();
        jftfCpf = new javax.swing.JFormattedTextField();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1149, 625));
        getContentPane().setLayout(null);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jtfQuantidadeTotal);
        jtfQuantidadeTotal.setBounds(980, 490, 111, 38);

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtVendas);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 1120, 442);

        jbExibirTudo.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbExibirTudo.setText("Exibir todos clientes");
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(30, 491, 278, 41);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(136, 12, 83, 25);

        jlSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlSapato.setText("ID DO CLIENTE: ");
        getContentPane().add(jlSapato);
        jlSapato.setBounds(20, 15, 112, 19);

        jbSapato.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbSapato.setText("Procurar");
        getContentPane().add(jbSapato);
        jbSapato.setBounds(229, 11, 93, 27);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Quantidade de clientes: ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 490, 322, 32);

        jbAlterar.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jbAlterar.setText("Alterar dados");
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(60, 540, 220, 41);

        jlNada.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jlNada.setText("NOME CLIENTE/BAIRRO");
        getContentPane().add(jlNada);
        jlNada.setBounds(338, 15, 163, 19);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(502, 12, 133, 25);

        jbVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbVoltar.setText("> Voltar <");
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(930, 540, 130, 30);

        jbProcurarTudo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbProcurarTudo.setText("Pesquisar");
        getContentPane().add(jbProcurarTudo);
        jbProcurarTudo.setBounds(645, 11, 103, 27);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("CPF DO CLIENTE: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(752, 15, 123, 19);

        jbCPF.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jbCPF.setText("Pesquisar");
        getContentPane().add(jbCPF);
        jbCPF.setBounds(1026, 11, 103, 27);

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jftfCpf);
        jftfCpf.setBounds(880, 10, 140, 20);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoVisualizarAll.png"))); // NOI18N
        FUNDO.setMaximumSize(new java.awt.Dimension(1120, 800));
        getContentPane().add(FUNDO);
        FUNDO.setBounds(-30, -30, 2420, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarPessoas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCPF;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbProcurarTudo;
    private javax.swing.JButton jbSapato;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JLabel jlNada;
    private javax.swing.JLabel jlSapato;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables

}


