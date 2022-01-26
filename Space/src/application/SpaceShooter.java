package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

//main class
public class SpaceShooter extends Application{
	
	@Override
	public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SpaceShooter.class.getResource("MainController.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("SPACE SHOOTER GAME");
        stage.setScene(scene);
        stage.show();
    }
    

	public static void main(String[] args) {
		launch();
	}
	
}