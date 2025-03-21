
package Principal;
import Modelo.ModeloAire;
import Vista.VistaAire;
import Controlador.ControladorAire;

public class Principal {
 public static void main(String[] args) {
        ModeloAire modelo = new ModeloAire();
        VistaAire vista = new VistaAire();
        ControladorAire controlador = new ControladorAire(modelo, vista);

        controlador.iniciar();    
}
}
