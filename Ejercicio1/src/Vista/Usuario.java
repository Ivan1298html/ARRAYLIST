
package Vista;
import java.util.Scanner;

public class Usuario {

private Scanner Scanner;

public Usuario(){
Scanner = new Scanner(System.in);    
}
public void mostrarMenu(){
System.out.println("\n Menu para reserva de Asientos"); 
System.out.println("1. Elegir numero de Asiento");
System.out.println("2.Mostrar las filas de los asientos");
System.out.println("3. Mostrar lista de asientos disponibles");
System.out.println("4. Salir");
System.out.println("Seleccionar una Opcion por Favor");
}

public int capturarnumero(){
System.out.println("Ingresar el numero del Asiento");
return Scanner.nextInt();
}

public String capturarfila(){
System.out.println("Ingresar la fila de Asiento");
return Scanner.nextLine();
}

public void mostrarMensaje (String mensaje){
System.out.println(mensaje);    
}

public int capturaropcion(){
return Scanner.nextInt();
}

public void limpiarBuffer(){
Scanner.nextLine();
}
}