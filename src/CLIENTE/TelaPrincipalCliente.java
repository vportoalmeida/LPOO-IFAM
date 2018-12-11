/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLIENTE;

import Objetos.Cliente;
import Objetos.Compra;
import Objetos.Item;
import Objetos.ObjectDao;
import Objetos.Produto;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author patcr
 */
public class TelaPrincipalCliente extends javax.swing.JFrame {
    
    public Cliente cliente;
    private double valorTotal;
    private DecimalFormat df = new DecimalFormat("#,##0.00");
    
    public TelaPrincipalCliente() {
        initComponents();
        carregarProdutos();
        this.valorTotal= 0;
        txtValorTotal.setText("R$ 0.00");
        cliente = new Cliente();
        setIcon();
    }
    public TelaPrincipalCliente(Cliente c) {
        initComponents();
        carregarProdutos();
        this.cliente=c;
        this.valorTotal= 0;
        txtValorTotal.setText("R$ 0.00");
        this.cliente = c;
        setIcon();
    }
    
    private void carregarProdutos(){
        List<Produto> lista = (List<Produto>)(Object)new ObjectDao().show("produto");
        DefaultTableModel model = (DefaultTableModel)tabelaProdutos.getModel();
        for (Produto produto : lista) {
            String codigo = produto.getCodigo();
            String nome = produto.getNome();
            String categoria = produto.getCategoria().getNome();
            String valor = Double.toString(produto.getValor());
            model.addRow(new String[]{codigo,nome,("R$ "+valor),categoria});
        }
        tabelaProdutos.setModel(model);
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        btnAdicionaAoCarrinho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnFinalizaCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VK Sistemas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 363, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Pesquisar");
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 184, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Produto:");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 553, 293));

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Qtd", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tabelaCarrinho);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 78, 309, 293));

        btnAdicionaAoCarrinho.setBackground(new java.awt.Color(204, 204, 255));
        btnAdicionaAoCarrinho.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdicionaAoCarrinho.setText("Adicionar ao carrinho");
        btnAdicionaAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaAoCarrinhoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnAdicionaAoCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Meu carrinho");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        btnRemover.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 120, -1));

        btnFinalizaCompra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnFinalizaCompra.setText("Finalizar");
        btnFinalizaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaCompraActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnFinalizaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 123, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorTotal.setText("R$ 50,00");
        jLayeredPane1.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 107, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        jMenu1.setText("Compras");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dados");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mensagens");

        jMenuItem1.setText("Visualizar Mensagens");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionaAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaAoCarrinhoActionPerformed
        TelaQuantidadeProduto qtd = new TelaQuantidadeProduto(this,true);
        String nome=(String)tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1);
        String valor=(String)tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2);
        qtd.carregar(nome, valor);
        qtd.setVisible(true);
        if(qtd.isAdicionar()){            
            String quantidade=Integer.toString(qtd.getQuantidade());            
            Double valorReal = Double.parseDouble(valor.substring(3));
            valorReal*=qtd.getQuantidade();
            this.valorTotal+=valorReal;
            DefaultTableModel model = (DefaultTableModel)tabelaCarrinho.getModel();
            model.addRow(new String[]{nome,quantidade,("R$ "+Double.toString(valorReal))});
           
            txtValorTotal.setText("R$ "+df.format(valorTotal));
        }
    }//GEN-LAST:event_btnAdicionaAoCarrinhoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if(tabelaCarrinho.getSelectedRow()>=0){
            DefaultTableModel model = (DefaultTableModel)tabelaCarrinho.getModel();
            if(0==JOptionPane.showConfirmDialog
                (
                    this,
                    (
                        "Deseja mesmo remover\n"+(String)model.getValueAt(tabelaCarrinho.getSelectedRow(),0)
                        +" do seu carrinho ?"
                    ),
                    "Remover",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)
                ){
                String valorTexto = (String)model.getValueAt(tabelaCarrinho.getSelectedRow(),2);
                this.valorTotal-=Double.parseDouble(valorTexto.substring(3));
                model.removeRow(tabelaCarrinho.getSelectedRow());
                txtValorTotal.setText("R$ "+df.format(valorTotal));
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFinalizaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaCompraActionPerformed
        if(0==JOptionPane.showConfirmDialog
            (this,"Tem certeza que deseja\n"
                + "finalizar sua compra ?",
                  "Finalizando Compra!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)
            ){
        
            DefaultTableModel model = (DefaultTableModel)tabelaCarrinho.getModel();
            int tam = model.getRowCount();
            if(tam>0){
                List<Produto> lista = (List<Produto>)(Object)new ObjectDao().show("produto");
                Compra c = new Compra(0);           
                for(int i = 0;i<tam;i++){
                    Item item = new Item();
                    item.setQtd(Integer.parseInt((String)model.getValueAt(i,1)));
                    for(int j=0;j<lista.size();j++){
                        if(lista.get(j).getNome().equals((String)model.getValueAt(i,0))){
                            item.setProduto(lista.get(j));                        
                            break;
                        }
                    }
                    String valor = (String)model.getValueAt(i,2);
                    item.setValor(Double.parseDouble(valor.substring(3)));                
                    c.adicionarItem(item);
                }
                c.setCliente(this.cliente);
                c.setStatus("Aguardando aprovação!");
                new ObjectDao().save("compra",c);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnFinalizaCompraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaPrincipalMensagensCli t = new TelaPrincipalMensagensCli(this, true);
        t.setVisible(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaAoCarrinho;
    private javax.swing.JButton btnFinalizaCompra;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
      setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Imagens\\code.png"));
    }
}
