package application.startseite;

import java.net.URL;

import javax.annotation.Resources;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Application {
    
    @FXML
    private LineChart<Number, Number> chart;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    
    @FXML
    private Button button;  
    
    @FXML
    private Text navbarText;
    
    /*Constructor:*/ public Controller() {}
    
    @FXML
    private void logout() {
        System.out.println("logout!");
        this.navbarText.setText("Heading");
        this.chart.setTitle("TestTitle");
    }
    
    @FXML
    protected void initialize() {
        System.out.println("Method initialize!");  
     
        this.chart = new LineChart<Number,Number>(this.xAxis,this.yAxis);
        
        //defining a series
          XYChart.Series series = new XYChart.Series();
          series.setName("My portfolio");
          //populating the series with data
          series.getData().add(new XYChart.Data(1, 23));
          series.getData().add(new XYChart.Data(2, 14));
          series.getData().add(new XYChart.Data(3, 15));
          series.getData().add(new XYChart.Data(4, 24));
          series.getData().add(new XYChart.Data(5, 34));
          series.getData().add(new XYChart.Data(6, 36));
          series.getData().add(new XYChart.Data(7, 22));
          series.getData().add(new XYChart.Data(8, 45));
          series.getData().add(new XYChart.Data(9, 43));
          series.getData().add(new XYChart.Data(10, 17));
          series.getData().add(new XYChart.Data(11, 29));
          series.getData().add(new XYChart.Data(12, 25)); 
          
          this.chart.getData().add(series);
    }

    
    @Override
    public void init() {
        System.out.println("Method init!");
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Method start!");

    }

    
}
