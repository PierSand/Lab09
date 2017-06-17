package it.polito.tdp.metrodeparis;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.metrodeparis.model.Fermata;
import it.polito.tdp.metrodeparis.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class MetroDeParisController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Fermata> cmbBoxPartenza;

    @FXML
    private Button btnPercorso;

    @FXML
    private ComboBox<Fermata> cmbBoxArrivo;

    @FXML
    private TextArea txtResult;

    private Model model;
    
    public void setModel(Model model){
    	this.model=model;
    }
    
    @FXML
    void doCalcola(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cmbBoxPartenza != null : "fx:id=\"cmbBoxPartenza\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert btnPercorso != null : "fx:id=\"btnPercorso\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert cmbBoxArrivo != null : "fx:id=\"cmbBoxArrivo\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'MetroDeParis.fxml'.";

    }

}
