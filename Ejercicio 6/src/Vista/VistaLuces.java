package Vista;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaLuces {
    private Scanner scanner = new Scanner(System.in);

    public boolean pedirModoNoche() {
        System.out.print("Es de noche (si/no): ");
        return scanner.next().equalsIgnoreCase("si");
    }

    public ArrayList<Boolean> pedirEstadoSensores() {
        ArrayList<Boolean> sensores = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Sensor " + i + " detecta movimiento (si/no): ");
            sensores.add(scanner.next().equalsIgnoreCase("si"));
        }
        return sensores;
    }

    public void mostrarEstado(String estadoSensores, boolean lucesEncendidas) {
        System.out.println(estadoSensores);
        System.out.println("Luces: " + (lucesEncendidas ? "ENCENDIDAS " : "APAGADAS "));
        System.out.println("--------------------------------");
    }
}

