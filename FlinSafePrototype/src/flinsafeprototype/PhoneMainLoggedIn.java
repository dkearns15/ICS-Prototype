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
public class PhoneMainLoggedIn extends javax.swing.JPanel {

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
                            .addComponent(ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(OtherReport)))))
                .addContainerGap(37, Short.MAX_VALUE))
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
                .addContainerGap(33, Short.MAX_VALUE))
        );
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
        new PhoneFire().setVisible(true);
    }//GEN-LAST:event_OtherReportActionPerformed


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
