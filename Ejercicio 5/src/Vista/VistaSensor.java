package Vista;

import java.util.Scanner;

public class VistaSensor {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\nMenu de Seguridad:");
        System.out.println("1. Activar Alarma");
        System.out.println("2. Desactivar Alarma");
        System.out.println("3. Configurar Dia/Noche");
        System.out.println("4. Simular Sensores");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public boolean pedirModoNoche() {
        System.out.print("Es de noche (si/no): ");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("si");
    }

    public void mostrarEstadoSensores(String estadoSensores) {
        System.out.println(estadoSensores);
    }

    public void mostrarEstadoAlarma(boolean alarmaActivada) {
        System.out.println("Alarma " + (alarmaActivada ? "ACTIVADA " : "DESACTIVADA "));
    }
}
