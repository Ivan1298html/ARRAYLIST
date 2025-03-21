package Controlador;

import Modelo.ModeloCalculadora;
import Vista.VistaCalculadora;
import java.util.ArrayList;

public class ControladorCalculadora {

    private ModeloCalculadora modelo;
    private VistaCalculadora vista;

    public ControladorCalculadora(ModeloCalculadora modelo, VistaCalculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            double num1 = vista.obtenerNumero("Ingrese el primer numero: ");
            double num2 = vista.obtenerNumero("Ingrese el segundo numero: ");
            String operacion = vista.obtenerOperacion();

            double resultado = modelo.calcular(num1, num2, operacion);
            vista.mostrarResultado(resultado);

     
            if (vista.preguntarVerHistorial()) {
                ArrayList<String> historial = modelo.getHistorial();
                vista.mostrarHistorial(historial);
            }

            continuar = vista.preguntarContinuar();
        }

        System.out.println("Gracias por usar la calculadora.");
    }
}


