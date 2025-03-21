package Modelo;

public class Calcular {

    public void calcularFizzBuzz(int numero) {
        
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz"); 
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(" Este numero no es divisible por 3 ni 5");
            }
        }
    }    


