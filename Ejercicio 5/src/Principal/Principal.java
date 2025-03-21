package Principal;

import Modelo.ModeloSensor;
import Vista.VistaSensor;
import Controlador.ControladorSensor;

public class Principal {
    public static void main(String[] args) {
        ModeloSensor modelo = new ModeloSensor();
        VistaSensor vista = new VistaSensor();
        ControladorSensor controlador = new ControladorSensor(modelo, vista);

        controlador.iniciar();
    }
}

