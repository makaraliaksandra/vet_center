package work;

import org.jfree.chart.*;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class PieChart_AWT {

    public PieChart_AWT() {
        /*DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue("IPhone 5s", new Double( 20 ) );
        dataset.setValue("SamSung Grand", new Double( 20 ) );
        dataset.setValue("MotoG", new Double( 40 ) );
        dataset.setValue("Nokia Lumia", new Double( 10 ) );

        JFreeChart chart = ChartFactory.createPieChart(
                "Диаграмма заявок услуг",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        int width = 640;
        int height = 480;
        File pieChart = new File( "img.jpeg" );
        //pieChart.createNewFile();
        ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );*/

        final DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("One", new Double(43.2));
        data.setValue("Two", new Double(10.0));
        data.setValue("Three", new Double(27.5));
        data.setValue("Four", new Double(17.5));
        data.setValue("Five", new Double(11.0));
        data.setValue("Six", new Double(19.4));

        JFreeChart chart = ChartFactory.createPieChart
                ("Pie Chart ", data, true, true, false);

        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("D:\\pieChart.png");
            file1.createNewFile();
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
