package Modelo;

public class ModeloTemperatura {
    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String controlarTemperatura() {
        if (temperatura < 10) {
            return "Calefactor Activado";
        } else if (temperatura > 25) {
            return "Ventilador Activado️";
        } else {
            return "Sistema Inactivo ";
        }
    }
}
