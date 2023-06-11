package Kyu_7;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class ScalingSquaredStrings {

    /*You are given a string of n lines, each substring being n characters long. For example:

    s = "abcd\nefgh\nijkl\nmnop"

    We will study the "horizontal" and the "vertical" scaling of this square of strings.
    A k-horizontal scaling of a string consists of replicating k times each character of the string (except '\n').
    Example: 2-horizontal scaling of s: => "aabbccdd\neeffgghh\niijjkkll\nmmnnoopp"

    A v-vertical scaling of a string consists of replicating v times each part of the squared string.
    Example: 2-vertical scaling of s: => "abcd\nabcd\nefgh\nefgh\nijkl\nijkl\nmnop\nmnop"

    Function scale(strng, k, v) will perform a k-horizontal scaling and a v-vertical scaling.

    Example: a = "abcd\nefgh\nijkl\nmnop"
    scale(a, 2, 3) --> "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\niijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp"

    abcd   ----->   aabbccdd
    efgh            aabbccdd
    ijkl            aabbccdd
    mnop            eeffgghh
                    eeffgghh
                    eeffgghh
                    iijjkkll
                    iijjkkll
                    iijjkkll
                    mmnnoopp
                    mmnnoopp
                    mmnnoopp

    Write function scale(strng, k, v) k and v will be positive integers. If strng == "" return "".
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a, last;
        int k, v;

        //System.out.println("");
        a = "abcd\nefgh\nijkl\nmnop";//sc.nextLine();

        System.out.println("Ingresa el valor horizontal");
        k = sc.nextInt();

        System.out.println("Ingresa el valor vertical");
        v = sc.nextInt();

        if (a == null){
            System.out.println("\"\"");
        } else {
            last = scale(a, k, v);
            System.out.println(last);
        }
    }

    public static String scale(@NotNull String a, int k, int v){
        String[] countF = a.split("\n");
        String[] newCadena = new String[countF.length];
        Arrays.fill(newCadena, "");
        String ultimate = "";
        String newPalabra;
        int r = 0;

        for (int i = 0; i < countF.length; i++){ // coger cada string del arreglo individualmente
            String palabra = countF[i];          // cada string del arreglo se vuelve una palabra aparte
            for (int l = 0; l < palabra.length(); l++){ //cogemos la capabra y cogemos cada una de sus letras
                do {                                    //Con el do lo que hacemos es que coie la letra tantas veces como el valor k lo solicite
                    newPalabra = String.valueOf(palabra.charAt(l)) + String.valueOf(palabra.charAt(l));
                } while(newPalabra.length() > k);
                for (int q = r; q == i; q++){   //En este ciclo logramos ingrear el nuevo string en una nuva cadena, delimitada por el numero de letras
                    newCadena[q] += newPalabra;  //Que tenga la palabra
                    //r = q + 1;
                }
            }
            r ++;
        }

        for (int i = 0; i < newCadena.length;i++){
            for (int j = 1; j <= v; j++){
                ultimate += newCadena[i] + "\n";
            }
        }
        return ultimate;
    }
}
