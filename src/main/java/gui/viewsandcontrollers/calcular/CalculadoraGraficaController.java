package gui.viewsandcontrollers.calcular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraGraficaController {

	@FXML
	private TextField digitoSegundo;

	@FXML
	private TextField digitoResultado;

	@FXML
	private Button botonDiv;

	@FXML
	private TextField digitoPrimero;

	@FXML
	private Button botonSuma;

	@FXML
	private Button botonResta;

	@FXML
	private Button botonMult;

	double digito1;
	double digito2;

	@FXML
	void hazSuma(ActionEvent event) {

		try {
			digito1 = Double.parseDouble(this.digitoPrimero.getText());
			digito2 = Double.parseDouble(this.digitoSegundo.getText());
			double resultado = digito1 + digito2;
			this.digitoResultado.setText(resultado + "");

		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("FATAL ERROR");
			alert.setContentText("Dato incorrecto. Use NÚMEROS.");
			alert.showAndWait();
		}
	}

	@FXML
	void hazResta(ActionEvent event) {

		try {
			digito1 = Double.parseDouble(this.digitoPrimero.getText());
			digito2 = Double.parseDouble(this.digitoSegundo.getText());
			double resultado = digito1 - digito2;
			this.digitoResultado.setText(resultado + "");

		} catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("FATAL ERROR");
			alert.setContentText("Dato incorrecto. Use NÚMEROS.");
			alert.showAndWait();
		}
	}

	@FXML
	void hazMult(ActionEvent event) {

		try {
			digito1 = Double.parseDouble(this.digitoPrimero.getText());
			digito2 = Double.parseDouble(this.digitoSegundo.getText());
			double resultado = digito1 * digito2;
			this.digitoResultado.setText(resultado + "");
		}

		catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("FATAL ERROR");
			alert.setContentText("Dato incorrecto. Use NÚMEROS.");
			alert.showAndWait();
		}
	}

	@FXML
	void hazDiv(ActionEvent event) {
		try {
			digito1 = Double.parseDouble(this.digitoPrimero.getText());
			digito2 = Double.parseDouble(this.digitoSegundo.getText());
			double resultado = digito1 / digito2;
			this.digitoResultado.setText(resultado + "");

			if (digito2 == 0) {
				Alert alertaCero = new Alert(Alert.AlertType.ERROR);
				alertaCero.setHeaderText(null);
				alertaCero.setTitle("Math Error");
				alertaCero.setContentText("El divisor NO puede ser 0.");
				alertaCero.showAndWait();
			}
		}

		catch (NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("FATAL ERROR");
			alert.setContentText("Dato incorrecto. Use NÚMEROS.");
			alert.showAndWait();
		}
	}
}
