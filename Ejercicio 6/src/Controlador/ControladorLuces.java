package Controlador;

import Modelo.ModeloLuces;
import Vista.VistaLuces;

public class ControladorLuces {
    private ModeloLuces modelo;
    private VistaLuces vista;

    public ControladorLuces(ModeloLuces modelo, VistaLuces vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        modelo.setEsDeNoche(vista.pedirModoNoche());

        while (true) {
            modelo.actualizarSensores(vista.pedirEstadoSensores());
            vista.mostrarEstado(modelo.obtenerEstadoSensores(), modelo.lucesEncendidas());

            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

