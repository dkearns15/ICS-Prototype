/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author dkear
 *
 */
public class SecuritySummaryMain extends javax.swing.JFrame {

    private String currentUser;

    /**
     * Creates new form securitySummary
     */
    public SecuritySummaryMain() throws IOException {
        initComponents();
        initTableListener();
        readReports();
        readNewIncidents();
        readInProgress();
        readIncidentQueue();
        currentUser = "Gerry Mortimer";
        Font font = new Font("Tahoma", Font.PLAIN, 18);
        JTableHeader header = newIncidentTable.getTableHeader();
        header.setFont(font);
        header = incidentQueueTable.getTableHeader();
        header.setFont(font);
        header = inProgressTable.getTableHeader();
        header.setFont(font);
        header = recentlyResolvedTable.getTableHeader();
        header.setFont(font);
        tabbedMenu.setFont(font);
        this.getContentPane().setBackground(Color.white);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void setTabbedMenu(int i){
        this.tabbedMenu.setSelectedIndex(i);
    }
    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedMenu = new javax.swing.JTabbedPane();
        NewIncidentsPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        newIncidentTable = new javax.swing.JTable();
        viewIncidentDetailsButton = new javax.swing.JButton();
        tab1Queue = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        incidentQueueTable = new javax.swing.JTable();
        respondToIncidentButton = new javax.swing.JButton();
        inProgressPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inProgressTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        recentlyResolvedPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recentlyResolvedTable = new javax.swing.JTable();
        openReportButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Security Summary Main");
        setBackground(new java.awt.Color(255, 255, 255));

        tabbedMenu.setBackground(new java.awt.Color(255, 255, 255));

        NewIncidentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        newIncidentTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newIncidentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Report Type", "Report Location", "Report Time", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        newIncidentTable.setRowHeight(24);
        jScrollPane4.setViewportView(newIncidentTable);

        viewIncidentDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        viewIncidentDetailsButton.setText("View Incident Details");
        viewIncidentDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIncidentDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewIncidentsPanelLayout = new javax.swing.GroupLayout(NewIncidentsPanel);
        NewIncidentsPanel.setLayout(NewIncidentsPanelLayout);
        NewIncidentsPanelLayout.setHorizontalGroup(
            NewIncidentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewIncidentsPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1665, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(viewIncidentDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NewIncidentsPanelLayout.setVerticalGroup(
            NewIncidentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addGroup(NewIncidentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewIncidentDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedMenu.addTab("New Incidents", NewIncidentsPanel);

        tab1Queue.setBackground(new java.awt.Color(255, 255, 255));

        incidentQueueTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        incidentQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Report Type", "Report Location", "Report Time", "Comments", "Priority", "Security Guard Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        incidentQueueTable.setRowHeight(24);
        jScrollPane1.setViewportView(incidentQueueTable);

        respondToIncidentButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        respondToIncidentButton.setText("Respond to Incident");
        respondToIncidentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondToIncidentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab1QueueLayout = new javax.swing.GroupLayout(tab1Queue);
        tab1Queue.setLayout(tab1QueueLayout);
        tab1QueueLayout.setHorizontalGroup(
            tab1QueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1QueueLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(respondToIncidentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        tab1QueueLayout.setVerticalGroup(
            tab1QueueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1QueueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(respondToIncidentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
            .addGroup(tab1QueueLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tabbedMenu.addTab("Incident Queue", tab1Queue);

        inProgressPanel.setBackground(new java.awt.Color(255, 255, 255));

        inProgressTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inProgressTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Report Type", "Report Location", "Report Time", "Responder", "Response Time", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inProgressTable.setRowHeight(24);
        jScrollPane2.setViewportView(inProgressTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inProgressPanelLayout = new javax.swing.GroupLayout(inProgressPanel);
        inProgressPanel.setLayout(inProgressPanelLayout);
        inProgressPanelLayout.setHorizontalGroup(
            inProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inProgressPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1665, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        inProgressPanelLayout.setVerticalGroup(
            inProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addGroup(inProgressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedMenu.addTab("In Progress", inProgressPanel);

        recentlyResolvedPanel.setBackground(new java.awt.Color(255, 255, 255));

        recentlyResolvedTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recentlyResolvedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Incident ID", "Report Type", "Report Location", "Responder", "Result", "Other Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recentlyResolvedTable.setRowHeight(24);
        jScrollPane3.setViewportView(recentlyResolvedTable);

        openReportButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        openReportButton.setText("Open Report");
        openReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recentlyResolvedPanelLayout = new javax.swing.GroupLayout(recentlyResolvedPanel);
        recentlyResolvedPanel.setLayout(recentlyResolvedPanelLayout);
        recentlyResolvedPanelLayout.setHorizontalGroup(
            recentlyResolvedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentlyResolvedPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1665, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(openReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        recentlyResolvedPanelLayout.setVerticalGroup(
            recentlyResolvedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addGroup(recentlyResolvedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(openReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedMenu.addTab("Recently Resolved", recentlyResolvedPanel);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flinsafeprototype/flindersbannerSecSum.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = inProgressTable.getSelectedRow();
        try {
            int id = Integer.parseInt((String) inProgressTable.getModel().getValueAt(selectedRow, 0));
            try {
                openInProgressResponse(selectedRow);
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Didn't select incident");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void openReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openReportButtonActionPerformed
        int selectedRow = recentlyResolvedTable.getSelectedRow();
        try {
            try {
               openReportDetails(selectedRow + 1);
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Didn't select incident");
        }
    }//GEN-LAST:event_openReportButtonActionPerformed

    private void respondToIncidentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondToIncidentButtonActionPerformed
        int selectedRow = incidentQueueTable.getSelectedRow();
        try {
            //int id = Integer.parseInt((String) inProgressTable.getModel().getValueAt(selectedRow, 0));
            try {
                openIncidentQueueResponse(selectedRow);
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Didn't select incident");
        }
    }//GEN-LAST:event_respondToIncidentButtonActionPerformed

    private void viewIncidentDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIncidentDetailsButtonActionPerformed
        int selectedRow = newIncidentTable.getSelectedRow();
        try {
            int id = Integer.parseInt((String) newIncidentTable.getModel().getValueAt(selectedRow, 0));
            try {
                openIncidentResponse(selectedRow);
            } catch (IOException ex) {
                Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Didn't select incident");
        }
    }//GEN-LAST:event_viewIncidentDetailsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SecuritySummaryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SecuritySummaryMain().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //Opens a new report detail instance for the report with the id 'num'
    public void openReportDetails(int num) throws IOException {
        new ReportDetails(num).setVisible(true);
    }
    public void openIncidentResponse(int num) throws IOException {
        new SecuritySummaryNewIncidentResponse(num, this, true).setVisible(true);
    }
    public void openInProgressResponse(int num) throws IOException {
        new SecuritySummaryInProgressResponse(num, this).setVisible(true);
    }
    public void openIncidentQueueResponse(int num) throws IOException {
        SecuritySummaryNewIncidentResponse a = new SecuritySummaryNewIncidentResponse(num, this, false);
        a.setVisible(true);
        a.setContentPane(new SecuritySummaryIncidentQueueResponsePanel(num, this, a));
        a.revalidate();
    }

    //Adds a listener to the table on tab 3 which listens for a double click and
    //opens a new ReportDetails instance with the id of that report if it hears
    //a double click
    public void initTableListener() {
        recentlyResolvedTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                int id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    try {
                        openReportDetails(row + 1);
                    } catch (IOException ex) {
                        Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        newIncidentTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                //int id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    try {
                        openIncidentResponse(row);
                    } catch (IOException ex) {
                        Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        inProgressTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                //int id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    try {
                        openInProgressResponse(row);
                    } catch (IOException ex) {
                        Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        incidentQueueTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                //int id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    try {
                        openIncidentQueueResponse(row);
                    } catch (IOException ex) {
                        Logger.getLogger(SecuritySummaryMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    public void readIncidentQueue() throws FileNotFoundException, IOException{
        //CSV FILE HERE
        //URL url = getClass().getResource("IncidentQueue.csv");
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "IncidentQueue.csv";
            String line;
            String[] incident = null;
            DefaultTableModel tableModel = (DefaultTableModel) incidentQueueTable.getModel();

            //clear out table of anything that might be in it
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                tableModel.removeRow(0);
            }

//            ArrayList<String[]> list = new ArrayList();
            //Add all recentlyResolved reports to the recentlyResolvedTable
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine(); //Skip headers
                while ((line = br.readLine()) != null) {

                    //The following regex splits a csv file by commas, but not if they are in quotes
                    incident = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    String[] t = new String[]{incident[0], incident[2], incident[3], incident[1], incident[4], incident[5], incident[6]};
                    tableModel.addRow(t);
                    //list.add(t);
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

    public void readInProgress() throws FileNotFoundException, IOException {
        //CSV FILE HERE
        //URL url = getClass().getResource("InProgress.csv");
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "InProgress.csv";
            String line;
            String[] incident = null;
            DefaultTableModel tableModel = (DefaultTableModel) inProgressTable.getModel();

            //clear out table of anything that might be in it
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                tableModel.removeRow(0);
            }
//            ArrayList<String[]> list = new ArrayList();
            //Add all recentlyResolved reports to the recentlyResolvedTable
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine(); //Skip headers
                while ((line = br.readLine()) != null) {

                    //The following regex splits a csv file by commas, but not if they are in quotes
                    incident = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    String[] t = new String[]{incident[0], incident[3], incident[6], incident[2], incident[4], incident[1], incident[5]};
                    tableModel.addRow(t);
//                    list.add(t);
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

    public void readNewIncidents() throws FileNotFoundException, IOException {
        //CSV FILE HERE
        //URL url = getClass().getResource("NewIncidents.csv");
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "NewIncidents.csv";
            String line;
            String[] incident = null;
            DefaultTableModel tableModel = (DefaultTableModel) newIncidentTable.getModel();

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
                    String[] t = new String[]{incident[0], incident[2], incident[3], incident[1], incident[4]};
                    tableModel.addRow(t);
                }
            }

            //Just here in case we want it later
            rowCount = tableModel.getRowCount();

        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
            //Not implemented yet
        }
    }

    public void readReports() throws FileNotFoundException, IOException {
        //CSV FILE HERE
        //URL url = getClass().getResource("Reports.csv");
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "Reports.csv";
            String line;
            String[] incident = null;
            DefaultTableModel tableModel = (DefaultTableModel) recentlyResolvedTable.getModel();

            //clear out table of anything that might be in it
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                tableModel.removeRow(0);
            }
            //ArrayList<String[]> list = new ArrayList();
            //Add all recentlyResolved reports to the recentlyResolvedTable
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine(); //Skip headers
                while ((line = br.readLine()) != null) {

                    //The following regex splits a csv file by commas, but not if they are in quotes
                    incident = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    String[] t = new String[]{incident[0], incident[9], incident[6], incident[7], incident[10], incident[3]};
                    //list.add(t);
                    tableModel.addRow(t);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NewIncidentsPanel;
    private javax.swing.JPanel inProgressPanel;
    private javax.swing.JTable inProgressTable;
    private javax.swing.JTable incidentQueueTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable newIncidentTable;
    private javax.swing.JButton openReportButton;
    private javax.swing.JPanel recentlyResolvedPanel;
    private javax.swing.JTable recentlyResolvedTable;
    private javax.swing.JButton respondToIncidentButton;
    private javax.swing.JPanel tab1Queue;
    public static javax.swing.JTabbedPane tabbedMenu;
    private javax.swing.JButton viewIncidentDetailsButton;
    // End of variables declaration//GEN-END:variables
}
