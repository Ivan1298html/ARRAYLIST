package Modelo;

import java.util.ArrayList;

public class ModeloCalculadora {

    private ArrayList<String> historial; 

    public ModeloCalculadora() {
        historial = new ArrayList<>();
    }

    public double calcular(double num1, double num2, String operacion) {
        double resultado = 0;

        switch (operacion.toLowerCase()) { 
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println(" Error: No se puede dividir por cero.");
                    return 0;
                }
                break;
            default:
                System.out.println(" Operación no válida.");
                return 0;
        }

       
        String operacionRealizada = num1 + " " + operacion + " " + num2 + " = " + resultado;
        historial.add(operacionRealizada);

        return resultado;
    }

    
    public ArrayList<String> getHistorial() {
        return historial;
    }
}
 

