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
public class KioskIncidentReceiptPanel extends javax.swing.JPanel {

    JFrame parent;
    String type;
    
    /**
     * Creates new form KioskIncidentDetailsPanel
     */
    public KioskIncidentReceiptPanel() {
        initComponents();
    }
    public KioskIncidentReceiptPanel(JFrame parent, String location, String comments, String incidentnumber) {
        initComponents();
        this.parent = parent;
        
        LocationText.setText(location);
        CommentsText.setText(comments);
        Randnumber.setText(incidentnumber);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentsText = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Randnumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LocationText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Location:");
        add(jLabel2);
        jLabel2.setBounds(450, 110, 96, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Comments:");
        add(jLabel4);
        jLabel4.setBounds(430, 160, 120, 29);

        CommentsText.setColumns(20);
        CommentsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CommentsText.setRows(5);
        jScrollPane1.setViewportView(CommentsText);

        add(jScrollPane1);
        jScrollPane1.setBounds(590, 160, 425, 201);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("One of our security guards will deal with the incident shortly");
        add(jLabel7);
        jLabel7.setBounds(320, 440, 640, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("You have successfully submitted a security incident report with the following details:");
        add(jLabel6);
        jLabel6.setBounds(153, 49, 895, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(491, 495, 277, 148);

        Randnumber.setEditable(false);
        Randnumber.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Randnumber.setText("jTextField1");
        add(Randnumber);
        Randnumber.setBounds(590, 390, 122, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Incident Reference Number:");
        add(jLabel1);
        jLabel1.setBounds(260, 390, 301, 29);

        LocationText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LocationText.setText("jLabel3");
        add(LocationText);
        LocationText.setBounds(590, 110, 240, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbackgroundfaded.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1540, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        parent.setContentPane(new KioskMainScreenPanel(parent));
        parent.revalidate();        // SUBMIT BUTTON
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentsText;
    private javax.swing.JLabel LocationText;
    private javax.swing.JTextField Randnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
