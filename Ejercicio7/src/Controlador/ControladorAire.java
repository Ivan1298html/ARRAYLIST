package Controlador;
import Modelo.ModeloAire;
import Vista.VistaAire;

public class ControladorAire {
    private ModeloAire modelo;
    private VistaAire vista;

    public ControladorAire(ModeloAire modelo, VistaAire vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            int temperatura = vista.pedirDato("Ingrese la temperatura (°C)");
            int humedad = vista.pedirDato("Ingrese la humedad (%)");
            
            modelo.actualizarSensores(temperatura, humedad);
            vista.mostrarEstado(modelo.aireEncendido());

            System.out.println("Salir o continue...");
        }
    }
}

