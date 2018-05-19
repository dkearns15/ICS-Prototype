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
public class KioskInjuryReceiptPanel extends javax.swing.JPanel {

    JFrame parent;
    String type;
    
    /**
     * Creates new form KioskIncidentDetailsPanel
     */
    public KioskInjuryReceiptPanel() {
        initComponents();
    }
    public KioskInjuryReceiptPanel(JFrame parent, String location, String type, String room, String comments, String incidentnumber) {
        initComponents();
        this.parent = parent;

                
        LocationText.setText(location);
        TypeText.setText(type);
        RoomText.setText(room);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentsText = new javax.swing.JTextArea();
        RoomText = new javax.swing.JTextField();
        TypeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Randnumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        LocationText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Location:");
        add(jLabel2);
        jLabel2.setBounds(304, 135, 96, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Room:");
        add(jLabel3);
        jLabel3.setBounds(304, 178, 69, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Type:");
        add(jLabel4);
        jLabel4.setBounds(304, 220, 60, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Additional Comments:");
        add(jLabel5);
        jLabel5.setBounds(304, 279, 230, 29);

        CommentsText.setColumns(20);
        CommentsText.setRows(5);
        jScrollPane1.setViewportView(CommentsText);

        add(jScrollPane1);
        jScrollPane1.setBounds(592, 279, 325, 96);

        RoomText.setText("jTextField1");
        add(RoomText);
        RoomText.setBounds(592, 185, 69, 22);

        TypeText.setText("jTextField2");
        add(TypeText);
        TypeText.setBounds(592, 228, 69, 22);


        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("You have successfully submitted a security incident report with the following details:");
        add(jLabel6);
        jLabel6.setBounds(255, 51, 895, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("One of our security guards will deal with the incident shortly");
        add(jLabel7);
        jLabel7.setBounds(373, 509, 640, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Finish");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(547, 570, 277, 148);


        Randnumber.setText("jTextField1");
        add(Randnumber);
        Randnumber.setBounds(615, 413, 69, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Incident Reference Number:");
        add(jLabel1);
        jLabel1.setBounds(296, 405, 301, 29);

        LocationText.setText("jTextField4");
        add(LocationText);
        LocationText.setBounds(592, 143, 69, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbackgroundfaded.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1370, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        parent.setContentPane(new KioskMainScreenPanel(parent));
        parent.revalidate();        // SUBMIT BUTTON
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentsText;
    private javax.swing.JTextField LocationText;
    private javax.swing.JTextField Randnumber;
    private javax.swing.JTextField RoomText;
    private javax.swing.JTextField TypeText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
