/*
Ejercicio 2:
En el siguiente modelo, tenemos una clase Jugador con los atributos: nombre y clasificación; un
constructor que inicializa su atributo nombre y los métodos:
tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método
generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
verClasificación(): Retornará la clasificación del jugador.
Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y
los métodos:
generarNro(): Que genera un número al azar entre 1 y 6 que se lo asigna a su variable atributo
numero, si el atributo tiene un valor mayor a 0, significa que ese dado ya generó un valor y lo
mantendrá.
verNro(): Retornará el valor guardado en la variable numero.

Desde una clase TestJuego se pide:
a) Crear 3 Dados.
b) Crear un Jugador de nombre “Pocho” y pedirle que tire los 3 Dados.
c) Mostrar al final la clasificación del Jugador.
d) Ahora Crear otros 3 Dados más.
e) Crear un nuevo Jugador de nombre “Pepe” y pedirle que tire los 3 últimos dados creados.
f) Al finalizar mostrar de los 2 jugadores el nombre que obtuvo la mayor clasificación.
 */
package guia3extra2;


public class Guia3Extra2 {

    
    public static void main(String[] args) {
       // Crear 3 dados
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Dado dado3 = new Dado();
        
        // Crear jugador Pocho y tirar los 3 dados
        Jugador pocho = new Jugador("Pocho");
        pocho.tirarDado(dado1);
        pocho.tirarDado(dado2);
        pocho.tirarDado(dado3);
        
        // Mostrar clasificación de Pocho
        System.out.println("La clasificación de " + pocho.nombre + " es " + pocho.verClasificacion());
        
        // Crear otros 3 dados
        Dado dado4 = new Dado();
        Dado dado5 = new Dado();
        Dado dado6 = new Dado();
        
        // Crear jugador Pepe y tirar los 3 últimos dados
        Jugador pepe = new Jugador("Pepe");
        pepe.tirarDado(dado4);
        pepe.tirarDado(dado5);
        pepe.tirarDado(dado6);
        
        // Mostrar clasificación de Pepe
        System.out.println("La clasificación de " + pepe.nombre + " es " + pepe.verClasificacion());
        
        // Comparar las clasificaciones de los jugadores para determinar quién ganó
        if (pocho.verClasificacion() > pepe.verClasificacion()) {
            System.out.println(pocho.nombre + " obtuvo la mayor clasificación");
        } else if (pocho.verClasificacion() < pepe.verClasificacion()) {
            System.out.println(pepe.nombre + " obtuvo la mayor clasificación");
        } else {
            System.out.println("Ambos jugadores empataron");
        }
    }
}
    

