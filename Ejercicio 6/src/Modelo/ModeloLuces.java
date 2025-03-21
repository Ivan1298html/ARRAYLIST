package Modelo;

import java.util.ArrayList;

public class ModeloLuces {
    private boolean esDeNoche;
    private ArrayList<Boolean> sensores;

    public ModeloLuces() {
        sensores = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            sensores.add(false); 
        }
    }

    public void setEsDeNoche(boolean noche) {
        this.esDeNoche = noche;
    }

    public void actualizarSensores(ArrayList<Boolean> nuevosSensores) {
        this.sensores = nuevosSensores;
    }

    public boolean lucesEncendidas() {
        return esDeNoche && sensores.contains(true); 
    }

    public String obtenerEstadoSensores() {
        return "Noche: " + esDeNoche + ", Sensores: " + sensores.toString();
    }
}


