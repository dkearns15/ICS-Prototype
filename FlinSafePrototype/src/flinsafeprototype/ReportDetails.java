/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author 
 * 
 * In depth details for a specific report
 */
public class ReportDetails extends javax.swing.JFrame {

    /**
     * Creates new form ReportDetails
     * 
     * From the Reports.csv file based on id numbers
     */
    public ReportDetails(int incidentNum) throws IOException {
        initComponents();
        initText(incidentNum);
    }

    public ReportDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapWithPointsPanel1 = new flinsafeprototype.MapWithPointsPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        summaryLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        writerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTextArea = new javax.swing.JTextArea();
        numberLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        resolutionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Report Summary for Incident Number:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Report Title");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Report Summary");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Report Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Report Time");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Report Location");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Report Writer");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Report Text");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titleLabel.setText("jLabel9");

        summaryLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        summaryLabel.setText("jLabel9");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dateLabel.setText("jLabel9");

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeLabel.setText("jLabel9");

        locationLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locationLabel.setText("jLabel9");

        writerLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        writerLabel.setText("jLabel9");

        textTextArea.setEditable(false);
        textTextArea.setBackground(new java.awt.Color(240, 240, 240));
        textTextArea.setColumns(20);
        textTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textTextArea.setLineWrap(true);
        textTextArea.setRows(5);
        textTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textTextArea);

        numberLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        numberLabel.setText("jLabel9");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Report Resolution");

        resolutionLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        resolutionLabel.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(titleLabel)
                                .addComponent(summaryLabel)
                                .addComponent(dateLabel)
                                .addComponent(timeLabel)
                                .addComponent(locationLabel)
                                .addComponent(writerLabel)
                                .addComponent(resolutionLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapWithPointsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mapWithPointsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(titleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(summaryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(timeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(locationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(writerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(resolutionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportDetails().setVisible(true);
            }
        });
    }

    /*
    * Pass in an incident id as the incident number
    * Should add a try catch for invalid incident number
    *
    * Reads in details from Reports.csv and displays them and sets up the
    * MapWithPointsPanel with the point in the correct place
    */
    public void initText(int incidentNum) throws IOException {
        HelperLocations locs = new HelperLocations();
        
        //URL url = getClass().getResource("Reports.csv");
        try {
            //File file = new File(url.getPath());
        String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "Reports.csv";
        String line;
        String[] incident = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < incidentNum; i++) {
                br.readLine();
            }
            line = br.readLine();
            incident = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        }
        System.out.println(incident[0]);
        numberLabel.setText(incident[0]);
        dateLabel.setText(incident[1]);
        timeLabel.setText(incident[2]);
        titleLabel.setText(incident[3]);
        summaryLabel.setText(incident[4]);
        resolutionLabel.setText(incident[5]);
        locationLabel.setText(incident[6]);
        writerLabel.setText(incident[7]);
        textTextArea.setText(incident[8]);
        
        
        //Gets the location based on the word describing the locations
        //If it does not find the location, X and Y point will be zero
        //Currently supported locations (can add more in Locations.java)
        //  hub, humanities, engineering
        mapWithPointsPanel1.setXpoint(locs.getLocationX(incident[6].toLowerCase()));
        mapWithPointsPanel1.setYpoint(locs.getLocationY(incident[6].toLowerCase()));
        mapWithPointsPanel1.repaint();
        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel resolutionLabel;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextArea textTextArea;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel writerLabel;
    // End of variables declaration//GEN-END:variables
}
