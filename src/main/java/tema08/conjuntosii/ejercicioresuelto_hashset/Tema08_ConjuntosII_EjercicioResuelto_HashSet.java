/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema08.conjuntosii.ejercicioresuelto_hashset;

import java.util.Scanner;
import java.util.HashSet;

/**
 * <h1>ejercicioresuelto_hashset</h1>
 *
 * Realiza un pequeño programita que pregunte al usuario 5 números diferentes
 * (almacenándolos en un HashSet), y que después calcule la suma de los mismos
 * (usando un bucle for-each).
 *
 * <h2>Métodos</h2>
 * <ul>
 * <li>nombreMetodo: Descripción.</li>
 * </ul>
 *
 * @author RJNewbyte
 * @version 1.0
 * @since 2024-03-17
 */
public class Tema08_ConjuntosII_EjercicioResuelto_HashSet {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int contador = 0;
        HashSet<Integer> numeros= new HashSet<Integer>();
        System.out.println("Vamos a sumar 5 números");
        while (contador < 5) {
            System.out.println(contador + 1 + ". Introduzca un número:");
            int num = kbd.nextInt();
            kbd.nextLine();//limpia buffer
            numeros.add(num);
            contador++;
        }

        int suma=0;
            for (Integer n : numeros) {
                suma+=n;
            }
        System.out.println("La suma de los 5 números es: " + suma);
    }

}
