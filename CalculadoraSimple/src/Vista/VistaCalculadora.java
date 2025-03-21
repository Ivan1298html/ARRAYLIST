package Vista;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaCalculadora {

    private Scanner scanner = new Scanner(System.in);

    public double obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String obtenerOperacion() {
        System.out.print("Ingrese operacion (Suma, Resta, Multiplicacion, Division): ");
        return scanner.next();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public boolean preguntarContinuar() {
        System.out.print("¿Desea realizar otra operacion? (si/no): ");
        String respuesta = scanner.next();
        return respuesta.equals("si");
    }

    public boolean preguntarVerHistorial() {
        System.out.print("¿Desea ver el historial de operaciones? (si/no): ");
        String respuesta = scanner.next();
        return respuesta.equals("si");
    }

    public void mostrarHistorial(ArrayList<String> historial) {
        System.out.println("Historial de operaciones:");
        for (String operacion : historial) {
            System.out.println(operacion);
        }
    }
}


