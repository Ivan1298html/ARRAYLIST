
package Vista;
import java.util.Scanner;

public class Calculadora {
Scanner obj = new Scanner(System.in);

public void  MostrarResultado(){
    System.out.println("  Bienvenidos a la calculadora del Futuro  ");
    System.out.println(" 1. Iniciemos a jugar");
    System.out.println(" 2. Volvamos a intentarlo");
    System.out.println(" 3. Salir");
       
}
public int pedirOpcion(){
    return obj.nextInt();
}
public int[]pedirNumero(){
    System.out.println("Cuantos numeros desea ingresar");
    int numero =obj.nextInt();
    int []Cantidad=new int[numero];
    for (int i = 0; i < numero; i++) {
        System.out.println("Ingresar el numero "+ (i+1)+ ":");
       Cantidad[i]=obj.nextInt();
        
    }
    return Cantidad;
}
}
