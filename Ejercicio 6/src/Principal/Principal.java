package Principal;

import Modelo.ModeloLuces;
import Vista.VistaLuces;
import Controlador.ControladorLuces;

public class Principal {
    public static void main(String[] args) {
       ModeloLuces modelo = new ModeloLuces();
        VistaLuces vista = new VistaLuces();
        ControladorLuces controlador = new ControladorLuces(modelo, vista);

        controlador.iniciar();
    }
}
