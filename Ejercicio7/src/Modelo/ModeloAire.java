package Modelo;
import java.util.ArrayList;

public class ModeloAire {
    private ArrayList<Integer> sensores; 

    public ModeloAire() {
        sensores = new ArrayList<>();
        sensores.add(0); 
        sensores.add(0);
    }

    public void actualizarSensores(int temperatura, int humedad) {
        sensores.set(0, temperatura);
        sensores.set(1, humedad);
    }

    public boolean aireEncendido() {
        int temperatura = sensores.get(0);
        int humedad = sensores.get(1);
        return (temperatura > 28 && humedad > 60) || temperatura > 30;
    }
}

