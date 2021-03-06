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
public class PhonePanelSnake extends javax.swing.JPanel {

    JFrame parent;
    /**
     * Creates new form PhonePanelSnake
     */
    public PhonePanelSnake() {
        initComponents();
    }
    
    public PhonePanelSnake(JFrame parent) {
        initComponents();
        this.parent = parent;
    }
    
    public PhonePanelSnake(JFrame parent, String areaOld, String roomOld, String typeOld, String sizeOld, String commentOld) {
        initComponents();
        this.parent = parent;
        AreaComboBox.setSelectedItem(areaOld);
        RoomComboBox.setSelectedItem(roomOld);
        TypeComboBox.setSelectedItem(typeOld);
        SizeComboBox.setSelectedItem(sizeOld);
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

        jLabel1 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Comments = new java.awt.TextArea();
        AreaComboBox = new javax.swing.JComboBox<>();
        RoomComboBox = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        SizeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Snake Sighting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Area:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 147, -1, -1));

        jLabel3.setText("Room:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 178, -1, -1));

        jLabel4.setText("Additional Comments:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 297, -1, -1));

        Comments.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 255, 172));

        AreaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humanities", "Social Sciences North", "Tonsley", "Information Science & Technology" }));
        AreaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaComboBoxActionPerformed(evt);
            }
        });
        add(AreaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01", "1.30", "2.62", "North Theatre 1" }));
        add(RoomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 188, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        jLabel5.setText("Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 216, -1, -1));

        jLabel6.setText("Size:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 254, -1, -1));

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brown", "Copperhead", "Tiger", "Other", "Unknown" }));
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });
        add(TypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        add(SizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        String area = (String)AreaComboBox.getSelectedItem();
        String room = (String)RoomComboBox.getSelectedItem();
        String type = (String)TypeComboBox.getSelectedItem();
        String size = (String)SizeComboBox.getSelectedItem();
        String comments = Comments.getText();

        parent.setContentPane(new PhonePanelSnakeSummary(parent, area, room, type, size, comments));
        parent.revalidate();
    }//GEN-LAST:event_SubmitActionPerformed

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AreaComboBox;
    private javax.swing.JButton Back1;
    private java.awt.TextArea Comments;
    private javax.swing.JComboBox<String> RoomComboBox;
    private javax.swing.JComboBox<String> SizeComboBox;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
