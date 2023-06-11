package Kyu_7;

import java.util.Arrays;
import java.util.Scanner;

public class HowGreenIsMyValley {

    /*Description:

    Input : an array of integers.

    Output : this array, but sorted in such a way that there are two wings:

    the left wing with numbers decreasing,

    the right wing with numbers increasing.

    the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.

    each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steep as the left wing.

The function is make_valley or makeValley or make-valley.

a = [79, 35, 54, 19, 35, 25]
make_valley(a) --> [79, 35, 25, *19*, 35, 54]
The bottom is 19, left wing is [79, 35, 25], right wing is [*19*, 35, 54].
79..................54
    35..........35
        25.
          ..19

a = [67, 93, 100, -16, 65, 97, 92]
make_valley(a) --> [100, 93, 67, *-16*, 65, 92, 97]
The bottom is -16, left wing [100, 93, 67] and right wing [65, 92, 97] have same length.
100.........................97
    93..........
                .........92
        67......
               .....65
            -16

a = [66, 55, 100, 68, 46, -82, 12, 72, 12, 38]
make_valley(a) --> [100, 68, 55, 38, 12, *-82*, 12, 46, 66, 72]
The bottom is -82, left wing is [100, 68, 55, 38, 12]], right wing is [*-82*, 12, 46, 66, 72].

a = [14,14,14,14,7,14]
make_valley(a) => [14, 14, 14, *7*, 14, 14]

a = [14,14,14,14,14]
make_valley(a) => [14, 14, *14*, 14, 14]

A counter-example:

a = [17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1]
A solution could be [17, 17, 15, 14, 8, 1, 4, 4, 5, 7, 7]
but the right wing [4, 4, 5, 7, 7] is much flatter than the left one
[17, 17, 15, 14, 8].

Summing the differences between left and right wing:
(17-7)+(17-7)+(15-5)+(14-4)+(8-4) = 44

Consider the following solution:
[17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17]
Summing the differences between left and right wing:
(17-17)+(15-14)+(8-7)+(7-5)+(4-4) = 4
The right wing is nearly as steep as the right one.
Arrays.sort()
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Cuantos numeros ingresara en el arreglo? ");
        a = sc.nextInt();

        int[] alaCentral = new int[a];
        int[] alaDerecha = new int[(a/2)+1]; //right descendente
        int[] alaIzquierda = new int[(a/2)+1]; //left ascendente

        for (int i = 0; i < a; i++){
            System.out.println("Ingresa un numero: ");
            b = sc.nextInt();
            alaCentral[i] = b;
        }

        System.out.println();

        Arrays.sort(alaCentral);

        for (int i = alaCentral.length - 1; i > 0; i--){
            for (int j = 0; j < alaIzquierda.length; j++){
                for (int n = 0; n < alaDerecha.length; n++){

                    if (i != 0){
                        alaIzquierda[j] = alaCentral[i]; //left ascendente
                        i--;
                        j++;
                    } else {
                        break;
                    }

                    if (i != 0){
                        alaDerecha[n] = alaCentral[i]; //right descendente
                        i--;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println("The bottom is " + alaCentral[0]);

        System.out.print("Ala Izquierda [");
        for (int c: alaIzquierda){
            if (c != 0){
                System.out.print(c + ", ");
            } else {
                continue;
            }

        }
        System.out.println("]");

        System.out.print("Ala Derecha [");
        for (int c: alaDerecha){
            if (c != 0){
                System.out.print(c + ", ");
            } else {
                continue;
            }

        }
        System.out.println("]");
    }
}
