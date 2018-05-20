/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dkear
 */
public class PhonePanelMyReports extends javax.swing.JPanel {

    JFrame parent;
    
    /**
     * Creates new form PhonePanelMyReports
     */
    public PhonePanelMyReports() {
        initComponents();
    }
    
    public PhonePanelMyReports(JFrame parent) throws FileNotFoundException, IOException{
        initComponents();
        this.parent = parent;
        
        
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "ReportsKioskPhone.csv";
            String line;
            String[] incident = null;
            DefaultTableModel tableModel = (DefaultTableModel) MyReportsTable.getModel();

            //clear out table of anything that might be in it
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                tableModel.removeRow(0);
            }
            //Add all recentlyResolved reports to the recentlyResolvedTable
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine(); //Skip headers
                while ((line = br.readLine()) != null) {

                    //The following regex splits a csv file by commas, but not if they are in quotes
                    incident = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    String[] t = new String[]{incident[0], incident[2], incident[1]};
                    //list.add(t);
                    if (incident.length > 11 && incident[11].equals("Matthew Flinders"))
                    {
                        tableModel.addRow(t);
                    }
                }
            }
//            while(!list.isEmpty()){
//                tableModel.addRow(list.remove(list.size() - 1));
//            }
            //Just here in case we want it later
            rowCount = tableModel.getRowCount();

        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
            //Not implemented yet
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyReportsTable = new javax.swing.JTable();
        ReportDetailsButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Reports");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        MyReportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Incident Type", "Incident Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MyReportsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 257, 310));

        ReportDetailsButton.setText("View Report Details");
        ReportDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportDetailsButtonActionPerformed(evt);
            }
        });
        add(ReportDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/PhoneWhiteBackground.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        parent.setContentPane(new PhonePanelMainLoggedIn(parent));
        parent.revalidate();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ReportDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportDetailsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = MyReportsTable.getSelectedRow();
        String incidentNumber = MyReportsTable.getValueAt(selectedRow, 0).toString();
        try {
                parent.setContentPane(new PhonePanelMyReportsDetails(parent, selectedRow, incidentNumber));
                parent.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_ReportDetailsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MyReportsTable;
    private javax.swing.JButton ReportDetailsButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
