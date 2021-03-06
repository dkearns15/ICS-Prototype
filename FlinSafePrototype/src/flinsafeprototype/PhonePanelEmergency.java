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
public class PhonePanelEmergency extends javax.swing.JPanel {

    JFrame parent;
    boolean loggedIn;
    
    /**
     * Creates new form PhonePanelEmergency
     */
    public PhonePanelEmergency() {
        initComponents();
    }

    public PhonePanelEmergency(JFrame parent) {
        initComponents();
        this.parent = parent;
    }
    
    public PhonePanelEmergency(JFrame parent, String emergencyType, String area, String room, String extra1, String extra2, String comment) {
        initComponents();
        this.parent = parent;
        
        if (emergencyType.equals("Intruder Report")) {
            extraLabel1.setText("Armed:");
            extraLabel2.setText("Number:");
            extraComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"No", "Knife", "Gun", "Other", "Unknown"}));
            extraComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3-5","5-10","More than 10"}));
            
        }
        
        emergencyComboBox.setSelectedItem(emergencyType);
        areaComboBox.setSelectedItem(area);
        roomComboBox.setSelectedItem(room);
        extraComboBox1.setSelectedItem(extra1);
        extraComboBox2.setSelectedItem(extra2);
        commentText.setText(comment);
        
        
        
    }
    
    public PhonePanelEmergency(JFrame parent, String emergencyType, String area, String room, String comment) {
        initComponents();
        this.parent = parent;

        emergencyComboBox.setSelectedItem(emergencyType);
        areaComboBox.setSelectedItem(area);
        roomComboBox.setSelectedItem(room);
        commentText.setText(comment);

        extraLabel1.setVisible(false);
        extraLabel2.setVisible(false);
        extraComboBox1.setVisible(false);
        extraComboBox2.setVisible(false);

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
        roomComboBox = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        extraLabel1 = new javax.swing.JLabel();
        extraLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        extraComboBox1 = new javax.swing.JComboBox<>();
        extraComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        commentText = new java.awt.TextArea();
        areaComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        emergencyComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        callSecurity = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01", "1.30", "2.62", "North Theatre 1" }));
        add(roomComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 188, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 513, -1, -1));

        extraLabel1.setText("Type:");
        add(extraLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        extraLabel2.setText("Size:");
        add(extraLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Emergency Reporting");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 103, -1, -1));

        extraComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bush", "Electrical", "Chemical", "Building", "Other", "Unknown" }));
        extraComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraComboBox1ActionPerformed(evt);
            }
        });
        add(extraComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        extraComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        add(extraComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel2.setText("Area:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setText("Room:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setText("Additional Comments:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        commentText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(commentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 255, 130));

        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humanities", "Social Sciences North", "Tonsley", "Information Science & Technology" }));
        areaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboBoxActionPerformed(evt);
            }
        });
        add(areaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel11.setText("Type of Emergency:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        emergencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fire Report", "Intruder Report", "Injury Report", "Other Report" }));
        emergencyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyComboBoxActionPerformed(evt);
            }
        });
        add(emergencyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel12.setText("If safe please call 000 or security");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        callSecurity.setText("Call Security");
        callSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callSecurityActionPerformed(evt);
            }
        });
        add(callSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        parent.setContentPane(new PhoneMainPanel(parent));
        parent.revalidate();
    }//GEN-LAST:event_backButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        String emergencyType = (String)emergencyComboBox.getSelectedItem();
        String area = (String)areaComboBox.getSelectedItem();
        String room = (String)roomComboBox.getSelectedItem();
        String type = (String)extraComboBox1.getSelectedItem();
        String size = (String)extraComboBox2.getSelectedItem();
        String comments = commentText.getText();
        
        if (emergencyType.equals("Intruder Report")||emergencyType.equals("Fire Report")) {
            parent.setContentPane(new PhonePanelEmergencySummary(parent, emergencyType, area, room, type, size, comments));
        }
        else
        {
            parent.setContentPane(new PhonePanelEmergencySummary(parent, emergencyType, area, room, comments));
        }
        
        parent.revalidate();
    }//GEN-LAST:event_SubmitActionPerformed

    private void extraComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraComboBox1ActionPerformed

    private void areaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboBoxActionPerformed
        String area = (String)areaComboBox.getSelectedItem();
        switch(area){
            case "Humanities" :
            roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.01","1.30","2.62","North Theatre 1"}));
            break;

            case "Social Sciences North" :
            roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.06","2.39","2.41","North Theatre 3" }));
            break;

            case "Tonsley" :
            roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.02","3.32","Serious Games Lab","Lecture Theatre 1" }));
            break;

            case "Information Science & Technology" :
            roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2.01","2.07","3.01","South Theatre 3" }));
        }
    }//GEN-LAST:event_areaComboBoxActionPerformed

    private void emergencyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyComboBoxActionPerformed
        // TODO add your handling code here:
        String emergencyType = (String)emergencyComboBox.getSelectedItem();
        switch(emergencyType){
            case "Fire Report" :
                extraLabel1.setVisible(true);
                extraLabel2.setVisible(true);
                extraComboBox1.setVisible(true);
                extraComboBox2.setVisible(true);                
                
                extraComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Bush", "Electrical", "Chemical", "Building", "Other", "Unknown"}));
                extraComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Small","Medium","Large"}));
                break;

            case "Intruder Report" :
                extraLabel1.setVisible(true);
                extraLabel2.setVisible(true);
                extraComboBox1.setVisible(true);
                extraComboBox2.setVisible(true);
                
                extraLabel1.setText("Armed");
                extraLabel2.setText("Number");
                extraComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"No", "Knife", "Gun", "Other", "Unknown"}));
                extraComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3-5","5-10","More than 10"}));
                break;

            case "Injury Report" :
                extraLabel1.setVisible(false);
                extraLabel2.setVisible(false);
                extraComboBox1.setVisible(false);
                extraComboBox2.setVisible(false);
                break;

            case "Other Report" :
                extraLabel1.setVisible(false);
                extraLabel2.setVisible(false);
                extraComboBox1.setVisible(false);
                extraComboBox2.setVisible(false);
        }
    }//GEN-LAST:event_emergencyComboBoxActionPerformed

    private void callSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callSecurityActionPerformed
        // TODO add your handling code here:
        parent.setContentPane(new PhonePanelCallSecurity(parent, false));
        parent.revalidate();
    }//GEN-LAST:event_callSecurityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> areaComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton callSecurity;
    private java.awt.TextArea commentText;
    private javax.swing.JComboBox<String> emergencyComboBox;
    private javax.swing.JComboBox<String> extraComboBox1;
    private javax.swing.JComboBox<String> extraComboBox2;
    private javax.swing.JLabel extraLabel1;
    private javax.swing.JLabel extraLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> roomComboBox;
    // End of variables declaration//GEN-END:variables
}
