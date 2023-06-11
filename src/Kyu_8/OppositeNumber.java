package Kyu_8;

import java.util.Scanner;

public class OppositeNumber {

    /*given an integer or a floating-point number, find its opposite.
    Examples:
    1: -1
    14: -14
    -34: 34
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int nume = sc.nextInt();
        int numeF = 0;
        int doble = nume*2;

        if (nume < 0){
            numeF = nume - doble;
        } else if (nume == 1 ) {
            numeF = -1;
        } else if (nume == -1) {
            numeF = 1;
        } else {
            numeF = nume - doble;
        }

        System.out.println(numeF);
    }
}
