/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bryn
 */
public class PhonePanelMyReportsDetails extends javax.swing.JPanel {

    JFrame parent;
    private String[] incidentInfo;
    
    /**
     * Creates new form PhonePanelMyReportsDetails
     */
    public PhonePanelMyReportsDetails() {
        initComponents();
    }
    
    public PhonePanelMyReportsDetails(JFrame parent, int rowNum) throws IOException {
        initComponents();
        this.parent = parent;
                
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";
        
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i <= rowNum; i++) {
                br.readLine();
            }
            line = br.readLine();
            this.incidentInfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            //setIncidentInfo(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1));
            //System.out.println(incidentInfo);
        }
        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
        }
        
        IncidentNumberText.setText(incidentInfo[0]);
        AreaText.setText(incidentInfo[3]);
        RoomText.setText(incidentInfo[4]);
        CommentText.setText(incidentInfo[10]);
        reportTimeText.setText(incidentInfo[1]);
        reportTitle.setText(incidentInfo[2]);
        
        
       
        
        
        switch(incidentInfo[2]){
            case "Escort Request" :                       
                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Area:");
                ExtraText1.setText(incidentInfo[5]);
                ExtraLabel2.setText("Room:");            
                ExtraText2.setText(incidentInfo[6]);
                ExtraLabel3.setText("Time for Escort:");            
                ExtraText3.setText(incidentInfo[7]);
                break;

            case "Fire Report" :
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Size:");
                ExtraLabel2.setText("Type:");
                ExtraText1.setText(incidentInfo[9]);
                ExtraText2.setText(incidentInfo[8]);
                break;

            case "Intruder Report" :
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Number:");
                ExtraLabel2.setText("Armed:");
                ExtraText1.setText(incidentInfo[9]);
                ExtraText2.setText(incidentInfo[8]);
                break;
            
            case "Injury Report":
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                ExtraLabel2.setVisible(false);
                ExtraText2.setVisible(false);
                ExtraLabel1.setVisible(false);
                ExtraText1.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
                break;
            
            case "Snake Sighting" :
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Size:");
                ExtraLabel2.setText("Type:");
                ExtraText1.setText(incidentInfo[9]);
                ExtraText2.setText(incidentInfo[8]);
                break;
            
            case "Room Access Request" :
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                ExtraLabel2.setVisible(false);
                ExtraText2.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Time for Access:");
                ExtraText1.setText(incidentInfo[7]);
                break;
            
            case "Accessibility Transport" :
            break;

            case "Other Report" :
                DestinationLabel.setVisible(false);
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                ExtraLabel2.setVisible(false);
                ExtraText2.setVisible(false);
                ExtraLabel1.setVisible(false);
                ExtraText1.setVisible(false);
                CurrentLocationLabel.setVisible(false);

                reportTimeLabel.setText("Report Time:");
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        reportTitle = new javax.swing.JLabel();
        ExtraText3 = new javax.swing.JLabel();
        CommentLabel = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        AreaText = new javax.swing.JLabel();
        AreaLabel = new javax.swing.JLabel();
        CurrentLocationLabel = new javax.swing.JLabel();
        RoomText = new javax.swing.JLabel();
        DestinationLabel = new javax.swing.JLabel();
        ExtraLabel1 = new javax.swing.JLabel();
        CommentText = new java.awt.TextArea();
        ExtraLabel2 = new javax.swing.JLabel();
        ExtraText1 = new javax.swing.JLabel();
        ExtraLabel3 = new javax.swing.JLabel();
        ExtraText2 = new javax.swing.JLabel();
        RoomLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IncidentNumberText = new javax.swing.JLabel();
        reportTimeLabel = new javax.swing.JLabel();
        reportTimeText = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/phone4top.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/phone4left.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/phone4right.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/phone4bottom.jpg"))); // NOI18N

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        reportTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reportTitle.setText("Report Details");

        ExtraText3.setText("jLabel6");

        CommentLabel.setText("Additional Comments:");

        Cancel.setText("Cancel Report");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        AreaText.setText("jLabel5");

        AreaLabel.setText("Area:");

        CurrentLocationLabel.setText("Your Current Location:");

        RoomText.setText("jLabel6");

        DestinationLabel.setText("Your Destination:");

        ExtraLabel1.setText("Area:");

        CommentText.setEditable(false);
        CommentText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N

        ExtraLabel2.setText("Room:");

        ExtraText1.setText("jLabel5");

        ExtraLabel3.setText("Time for Escort:");

        ExtraText2.setText("jLabel6");

        RoomLabel.setText("Room:");

        jLabel2.setText("Incident Number:");

        IncidentNumberText.setText("jLabel3");

        reportTimeLabel.setText("Time of Request:");

        reportTimeText.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ExtraLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(ExtraText3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DestinationLabel)
                                    .addComponent(CommentLabel)
                                    .addComponent(CommentText, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CurrentLocationLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ExtraLabel1)
                                            .addComponent(ExtraLabel2))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ExtraText1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                            .addComponent(ExtraText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AreaLabel)
                                            .addComponent(RoomLabel))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AreaText, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(RoomText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IncidentNumberText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reportTimeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reportTimeText))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton)
                                .addGap(18, 18, 18)
                                .addComponent(reportTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(Cancel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(reportTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IncidentNumberText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reportTimeLabel)
                            .addComponent(reportTimeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentLocationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AreaLabel)
                            .addComponent(AreaText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomLabel)
                            .addComponent(RoomText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DestinationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExtraLabel1)
                            .addComponent(ExtraText1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExtraText2)
                            .addComponent(ExtraLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExtraLabel3)
                            .addComponent(ExtraText3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CommentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CommentText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
                parent.setContentPane(new PhonePanelMyReports(parent));
                parent.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_backButtonActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        //remove from in progress
        int id = Integer.parseInt(incidentInfo[0]);
        BufferedWriter writer = null;
        //CSV FILE HERE
        //url = getClass().getResource("InProgress.csv");
        //file = new File(url.getPath());
        String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";

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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
                parent.setContentPane(new PhonePanelMyReports(parent));
                parent.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JLabel AreaText;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel CommentLabel;
    private java.awt.TextArea CommentText;
    private javax.swing.JLabel CurrentLocationLabel;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JLabel ExtraLabel1;
    private javax.swing.JLabel ExtraLabel2;
    private javax.swing.JLabel ExtraLabel3;
    private javax.swing.JLabel ExtraText1;
    private javax.swing.JLabel ExtraText2;
    private javax.swing.JLabel ExtraText3;
    private javax.swing.JLabel IncidentNumberText;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JLabel RoomText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel reportTimeLabel;
    private javax.swing.JLabel reportTimeText;
    private javax.swing.JLabel reportTitle;
    // End of variables declaration//GEN-END:variables
}
