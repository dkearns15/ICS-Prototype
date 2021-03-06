/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dkear
 */
public class PhonePanelAccessibilityTransport extends javax.swing.JPanel {

    JFrame parent;

    /**
     * Creates new form PhonePanelAccessibiltyTransport
     */
    public PhonePanelAccessibilityTransport() {
        initComponents();
    }

    public PhonePanelAccessibilityTransport(JFrame parent) {
        initComponents();
        this.parent = parent;
    }
    
    public PhonePanelAccessibilityTransport(JFrame parent, String pickUp, String dropOff, String day, String time) {
        initComponents();
        this.parent = parent;
        
        pickUpComboBox.setSelectedItem(pickUp);
        dropOffComboBox.setSelectedItem(dropOff);
        //calendar2Form1.setSelectedItem(day);
        timeText.setText(time);
        
        
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
        jLabel2 = new javax.swing.JLabel();
        pickUpComboBox = new javax.swing.JComboBox<>();
        dropOffComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        calendar2Form1 = new flinsafeprototype.Calendar2Form();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        timeText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book Accessibility Transport");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel2.setText("Where would you like to be dropped off?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 240, -1, -1));

        pickUpComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bedford Park Engineering", "Bedford Park Humanities", "Bedford Park Registry Road", "Sturt Main Entrance", "Tonsley Gate 8" }));
        add(pickUpComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 202, 195, -1));

        dropOffComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bedford Park Engineering", "Bedford Park Humanities", "Bedford Park Registry Road", "Sturt Main Entrance", "Tonsley Gate 8" }));
        add(dropOffComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 260, 195, -1));

        jLabel3.setText("Where would you like to be picked up?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 182, -1, -1));
        add(calendar2Form1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 318, 210, 60));

        jLabel4.setText("What day are you booking for?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 298, -1, -1));

        jLabel5.setText("What time would you like to be picked up?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));
        add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 219, -1));

        jButton1.setText("Submit Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, 46));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        parent.setContentPane(new PhonePanelIncidentSelection(parent));
        parent.revalidate();
    }//GEN-LAST:event_Back1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String pickUp = (String)pickUpComboBox.getSelectedItem();
        String dropOff = (String)dropOffComboBox.getSelectedItem();
        String day  = "Wednesday";
        String time = (String)timeText.getText();
        
        parent.setContentPane(new PhonePanelAccessibilityTransportSummary(parent, pickUp, dropOff, day, time));
        parent.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private flinsafeprototype.Calendar2Form calendar2Form1;
    private javax.swing.JComboBox<String> dropOffComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> pickUpComboBox;
    private javax.swing.JTextField timeText;
    // End of variables declaration//GEN-END:variables
}
