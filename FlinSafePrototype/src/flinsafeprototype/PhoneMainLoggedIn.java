/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

/**
 *
 * @author Bryn
 */
public class PhoneMainLoggedIn extends javax.swing.JFrame {

    /**
     * Creates new form PhoneMainLoggedIn
     */
    public PhoneMainLoggedIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PhoneCalling = new javax.swing.JButton();
        PhoneReportEmergency = new javax.swing.JButton();
        PhoneSecurityAlerts = new javax.swing.JButton();
        ReportType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        OtherReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("FlinSafe");

        PhoneCalling.setText("Call Security Now");
        PhoneCalling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneCallingActionPerformed(evt);
            }
        });

        PhoneReportEmergency.setText("Report Emergency");
        PhoneReportEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneReportEmergencyActionPerformed(evt);
            }
        });

        PhoneSecurityAlerts.setText("Current Security Alerts");
        PhoneSecurityAlerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneSecurityAlertsActionPerformed(evt);
            }
        });

        ReportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fire", "Injury", "Snake", "Maintenence", "Escort", "Intruder", "Access", "Other" }));
        ReportType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Other Security Report");

        OtherReport.setText("Submit");
        OtherReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(PhoneCalling, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhoneReportEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneSecurityAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OtherReport)
                            .addComponent(ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PhoneCalling, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PhoneReportEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PhoneSecurityAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OtherReport)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneCallingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneCallingActionPerformed
        new PhoneCalling().setVisible(true);
    }//GEN-LAST:event_PhoneCallingActionPerformed

    private void PhoneReportEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneReportEmergencyActionPerformed
        new PhoneReportEmergency().setVisible(true);
    }//GEN-LAST:event_PhoneReportEmergencyActionPerformed

    private void PhoneSecurityAlertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneSecurityAlertsActionPerformed
        new PhoneSecurityAlerts().setVisible(true);
    }//GEN-LAST:event_PhoneSecurityAlertsActionPerformed

    private void ReportTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportTypeActionPerformed

    private void OtherReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherReportActionPerformed

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
            java.util.logging.Logger.getLogger(PhoneMainLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneMainLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneMainLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneMainLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneMainLoggedIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OtherReport;
    private javax.swing.JButton PhoneCalling;
    private javax.swing.JButton PhoneReportEmergency;
    private javax.swing.JButton PhoneSecurityAlerts;
    private javax.swing.JComboBox<String> ReportType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
