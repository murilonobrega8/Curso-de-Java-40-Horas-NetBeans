/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cursoemvideo;


/**
 *
 * @author murilonobrega8
 */
public class Frame15_TelaFatorial extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public Frame15_TelaFatorial() { //CONSTRUTOR
        initComponents();
        this.setLocationRelativeTo(null);
    }

/*Frame16_TelaGenio janelaGenio = new Frame16_TelaGenio();   */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSeguir = new javax.swing.JButton();
        lblEscolha = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        lblFatorial = new javax.swing.JLabel();
        lblImprime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Repetição e Cálculo de Fatorial");

        lblText1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText1.setText("Escolha de 1 - 12:");

        btnVoltar.setText("<¬ Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSeguir.setText("Seguir ¬>");
        btnSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguirActionPerformed(evt);
            }
        });

        lblEscolha.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblEscolha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscolha.setText("! =");

        txtNum.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        txtNum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtNumStateChanged(evt);
            }
        });

        lblFatorial.setBackground(new java.awt.Color(204, 204, 204));
        lblFatorial.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblFatorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFatorial.setText("0");
        lblFatorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImprime.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblImprime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                        .addComponent(btnSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblText1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblImprime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImprime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        new Frame14_TelaContador().show();
        this.hide();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirActionPerformed
        // TODO add your handling code here:
        /*janelaGenio = new Frame16_TelaGenio();
        janelaGenio.setLocationRelativeTo(null);
        janelaGenio.setVisible(true);
        this.hide();*/
        System.exit(0);
    }//GEN-LAST:event_btnSeguirActionPerformed

    private void txtNumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtNumStateChanged
        // TODO add your handling code here:
        int num = Integer.parseInt(txtNum.getValue().toString());
        int fat = 1;
        int contador = num;
        String conta = "";
        // 5! = 5x4x3x2x1
        while (contador>=1) {
            fat *= contador;
            contador--;
            if (num==1) {
                conta += (contador + 1) + " x 1";
            } else {
                conta += (contador + 1) + " x "; 
            }
        }
        lblFatorial.setText(Integer.toString(fat));
        lblImprime.setText("<html><center>" + conta + " = " + fat + "</center></html>");
    }//GEN-LAST:event_txtNumStateChanged

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
            java.util.logging.Logger.getLogger(Frame15_TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame15_TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame15_TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame15_TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Frame15_TelaFatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeguir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JLabel lblFatorial;
    private javax.swing.JLabel lblImprime;
    private javax.swing.JLabel lblText1;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
