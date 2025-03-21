
package Principal;

import Modelo.ModeloCalculadora;
import Vista.VistaCalculadora;
import Controlador.ControladorCalculadora;

public class Principal {
    public static void main(String[] args) {
        ModeloCalculadora modelo = new ModeloCalculadora();
        VistaCalculadora vista = new VistaCalculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(modelo, vista);

        controlador.iniciar();
    }
}
