package tela;

import classes.Personagem;
import classes.Arqueiro;
import classes.Mago;
import classes.Guerreiro;
import classes.Batalha;
        

public class TelaPrincipal extends javax.swing.JFrame {
    private Personagem player1, player2;
    /*
    private void batalha() {
        //TODO: verificar qual esta selecionado e instanciar;
        
        if (rbGuerreiroPlayer1.getChecked())
           player1 = new Guerreiro(tfNomePlayer1.getText());
        else if (rbMagoPlayer1.getChecked())
           player1 = new Mago(tfNomePlayer1.getText());
        else if (rbArqueiroPlayer1.getChecked())
           player1 = new Arqueiro(tfNomePlayer1.getText());
        
        if (rbGuerreiroPlayer2.getChecked())
           player2 = new Guerreiro(tfNomePlayer2.getText());
        else if (rbMagoPlayer2.getChecked())
           player2 = new Mago(tfNomePlayer2.getText());
        else if (rbArqueiroPlayer2.getChecked())
           player2 = new Arqueiro(tfNomePlayer2.getText());
        
        Batalha objBatalha = new Batalha(player1, player2);
        
        while (!objBatalha.fimBatalha()) {
            int quemSofreDano;
            
            quemSofreDano = objBatalha.luta()
            
            if (quemSofreDano == 1) {
                // TODO: img de dano no player 1;
            };
            else if (quemSofreDano == 2) {
                // TODO: img de dano no player 2;
            }
            else {
                // TODO: img de miss nos dois;    
            }
            
            atualizarTela();
        }
        
        
        for (int i = 1; i <= 50; i++) {
           imgPlayer1.Visible = false;
           sleep(i * 20);
           imgPlayer1.Visible = true;
        }
        
        imgPlayer1.Visible = false;
    }
    
    private void atualizarTela() {
            lbVidaPlayer1.setText(String.valueOf(player1.getVida));
            lbVidaPlayer2.setText(String.valueOf(player2.getVida));
            //TODO: setar img dano para visible false;
    }
    */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Batalha");
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/batalha.png")).getImage());
        rbgClassesPlayer1.add(rbMagoPlayer1);
        rbgClassesPlayer1.add(rbGuerreiroPlayer1);
        rbgClassesPlayer1.add(rbArqueiroPlayer1);
        
        rbgClassesPlayer2.add(rbMagoPlayer2);
        rbgClassesPlayer2.add(rbGuerreiroPlayer2);
        rbgClassesPlayer2.add(rbArqueiroPlayer2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgClassesPlayer1 = new javax.swing.ButtonGroup();
        rbgClassesPlayer2 = new javax.swing.ButtonGroup();
        pnImgMapa = new componentes.UJPanelImagem();
        imgPlayer1 = new javax.swing.JLabel();
        imgPlayer2 = new javax.swing.JLabel();
        pnPlayer1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfNomePlayer1 = new javax.swing.JTextField();
        rbMagoPlayer1 = new javax.swing.JRadioButton();
        rbGuerreiroPlayer1 = new javax.swing.JRadioButton();
        rbArqueiroPlayer1 = new javax.swing.JRadioButton();
        lbVidaPlayer1 = new javax.swing.JLabel();
        lbForcaPlayer1 = new javax.swing.JLabel();
        lbAgilidadePlayer1 = new javax.swing.JLabel();
        lbImgClassePlayer1 = new javax.swing.JLabel();
        pnPlayer2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfNomePlayer2 = new javax.swing.JTextField();
        rbMagoPlayer2 = new javax.swing.JRadioButton();
        rbGuerreiroPlayer2 = new javax.swing.JRadioButton();
        rbArqueiroPlayer2 = new javax.swing.JRadioButton();
        lbVidaPlayer2 = new javax.swing.JLabel();
        lbForcaPlayer2 = new javax.swing.JLabel();
        lbAgilidadePlayer2 = new javax.swing.JLabel();
        lbImgClassePlayer2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnIniciarBatalha2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnImgMapa.setImagem(new java.io.File("D:\\repositorio\\java\\Batalha\\src\\imagens\\map.jpg"));

        javax.swing.GroupLayout pnImgMapaLayout = new javax.swing.GroupLayout(pnImgMapa);
        pnImgMapa.setLayout(pnImgMapaLayout);
        pnImgMapaLayout.setHorizontalGroup(
            pnImgMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImgMapaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imgPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        pnImgMapaLayout.setVerticalGroup(
            pnImgMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImgMapaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnImgMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPlayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnPlayer1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Player 1"));
        pnPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        pnPlayer1.setPreferredSize(new java.awt.Dimension(300, 150));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        tfNomePlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        rbMagoPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbMagoPlayer1.setText("Mago");
        rbMagoPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMagoPlayer1MouseClicked(evt);
            }
        });

        rbGuerreiroPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbGuerreiroPlayer1.setText("Guerreiro");

        rbArqueiroPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbArqueiroPlayer1.setText("Arqueiro");

        lbVidaPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbVidaPlayer1.setText("Vida:");

        lbForcaPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbForcaPlayer1.setText("Força:");

        lbAgilidadePlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbAgilidadePlayer1.setText("Agilidade:");

        javax.swing.GroupLayout pnPlayer1Layout = new javax.swing.GroupLayout(pnPlayer1);
        pnPlayer1.setLayout(pnPlayer1Layout);
        pnPlayer1Layout.setHorizontalGroup(
            pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayer1Layout.createSequentialGroup()
                        .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbGuerreiroPlayer1)
                            .addComponent(rbMagoPlayer1)
                            .addComponent(rbArqueiroPlayer1))
                        .addGap(93, 93, 93)
                        .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVidaPlayer1)
                            .addComponent(lbForcaPlayer1)
                            .addComponent(lbAgilidadePlayer1))
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(pnPlayer1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbImgClassePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        pnPlayer1Layout.setVerticalGroup(
            pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfNomePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImgClassePlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayer1Layout.createSequentialGroup()
                        .addComponent(rbMagoPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbGuerreiroPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbArqueiroPlayer1))
                    .addGroup(pnPlayer1Layout.createSequentialGroup()
                        .addComponent(lbVidaPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbForcaPlayer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAgilidadePlayer1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnPlayer2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Player 2"));
        pnPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        pnPlayer2.setPreferredSize(new java.awt.Dimension(300, 150));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        tfNomePlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        rbMagoPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbMagoPlayer2.setText("Mago");

        rbGuerreiroPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbGuerreiroPlayer2.setText("Guerreiro");

        rbArqueiroPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbArqueiroPlayer2.setText("Arqueiro");

        lbVidaPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbVidaPlayer2.setText("Vida:");

        lbForcaPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbForcaPlayer2.setText("Força:");

        lbAgilidadePlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lbAgilidadePlayer2.setText("Agilidade:");

        javax.swing.GroupLayout pnPlayer2Layout = new javax.swing.GroupLayout(pnPlayer2);
        pnPlayer2.setLayout(pnPlayer2Layout);
        pnPlayer2Layout.setHorizontalGroup(
            pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayer2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayer2Layout.createSequentialGroup()
                        .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbGuerreiroPlayer2)
                            .addComponent(rbMagoPlayer2)
                            .addComponent(rbArqueiroPlayer2))
                        .addGap(93, 93, 93)
                        .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVidaPlayer2)
                            .addComponent(lbForcaPlayer2)
                            .addComponent(lbAgilidadePlayer2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnPlayer2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNomePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbImgClassePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        pnPlayer2Layout.setVerticalGroup(
            pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPlayer2Layout.createSequentialGroup()
                .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayer2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNomePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbImgClassePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPlayer2Layout.createSequentialGroup()
                        .addComponent(rbMagoPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbGuerreiroPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbArqueiroPlayer2))
                    .addGroup(pnPlayer2Layout.createSequentialGroup()
                        .addComponent(lbVidaPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbForcaPlayer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAgilidadePlayer2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnSair.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnSair.setText("Sair");

        btnIniciar.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnIniciar.setText("Lutar!!!");

        btnIniciarBatalha2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        btnIniciarBatalha2.setText("Nova Batalha");
        btnIniciarBatalha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarBatalha2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnImgMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(pnPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarBatalha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciarBatalha2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnImgMapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPlayer2.getAccessibleContext().setAccessibleName("Player 2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarBatalha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarBatalha2ActionPerformed
        tfNomePlayer1.setText(null);
        tfNomePlayer2.setText(null);
        lbImgClassePlayer1.setVisible(false);
        lbImgClassePlayer2.setVisible(false);
        lbAgilidadePlayer1.setText("Agilidade:");
        lbAgilidadePlayer2.setText("Agilidade:");
        lbForcaPlayer1.setText("Força:");
        lbForcaPlayer2.setText("Força");
        lbVidaPlayer1.setText("Vida:");
        lbVidaPlayer2.setText("Vida:");
        imgPlayer1.setIcon(null);
        
        rbgClassesPlayer1.clearSelection();
        rbgClassesPlayer2.clearSelection();
        
        player1 = null;
        player2 = null;        
    }//GEN-LAST:event_btnIniciarBatalha2ActionPerformed

    private void rbMagoPlayer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMagoPlayer1MouseClicked
        imgPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mage-left.png")));
    }//GEN-LAST:event_rbMagoPlayer1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciarBatalha2;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgPlayer1;
    private javax.swing.JLabel imgPlayer2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbAgilidadePlayer1;
    private javax.swing.JLabel lbAgilidadePlayer2;
    private javax.swing.JLabel lbForcaPlayer1;
    private javax.swing.JLabel lbForcaPlayer2;
    private javax.swing.JLabel lbImgClassePlayer1;
    private javax.swing.JLabel lbImgClassePlayer2;
    private javax.swing.JLabel lbVidaPlayer1;
    private javax.swing.JLabel lbVidaPlayer2;
    private componentes.UJPanelImagem pnImgMapa;
    private javax.swing.JPanel pnPlayer1;
    private javax.swing.JPanel pnPlayer2;
    private javax.swing.JRadioButton rbArqueiroPlayer1;
    private javax.swing.JRadioButton rbArqueiroPlayer2;
    private javax.swing.JRadioButton rbGuerreiroPlayer1;
    private javax.swing.JRadioButton rbGuerreiroPlayer2;
    private javax.swing.JRadioButton rbMagoPlayer1;
    private javax.swing.JRadioButton rbMagoPlayer2;
    private javax.swing.ButtonGroup rbgClassesPlayer1;
    private javax.swing.ButtonGroup rbgClassesPlayer2;
    private javax.swing.JTextField tfNomePlayer1;
    private javax.swing.JTextField tfNomePlayer2;
    // End of variables declaration//GEN-END:variables
}
