package Vista;
import java.util.Scanner;

public class VistaTienda {
    private Scanner scanner = new Scanner(System.in);

    public boolean pedirDato(String mensaje) {
        System.out.print(mensaje + " (si/no): ");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("si");
    }

    public void mostrarAcceso(boolean acceso) {
        System.out.println("Acceso " + (acceso ? "PERMITIDO " : "DENEGADO"));
    }
}


