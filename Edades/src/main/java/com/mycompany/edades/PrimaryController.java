package com.mycompany.edades;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML TextField txtfecha;
    @FXML Label lblresultado;
 
    @FXML
    private void calcular() {
        
        LocalDate fecha = LocalDate.parse(
            txtfecha.getText(),
            DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );

        Persona persona;
        persona = new Persona(fecha);
        lblresultado.setText(persona.toString());
    }

    @FXML
    private void limpiar() {
        txtfecha.clear();
        lblresultado.setText("");
    }
}