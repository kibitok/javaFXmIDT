/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_abraham;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author STUDENT
 */
public class FXMLDocumentController implements Initializable {
    @FXML
   private ImageView admilogo;
    
    @FXML
    private GridPane timeTable;
    String time[] = new String[]{"8:30-10.30am", "10:30-11:00", "11:00-1.00pm",
        "1:00-2:00pm", "2-4:00pm", "4:00-4:30pm", "4:30-6:30pm", "6:30-8:30pm"};
    String subjects[] = new String[]{"", "Ai and Block Chain", "java 004", 
        "Career Launchpad", "Android","DevOps","Monetization"};

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       // Parent root= new StackPane();
        //ImageView admilogo = new ImageView(new Image(getClass().getResourceAsStream("images/admi.png")));
        //((Stackane)root.getChildren().add(admilogo));
        
       // admilogo.setImage(new Image ("/src/admi.jpg") {});
         
        
        // TODO
        //Image image= new Image(new FileInputStream("/images/logo..png"));
       //ImageView admilogo = new ImageView(image);
     
        timeTable.add(new Label("8:30-10.30am"), 1, 0);
        timeTable.add(new Label("11:00-1.00pm"), 2, 0);
        timeTable.add(new Label("2-4:00pm"), 3, 0);
        timeTable.add(new Label("2-4:00pm"), 4, 0);
        timeTable.add(new Label("4:30-6:30pm"), 5, 0);
        timeTable.add(new Label("6:30-8:30pm"), 6, 0);
        timeTable.add(new Label("Monday"), 0,1);
        timeTable.add(new Label("Tuesday"), 0, 2);
        timeTable.add(new Label("Wednesday"),0, 3);
        timeTable.add(new Label("Thursday"), 0, 4);
        timeTable.add(new Label("Friday"), 0, 5);
        timeTable.add(new Label("Saturday"), 0, 6);
        //timeTable.add(new Label("8:30-10.30am"), 6, 0);
        for (int i = 1; i < subjects.length; i++) {
            for (int j = 1; j < 7; j++) {
                timeTable.add(new Label(subjects[i]+j), i, j);
            }
        }
    }

}
