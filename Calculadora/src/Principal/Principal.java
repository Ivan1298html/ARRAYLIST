
package Principal;
import  Modelo.Calcular;
import Vista.Calculadora;
import Controlador.Controller;

public class Principal {

   
    public static void main(String[] args) {
    Calcular obj=new Calcular();
    Calculadora  cal=new Calculadora();
    Controller con=new Controller(obj, cal);
    con.Ejecutar();
    
    
        
    }
    
}
