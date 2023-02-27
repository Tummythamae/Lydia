
package flaggs;



import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author REILAH
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
      @FXML
    private Button Germany;

    @FXML
    private Button Hungary;

    @FXML
    private Button Lesotho;

    @FXML
    private Button Netherlands;
    
     @FXML
    private Rectangle Rectangle1;

    @FXML
    private Rectangle Rectangle2;

    @FXML
    private Rectangle Rectangle3;
    

    @FXML
    private Button Russia;

    @FXML
    private Button clear;

    @FXML
    private Button exit;
    
    HashMap<String, String> flags = new HashMap<>();
    
    
    @FXML
    void GermanyButton(ActionEvent event) {
        
        Rectangle1.setFill(Color.BLACK);
        Rectangle2.setFill(Color.RED); 
        Rectangle3.setFill(Color.YELLOW); 
    }
    
    @FXML
    void HungaryButton(ActionEvent event) {
        
       Rectangle1.setFill(Color.RED);
        Rectangle2.setFill(Color.WHITE);
        Rectangle3.setFill(Color.GREEN);

    }

    @FXML
    void LesothoButton(ActionEvent event) {
        
        Rectangle1.setFill(Color.BLUE);
        Rectangle2.setFill(Color.WHITE);
        Rectangle3.setFill(Color.GREEN);

    }

    @FXML
    void NetherlandsButton(ActionEvent event) {
        
       Rectangle1.setFill(Color.MAROON);
        Rectangle2.setFill(Color.WHITE);
        Rectangle3.setFill(Color.BLUE);

    }

    @FXML
    void RussiaButton(ActionEvent event) {
        Rectangle1.setFill(Color.WHITE);
        Rectangle2.setFill(Color.BLUE);
        Rectangle3.setFill(Color.RED);

    }
    ///*************************************************************************
    //**************************************************************************
    //*****USING HASHMAP******************************************
    
     @FXML
    void computation(ActionEvent event) {
        
        ////////////////////
        if(Germany.isPressed())
        { 
           flags.put("Rectangle1", "BLACK");
           flags.put("Rectangle2", "Red");
           flags.put("Rectangle3", "YELLOW");
           
        }
        if(Hungary.isPressed())
        { 
           flags.put("Rectangle1", "RED");
           flags.put("Rectangle2", "WHITE");
           flags.put("Rectangle3", "GREEN");
           
        }
                if(Lesotho.isPressed())
        { 
           flags.put("Rectangle1", "BLUE");
           flags.put("Rectangle2", "WHITE");
           flags.put("Rectangle3", "GREEN");
           
        }
             if(Netherlands.isPressed())
        { 
           flags.put("Rectangle1", "MAROON");
           flags.put("Rectangle2", "WHITE");
           flags.put("Rectangle3", "BLUE");
           
        }
         if(Russia.isPressed())
        { 
           flags.put("Rectangle1", "WHITE");
           flags.put("Rectangle2", "BLUE");
           flags.put("Rectangle3", "RED");
           
        }
        else 
       {
           System.out.println("Error: ");
       }
       
    }

    ///////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    /////////////////EXIT AND CLEAR BUTTON///////////////////////////////////////
      @FXML
    void Clear(ActionEvent event) {
        Rectangle1.setFill(Color.WHITE);
        Rectangle2.setFill(Color.WHITE);
        Rectangle3.setFill(Color.WHITE);
      
    }

    @FXML
    void Exit(ActionEvent event) {
        
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("ARE YOU SURE YOU  WANT TO EXIT");
        if(alert.showAndWait().get()==ButtonType.OK)
        System.exit(0);

    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}