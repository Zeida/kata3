package kata3;


import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 45395507
 */
public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    

    private Container createPanel() {
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart;
        chart = ChartFactory.createBarChart("JFreeChart", 
                "Dominios email",
                "Nº email",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                true,
                rootPaneCheckingEnabled);

            return chart;
    }
    
        private DefaultCategoryDataset createDataset(){

            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
            dataSet.addValue(15,"","ulpgc.es");
            dataSet.addValue(8,"","ull.es");
            dataSet.addValue(2,"","hotmail.com");
            dataSet.addValue(6,"","gmail.com");

            return dataSet;
        }
    
}
