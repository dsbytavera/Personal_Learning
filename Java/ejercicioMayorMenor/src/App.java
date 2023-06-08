// El presente ejercicio nos pide resolver lo siguiente:
// Arma un programa que permita cargar 3 numeros y mostrar cual es el mayor y cual es el menor"


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

                Integer max;
                Integer min;

                if (num1 >= num2 && num1 >= num3) {
                    max = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    max = num2;
                } else {
                    max = num3;
                }
                if (num1 <= num2 && num1 <= num3) {
                    min = num1;
                } else if (num2 <= num1 && num2 <= num3) {
                    min = num2;
                } else {
                    min = num3;
                }
        System.out.println("El número menor es: " + min + " El número mayor es: " + max);
    }
}
