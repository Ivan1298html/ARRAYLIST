package Principal;

import Modelo.ModeloTemperatura;
import Vista.VistaTemperatura;
import Controlador.ControladorTemperatura;

public class Principal {
    public static void main(String[] args) {
        ModeloTemperatura modelo = new ModeloTemperatura();
        VistaTemperatura vista = new VistaTemperatura();
        ControladorTemperatura controlador = new ControladorTemperatura(modelo, vista);

        controlador.iniciar();
    }
}
