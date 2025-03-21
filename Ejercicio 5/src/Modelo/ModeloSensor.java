package Modelo;

import java.util.Random;

public class ModeloSensor {
    private boolean sensor1;
    private boolean sensor2;
    private boolean sensor3;
    private boolean esDeNoche;
    private boolean alarmaActivada;

    public void leerSensores() {
        Random rand = new Random();
        sensor1 = rand.nextBoolean();
        sensor2 = rand.nextBoolean();
        sensor3 = rand.nextBoolean();
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void activarAlarma() {
        alarmaActivada = true;
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
    }

    public boolean evaluarAlarma() {
        int detecciones = (sensor1 ? 1 : 0) + (sensor2 ? 1 : 0) + (sensor3 ? 1 : 0);
        return alarmaActivada && esDeNoche && detecciones >= 2;
    }

    public String obtenerEstadoSensores() {
        return "Sensor 1: " + (sensor1 ? "Activado" : " Inactivo") +
               ", Sensor 2: " + (sensor2 ? "Activado" : " Inactivo") +
               ", Sensor 3: " + (sensor3 ? " Activado" : "Inactivo");
    }
}
