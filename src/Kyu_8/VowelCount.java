package Kyu_8;

import java.util.Scanner;

public class VowelCount {

    /*Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la palabra u oracion de la cual quieres que realicemos el conteo: ");
        String count = sc.nextLine().toLowerCase();
        char[] countF = count.toCharArray();
        char[] vocales = {'a','e','i','o','u'};
        int contador = 0;

        for (int i = 0; i < countF.length; i++){
            if (countF[i] == vocales[0]) {
                contador++;
            }
        }
        for (int i = 0; i < countF.length; i++){
            if (countF[i] == vocales[1]) {
                contador++;
            }
        }
        for (int i = 0; i < countF.length; i++){
            if (countF[i] == vocales[2]) {
                contador++;
            }
        }
        for (int i = 0; i < countF.length; i++){
            if (countF[i] == vocales[3]) {
                contador++;
            }
        }
        for (int i = 0; i < countF.length; i++){
            if (countF[i] == vocales[4]) {
                contador++;
            }
        }

        System.out.println("El total de vocales encontradas en tu palabra u oracion son: " + contador);

    }
}
