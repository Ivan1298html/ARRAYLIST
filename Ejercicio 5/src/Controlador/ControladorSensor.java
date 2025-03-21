package Controlador;

import Modelo.ModeloSensor;
import Vista.VistaSensor;

public class ControladorSensor {
    private ModeloSensor modelo;
    private VistaSensor vista;

    public ControladorSensor(ModeloSensor modelo, VistaSensor vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean ejecutando = true;

        while (ejecutando) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    modelo.activarAlarma();
                    System.out.println("Alarma activada.");
                    break;
                case 2:
                    modelo.desactivarAlarma();
                    System.out.println("Alarma desactivada.");
                    break;
                case 3:
                    boolean esDeNoche = vista.pedirModoNoche();
                    modelo.setEsDeNoche(esDeNoche);
                    System.out.println("Modo " + (esDeNoche ? "Noche " : "Día️") + " configurado.");
                    break;
                case 4:
                    modelo.leerSensores();
                    vista.mostrarEstadoSensores(modelo.obtenerEstadoSensores());
                    boolean alarmaEncendida = modelo.evaluarAlarma();
                    vista.mostrarEstadoAlarma(alarmaEncendida);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}

