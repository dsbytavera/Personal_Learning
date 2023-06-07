# Java

Java es un lenguaje de programación de alto nivel y propósito general ampliamente utilizado. Con una sintaxis sencilla y orientada a objetos, Java ofrece una plataforma independiente, lo que significa que los programas escritos en Java pueden ejecutarse en diferentes sistemas operativos sin necesidad de modificaciones. Es conocido por su seguridad y estabilidad, lo que lo hace ideal para el desarrollo de aplicaciones empresariales y de gran escala. Java también es muy popular en el desarrollo de aplicaciones móviles y para Internet, ya que proporciona bibliotecas y herramientas robustas. Además, su amplia comunidad y documentación hacen de Java una opción confiable para muchos desarrolladores. Estas notas se tomaron del curso basico de Java proporcionado por ATL Academy: https://www.youtube.com/watch?v=Z8zAKYLZBqc

## Reglas de Nomenclatura

* No usar Espacios
    * Correcto: "NombreDelProyecto"
    * Incorrecto: "Nombre Del Proyecto"    

* No iniciar con un numero
    * Correcto: "Proyecto2"
    * Incorrecto: "2Proyecto"

* No usar palabras reservada como:
    * if
    * while
    * for

## Convenciones de nombres

* camelCase: fechaDeNacimiento -> se usa para declarar una variable

* snake_case: fecha_de_nacimiento -> base de datos

* SCREAMNG_SNAKE_CASE: FECHA_DE_NACIMIENTO -> constantes

* kebab-case: fecha-de-nacimiento -> urls / nombre de carpetas

* l33t: F3CH4D3N4C1M13Nt0 -> se usa para las contraseñas

## Crear variables 

Prara crear una variable en Java es necesario declarar primeramente el tipo de dato que alvergará, posteriormente el nombre de la variable y por ultimo el valor de la misma, a continuación un ejemplo:

**String** *marca* = ***"Taragüi"***

## Operadores

Los operadores en Java son símbolos especiales que se utilizan para realizar operaciones en variables y valores. Permiten combinar, comparar y manipular datos. Estos operadores ayudan a realizar cálculos, evaluar condiciones y controlar el flujo del programa. Son fundamentales para realizar operaciones matemáticas, realizar comparaciones y tomar decisiones en la lógica del programa.

### Operadores aritméticos

* Sumar = +
* Restar = -
* Multiplicar = *
* Dividir = /
* Resto = % 

#### Tipos de números
* byte
    * Rango: -128 a 127

* short
    * Rango: -32,768 a 32,767

* int
    * Rango: -2,147,483,648 a 2,147,483,647

* long
    * Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

* float
    * Rango: aproximadamente ±1.4 x 10^-45 a ±3.4 x 10^38
      Precisión: 6-7 dígitos decimales

* double
    * Rango: aproximadamente ±4.9 x 10^-324 a ±1.8 x 10^308
      Precisión: 15 dígitos decimales

* char
    * Rango: 0 a 65,535
      Representa caracteres Unicode

* boolean
    * Rango: true o false

### Operadores de comparación

Estos operadores se utilizan para realizar comparaciones entre valores y devuelven un resultado booleano (verdadero o falso) según se cumpla o no la condición establecida.

* Operador de igualdad: ==
    * Descripción: Comprueba si dos valores son iguales.

* Operador de desigualdad: !=
    * Descripción: Comprueba si dos valores son diferentes.

* Operador mayor que: >
    * Descripción: Comprueba si el valor de la izquierda es mayor que el valor de la derecha.

* Operador menor que: <
    * Descripción: Comprueba si el valor de la izquierda es menor que el valor de la derecha.

* Operador mayor o igual que: >=
    * Descripción: Comprueba si el valor de la izquierda es mayor o igual que el valor de la derecha.

* Operador menor o igual que: <=
    * Descripción: Comprueba si el valor de la izquierda es menor o igual que el valor de la derecha.

### Operadores lógicos 

Estos operadores lógicos se utilizan para combinar y evaluar condiciones booleanas. El operador && requiere que ambas condiciones sean verdaderas para que el resultado sea verdadero, mientras que el operador || devuelve verdadero si al menos una de las condiciones es verdadera. El operador ! se utiliza para negar una condición.

* Operador lógico AND: &&
    * Descripción: Devuelve true si ambos operandos son true, de lo contrario, devuelve false.

* Operador lógico OR: ||
    * Descripción: Devuelve true si al menos uno de los operandos es true, de lo contrario,  devuelve false.

* Operador lógico NOT: !
    * Descripción: Invierte el valor de un operando booleano. Si el operando es true, devuelve false; si el operando es false, devuelve true.