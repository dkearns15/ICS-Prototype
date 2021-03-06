/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author dkear
 */
public class PhonePanelMainLoggedIn extends javax.swing.JPanel {

    JFrame parent;
    
    /**
     * Creates new form PhonePanelMainLoggedIn
     */
    public PhonePanelMainLoggedIn() {
        initComponents();
    }
    
    public PhonePanelMainLoggedIn(JFrame parent) {
        initComponents();
        this.parent = parent;
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
        PhoneMyReports = new javax.swing.JButton();
        makeAReportButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("FlinSafe");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 38));

        PhoneCalling.setText("Call Security Now");
        PhoneCalling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneCallingActionPerformed(evt);
            }
        });
        add(PhoneCalling, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 158, 58));

        PhoneMyReports.setText("My Reports");
        PhoneMyReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneMyReportsActionPerformed(evt);
            }
        });
        add(PhoneMyReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 158, 54));

        makeAReportButton.setText("Make a Report");
        makeAReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeAReportButtonActionPerformed(evt);
            }
        });
        add(makeAReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 158, 51));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneCallingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneCallingActionPerformed
        parent.setContentPane(new PhonePanelCallSecurity(parent, true));
        parent.validate();
    }//GEN-LAST:event_PhoneCallingActionPerformed

    private void makeAReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeAReportButtonActionPerformed
        parent.setContentPane(new PhonePanelIncidentSelection(parent));
        parent.revalidate();
    }//GEN-LAST:event_makeAReportButtonActionPerformed

    private void PhoneMyReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneMyReportsActionPerformed
        try {
            parent.setContentPane(new PhonePanelMyReports(parent));
            parent.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PhoneMyReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PhoneCalling;
    private javax.swing.JButton PhoneMyReports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton makeAReportButton;
    // End of variables declaration//GEN-END:variables
}
