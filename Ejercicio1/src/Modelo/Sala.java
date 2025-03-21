
package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Sala {
private String tipoSala;
private int capacidadSala;
private String nombreSala;
    
       
    private static List <Sala> ListaSala = new ArrayList<>();
    
    public Sala (String tipoSala, int capacidadSala, String nombreSala){
    this.tipoSala=tipoSala;
    this.capacidadSala=capacidadSala;
    this.nombreSala=nombreSala;
    }
    
    public String gettipoSala(){
        return tipoSala;
    }
    
    public int getcapacidadSala(){
        return capacidadSala;
    }
    
    public String getnombreSala(){
        return nombreSala;
    }
    
       
    public static boolean AgregarSala(Sala sala){
    for (Sala p :ListaSala) {
    
    if (p.getnombreSala()==sala.getnombreSala()){
    
    return false;
    }
    }
    ListaSala.add(sala);
    return true;
    }
    public static List<Sala>obtenerListaSala(){
    return ListaSala;
    }
    
    
    
  public static Sala buscarSala(String nombreSala){

  for (Sala p : ListaSala) {
  if (p.getnombreSala()==p.getnombreSala()) {
  return p;
          
 }
 }
return null;
}
}
    

