/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkear
 */
public class SecuritySummaryInProgressReportResultPanel extends javax.swing.JPanel {
    
    private String[] incidentInfo;
    javax.swing.JFrame parent;
    SecuritySummaryMain home;
    
    /**
     * Creates new form SecuritySummaryInProgressReportResultPanel
     */
    public SecuritySummaryInProgressReportResultPanel() {
        initComponents();
    }
    public SecuritySummaryInProgressReportResultPanel(SecuritySummaryMain home, SecuritySummaryInProgressResponse parent) {
        this.parent = parent;
        this.home = home;
        incidentInfo = parent.getIncidentInfo();
        HelperLocations locs = new HelperLocations();
        initComponents();
        this.incidentInfo = incidentInfo;
        System.out.println(this.getWidth());
        parent.setSize(new Dimension(761, 900));
        
        timeLabel.setText(incidentInfo[2]);
        numLabel.setText(incidentInfo[0]);
        typeLabel.setText(incidentInfo[3]);
        locationLabel.setText(incidentInfo[6]);
        commentsTextArea.setText(incidentInfo[5]);
        responderLabel.setText(incidentInfo[4]);
        responseStartTimeLabel.setText(incidentInfo[1]);
    }
    public SecuritySummaryInProgressReportResultPanel(SecuritySummaryMain home, SecuritySummaryNewIncidentResponse parent) {
        this.parent = parent;
        this.home = home;
        incidentInfo = parent.getIncidentInfo();
        HelperLocations locs = new HelperLocations();
        initComponents();
        this.incidentInfo = incidentInfo;
        System.out.println(this.getWidth());
        parent.setSize(new Dimension(761, 805));
        
        timeLabel.setText(incidentInfo[2]);
        numLabel.setText(incidentInfo[0]);
        typeLabel.setText(incidentInfo[3]);
        locationLabel.setText(incidentInfo[6]);
        commentsTextArea.setText(incidentInfo[5]);
        responderLabel.setText(incidentInfo[4]);
        responseStartTimeLabel.setText(incidentInfo[1]);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        responderLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        responseStartTimeLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        reportTitleTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        reportSummaryTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        reportResolutionTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        reportResultComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportTextTextArea = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Completed Incident Report Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Report Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Incident Number");

        numLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLabel.setText("jLabel9");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Report Type");

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        typeLabel.setText("jLabel9");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Report Time");

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeLabel.setText("jLabel9");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Report Location");

        locationLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locationLabel.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Responder");

        responderLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        responderLabel.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Response Start Time");

        responseStartTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        responseStartTimeLabel.setText("jLabel9");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Report Comments");

        commentsTextArea.setEditable(false);
        commentsTextArea.setBackground(new java.awt.Color(240, 240, 240));
        commentsTextArea.setColumns(20);
        commentsTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        commentsTextArea.setLineWrap(true);
        commentsTextArea.setRows(5);
        commentsTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(commentsTextArea);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Incident Details:");

        reportTitleTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Report Title:");

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("This should be only a couple of words describing the incident");

        reportSummaryTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Report Summary:");

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Summarise the report in one sentence");

        reportResolutionTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Report Resolution:");

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Summarise the resolution of the incident in one sentence");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Report Result:");

        reportResultComboBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        reportResultComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resolved","Escalated","Resolved and Escalated" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Report Details:");

        reportTextTextArea.setColumns(20);
        reportTextTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        reportTextTextArea.setLineWrap(true);
        reportTextTextArea.setRows(5);
        reportTextTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(reportTextTextArea);

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Go into more detail about the incident");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Submit Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numLabel)
                                            .addComponent(typeLabel)
                                            .addComponent(timeLabel)
                                            .addComponent(locationLabel)
                                            .addComponent(responderLabel)
                                            .addComponent(responseStartTimeLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(reportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reportSummaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16)
                                        .addComponent(reportResolutionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(reportResultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(typeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(timeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(locationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(responderLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numLabel)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(responseStartTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(reportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(reportSummaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(reportResolutionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(reportResultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //CSV FILE HERE
        //URL url = getClass().getResource("Reports.csv");
        //File file = new File(url.getPath());
        String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "Reports.csv";
        BufferedWriter writer = null;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        //add to reports
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryNewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(incidentInfo[0] + ", " + new Date() + "," + incidentInfo[2] + "," + reportTitleTextField.getText() + "," + reportSummaryTextField.getText() + "," + reportResolutionTextField.getText() + "," + incidentInfo[6] + "," + "Gerry Mortimer" + ", \"Security Guards Comments:" + reportTextTextArea.getText() + "Reporter Comments:" + incidentInfo[5] + "\"," + incidentInfo[3] + "," + (String) reportResultComboBox.getSelectedItem());
            writer.append(incidentInfo[0] + ", " + new Date() + "," + incidentInfo[2] + "," + reportTitleTextField.getText() + "," + reportSummaryTextField.getText() + "," + reportResolutionTextField.getText() + "," + incidentInfo[6] + "," + "Gerry Mortimer" + ", \"Security Guards Comments:" + reportTextTextArea.getText() + "Reporter Comments:" + incidentInfo[5] + "\"," + incidentInfo[3] + "," + (String) reportResultComboBox.getSelectedItem());
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

        try {

            home.readReports();
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //remove from in progress
        int id = Integer.parseInt(incidentInfo[0]);
        //CSV FILE HERE
        //url = getClass().getResource("InProgress.csv");
        //file = new File(url.getPath());
        file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "InProgress.csv";

        //read in all lines
        BufferedReader reader;
        LinkedList<String> stringList = new LinkedList<String>();
        try {
            reader = new BufferedReader(new FileReader(file));
            //reader.readLine();
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                stringList.add(currentLine);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //write all out except for the one we want to remove

        try {

            writer = new BufferedWriter(new FileWriter(file, false));
            String currentLine;
            currentLine = stringList.remove();
            writer.write(currentLine);
            writer.newLine();
            while(stringList.size() > 0){
                currentLine = stringList.remove();
                String[] incident = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if(Integer.parseInt(incident[0]) != id){
                    writer.write(currentLine);
                    writer.newLine();
                }
            }
            writer.close();
            home.readInProgress();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        parent.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commentsTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel numLabel;
    private javax.swing.JTextField reportResolutionTextField;
    private javax.swing.JComboBox<String> reportResultComboBox;
    private javax.swing.JTextField reportSummaryTextField;
    private javax.swing.JTextArea reportTextTextArea;
    private javax.swing.JTextField reportTitleTextField;
    private javax.swing.JLabel responderLabel;
    private javax.swing.JLabel responseStartTimeLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
