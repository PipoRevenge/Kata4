/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4.view;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import kata4.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
/**
 *
 * @author aleja
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;
    public HistogramDisplay(Histogram<String> histogram) {
         super("HISTOGRAMA");
         this.histogram = histogram;
         setContentPane(createPanel());
         ChartPanel contenedor;
         
         pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
         chartPanel.setPreferredSize(new Dimension(500,400));
         return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=
                ChartFactory.createBarChart("Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, 
                false,false, false);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key),"",key);
        }
        
        return dataSet;
    }
    public void execute(){

        HistogramDisplay histo = new HistogramDisplay(histogram);
        this.setVisible(true);
        
    }
}
