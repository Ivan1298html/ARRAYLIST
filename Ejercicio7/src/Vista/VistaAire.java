package Vista;
import java.util.Scanner;

public class VistaAire {
    private Scanner scanner = new Scanner(System.in);

    public int pedirDato(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextInt();
    }

    public void mostrarEstado(boolean encendido) {
        System.out.println("Aire acondicionado " + (encendido ? "ENCENDIDO️" : "APAGADO"));
    }
}

