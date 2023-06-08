/*  El presente ejercicio nos pide resolver lo siguiente:
Arma un programa que permita cargar 3 numeros y mostrar el promedio"
Asi mismo se crearan funciones que permitan hacer mas limpio el codigo*/


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese el primer número entero:");
        String texto1 = buffer.readLine();
        Integer num1 = Integer.parseInt(texto1);

        System.out.println("Ingrese el segundo número entero:");
        String texto2 = buffer.readLine();
        Integer num2 = Integer.parseInt(texto2);

        System.out.println("Ingrese el tercer número entero:");
        String texto3 = buffer.readLine();
        Integer num3 = Integer.parseInt(texto3);

        calcularPromedio(num1, num2, num3);
    }

    /**
     * Con esta función se calcula el promedio de los tres números que ingresaron por consola
     */
    public static void calcularPromedio(double num1, double num2, double num3) {
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de esos tres valores es: " + promedio);
    }
}
