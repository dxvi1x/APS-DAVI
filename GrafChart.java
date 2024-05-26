
package aps_davi;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GrafChart extends JFrame {
    public GrafChart(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Grafico Gasto");
        setSize (950,700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
        
    }
    public void criarGrafico(){
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
    barra.setValue(485, "jan", "");
    barra.setValue(361, "feb", "");
    barra.setValue(295, "mar", "");
    barra.setValue(345, "apr", "");
    barra.setValue(234, "may", "");
    barra.setValue(217, "jun", "");
    barra.setValue(200, "jul", "");
    
        var grafico = ChartFactory.createBarChart("Gastos com Conta de Energia","Meses","Dinheiro",barra,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot barraItem = grafico.getCategoryPlot();
        barraItem.getRenderer().setSeriesPaint(0, Color.BLACK);
        barraItem.getRenderer().setSeriesPaint(1, Color.WHITE);
        barraItem.getRenderer().setSeriesPaint(2, Color.GRAY);
        barraItem.getRenderer().setSeriesPaint(3, Color.RED);
        barraItem.getRenderer().setSeriesPaint(4, Color.GREEN);
        barraItem.getRenderer().setSeriesPaint(5, Color.YELLOW);
        barraItem.getRenderer().setSeriesPaint(6, Color.BLUE);
        
        
        ChartPanel painel = new ChartPanel(grafico);
    add(painel);
    
    
            
    }
 public static void main(String[] args){
        GrafChart grafChart = new GrafChart();    
 }   
}
