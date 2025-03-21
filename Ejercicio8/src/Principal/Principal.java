package Principal;
import Modelo.ModeloTienda;
import Vista.VistaTienda;
import Controlador.ControladorTienda;

public class Principal {
    public static void main(String[] args) {
        ModeloTienda modelo = new ModeloTienda();
        VistaTienda vista = new VistaTienda();
        ControladorTienda controlador = new ControladorTienda(modelo, vista);

        controlador.iniciar();
    }
}

