package tela;

import classes.Arqueiro;
import classes.Batalha;
import classes.Guerreiro;
import classes.Mago;
import classes.Personagem;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.Timer;
        

public class TelaPrincipal extends javax.swing.JFrame {
    private static Personagem player1, player2;
    private static Batalha objBatalha;
    private javax.swing.ImageIcon img;
    
    //Thread de atualizacao da tela
    private Action atualizarTela = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (player1 != null && player2 != null) {
                //Player1
                lbVidaPlayer1.setText("Vida: " + String.valueOf(player1.getVida() < 0 ? 0 : player1.getVida()));
                lbForcaPlayer1.setText("Força: " + player1.getForca());
                lbAgilidadePlayer1.setText("Agilidade: " + player1.getAgilidade());
                
                //Player2
                lbVidaPlayer2.setText("Vida: " + String.valueOf(player2.getVida() < 0 ? 0 : player2.getVida()));
                lbForcaPlayer2.setText("Força: " + player2.getForca());
                lbAgilidadePlayer2.setText("Agilidade: " + player2.getAgilidade());
                
                if (player1.getVida() <= 0) {
                    imgPlayer1.setIcon(null);
                } else if (player2.getVida() <= 0) {
                    imgPlayer2.setIcon(null);
                }
                
                //Se alguem ja morreu, limpa o cabaré
                /*if (player1.getVida() <= 0 || player2.getVida() <=0) {
                   player1 = null;
                   player2 = null;
                   
                   System.gc(); //Limpa o lixo da JVM
                   
                }*/
            }
        }
    };

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Batalha");
        img = new ImageIcon(getClass().getResource("/imagens/batalha.png"));
        this.setIconImage(img.getImage());
        rbgClassesPlayer1.add(rbMagoPlayer1);
        rbgClassesPlayer1.add(rbGuerreiroPlayer1);
        rbgClassesPlayer1.add(rbArqueiroPlayer1);
        
        rbgClassesPlayer2.add(rbMagoPlayer2);
        rbgClassesPlayer2.add(rbGuerreiroPlayer2);
        rbgClassesPlayer2.add(rbArqueiroPlayer2);
        
        //Inicia timer de atualizacao de tela
        new Timer(500, atualizarTela).start();
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
                .addComponent(imgPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        rbMagoPlayer1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbMagoPlayer1ItemStateChanged(evt);
            }
        });

        rbGuerreiroPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbGuerreiroPlayer1.setText("Guerreiro");
        rbGuerreiroPlayer1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbGuerreiroPlayer1ItemStateChanged(evt);
            }
        });

        rbArqueiroPlayer1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbArqueiroPlayer1.setText("Arqueiro");
        rbArqueiroPlayer1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbArqueiroPlayer1ItemStateChanged(evt);
            }
        });

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
        rbMagoPlayer2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbMagoPlayer2ItemStateChanged(evt);
            }
        });

        rbGuerreiroPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbGuerreiroPlayer2.setText("Guerreiro");
        rbGuerreiroPlayer2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbGuerreiroPlayer2ItemStateChanged(evt);
            }
        });

        rbArqueiroPlayer2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        rbArqueiroPlayer2.setText("Arqueiro");
        rbArqueiroPlayer2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbArqueiroPlayer2ItemStateChanged(evt);
            }
        });

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
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

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
        
        rbgClassesPlayer1.clearSelection();
        rbgClassesPlayer2.clearSelection();
        
        imgPlayer1.setIcon(null);
        imgPlayer2.setIcon(null);
        
        player1 = null;
        player2 = null;        
    }//GEN-LAST:event_btnIniciarBatalha2ActionPerformed

    private void rbMagoPlayer1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbMagoPlayer1ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/mage-left.png"));
        imgPlayer1.setIcon(img);
    }//GEN-LAST:event_rbMagoPlayer1ItemStateChanged

    private void rbGuerreiroPlayer1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbGuerreiroPlayer1ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/warrior-left.jpg"));
        imgPlayer1.setIcon(img);
    }//GEN-LAST:event_rbGuerreiroPlayer1ItemStateChanged

    private void rbArqueiroPlayer1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbArqueiroPlayer1ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/archer-left.jpg"));
        imgPlayer1.setIcon(img);
    }//GEN-LAST:event_rbArqueiroPlayer1ItemStateChanged

    private void rbMagoPlayer2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbMagoPlayer2ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/mage-right.png"));
        imgPlayer2.setIcon(img);
    }//GEN-LAST:event_rbMagoPlayer2ItemStateChanged

    private void rbGuerreiroPlayer2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbGuerreiroPlayer2ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/warrior-right.jpg"));
        imgPlayer2.setIcon(img);
    }//GEN-LAST:event_rbGuerreiroPlayer2ItemStateChanged

    private void rbArqueiroPlayer2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbArqueiroPlayer2ItemStateChanged
        img = new ImageIcon(getClass().getResource("/imagens/archer-right.jpg"));
        imgPlayer2.setIcon(img);
    }//GEN-LAST:event_rbArqueiroPlayer2ItemStateChanged

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (rbGuerreiroPlayer1.isSelected())
           player1 = new Guerreiro(tfNomePlayer1.getText());
        else if (rbMagoPlayer1.isSelected())
           player1 = new Mago("aaaa");
        else if (rbArqueiroPlayer1.isSelected())
           player1 = new Arqueiro(tfNomePlayer1.getText());
        
        if (rbGuerreiroPlayer2.isSelected())
           player2 = new Guerreiro(tfNomePlayer2.getText());
        else if (rbMagoPlayer2.isSelected())
           player2 = new Mago("aaaa");
        else if (rbArqueiroPlayer2.isSelected())
           player2 = new Arqueiro(tfNomePlayer2.getText());
        
        objBatalha = new Batalha(player1, player2);  
        
        objBatalha.luta();
    }//GEN-LAST:event_btnIniciarActionPerformed
    
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