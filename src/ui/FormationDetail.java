/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.WindowConstants;
import model.Formation;

/**
 *
 * @author kix
 */
public class FormationDetail extends javax.swing.JFrame {

    private Formation formation;
    /**
     * Creates new form DetailFormation
     */
    public FormationDetail() {
        initComponents();
        setLocationRelativeTo(null);
        this.formation = new Formation();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPlayer1 = new javax.swing.JTextField();
        jTextFieldPlayer2 = new javax.swing.JTextField();
        jTextFieldPlayer3 = new javax.swing.JTextField();
        jTextFieldPlayer4 = new javax.swing.JTextField();
        jTextFieldPlayer5 = new javax.swing.JTextField();
        jTextFieldPlayer6 = new javax.swing.JTextField();
        jTextFieldPlayer7 = new javax.swing.JTextField();
        jTextFieldPlayer8 = new javax.swing.JTextField();
        jTextFieldPlayer9 = new javax.swing.JTextField();
        jTextFieldPlayer10 = new javax.swing.JTextField();
        jTextFieldPlayer11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlayer12 = new javax.swing.JTextField();
        jTextFieldPlayer13 = new javax.swing.JTextField();
        jTextFieldPlayer14 = new javax.swing.JTextField();
        jTextFieldPlayer15 = new javax.swing.JTextField();
        jTextFieldPlayer16 = new javax.swing.JTextField();
        jTextFieldPlayer17 = new javax.swing.JTextField();
        jTextFieldPlayer18 = new javax.swing.JTextField();
        jButtonCloseDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldPlayer1.setEditable(false);

        jTextFieldPlayer2.setEditable(false);

        jTextFieldPlayer3.setEditable(false);

        jTextFieldPlayer4.setEditable(false);

        jTextFieldPlayer5.setEditable(false);

        jTextFieldPlayer6.setEditable(false);

        jTextFieldPlayer7.setEditable(false);

        jTextFieldPlayer8.setEditable(false);

        jTextFieldPlayer9.setEditable(false);

        jTextFieldPlayer10.setEditable(false);

        jTextFieldPlayer11.setEditable(false);

        jLabel1.setText("Formazione");

        jLabel2.setText("Panchina");

        jTextFieldPlayer12.setEditable(false);

        jTextFieldPlayer13.setEditable(false);

        jTextFieldPlayer14.setEditable(false);

        jTextFieldPlayer15.setEditable(false);

        jTextFieldPlayer16.setEditable(false);

        jTextFieldPlayer17.setEditable(false);

        jTextFieldPlayer18.setEditable(false);

        jButtonCloseDetail.setBackground(new java.awt.Color(254, 75, 75));
        jButtonCloseDetail.setText("Chiudi");
        jButtonCloseDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPlayer10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlayer11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPlayer18)
                    .addComponent(jTextFieldPlayer17)
                    .addComponent(jTextFieldPlayer16)
                    .addComponent(jTextFieldPlayer15)
                    .addComponent(jTextFieldPlayer14)
                    .addComponent(jTextFieldPlayer13)
                    .addComponent(jTextFieldPlayer12)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCloseDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPlayer12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPlayer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPlayer9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPlayer11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCloseDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseDetailActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseDetailActionPerformed

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
    
    public void loadFormation(){
        
        this.jTextFieldPlayer1.setText(this.formation.getFormation().get(0).getNome());
        this.jTextFieldPlayer2.setText(this.formation.getFormation().get(1).getNome());
        this.jTextFieldPlayer3.setText(this.formation.getFormation().get(2).getNome());
        this.jTextFieldPlayer4.setText(this.formation.getFormation().get(3).getNome());
        this.jTextFieldPlayer5.setText(this.formation.getFormation().get(4).getNome());
        this.jTextFieldPlayer6.setText(this.formation.getFormation().get(5).getNome());
        this.jTextFieldPlayer7.setText(this.formation.getFormation().get(6).getNome());
        this.jTextFieldPlayer8.setText(this.formation.getFormation().get(7).getNome());
        this.jTextFieldPlayer9.setText(this.formation.getFormation().get(8).getNome());
        this.jTextFieldPlayer10.setText(this.formation.getFormation().get(9).getNome());
        this.jTextFieldPlayer11.setText(this.formation.getFormation().get(10).getNome());
        
        this.jTextFieldPlayer12.setText(this.formation.getBench().get(0).getNome());
        this.jTextFieldPlayer13.setText(this.formation.getBench().get(1).getNome());
        this.jTextFieldPlayer14.setText(this.formation.getBench().get(2).getNome());
        this.jTextFieldPlayer15.setText(this.formation.getBench().get(3).getNome());
        this.jTextFieldPlayer16.setText(this.formation.getBench().get(4).getNome());
        this.jTextFieldPlayer17.setText(this.formation.getBench().get(5).getNome());
        this.jTextFieldPlayer18.setText(this.formation.getBench().get(6).getNome());
    }
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
            java.util.logging.Logger.getLogger(FormationDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormationDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormationDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormationDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormationDetail().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldPlayer1;
    private javax.swing.JTextField jTextFieldPlayer10;
    private javax.swing.JTextField jTextFieldPlayer11;
    private javax.swing.JTextField jTextFieldPlayer12;
    private javax.swing.JTextField jTextFieldPlayer13;
    private javax.swing.JTextField jTextFieldPlayer14;
    private javax.swing.JTextField jTextFieldPlayer15;
    private javax.swing.JTextField jTextFieldPlayer16;
    private javax.swing.JTextField jTextFieldPlayer17;
    private javax.swing.JTextField jTextFieldPlayer18;
    private javax.swing.JTextField jTextFieldPlayer2;
    private javax.swing.JTextField jTextFieldPlayer3;
    private javax.swing.JTextField jTextFieldPlayer4;
    private javax.swing.JTextField jTextFieldPlayer5;
    private javax.swing.JTextField jTextFieldPlayer6;
    private javax.swing.JTextField jTextFieldPlayer7;
    private javax.swing.JTextField jTextFieldPlayer8;
    private javax.swing.JTextField jTextFieldPlayer9;
    // End of variables declaration//GEN-END:variables
}
