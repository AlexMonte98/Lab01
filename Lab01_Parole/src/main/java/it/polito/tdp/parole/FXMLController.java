package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	Parole elenco=new Parole();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnCancella;

    @FXML
    void doDelete(ActionEvent event) {
    	String p=txtResult.getSelectedText();
    	elenco.cancella(p);
    	txtResult.clear();
    	for(String cs:elenco.getElenco()) {
    		if(cs!=null) {
    			txtResult.appendText(cs+"\n");
    		}
    	}
    	

    }

    @FXML
    void doInsert(ActionEvent event) {
    	
    	txtResult.clear();
    	String p=txtParola.getText();
    	
    	
    	elenco.addParola(p);
    	for(String cs:elenco.getElenco()) {
    		if(cs!=null) {
    			txtResult.appendText(cs+"\n");
    		}
    	}
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtParola.clear();
    	elenco.reset();
    	for(String cs:elenco.getElenco()) {
    		if(cs!=null) {
    			txtResult.appendText(cs+"\n");
    		}
    	}

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

