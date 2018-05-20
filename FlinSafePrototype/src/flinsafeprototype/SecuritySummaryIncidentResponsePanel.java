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
public class SecuritySummaryIncidentResponsePanel extends javax.swing.JPanel {

    private String[] incidentInfo;
    SecuritySummaryNewIncidentResponse parent;
    SecuritySummaryMain home;

    /**
     * Creates new form IncidentResponsePanel
     */
    public SecuritySummaryIncidentResponsePanel() {
        initComponents();
    }

    public SecuritySummaryIncidentResponsePanel(int incidentNum, SecuritySummaryMain home, SecuritySummaryNewIncidentResponse parent) throws IOException {
        initComponents();
        this.parent = parent;
        this.home = home;
        this.incidentInfo = parent.getIncidentInfo();
        initText(incidentNum);

    }

    public void initText(int incidentNum) throws IOException {
        HelperLocations locs = new HelperLocations();
        System.out.println(incidentInfo[0]);
        timeLabel.setText(incidentInfo[1]);
        numLabel.setText(incidentInfo[0]);
        typeLabel.setText(incidentInfo[2]);
        locationLabel.setText(incidentInfo[3]);
        commentsTextArea.setText(incidentInfo[4]);

        //Gets the location based on the word describing the locations
        //If it does not find the location, X and Y point will be zero
        //Currently supported locations (can add more in Locations.java)
        //  hub, humanities, engineering
        mapWithPointsPanel1.setXpoint(locs.getLocationX(incidentInfo[3].toLowerCase()));
        mapWithPointsPanel1.setYpoint(locs.getLocationY(incidentInfo[3].toLowerCase()));
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

        jLabel3 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addToQueueButton = new javax.swing.JButton();
        respondImmeditatelyButton = new javax.swing.JButton();
        mapWithPointsPanel1 = new flinsafeprototype.MapWithPointsPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Incident Number");
        add(jLabel3);
        jLabel3.setBounds(21, 112, 132, 22);

        numLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLabel.setText("jLabel9");
        add(numLabel);
        numLabel.setBounds(171, 114, 180, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Report Type");
        add(jLabel4);
        jLabel4.setBounds(56, 141, 97, 22);

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        typeLabel.setText("jLabel9");
        add(typeLabel);
        typeLabel.setBounds(171, 143, 190, 20);

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeLabel.setText("jLabel9");
        add(timeLabel);
        timeLabel.setBounds(172, 172, 200, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Report Time");
        add(jLabel6);
        jLabel6.setBounds(57, 170, 97, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Report Location");
        add(jLabel7);
        jLabel7.setBounds(30, 199, 124, 22);

        locationLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locationLabel.setText("jLabel9");
        add(locationLabel);
        locationLabel.setBounds(172, 201, 210, 20);

        commentsTextArea.setEditable(false);
        commentsTextArea.setBackground(new java.awt.Color(240, 240, 240));
        commentsTextArea.setColumns(20);
        commentsTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        commentsTextArea.setLineWrap(true);
        commentsTextArea.setRows(5);
        commentsTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(commentsTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(172, 228, 331, 87);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Report Comments");
        add(jLabel8);
        jLabel8.setBounds(12, 228, 142, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("How would you like to respond?");
        add(jLabel2);
        jLabel2.setBounds(159, 333, 255, 22);

        addToQueueButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addToQueueButton.setText("Add Incident to Queue");
        addToQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToQueueButtonActionPerformed(evt);
            }
        });
        add(addToQueueButton);
        addToQueueButton.setBounds(87, 373, 193, 100);

        respondImmeditatelyButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        respondImmeditatelyButton.setText("Respond Immediately");
        respondImmeditatelyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondImmeditatelyButtonActionPerformed(evt);
            }
        });
        add(respondImmeditatelyButton);
        respondImmeditatelyButton.setBounds(292, 373, 187, 100);

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
        mapWithPointsPanel1.setBounds(576, 91, 382, 382);

        jLabel23.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel23.setText("FlinSafe: Response Choice");
        add(jLabel23);
        jLabel23.setBounds(640, 30, 380, 30);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbanner.png"))); // NOI18N
        jLabel21.setText("jLabel2");
        add(jLabel21);
        jLabel21.setBounds(-210, 0, 1240, 87);
    }// </editor-fold>//GEN-END:initComponents

    private void addToQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToQueueButtonActionPerformed
        Dimension size = parent.getSize();
        parent.setContentPane(new SecuritySummaryaddToQueuePanel(home, parent));
        parent.setSize(size);
        parent.revalidate();
    }//GEN-LAST:event_addToQueueButtonActionPerformed

    private void respondImmeditatelyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondImmeditatelyButtonActionPerformed
        //CSV FILE HERE
        //URL url = getClass().getResource("InProgress.csv");
        //File file = new File(url.getPath());
        String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "InProgress.csv";
        BufferedWriter writer = null;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        //add to inprogress
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryNewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(incidentInfo[0] + "," + hour + ":" + min + "," + incidentInfo[1] + "," + incidentInfo[2] + "," + home.getCurrentUser() + "," + incidentInfo[4] + "," + incidentInfo[3]);
            writer.append(incidentInfo[0] + "," + hour + ":" + min + "," + incidentInfo[1] + "," + incidentInfo[2] + "," + home.getCurrentUser() + "," + incidentInfo[4] + "," + incidentInfo[3]);
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

            home.readInProgress();
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        //remove from new incidents queue
        int id = Integer.parseInt(incidentInfo[0]);
        //CSV FILE HERE
        //url = getClass().getResource("NewIncidents.csv");
        //file = new File(url.getPath());
        file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "NewIncidents.csv";

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
            home.readNewIncidents();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SecuritySummaryIncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dimension size = parent.getSize();
        parent.setContentPane(new SecuritySummaryrespondImmediatelyPanel(home, parent, this));
        parent.setSize(size);
        parent.revalidate();
    }//GEN-LAST:event_respondImmeditatelyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToQueueButton;
    private javax.swing.JTextArea commentsTextArea;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private flinsafeprototype.MapWithPointsPanel mapWithPointsPanel1;
    private javax.swing.JLabel numLabel;
    private javax.swing.JButton respondImmeditatelyButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
