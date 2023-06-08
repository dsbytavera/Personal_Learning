/*  El presente ejercicio nos pide resolver lo siguiente:
Arma un programa que permita cargar 3 numeros y mostrar el promedio"
Asi mismo se crearan funciones que permitan hacer mas limpio el codigo*/


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {
    
    public static void main(String[] args) throws IOException {
       
        
        System.out.println("Ingrese el primer número:");
        Double num1 = numConsola();

        System.out.println("Ingrese el segundo número:");
        Double num2 = numConsola();

        System.out.println("Ingrese el tercer número:");
        Double num3 = numConsola();

        calcularPromedio(num1, num2, num3);
    }

    // Esta función lee el texto ingresado por consola y lo transforma a double
    
    public static Double numConsola () throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String texto = buffer.readLine();
        Double num = Double.parseDouble(texto);
        return num;
    }
    
    // Con esta función se calcula el promedio de los tres números que ingresaron por consola
     
    public static void calcularPromedio(double num1, double num2, double num3) {
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de esos tres valores es: " + promedio);
    }
}
