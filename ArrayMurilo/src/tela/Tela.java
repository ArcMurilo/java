/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import classes.ArrayNumbers;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Tela extends javax.swing.JFrame {
//atributo
    private ArrayNumbers objeto;
    private int tamanhoArray;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        tamanhoArray = 0;
        
        try {
            tamanhoArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Insiro o tamanho do array", "Array Numbers", 3));
        } catch (NumberFormatException e) {
            tamanhoArray = 0;
        } 
        
        if(tamanhoArray == 0) {
            objeto = new ArrayNumbers();
        } else {
            objeto = new ArrayNumbers(tamanhoArray);
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btAdiciona = new javax.swing.JButton();
        btGera = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        jInverter = new javax.swing.JButton();
        jOrdena = new javax.swing.JButton();
        jBuscaIguais = new javax.swing.JButton();
        btEncerra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResultado = new javax.swing.JTextArea();
        jLimpar = new javax.swing.JButton();
        jDivisiveis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Array de Inteiros");

        jLabel1.setText("Número:");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        btAdiciona.setText("Adicionar");
        btAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionaActionPerformed(evt);
            }
        });

        btGera.setText("Gerar");
        btGera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeraActionPerformed(evt);
            }
        });

        btSoma.setText("Somar");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });

        jInverter.setText("Inverter");
        jInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInverterActionPerformed(evt);
            }
        });

        jOrdena.setText("Ordenar");
        jOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenaActionPerformed(evt);
            }
        });

        jBuscaIguais.setText("Busca Iguais");
        jBuscaIguais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscaIguaisActionPerformed(evt);
            }
        });

        btEncerra.setText("Encerrar");
        btEncerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerraActionPerformed(evt);
            }
        });

        jResultado.setColumns(20);
        jResultado.setRows(5);
        jResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));
        jScrollPane1.setViewportView(jResultado);

        jLimpar.setText("Limpar");
        jLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparActionPerformed(evt);
            }
        });

        jDivisiveis.setText("Divisíveis");
        jDivisiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivisiveisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btAdiciona, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btSoma, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jOrdena))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEncerra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jInverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBuscaIguais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDivisiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAdiciona, btEncerra, btGera, btSoma, jBuscaIguais, jInverter, jOrdena});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdiciona)
                            .addComponent(btGera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInverter)
                            .addComponent(btSoma)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuscaIguais)
                    .addComponent(jOrdena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDivisiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEncerra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionaActionPerformed
        if (txtNumero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Número: ", "ATENTION!!", 0);
            txtNumero.setText(null);
            txtNumero.requestFocusInWindow();
            return;
        }
        int valor = Integer.parseInt(txtNumero.getText().trim());
        if (objeto.adiciona(valor)) {
            txtNumero.setText(null); //limpar
            jResultado.setText(objeto.toString());
        } else {
            JOptionPane.showMessageDialog(null, "OVERFLOW ", "ATENTION!!", 0);
        }
    }//GEN-LAST:event_btAdicionaActionPerformed

    private void btEncerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerraActionPerformed
        System.exit(0); //vulgo sair  
// TODO add your handling code here:
    }//GEN-LAST:event_btEncerraActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btGeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeraActionPerformed
        objeto.gera();
        jResultado.setText(objeto.toString());
        txtNumero.setText(null);
        txtNumero.requestFocusInWindow();
    }//GEN-LAST:event_btGeraActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
       jResultado.setText(objeto.toString()+"\n\nSoma: "+objeto.soma());
    }//GEN-LAST:event_btSomaActionPerformed

    private void jInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInverterActionPerformed
        ArrayNumbers invertido;        
        
        invertido = objeto.inverso();
        
        jResultado.setText(objeto.toString() + "\n" + invertido.toString());
    }//GEN-LAST:event_jInverterActionPerformed

    private void jOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenaActionPerformed
        objeto.ordenar();
        jResultado.setText(objeto.toString());
    }//GEN-LAST:event_jOrdenaActionPerformed

    private void jBuscaIguaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscaIguaisActionPerformed
        ArrayNumbers indices;
        int numero;

        try {
            numero = Integer.parseInt(txtNumero.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Você inseriu um valor inválido!");
            txtNumero.requestFocus();
            return;
        }      
        
        indices = objeto.buscaIguais(numero);
        
        jResultado.setText(objeto.toString() + "\n" + indices.toString());
    }//GEN-LAST:event_jBuscaIguaisActionPerformed

    private void jLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparActionPerformed
        objeto = new ArrayNumbers(4);//isso sobrescreve o objeto,de forma que irá zerar o cont e o reseta o array
        jResultado.setText(null);
    }//GEN-LAST:event_jLimparActionPerformed

    private void jDivisiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivisiveisActionPerformed
        int i, divisor = 1;
        int[] x = new int[4];
        String numeros = "";
        
        try {
            divisor = Integer.parseInt(txtNumero.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Você inseriu um valor inválido!");
            txtNumero.requestFocus();
            return;
        }
        
        x = objeto.divisiveis(divisor).clone();
        
        for (i = 0; x[i] != 0 ; i++) {
            numeros += x[i] + "   ";            
        }
        
        jResultado.setText(jResultado.getText() + "\n\nDivisíveis por " + divisor + ":  " + numeros);        
    }//GEN-LAST:event_jDivisiveisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdiciona;
    private javax.swing.JButton btEncerra;
    private javax.swing.JButton btGera;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton jBuscaIguais;
    private javax.swing.JButton jDivisiveis;
    private javax.swing.JButton jInverter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLimpar;
    private javax.swing.JButton jOrdena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
