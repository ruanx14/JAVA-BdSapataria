package views;

import java.awt.event.ActionListener;

public class FormularioVendas extends javax.swing.JFrame {
    public FormularioVendas() {
        initComponents();
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfRetornoNomeSapato = new javax.swing.JTextField();
        jtfRetornoNome = new javax.swing.JTextField();
        jtfPrecoTotal = new javax.swing.JTextField();
        jCadastrarVenda = new javax.swing.JButton();
        jVoltarMenu3 = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jcbFormaPagamento = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jtfRetornoMarca = new javax.swing.JTextField();
        jtfRetornoTamanho = new javax.swing.JTextField();
        jlCpf = new javax.swing.JLabel();
        jlDataVenda = new javax.swing.JLabel();
        jlFormaPagamento = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jtfRetornoQtdEstoque = new javax.swing.JTextField();
        jftCpf = new javax.swing.JFormattedTextField();
        jftfDataVenda = new javax.swing.JFormattedTextField();
        jtfRetornoRua = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCarrinho = new javax.swing.JTable();
        jbApagarCarrinho = new javax.swing.JButton();
        jtfQuantidadeTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbSetQtd = new javax.swing.JButton();
        jbProcurarID = new javax.swing.JButton();
        jbSalvarCarrinho = new javax.swing.JButton();
        jbProcurarMarca = new javax.swing.JButton();
        jtfSapato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbExibirTudo = new javax.swing.JButton();
        jtfOutros = new javax.swing.JTextField();
        jlText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTudo = new javax.swing.JTable();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1190, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jtfRetornoNomeSapato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoNomeSapato);
        jtfRetornoNomeSapato.setBounds(10, 310, 187, 23);

        jtfRetornoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoNome);
        jtfRetornoNome.setBounds(10, 270, 187, 23);

        jtfPrecoTotal.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jtfPrecoTotal);
        jtfPrecoTotal.setBounds(102, 198, 162, 38);

        jCadastrarVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCadastrarVenda.setText("> Completar Venda <");
        getContentPane().add(jCadastrarVenda);
        jCadastrarVenda.setBounds(120, 380, 177, 25);

        jVoltarMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jVoltarMenu3.setText("> Voltar <");
        getContentPane().add(jVoltarMenu3);
        jVoltarMenu3.setBounds(300, 380, 97, 25);

        jbClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbClientes.setText("Pesquisar");
        getContentPane().add(jbClientes);
        jbClientes.setBounds(314, 98, 95, 37);

        jcbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartao Mastercard", "Cartao Visa", "Cartao Bradesco", "Cartao Itau", "Cartao da Loja", "Boleto Bancario - Parcelado", "Dinheiro - A vista" }));
        getContentPane().add(jcbFormaPagamento);
        jcbFormaPagamento.setBounds(176, 243, 230, 23);

        jbLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbLimpar.setText("> Limpar <");
        getContentPane().add(jbLimpar);
        jbLimpar.setBounds(10, 380, 103, 25);

        jtfRetornoMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoMarca);
        jtfRetornoMarca.setBounds(10, 350, 187, 23);

        jtfRetornoTamanho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoTamanho);
        jtfRetornoTamanho.setBounds(210, 350, 182, 23);

        jlCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCpf.setText("CPF Cliente");
        getContentPane().add(jlCpf);
        jlCpf.setBounds(10, 98, 82, 37);

        jlDataVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDataVenda.setText("Data/Venda");
        getContentPane().add(jlDataVenda);
        jlDataVenda.setBounds(10, 161, 79, 17);

        jlFormaPagamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlFormaPagamento.setText("Forma de Pagamento: ");
        getContentPane().add(jlFormaPagamento);
        jlFormaPagamento.setBounds(10, 246, 156, 17);

        jlTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTotal.setText("Valor Total: ");
        getContentPane().add(jlTotal);
        jlTotal.setBounds(10, 206, 82, 17);

        jtfRetornoQtdEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoQtdEstoque);
        jtfRetornoQtdEstoque.setBounds(210, 270, 182, 23);

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jftCpf);
        jftCpf.setBounds(102, 97, 206, 37);

        try {
            jftfDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfDataVenda.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        getContentPane().add(jftfDataVenda);
        jftfDataVenda.setBounds(102, 153, 197, 38);

        jtfRetornoRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfRetornoRua);
        jtfRetornoRua.setBounds(210, 310, 182, 23);

        jtCarrinho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo Sapato", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtCarrinho);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(420, 110, 213, 260);

        jbApagarCarrinho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbApagarCarrinho.setText("Apagar");
        getContentPane().add(jbApagarCarrinho);
        jbApagarCarrinho.setBounds(540, 380, 79, 25);

        jtfQuantidadeTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jtfQuantidadeTotal);
        jtfQuantidadeTotal.setBounds(534, 82, 99, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Total de sapatos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 82, 110, 23);

        jbSetQtd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSetQtd.setText("Alterar Qtd");
        getContentPane().add(jbSetQtd);
        jbSetQtd.setBounds(420, 380, 101, 25);

        jbProcurarID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbProcurarID.setText("Procurar");
        getContentPane().add(jbProcurarID);
        jbProcurarID.setBounds(730, 20, 87, 25);

        jbSalvarCarrinho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbSalvarCarrinho.setText("Adicionar ao carrinho");
        getContentPane().add(jbSalvarCarrinho);
        jbSalvarCarrinho.setBounds(1000, 380, 167, 25);

        jbProcurarMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbProcurarMarca.setText("Pesquisar");
        getContentPane().add(jbProcurarMarca);
        jbProcurarMarca.setBounds(1050, 20, 109, 25);

        jtfSapato.setFont(new java.awt.Font("Aharoni", 1, 16)); // NOI18N
        getContentPane().add(jtfSapato);
        jtfSapato.setBounds(680, 20, 40, 27);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tipo do Sapato/Marca");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 20, 140, 17);

        jbExibirTudo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbExibirTudo.setText("Exibir todos sapatos");
        getContentPane().add(jbExibirTudo);
        jbExibirTudo.setBounds(660, 380, 159, 25);

        jtfOutros.setFont(new java.awt.Font("Aharoni", 1, 16)); // NOI18N
        getContentPane().add(jtfOutros);
        jtfOutros.setBounds(960, 20, 85, 27);

        jlText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlText.setText("ID");
        getContentPane().add(jlText);
        jlText.setBounds(660, 20, 13, 20);

        jtTudo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTudo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 50, 510, 320);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SapatariaImagens/fundoCadastroVendas.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, 0, 1180, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //gets e sets
 
    //outros botoes
    public void jAdicionarCarrinho(ActionListener listener){
        jbSalvarCarrinho.addActionListener(listener);
    }
    public void jPesquisarCPF(ActionListener listener){
        jbClientes.addActionListener(listener);
    }
    public void jAlterarQuantidadeSapato(ActionListener listener){
        jbSetQtd.addActionListener(listener);
    }
    public void jApagarSapatoCarrinho(ActionListener listener){
        jbApagarCarrinho.addActionListener(listener);
    }
    public void jExibirSapatos(ActionListener evt){
        jbExibirTudo.addActionListener(evt);
    }
    public void jPesquisarID(ActionListener evento){
        jbProcurarID.addActionListener(evento);
    }
    public void jPesquisaMarca(ActionListener evento){
        jbProcurarMarca.addActionListener(evento);
    }
    //Padrao de botoes
    public void jLimpar(ActionListener listener){
        jbLimpar.addActionListener(listener);
    }
    public void jCadastrarVenda(ActionListener evt){
        jCadastrarVenda.addActionListener(evt);
    }
    public void jVoltarMenu(ActionListener evt){
        jVoltarMenu3.addActionListener(evt);
    }
  
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
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormularioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jCadastrarVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jVoltarMenu3;
    private javax.swing.JButton jbApagarCarrinho;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbExibirTudo;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbProcurarID;
    private javax.swing.JButton jbProcurarMarca;
    private javax.swing.JButton jbSalvarCarrinho;
    private javax.swing.JButton jbSetQtd;
    private javax.swing.JComboBox<String> jcbFormaPagamento;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JFormattedTextField jftfDataVenda;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataVenda;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlText;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTable jtCarrinho;
    private javax.swing.JTable jtTudo;
    private javax.swing.JTextField jtfOutros;
    private javax.swing.JTextField jtfPrecoTotal;
    private javax.swing.JTextField jtfQuantidadeTotal;
    private javax.swing.JTextField jtfRetornoMarca;
    private javax.swing.JTextField jtfRetornoNome;
    private javax.swing.JTextField jtfRetornoNomeSapato;
    private javax.swing.JTextField jtfRetornoQtdEstoque;
    private javax.swing.JTextField jtfRetornoRua;
    private javax.swing.JTextField jtfRetornoTamanho;
    private javax.swing.JTextField jtfSapato;
    // End of variables declaration//GEN-END:variables
}