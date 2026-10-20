package com.mycompany.edades;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private LocalDate fecha;

    public Persona(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tiene" + calcularEdad();
    }

    public String calcularEdad() {
    Period edad = Period.between(fecha, LocalDate.now());
    
    return edad.getYears() + " años con " + edad.getMonths() + " meses";
    }
}
