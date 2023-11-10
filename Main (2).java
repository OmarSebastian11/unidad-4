import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Metodofijoomar {
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int resta (int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = Metodo_fijo.sumar(1, 7); //llamando al metodo estatico
        System.out.println("La suma es: " + resultado);
        
        int resultado2 = Metodo_fijo.resta(1, 7); //llamando al metodo estatico
        System.out.println("La resta es: " + resultado2);
        
        int resultado3 = Metodo_fijo.multiplicacion (1, 7); //llamando al metodo estatico
        System.out.println("La multiplicacion es: " + resultado3);
        
        double resultado4 = Metodo_fijo.division (1, 7); //llamando al metodo estatico
        System.out.println("La division es: " + resultado4);
    }
    
}