/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

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
public class IncidentResponsePanel extends javax.swing.JPanel {

    private String[] incidentInfo;
    NewIncidentResponse parent;
    SecuritySummaryMain home;

    /**
     * Creates new form IncidentResponsePanel
     */
    public IncidentResponsePanel() {
        initComponents();
    }

    public IncidentResponsePanel(int incidentNum, SecuritySummaryMain home, NewIncidentResponse parent) throws IOException {
        initComponents();
        this.parent = parent;
        this.home = home;
        this.incidentInfo = parent.getIncidentInfo();
        initText(incidentNum);
        
    }

    public void initText(int incidentNum) throws IOException {
        Locations locs = new Locations();
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

        jLabel1 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Incident Details:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Incident Number");

        numLabel.setText("jLabel9");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Report Type");

        typeLabel.setText("jLabel9");

        timeLabel.setText("jLabel9");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Report Time");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Report Location");

        locationLabel.setText("jLabel9");

        commentsTextArea.setEditable(false);
        commentsTextArea.setColumns(20);
        commentsTextArea.setLineWrap(true);
        commentsTextArea.setRows(5);
        jScrollPane1.setViewportView(commentsTextArea);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Report Comments");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("How would you like to respond?");

        addToQueueButton.setText("Add Incident to Queue");
        addToQueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToQueueButtonActionPerformed(evt);
            }
        });

        respondImmeditatelyButton.setText("Respond Immediately");
        respondImmeditatelyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondImmeditatelyButtonActionPerformed(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Response Choice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addToQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respondImmeditatelyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numLabel)
                            .addComponent(typeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationLabel)
                            .addComponent(timeLabel))))
                .addGap(18, 18, 18)
                .addComponent(mapWithPointsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(numLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respondImmeditatelyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addToQueueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mapWithPointsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToQueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToQueueButtonActionPerformed
        parent.setContentPane(new addToQueuePanel(home, parent));
        parent.revalidate();
    }//GEN-LAST:event_addToQueueButtonActionPerformed

    private void respondImmeditatelyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondImmeditatelyButtonActionPerformed
        URL url = getClass().getResource("InProgress.csv");
        File file = new File(url.getPath());
        BufferedWriter writer = null;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        //add to inprogress
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException ex) {
            Logger.getLogger(NewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(incidentInfo[0] + "," + hour + ":" + min + "," + incidentInfo[1] + "," + incidentInfo[2] + "," + home.getCurrentUser() + "," + incidentInfo[4] + "," + incidentInfo[3]);
            writer.append(incidentInfo[0] + "," + hour + ":" + min + "," + incidentInfo[1] + "," + incidentInfo[2] + "," + home.getCurrentUser() + "," + incidentInfo[4] + "," + incidentInfo[3]);
            writer.newLine();
            
        } catch (IOException ex) {
            Logger.getLogger(NewIncidentResponse.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            writer.flush();
            writer.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            
            home.readInProgress();
        } catch (IOException ex) {
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //remove from new incidents queue
        int id = Integer.parseInt(incidentInfo[0]);
        url = getClass().getResource("NewIncidents.csv");
        file = new File(url.getPath());
        
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
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IncidentResponsePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        parent.setContentPane(new respondImmediatelyPanel(home, parent));
        parent.revalidate();
    }//GEN-LAST:event_respondImmeditatelyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToQueueButton;
    private javax.swing.JTextArea commentsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
