package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {
	
private Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		Scene escena = new Scene(controller.getView(), 320, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Hola Mundo Mejorado");
		stage.setScene(escena);
		stage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}

}
