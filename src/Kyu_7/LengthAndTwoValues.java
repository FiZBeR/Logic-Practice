package Kyu_7;

import java.util.Scanner;

public class LengthAndTwoValues {

    /*Given an integer n and two other values, build an array of size n filled with these two values
    alternating.
    Examples

    5, true, false     -->  [true, false, true, false, true]
    10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
    0, "one", "two"    -->  []
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        String valuUno, valuDos;

        System.out.println("Ingresa el tamaño del arreglo");
        n = sc.nextInt();

        //System.out.println("Ingresa el primer elemento a conformar el arreglo: ");
        valuUno = "true";//sc.nextLine();

        //System.out.println("Ingresa el segundo elemento a conformar el arreglo: ");
        valuDos = "false";//sc.nextLine();

        String[] arreglo;
        arreglo = new String[n];

        for (int i = 0; i <= n; i+=2){
            for (int j = 1; j <= arreglo.length - 1; j+=2){
                    arreglo[i] = valuUno;
                    arreglo[j] = valuDos;
            }
        }
        System.out.print(n + " " + valuUno + " " + valuDos + "  -->  [");
        String nuevo = "";
        for (String a : arreglo){
            nuevo +=a + ",";
        }
        System.out.print(nuevo.substring(0,nuevo.length()-1) + "]");
    }
}
