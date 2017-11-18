package kokoro;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	private Stage stage;

	@Override
	public void start(Stage stage){
		try {
			this.stage = stage;
			
			load();
			
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	private void load() throws IOException {
		FXMLLoader loader = new  FXMLLoader(getClass().getResource("/res/fxml/Main.fxml"));
		Parent p = (Parent)loader.load();
		Scene s = new Scene(p);
		stage.setScene(s);
	}
	
	public static void main(String[] args) {
		launch("にゃあ");
	}
}
