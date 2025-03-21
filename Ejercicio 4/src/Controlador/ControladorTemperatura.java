package Controlador;

import Modelo.ModeloTemperatura;
import Vista.VistaTemperatura;

public class ControladorTemperatura {
    private ModeloTemperatura modelo;
    private VistaTemperatura vista;

    public ControladorTemperatura(ModeloTemperatura modelo, VistaTemperatura vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            double temperatura = vista.pedirTemperatura();
            modelo.setTemperatura(temperatura);

            String estado = modelo.controlarTemperatura();
            vista.mostrarEstado(estado);

            continuar = vista.preguntarContinuar();
        }

        System.out.println("Sistema finalizado.");
    }
}



