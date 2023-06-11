package Kyu_7;

import java.util.Scanner;

public class DryingPotatoes {

    /*All we eat is water and dry matter.

Let us begin with an example:
John bought potatoes: their weight is 100 kilograms. Potatoes contain water and dry matter.
The water content is 99 percent of the total weight.
He thinks they are too wet and puts them in an oven - at low temperature - for them to lose some water.

At the output the water content is only 98%.

What is the total weight in kilograms (water content plus dry matter) coming out of the oven?
He finds 50 kilograms and he thinks he made a mistake: "So much weight lost for such a small change in water content!"
Can you help him?
Task

Write function potatoes with

    int parameter p0 - initial percent of water-
    int parameter w0 - initial weight -
    int parameter p1 - final percent of water -

potatoes should return the final weight coming out of the oven w1 truncated as an int.
Example:

potatoes(99, 100, 98) --> 50

Pérdida de peso = Peso inicial * (Porcentaje inicial - Porcentaje final) / 100

En este caso, el peso inicial es de 100 kilogramos, el porcentaje inicial es del 99 por ciento y el porcentaje final es del 98 por ciento. Aplicando la fórmula, podemos calcular la pérdida de peso:

Pérdida de peso = 100 * (99 - 98) / 100
= 100 * 1 / 100
= 1 kilogramo
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p0, w0, p1, w1;

        System.out.println("Peso incial en kilogramos: ");
        w0 = sc.nextInt();

        System.out.println("Porcentaje incial de agua: ");
        p0 = sc.nextInt();

        System.out.println("Porcentaje final de agua: ");
        p1 = sc.nextInt();

        w1 = potatoes(p0,w0,p1);

        System.out.println("El peso final es: " + (w0 - w1) + "kilogramos");
    }

    public static int potatoes(int p0, int w0, int p1){
        int d = 0;
        //Pérdida de peso = Peso inicial * (Porcentaje inicial - Porcentaje final) / 100
        d = w0 * (p0 - p1) / 100;
        return d;
    }

}
