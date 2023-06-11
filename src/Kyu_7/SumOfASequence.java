package Kyu_7;

import java.util.Scanner;

public class SumOfASequence {

    /*Your task is to write a function which returns the sum of a sequence of integers.
    The sequence is defined by 3 non-negative values: begin, end, step.
    If begin value is greater than the end, your function should return 0.
    If end is not the result of an integer number of steps, then don't add it to the sum.
    See the 4th example below.

    Tu tarea es escribir una función que devuelva la suma de una secuencia de enteros.
    La secuencia está definida por 3 valores no negativos: comienzo, final, paso.
    Si el valor begin es mayor que el end, su función debería devolver 0.
    Si el end no es el resultado de un número entero de step, entonces no lo agregues a la suma.
    Vea el cuarto ejemplo a continuación.

    Examples

    2,2,2 --> 2
    2,6,2 --> 12 (2 + 4 + 6)
    1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
    1,5,3  --> 5 (1 + 4)
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int a = sc.nextInt();
        System.out.println("Numero 2: ");
        int b = sc.nextInt();
        System.out.println("Numero 3: ");
        int c = sc.nextInt();

        int suma = sumaSecuencia(a,b,c);

            System.out.println(suma);

    }

    public static int sumaSecuencia(int inicio, int fin, int paso) {
        if (inicio > fin) { //          1,          5,          3  --> 5 (1 + 4)
            return 0;
        }

        int suma = 0;
        for (int i = inicio; i <= fin; i += paso) {
            suma += i;
        }

        return suma;
    }
}
