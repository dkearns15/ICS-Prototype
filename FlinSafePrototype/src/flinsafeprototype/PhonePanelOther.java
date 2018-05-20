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
public class PhonePanelOther extends javax.swing.JPanel {

    JFrame parent;
   
    /**
     * Creates new form PhonePanelOther
     */
    public PhonePanelOther() {
        initComponents();
    }
    
    public PhonePanelOther(JFrame parent) {
        initComponents();
        this.parent = parent;
    }
    
    public PhonePanelOther(JFrame parent, String areaOld, String roomOld, String commentOld) {
        initComponents();
        this.parent = parent;
        AreaComboBox.setSelectedItem(areaOld);
        RoomComboBox.setSelectedItem(roomOld);
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
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Other Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Room:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel3.setText("Area:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setText("Description of Report Item and Comments");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        Comments.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 243, 263));

        AreaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humanities", "Social Sciences North", "Tonsley", "Information Science & Technology" }));
        AreaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaComboBoxActionPerformed(evt);
            }
        });
        add(AreaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01", "1.30", "2.62", "North Theatre 1" }));
        add(RoomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 188, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

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
        String comments = Comments.getText();

        parent.setContentPane(new PhonePanelOtherSummary(parent, area, room, comments));
        parent.revalidate();
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AreaComboBox;
    private javax.swing.JButton Back1;
    private java.awt.TextArea Comments;
    private javax.swing.JComboBox<String> RoomComboBox;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
