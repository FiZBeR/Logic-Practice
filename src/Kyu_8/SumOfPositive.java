package Kyu_8;

import java.util.Scanner;

public class SumOfPositive {
    /*Kyu 8- You get an array of numbers, return the sum of all of the positives ones.
    Example [1,-4,7,12] => 1 + 7 + 12 = 20

    Note: if there is nothing to sum, the sum is default to 0.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista;
        int cuenta = 0;

        System.out.println("Cuantos numeros ingresara? ");
        int tamano = sc.nextInt();
        lista = new int[tamano];

        System.out.println("Ingrese " + tamano + " numeros");
        for (int i = 0; i < tamano; i++) {
            System.out.print("ingrese el numeros: ");
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++){
            if (lista[i] > 0){
                cuenta += lista[i];
            }else if (lista[i] < 0) {
                cuenta += 0;
            }
        }

        System.out.println(cuenta);


    }
}
