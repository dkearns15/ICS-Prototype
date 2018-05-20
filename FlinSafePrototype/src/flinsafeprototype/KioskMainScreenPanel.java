/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import javax.swing.JFrame;

/**
 *
 * @author dkear
 */
public class KioskMainScreenPanel extends javax.swing.JPanel {

    JFrame parent;
    /**
     * Creates new form KioskMainScreenPanel
     */
    public KioskMainScreenPanel() {
        initComponents();
    }
    public KioskMainScreenPanel(JFrame parent) {
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
        reportIncidentButton = new javax.swing.JButton();
        contactSecurityButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel1.setText("Flinders University Security Kiosk");
        add(jLabel1);
        jLabel1.setBounds(240, 0, 880, 87);

        reportIncidentButton.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        reportIncidentButton.setText("Report Incident");
        reportIncidentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportIncidentButtonActionPerformed(evt);
            }
        });
        add(reportIncidentButton);
        reportIncidentButton.setBounds(156, 94, 957, 175);

        contactSecurityButton.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        contactSecurityButton.setText("Contact Security");
        contactSecurityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactSecurityButtonActionPerformed(evt);
            }
        });
        add(contactSecurityButton);
        contactSecurityButton.setBounds(156, 287, 957, 175);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbackgroundfaded.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1370, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void reportIncidentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportIncidentButtonActionPerformed
        parent.setContentPane(new KioskReportSelectionPanel(parent));
        parent.revalidate();
    }//GEN-LAST:event_reportIncidentButtonActionPerformed

    private void contactSecurityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactSecurityButtonActionPerformed
        parent.setContentPane(new KioskContactSecurityPanel(parent, "string"));
        parent.revalidate();
    }//GEN-LAST:event_contactSecurityButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactSecurityButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton reportIncidentButton;
    // End of variables declaration//GEN-END:variables
}
