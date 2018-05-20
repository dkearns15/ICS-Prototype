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
 * @author dkear
 */
public class KioskAccessDetailsPanel1 extends javax.swing.JPanel {

    JFrame parent;
    String type;

    /**
     * Creates new form KioskIncidentDetailsPanel
     */
    public KioskAccessDetailsPanel1() {
        initComponents();
    }

    public KioskAccessDetailsPanel1(JFrame parent, String type) {
        initComponents();
        this.parent = parent;
        this.type = type;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentsText = new javax.swing.JTextArea();
        Location = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RoomText = new javax.swing.JTextField();
        TypeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(12, 13, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Location:");
        add(jLabel2);
        jLabel2.setBounds(326, 174, 96, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Room:");
        add(jLabel3);
        jLabel3.setBounds(326, 221, 69, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Type:");
        add(jLabel4);
        jLabel4.setBounds(326, 263, 60, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Additional Comments:");
        add(jLabel5);
        jLabel5.setBounds(326, 324, 230, 29);

        CommentsText.setColumns(20);
        CommentsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CommentsText.setRows(5);
        jScrollPane1.setViewportView(CommentsText);

        add(jScrollPane1);
        jScrollPane1.setBounds(614, 324, 340, 116);

        Location.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Hub", "Social Sciences", "Physical Sciences", "Tonsley", "Sturt" }));
        Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationActionPerformed(evt);
            }
        });
        add(Location);
        Location.setBounds(614, 175, 189, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Submit Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(623, 462, 208, 88);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Access Request");
        add(jLabel1);
        jLabel1.setBounds(591, 24, 273, 87);

        RoomText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        RoomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTextActionPerformed(evt);
            }
        });
        add(RoomText);
        RoomText.setBounds(614, 219, 297, 31);

        TypeText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        add(TypeText);
        TypeText.setBounds(614, 264, 297, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbackgroundfaded.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbackgroundfaded.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1370, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        parent.setContentPane(new KioskReportSelectionPanel(parent));
        parent.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //CSV FILE HERE
        //URL url = getClass().getResource("Reports.csv");
        //File file = new File(url.getPath());
        String file = new File(".").getAbsolutePath().substring(0, new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";
        BufferedWriter writer = null;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        Random rand = new Random();
        int n = rand.nextInt(500) + 1;

        //add to reports
       try {
            writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryNewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(n + ", " + new Date() + ", " + "Access Request" + ", " + (String) Location.getSelectedItem() + ", " + RoomText.getText() + ", " + ", " + ", " + ", " + TypeText.getText() + ", " + ", " + CommentsText.getText()+ ", ");
            writer.append(n + ", " + new Date() + ", " + "Access Request" + ", " + (String) Location.getSelectedItem() + ", " + RoomText.getText() + ", " + ", " + ", " + ", " + TypeText.getText() + ", " + ", " + CommentsText.getText()+ ", ");
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

        String location = (String)Location.getSelectedItem();
        String room = RoomText.getText();
        String type = TypeText.getText();
        String comments = CommentsText.getText();
        String incidentnumber = Integer.toString(n);
        parent.setContentPane(new KioskAccessReceiptPanel(parent, location, room, type, comments, incidentnumber));
        parent.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationActionPerformed

    private void RoomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentsText;
    private javax.swing.JComboBox<String> Location;
    private javax.swing.JTextField RoomText;
    private javax.swing.JTextField TypeText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
