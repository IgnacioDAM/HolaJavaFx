package dad.javafx.holamundo;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View extends VBox {
	private TextField nombreText;
	private Button saludarButton;
	private Label mensajeLabel;

	public View() {
		super();
		
		nombreText = new TextField();
		
		saludarButton = new Button("Saludar");
		saludarButton.setDefaultButton(true);
		
		mensajeLabel = new Label("Aquí saldrá el saludo");
		
		this.setSpacing(5);
		this.setFillWidth(false);
		this.getChildren().addAll(nombreText, saludarButton, mensajeLabel);
		this.setAlignment(Pos.CENTER);
	}

	public TextField getNombre() {
		return nombreText;
	}

	public Button getSaludar() {
		return saludarButton;
	}

	public Label getMensaje() {
		return mensajeLabel;
	}
}
