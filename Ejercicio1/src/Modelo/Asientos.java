
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Asientos {
   
private String fila ;
private int numero;
private String columna;
    
       
    private static List <Asientos> ListaAsientos = new ArrayList<>();
    
    public Asientos (String tipoSala, int capacidadSala, String nombreSala){
    this.fila=fila;
    this.numero=numero;
    this.columna=columna;
    }
    
    public String getfila(){
        return fila;
    }
    
    public int getnumero(){
        return numero;
    }
    
    public String getcolumna(){
        return columna;
    }
    
       
    public static boolean AgregarAsientos(Asientos asientos){
    for (Asientos p : ListaAsientos) {
    
    if (p.getnumero()==asientos.getnumero()){
    
    return false;
    }
    }
    ListaAsientos.add(asientos);
    return true;
    }
    public static List<Asientos>obtenerListaAsientos(){
    return ListaAsientos;
    }
    
    
    
  public static Asientos buscarAsientos(int numero){

  for (Asientos p : ListaAsientos) {
  if (p.getnumero()==p.getnumero()) {
  return p;
          
 }
 }
return null;
}
}

