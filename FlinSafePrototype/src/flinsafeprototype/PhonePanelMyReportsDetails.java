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

    public PhonePanelMyReportsDetails(JFrame parent, int rowNum, String id) throws IOException {
        initComponents();
        this.parent = parent;

        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0, new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";

            String line;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                while(true) {
                    line = br.readLine();
                    this.incidentInfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    if(incidentInfo[0].equals(id)){
                        break;
                    }

                }

                //setIncidentInfo(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1));
                //System.out.println(incidentInfo);
            }
        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
        }

        IncidentNumberText.setText(incidentInfo[0]);
        String test = IncidentNumberText.getText();
        AreaText.setText(incidentInfo[3]);
        if (incidentInfo[2].equals("Accessibility Transport Request")) {
            RoomText.setText(incidentInfo[5]);
            reportTitle.setText("Accessibility Transport");
        } else {
            RoomText.setText(incidentInfo[4]);
            CommentText.setText(incidentInfo[10]);
            reportTitle.setText(incidentInfo[2]);
        }
        reportTimeText.setText(incidentInfo[1]);

        switch (incidentInfo[2]) {
            case "Escort Request":
                reportTimeLabel.setText("Report Time:");
                ExtraLabel1.setText("Area:");
                ExtraText1.setText(incidentInfo[5]);
                ExtraLabel2.setText("Room:");
                ExtraText2.setText(incidentInfo[6]);
                ExtraLabel3.setText("Time for Escort:");
                ExtraText3.setText(incidentInfo[7]);
                break;

            case "Fire Report":
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

            case "Intruder Report":
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

            case "Snake Sighting":
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

            case "Room Access Request":
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

            case "Accessibility Transport Request":
                ExtraLabel3.setVisible(false);
                ExtraText3.setVisible(false);
                CurrentLocationLabel.setVisible(false);
                DestinationLabel.setVisible(false);

                AreaLabel.setText("Pick Up:");
                RoomLabel.setText("Drop Off:");
                reportTimeLabel.setText("Request Time:");
                ExtraLabel1.setText("Pick Up Day:");
                ExtraText1.setText("Wednesday 23rd May");
                ExtraLabel2.setText("Pick Up Time:");
                ExtraText2.setText(incidentInfo[7]);
                break;

            case "Other Report":
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
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 78, -1, -1));

        reportTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reportTitle.setText("Report Details");
        add(reportTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 75, -1, -1));

        ExtraText3.setText("jLabel6");
        add(ExtraText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 323, 137, -1));

        CommentLabel.setText("Additional Comments:");
        add(CommentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 374, -1, -1));

        Cancel.setText("Cancel Report");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 521, -1, -1));

        AreaText.setText("jLabel5");
        add(AreaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 177, -1));

        AreaLabel.setText("Area:");
        add(AreaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 184, -1, -1));

        CurrentLocationLabel.setText("Your Current Location:");
        add(CurrentLocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 164, -1, -1));

        RoomText.setText("jLabel6");
        add(RoomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 177, -1));

        DestinationLabel.setText("Your Destination:");
        add(DestinationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 241, -1, -1));

        ExtraLabel1.setText("Area:");
        add(ExtraLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 266, -1, -1));

        CommentText.setEditable(false);
        CommentText.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        add(CommentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 398, 256, 113));

        ExtraLabel2.setText("Room:");
        add(ExtraLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 298, -1, -1));

        ExtraText1.setText("jLabel5");
        add(ExtraText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 176, -1));

        ExtraLabel3.setText("Time for Escort:");
        add(ExtraLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 323, -1, -1));

        ExtraText2.setText("jLabel6");
        add(ExtraText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 176, -1));

        RoomLabel.setText("Room:");
        add(RoomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel2.setText("Incident Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 112, -1, -1));

        IncidentNumberText.setText("jLabel3");
        add(IncidentNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        reportTimeLabel.setText("Time of Request:");
        add(reportTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        reportTimeText.setText("jLabel3");
        add(reportTimeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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
        String file = new File(".").getAbsolutePath().substring(0, new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";

        //read in all lines
        BufferedReader reader;
        LinkedList<String> stringList = new LinkedList<String>();
        try {
            reader = new BufferedReader(new FileReader(file));
            //reader.readLine();
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
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
            while (stringList.size() > 0) {
                currentLine = stringList.remove();
                String[] incident = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (Integer.parseInt(incident[0]) != id) {
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel reportTimeLabel;
    private javax.swing.JLabel reportTimeText;
    private javax.swing.JLabel reportTitle;
    // End of variables declaration//GEN-END:variables
}
