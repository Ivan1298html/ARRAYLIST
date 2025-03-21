
package Principal;
import Controlador.Controller;
import Vista. Usuario;
import Modelo.Persona;
import Modelo.Asientos;
import Modelo.Sala;
public class Principal {

   
    public static void main(String[] args) {
    Usuario Vis =new Usuario();
    Persona mod1 = new Persona("", "", 0, "");
    Asientos mod2 = new Asientos("", 0, "");
    Sala mod3 = new Sala("", 0, "");
    Controller Con = new Controller(Vis, mod1, mod2, mod3);
    Con.ejecutar();
       
    }
    
}
