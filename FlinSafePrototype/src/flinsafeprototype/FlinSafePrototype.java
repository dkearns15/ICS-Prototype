/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flinsafeprototype;

import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author dkear
 * 
 * Main file, just used as a home file and to initialise the main menu
 */
public class FlinSafePrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new MainMenu().setVisible(true);
    }

}
