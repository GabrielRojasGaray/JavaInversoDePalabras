/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyecto.invertirpalabras;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class InvertirPalabras {

    public static void main(String[] args) {
        System.out.println("Escribe la Palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int total = palabra.length();
        String invertido = "";

        while (total != 0) {
            invertido += palabra.substring(total - 1, total);
            total--;

        }

        System.out.println("Tu palabra es: " + palabra + "\n Y su largo es: " + total);
        System.out.println("La palabra invertida es: " + invertido);
    }
}
