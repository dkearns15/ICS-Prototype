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

/**
 *
 * @author dkear
 */
public class SecuritySummaryInProgressResponse extends javax.swing.JFrame {

    private String[] incidentInfo;
    
    /**
     * Creates new form SecuritySummaryInProgressResponse
     */
    public SecuritySummaryInProgressResponse() {
        initComponents();
    }

    public SecuritySummaryInProgressResponse(int rowNum, SecuritySummaryMain home) throws IOException {
        initComponents();
        //CSV FILE HERE
        //URL url = getClass().getResource("InProgress.csv");
        try {
            //File file = new File(url.getPath());
            String file = new File(".").getAbsolutePath().substring(0,new File(".").getAbsolutePath().length() - 1) + "InProgress.csv";
        
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i <= rowNum; i++) {
                br.readLine();
            }
            line = br.readLine();
            //this.incidentInfo = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            setIncidentInfo(line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1));
            System.out.println(incidentInfo);
        }
        } catch (NullPointerException e) {
            //Create a popup saying, we can't find the file
        }
        this.setContentPane(new SecuritySummaryInProgressDetailsPanel(rowNum, home, this));
    }
    public String[] getIncidentInfo() {
        return incidentInfo;
    }

    public void setIncidentInfo(String[] incidentInfo) {
        this.incidentInfo = incidentInfo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(SecuritySummaryInProgressResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryInProgressResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryInProgressResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecuritySummaryInProgressResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecuritySummaryInProgressResponse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
