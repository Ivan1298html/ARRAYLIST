package Modelo;
import java.util.ArrayList;

public class ModeloTienda {
    private ArrayList<Boolean> condiciones; 

    public ModeloTienda() {
        condiciones = new ArrayList<>();
        condiciones.add(false); 
        condiciones.add(false); 
        condiciones.add(false); 
    }

    public void actualizarCondiciones(boolean membresia, boolean horario, boolean empleado) {
        condiciones.set(0, membresia);
        condiciones.set(1, horario);
        condiciones.set(2, empleado);
    }

    public boolean accesoPermitido() {
        return (condiciones.get(0) && condiciones.get(1)) || condiciones.get(2);
    }
}

