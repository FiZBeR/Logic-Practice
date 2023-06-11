package Kyu_7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class WaitingRoom {

    /*There's a waiting room with N chairs set in single row. Chairs are consecutively numbered from 1 to N.
    First is closest to the entrance (which is exit as well).

    For some reason people choose a chair in the following way

    Find a place as far from other people as possible
    Find a place as close to exit as possible

    All chairs must be occupied before the first person will be served

    So it looks like this for 10 chairs and 10 patients
    Sillas 	    1 	2 	3 	4 	5 	6 	7 	8 	9 	10
    Personas 	1 	7 	5 	8 	3 	9 	4 	6 	10 	2
                10  3   3   2   5   2   2   3   1   9
    Your task is to find last patient's chair's number.

    Input: number of chairs N, an integer greater than 2.
    Output: a positive integer, the last patient's chair number.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, m, p;
        System.out.println("Cuantas personas son: ");
        n = sc.nextInt();

        int[] personas = new int[n];

        personas[personas.length - 1] = n;
        n--;

        for (int j = 1; j < n; j++){
            i = n;
            do {
                if (i % 2 == 0){
                    m = n/2;
                    if (personas[m] == 0){
                        personas[m] = n;
                        n--;
                        i = n;
                        continue;
                    } else if (personas[m + 1] == 0){
                        if (personas[m] == 0){
                            personas[m] = n;
                            n--;
                            i = n;
                            continue;
                        }
                    } else {
                        m -= 2;
                        if (personas[m] == 0) {
                            personas[m] = n;
                            n--;
                            i = n;
                            continue;
                        }
                    }

                } else {
                    p = divisionRedondeo(n, 2);
                    if (personas[p] == 0){
                        personas[p] = n;
                        n--;
                        i = n;
                        continue;
                    } else if (personas[p + 1] == 0){
                        if (personas[p] == 0){
                            personas[p] = n;
                            n--;
                            i = n;
                            continue;
                        }
                    } else{
                        p -= 1;
                        if (personas[p] == 0) {
                            personas[p] = n;
                            n--;
                            i = n;
                            continue;
                        }
                    }
                }
            } while(i != 2);

            for (int l = 1; l < personas.length; l++){
                if (personas[l] == 0){
                    System.out.println("La ultima persona se sienta en la silla numero: " + l);
                    personas[l] = n;
                }
            }
            personas[0] = 1;
            n--;
        }
    }

    public static int divisionRedondeo(int dividendo, int divisor) {
        double resultado = (double) dividendo / divisor;
        resultado = Math.ceil(resultado);
        return (int) resultado;
    }
}

/*Resultado


*/

