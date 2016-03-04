package num2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LatinTranslator extends Application {

	public void start(Stage stage) throws Exception {

		Parent parent = FXMLLoader.load(
				getClass().getResource("LatinTranslator.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setTitle("Latin Translator");
		stage.setScene(scene);
		stage.show();
	}
	
	
	public static void main(String[] args){
		launch(args);
	}
	
}
