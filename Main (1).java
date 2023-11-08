import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
char[][] arreglo= new char [3][5];
        char letra = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Arreglo[i][j] = letra;
                letra++;
                
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j] + " ");
                
            }
            System.out.println();
    }
}