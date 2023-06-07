// Este código permite ingresar un valor por consola y regresarlo acompa;ado de un mensaje.
// Para presentar un mensaje compuesto de las diversas variables, 
// Asi mismo contiene codigo que permite usar la consola para ingresar datos en string
// Primero se declara el tipo de variable, su nombre y el contenido

// A continuación se importan las clases necesarias 

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese su bebida Favorita");
        String texto = buffer.readLine();

             String bebida = texto; //variable string que contiene la bebida
             String frase = "Esta es mi bebida favorita: "; // variable string con una frase complemento
             System.out.println(frase + bebida); // output compuesto de las variables 
             
    }
}
