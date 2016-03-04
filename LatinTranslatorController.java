package num2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LatinTranslatorController {

    @FXML
    private Button mediumButton;

    @FXML
    private Label latinLabel;

    @FXML
    private Label outputLabel;

    @FXML
    private Label englishLabel;

    @FXML
    private Button sinisterButton;
    
    @FXML
    private Button dexterButton;
    
    public void sinister(){
    	outputLabel.setText("Left");
    }
    
    public void medium(){
    	outputLabel.setText("Center");
    }
    
    public void dexter(){
    	outputLabel.setText("Right");
    }

}
