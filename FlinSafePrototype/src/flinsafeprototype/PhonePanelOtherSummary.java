/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Bryn
 */
public class PhonePanelOtherSummary extends javax.swing.JPanel {

    JFrame parent;
    /**
     * Creates new form PhonePanelOtherSummary
     */
    public PhonePanelOtherSummary() {
        initComponents();
    }
    
    public PhonePanelOtherSummary(JFrame parent, String area, String room, String comment) {
        initComponents();
        this.parent = parent;
        
        AreaText.setText(area);
        RoomText.setText(room);
        CommentText.setText(comment);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RoomText = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AreaText = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CommentText = new java.awt.TextArea();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Description of Report Item and Comments");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setText("Room:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        RoomText.setText("jLabel6");
        add(RoomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 197, -1));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Area:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        AreaText.setText("jLabel5");
        add(AreaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 196, -1));

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Other Report Summary");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        CommentText.setEditable(false);
        CommentText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(CommentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 256, 261));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        String area = AreaText.getText();
        String room = RoomText.getText();
        String comment = CommentText.getText();
        parent.setContentPane(new PhonePanelOther(parent, area, room, comment));
        parent.revalidate();
    }//GEN-LAST:event_Back1ActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        
        String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";
        BufferedWriter writer = null;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        Random rand = new Random();
        int  n = rand.nextInt(5000) + 1;
        Date date = new Date();
        String currentDate = String.format("%1$tb %1$td %1$tR", date );
        //add to reports
        try {
          writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryNewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(n + "," + currentDate + "," + "Other Report" + "," + AreaText.getText() + "," + RoomText.getText() + ","  + ","  + ","  + "," + ","  + "," + CommentText.getText() + "," + "Matthew Flinders");
            writer.append(n + "," + currentDate + "," + "Other Report" + "," + AreaText.getText() + "," + RoomText.getText() + ","  + ","  + ","  + "," + ","  + "," + CommentText.getText()+ "," + "Matthew Flinders");
            writer.newLine();

        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryNewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writer.flush();
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        parent.setContentPane(new PhonePanelMainLoggedIn(parent));
        parent.revalidate();
    }//GEN-LAST:event_ConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaText;
    private javax.swing.JButton Back1;
    private java.awt.TextArea CommentText;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel RoomText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
