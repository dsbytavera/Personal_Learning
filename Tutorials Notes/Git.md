# Git

Git es una herramienta que permite llevar a cabo un control del código en el cual se este trabajando, de tal manera que se pueden revisar versiones de un mismo código, trabajar en equipo, descentralizar el trabajo, etc. Existen interfaces gráficas que permiten trabajar con git, tales como github, sin embargo estas presentan algunas limitantes, es por eso que resulta pertinente el uso de la terminal de git para trabajar. A continuación encontraremos algunas de las notas retomadas del curso básico de git: https://www.youtube.com/watch?v=VdGzPZ31ts8


## Configuración de Git en terminal de linux

En caso de usar windows, NO utilizar la terminal del sistema operativo con estos comandos, es necesatio descargar Git Bash 

* dsbyalberto@Nautilus:~$ git config --global user.name "Alberto Tavera"

* dsbyalberto@Nautilus:~$ git config --global user.email atavera.galicia@gmail.com

* dsbyalberto@Nautilus:~$ git config --global core.editor "code --wait"

* dsbyalberto@Nautilus:~$ git config --global -e

### CR LF configuración

dsbyalberto@Nautilus:~$ git config --global core.autocrlf input 

En Git, "CR LF" se refiere a la combinación de caracteres "Carriage Return" (retorno de carro) y "Line Feed" (salto de línea) utilizados en sistemas Windows para indicar el final de una línea de texto. En sistemas Unix/Linux, solo se utiliza "LF" para este propósito. Git detecta las diferencias en los caracteres de terminación de línea entre versiones de archivos y resalta "CR LF" cuando ocurren estas diferencias. Es importante tener en cuenta estas diferencias al revisar y fusionar cambios en Git, especialmente cuando se trabaja en diferentes sistemas operativos.

Cuando se usa sitema operativo Windows se utilizará el comando True, si se utiliza Linux o Mac utilizar Input

## Comandos básicos 

* ls= listado de carpetas y archivos 

* pwd= directorio donde nos encontramos actualmente

* cd (carpeta donde nos queremos mover)/ = nos permite navegar entre directorios 

* cd .. = nos permite regresar a un directorio anterior 

* mkdir (nombre nuevo directorio ) = crear un nuevo repositorio

* git init = crear un nuevo repositorio para trabajar con git

## Flujo de trabajo en Git
El comando [git status] permite conocer el estatus de nuestro código y sus cambios

* Computador = aquello con lo que estamos trabajando : una vez que hemos realizado cambion podemos mandarlos al estado de Stage, es decir cuando guardamos esos cambios de manera tentativa, de tal manera que se pueden revisar posterioremente, para poder mandar a stage se utiliza el comando [git add (nombre del archivo/código con el que estamos trabajando)]. 

* Stage= Elementos que han cambiado, se pueden seleccionar aquellos que se quieren mantener y aquellos que se eliminaran 

* Commit= comprometemos los cambios elegidos, se aplican estos cambios en el código, para esto se utiliza el comando [git commit -m "(mensaje)"]

* Server= Este proyecto con sus cambios se comparte en la nube

Esto es una prueba
