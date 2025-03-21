package Controlador;
import Modelo.ModeloTienda;
import Vista.VistaTienda;

public class ControladorTienda {
    private ModeloTienda modelo;
    private VistaTienda vista;

    public ControladorTienda(ModeloTienda modelo, VistaTienda vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean membresia = vista.pedirDato("Tiene membresia");
        boolean horario = vista.pedirDato("Esta dentro del horario de atencion");
        boolean empleado = vista.pedirDato("Es empleado");
        
        modelo.actualizarCondiciones(membresia, horario, empleado);
        vista.mostrarAcceso(modelo.accesoPermitido());
    }
}


