package dad.javafx.holamundo;

import javafx.event.ActionEvent;

public class Controller {
	private View view = new View();
	private Model model = new Model();

	public Controller() {
		model.mensajeProperty().set("Aquí saldrá el saludo");
		
		model.nombreProperty().bind(view.getNombre().textProperty());
		view.getMensaje().textProperty().bind(model.mensajeProperty());
		
		view.getSaludar().setOnAction(e -> onNombreAction(e));
	}

	private void onNombreAction(ActionEvent e) {
		if (model.nombreProperty().getValue().equals("")) {
			model.mensajeProperty().setValue("Aquí saldrá el saludo");
			view.getMensaje().setStyle("");
		} else {
			model.mensajeProperty().setValue("¡Hola " + model.nombreProperty().getValue() + "!");
		}
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}

}
