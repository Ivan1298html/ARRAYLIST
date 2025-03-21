
package Controlador;
import Modelo.Calcular;
import Vista.Calculadora;
public class Controller {
    
private Calcular Calcular;
private Calculadora Calculadora;

public Controller(Calcular Calcular, Calculadora Calculadora){
    
    this.Calcular=Calcular;
    this.Calculadora=Calculadora;
    
}
public void Ejecutar(){
    boolean salir=false;
    
    while(!salir){
    Calculadora.MostrarResultado();
    int opcion=Calculadora.pedirOpcion();
    
    switch(opcion){
        case 1:
            int[]numerosIngresados=Calculadora.pedirNumero();
            for (int numero:numerosIngresados) {
                Calcular.calcularFizzBuzz(numero);               
            }
            case    2:
                    
                break;
                
            case 3:
                salir=true;
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
    }
    }
}
 
}
