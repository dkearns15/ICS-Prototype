/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import javax.swing.JFrame;

/**
 *
 * @author Bryn
 */
public class PhonePanelRoomAccess extends javax.swing.JPanel {

    JFrame parent;
    /**
     * Creates new form PhonePanelRoomAccess
     */
    public PhonePanelRoomAccess() {
        initComponents();
    }
    
    public PhonePanelRoomAccess(JFrame parent) {
        initComponents();
        this.parent = parent;
    }
    
    public PhonePanelRoomAccess(JFrame parent, String areaOld, String roomOld, String timeOld, String commentOld) {
        initComponents();
        this.parent = parent;
        AreaComboBox.setSelectedItem(areaOld);
        RoomComboBox.setSelectedItem(roomOld);
        Time.setText(timeOld);
        Comments.setText(commentOld);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Comments = new java.awt.TextArea();
        AreaComboBox = new javax.swing.JComboBox<>();
        RoomComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Room Access Request");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        jPanel1.add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Area:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setText("Room:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel4.setText("Reason for Access and Additional Comments:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        Comments.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jPanel1.add(Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 254, 199));

        AreaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humanities", "Social Sciences North", "Tonsley", "Information Science & Technology" }));
        AreaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(AreaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01", "1.30", "2.62", "North Theatre 1" }));
        jPanel1.add(RoomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 188, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        jLabel5.setText("Access Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        Time.setText("ASAP");
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });
        jPanel1.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 250, 150, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        parent.setContentPane(new PhonePanelIncidentSelection(parent));
        parent.revalidate();
    }//GEN-LAST:event_Back1ActionPerformed

    private void AreaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaComboBoxActionPerformed
        String type = (String)AreaComboBox.getSelectedItem();
        switch(type){
            case "Humanities" :
            RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01","1.30","2.62","North Theatre 1"}));
            break;
            
            case "Social Sciences North" :
            RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.06","2.39","2.41","North Theatre 3" }));
            break;
            
            case "Tonsley" :
            RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.02","3.32","Serious Games Lab","Lecture Theatre 1" }));
            break;
            
            case "Information Science & Technology" :
            RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.01","2.07","3.01","South Theatre 3" }));
        }
    }//GEN-LAST:event_AreaComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String area = (String)AreaComboBox.getSelectedItem();
        String room = (String)RoomComboBox.getSelectedItem();
        String time = Time.getText();
        String comments = Comments.getText();
        
        parent.setContentPane(new PhonePanelRoomAccessSummary(parent, area, room, time, comments));
        parent.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AreaComboBox;
    private javax.swing.JButton Back1;
    private java.awt.TextArea Comments;
    private javax.swing.JComboBox<String> RoomComboBox;
    private javax.swing.JTextField Time;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
