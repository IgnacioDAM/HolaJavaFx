package dad.javafx.holamundo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty mensaje = new SimpleStringProperty();

	public final StringProperty nombreProperty() {
		return this.nombre;
	}

	public final String getNombre() {
		return this.nombreProperty().get();
	}

	public final void setSaludo(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	public final StringProperty mensajeProperty() {
		return this.mensaje;
	}

	public final String getMensaje() {
		return this.mensajeProperty().get();
	}

	public final void setMensaje(final String mensaje) {
		this.mensajeProperty().set(mensaje);
	}
}
