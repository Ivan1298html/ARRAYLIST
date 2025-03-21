
package Modelo;
import java.util.ArrayList;
import java.util.List;



public class Persona {
   
    private String Nombre;
    private String Apellido;
    private int Cedula;
    private String Correo;
       
    private static List <Persona> ListaPersona = new ArrayList<>();
    
    public Persona(String Nombre, String Apellido, int Cedula, String Correo){
        
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Cedula=Cedula;
        this.Correo=Correo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public int getCedula(){
        return Cedula;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public static boolean AgregarPersona(Persona persona){
    for (Persona p :ListaPersona) {
    
    if (p.getCedula()==persona.getCedula()){
    
    return false;
    }
    }
    ListaPersona.add(persona);
    return true;
    }
    public static List<Persona>obtenerListaPersona(){
    return ListaPersona;
    }
    
    
    
  public static Persona buscarPersona(int Cedula){

  for (Persona p : ListaPersona) {
  if (p.getCedula()==p.getCedula()) {
  return p;
          
 }
 }
return null;
}
}

    
