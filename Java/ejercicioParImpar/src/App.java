/*  El presente ejercicio nos pide resolver lo siguiente:
Arma un programa que permita cargar un número y determinar si es par o impar"
Asi mismo se crearan funciones que permitan hacer mas limpio el codigo*/


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {
    
    public static void main(String[] args) throws IOException {
       
        
        System.out.println("Ingrese un número:");
        Double num1 = numConsola();
        parImpar(num1);
        
    }

 // Esta función lee el texto ingresado por consola y lo transforma a double
    
  
    public static Double numConsola () throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String texto = buffer.readLine();
        Double num = Double.parseDouble(texto);
        return num; 
    }   
// Con esta función se determina si un numero es par o impar
     
public static void parImpar (double num1) {
    double resto = num1 % 2;
    
    String par; 

    if (resto == 0) {
        par = "Par"; 
    } else {
        par = "Impar";
    }
     System.out.println("El numero que fue ingresado es: " + par);

    }

}
