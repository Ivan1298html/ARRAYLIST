package Vista;

import java.util.Scanner;

public class VistaTemperatura {
    private Scanner scanner = new Scanner(System.in);

    public double pedirTemperatura() {
        System.out.print("Ingrese la temperatura actual: ");
        return scanner.nextDouble();
    }

    public void mostrarEstado(String estado) {
        System.out.println("Estado del sistema: " + estado);
        System.out.println("--------------------------------");
    }

    public boolean preguntarContinuar() {
        System.out.print("Desea ingresar otra temperatura (si/no): ");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("si");
    }
}


