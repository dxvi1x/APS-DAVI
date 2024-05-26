
package aps_davi;

import static java.awt.AWTEventMulticaster.add;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GrafPizza extends JFrame {
    
    public GrafPizza(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gráfico Água");
        setSize(950,700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }
     public void criarGrafico(){
         DefaultPieDataset pizza = new DefaultPieDataset();
         pizza.setValue("jan", 480);
         pizza.setValue("feb", 500);
         pizza.setValue("mar", 421);
         pizza.setValue("apr", 395);
         pizza.setValue("may", 307);
         pizza.setValue("jun", 260);
         pizza.setValue("jul", 200);
         
         JFreeChart grafico = ChartFactory.createPieChart("Gasto Água",pizza,true,true,false);
         ChartPanel painel = new ChartPanel(grafico);
         add(painel);
         
     }
  public static void main (String[] args){
        GrafPizza grafPizza = new GrafPizza(); 
       }
}