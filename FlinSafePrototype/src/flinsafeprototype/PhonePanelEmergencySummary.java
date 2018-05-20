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
public class PhonePanelEmergencySummary extends javax.swing.JPanel {

    JFrame parent;
    
    /**
     * Creates new form PhonePanelEmergencySummary
     */
    public PhonePanelEmergencySummary() {
        initComponents();
    }
    
    public PhonePanelEmergencySummary(JFrame parent, String emergencyType, String area, String room, String extra1, String extra2, String comment) {
        initComponents();
        this.parent = parent;
        
        emergencyTypeText.setText(emergencyType);
        areaText.setText(area);
        roomText.setText(room);
        extraText1.setText(extra1);
        extraText2.setText(extra2);
        commentText.setText(comment);
        
        if (emergencyType.equals("Intruder Report")) {
            extraLabel1.setText("Armed:");
            extraLabel2.setText("Number:");
        }
        
    }
    
    public PhonePanelEmergencySummary(JFrame parent, String emergencyType, String area, String room, String comment) {
        initComponents();
        this.parent = parent;

        emergencyTypeText.setText(emergencyType);
        areaText.setText(area);
        roomText.setText(room);
        commentText.setText(comment);

        extraLabel1.setVisible(false);
        extraLabel2.setVisible(false);
        extraText1.setVisible(false);
        extraText2.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        extraLabel1 = new javax.swing.JLabel();
        extraLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        commentText = new java.awt.TextArea();
        jLabel11 = new javax.swing.JLabel();
        emergencyTypeText = new javax.swing.JLabel();
        areaText = new javax.swing.JLabel();
        roomText = new javax.swing.JLabel();
        extraText1 = new javax.swing.JLabel();
        extraText2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        extraLabel1.setText("Type:");
        add(extraLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        extraLabel2.setText("Size:");
        add(extraLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Emergency Reporting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setText("Area:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel3.setText("Room:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel4.setText("Additional Comments:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 351, -1, -1));

        commentText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(commentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 255, 130));

        jLabel11.setText("Type of Emergency:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        emergencyTypeText.setText("jLabel5");
        add(emergencyTypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        areaText.setText("jLabel6");
        add(areaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        roomText.setText("jLabel12");
        add(roomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        extraText1.setText("jLabel13");
        add(extraText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        extraText2.setText("jLabel14");
        add(extraText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        String emergencyType = emergencyTypeText.getText();
        String area = areaText.getText();
        String room = roomText.getText();
        String comment = commentText.getText();
        
        if (emergencyType.equals("Intruder Report")||emergencyType.equals("Fire Report")) {
            
            String extra1 = extraText1.getText();
            String extra2 = extraText2.getText();
            parent.setContentPane(new PhonePanelEmergency(parent, emergencyType, area, room, extra1, extra2, comment)); 
        }
        else
        {
            parent.setContentPane(new PhonePanelEmergency(parent, emergencyType, area, room, comment)); 
        }       
        parent.revalidate();
    }//GEN-LAST:event_backButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
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
            if (emergencyTypeText.getText().equals("Intruder Report")||emergencyTypeText.getText().equals("Fire Report")) {
                System.out.println(n + "," + currentDate + "," + emergencyTypeText.getText() + "," + areaText.getText() + "," + roomText.getText() + "," + "," + "," + "," +  extraText1.getText() + ","  + extraText2.getText() + "," + commentText.getText()+ ",");
                writer.append(n + "," + currentDate + "," + emergencyTypeText.getText() + "," + areaText.getText() + "," + roomText.getText() + "," + "," + "," + "," +  extraText1.getText() + ","  + extraText2.getText() + "," + commentText.getText()+ ",");
            }
            else
            {
                System.out.println(n + "," + currentDate + "," + emergencyTypeText.getText() + "," + areaText.getText() + "," + roomText.getText() + "," + "," + "," + "," +  "," + ","  + commentText.getText()+ ",");
                writer.append(n + "," + currentDate + "," + emergencyTypeText.getText() + "," + areaText.getText() + "," + roomText.getText() + "," + "," + "," + "," +  "," + ","  + commentText.getText()+ ",");
            }
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

        parent.setContentPane(new PhoneMainPanel(parent));
        parent.revalidate();
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JLabel areaText;
    private javax.swing.JButton backButton;
    private java.awt.TextArea commentText;
    private javax.swing.JLabel emergencyTypeText;
    private javax.swing.JLabel extraLabel1;
    private javax.swing.JLabel extraLabel2;
    private javax.swing.JLabel extraText1;
    private javax.swing.JLabel extraText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel roomText;
    // End of variables declaration//GEN-END:variables
}
