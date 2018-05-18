/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.IOException;

/**
 *
 * @author dkear
 */
public class SecuritySummaryInProgressDetailsPanel extends javax.swing.JPanel {

    private String[] incidentInfo;
    SecuritySummaryInProgressResponse parent;
    SecuritySummaryMain home;
    /**
     * Creates new form SecuritySummaryInProgressDetails
     */
    public SecuritySummaryInProgressDetailsPanel() {
        initComponents();
    }
    
    public SecuritySummaryInProgressDetailsPanel(int incidentNum, SecuritySummaryMain home, SecuritySummaryInProgressResponse parent) throws IOException {
        setOpaque(false);
        this.repaint();
        initComponents();
        this.parent = parent;
        this.home = home;
        this.incidentInfo = parent.getIncidentInfo();
        initText(incidentNum);

    }

    public void initText(int incidentNum) throws IOException {
        HelperLocations locs = new HelperLocations();
        System.out.println(incidentInfo[0]);
        timeLabel.setText(incidentInfo[2]);
        numLabel.setText(incidentInfo[0]);
        typeLabel.setText(incidentInfo[3]);
        locationLabel.setText(incidentInfo[6]);
        commentsTextArea.setText(incidentInfo[5]);
        responderLabel.setText(incidentInfo[4]);
        responseStartTimeLabel.setText(incidentInfo[1]);

        //Gets the location based on the word describing the locations
        //If it does not find the location, X and Y point will be zero
        //Currently supported locations (can add more in Locations.java)
        //  hub, humanities, engineering
        mapWithPointsPanel1.setXpoint(locs.getLocationX(incidentInfo[6].toLowerCase()));
        mapWithPointsPanel1.setYpoint(locs.getLocationY(incidentInfo[6].toLowerCase()));
        mapWithPointsPanel1.repaint();

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mapWithPointsPanel1 = new flinsafeprototype.MapWithPointsPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        responseStartTimeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        responderLabel = new javax.swing.JLabel();
        finishedRespondingButton = new javax.swing.JButton();

        setLayout(null);

        commentsTextArea.setEditable(false);
        commentsTextArea.setBackground(new java.awt.Color(240, 240, 240));
        commentsTextArea.setColumns(20);
        commentsTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        commentsTextArea.setLineWrap(true);
        commentsTextArea.setRows(5);
        commentsTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(commentsTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(197, 225, 385, 87);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Report Comments");
        add(jLabel8);
        jLabel8.setBounds(37, 225, 142, 22);

        locationLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locationLabel.setText("jLabel9");
        add(locationLabel);
        locationLabel.setBounds(198, 140, 51, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Report Location");
        add(jLabel7);
        jLabel7.setBounds(56, 138, 124, 22);

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeLabel.setText("jLabel9");
        add(timeLabel);
        timeLabel.setBounds(198, 111, 51, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Report Time");
        add(jLabel6);
        jLabel6.setBounds(83, 109, 97, 22);

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        typeLabel.setText("jLabel9");
        add(typeLabel);
        typeLabel.setBounds(198, 82, 51, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Report Type");
        add(jLabel4);
        jLabel4.setBounds(83, 80, 97, 22);

        numLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLabel.setText("jLabel9");
        add(numLabel);
        numLabel.setBounds(198, 53, 51, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Incident Number");
        add(jLabel3);
        jLabel3.setBounds(47, 51, 132, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Incident Details:");
        add(jLabel1);
        jLabel1.setBounds(32, 13, 147, 25);

        javax.swing.GroupLayout mapWithPointsPanel1Layout = new javax.swing.GroupLayout(mapWithPointsPanel1);
        mapWithPointsPanel1.setLayout(mapWithPointsPanel1Layout);
        mapWithPointsPanel1Layout.setHorizontalGroup(
            mapWithPointsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        mapWithPointsPanel1Layout.setVerticalGroup(
            mapWithPointsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        add(mapWithPointsPanel1);
        mapWithPointsPanel1.setBounds(611, 13, 382, 382);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Response Choice");
        add(jLabel5);
        jLabel5.setBounds(452, 27, 133, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Responder");
        add(jLabel9);
        jLabel9.setBounds(97, 167, 83, 22);

        responseStartTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        responseStartTimeLabel.setText("jLabel9");
        add(responseStartTimeLabel);
        responseStartTimeLabel.setBounds(198, 198, 51, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Response Start Time");
        add(jLabel10);
        jLabel10.setBounds(17, 196, 163, 22);

        responderLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        responderLabel.setText("jLabel9");
        add(responderLabel);
        responderLabel.setBounds(198, 169, 51, 20);

        finishedRespondingButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        finishedRespondingButton.setText("Finished Responding");
        finishedRespondingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedRespondingButtonActionPerformed(evt);
            }
        });
        add(finishedRespondingButton);
        finishedRespondingButton.setBounds(258, 330, 178, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void finishedRespondingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedRespondingButtonActionPerformed
        parent.setContentPane(new SecuritySummaryInProgressReportResultPanel(home, parent, this));
        parent.revalidate();
    }//GEN-LAST:event_finishedRespondingButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commentsTextArea;
    private javax.swing.JButton finishedRespondingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private flinsafeprototype.MapWithPointsPanel mapWithPointsPanel1;
    private javax.swing.JLabel numLabel;
    private javax.swing.JLabel responderLabel;
    private javax.swing.JLabel responseStartTimeLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
