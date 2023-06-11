package Kyu_7;

import java.util.Scanner;

public class GoingToTheCinema {

    /*My friend John likes to go to the cinema. He can choose between system A and system B.

    System A : he buys a ticket (15 dollars) every time
    System B : he buys a card (500 dollars) and a first ticket for 0.90 times the ticket price,
    then for each additional ticket he pays 0.90 times the price paid for the previous ticket.

    Sistema A: compra un boleto (15 dólares) cada vez
    Sistema B: compra una tarjeta (500 dólares) y un primer boleto por 0,90 veces el precio del boleto,
    luego por cada boleto adicional paga 0,90 veces el precio pagado por el boleto anterior.

    Example:

    If John goes to the cinema 3 times:

    System A : 15 * 3 = 45
    System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)

    John wants to know how many times he must go to the cinema so that the final result of System B,
    when rounded up to the next dollar, will be cheaper than System A.
    The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket),
    perc (fraction of what he paid for the previous ticket) and returns the first n such that

    ceil(price of System B) < price of System A.

    La función película tiene 3 parámetros: tarjeta (precio de la tarjeta), boleto (precio normal de un boleto),
    perc (fracción de lo que pagó por el boleto anterior) y devuelve el primer n tal que

    ceil(precio del Sistema B) < precio del Sistema A.

    More examples:

    movie(500, 15, 0.9) should return 43
        (with card the total price is 634, with tickets 645)
    movie(100, 10, 0.95) should return 24
        (with card the total price is 235, with tickets 240)

*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tarjeta = 100;
        int boleto = 10;
        double perc = 0.95;

        String total = movie(tarjeta, boleto, perc);

        System.out.println(total);

    }

    public static String movie(int tarjeta, int boleto, double perc){
        double sistemaA = Double.valueOf(boleto);
        double sistemaB = tarjeta + boleto * perc;
        double valorUTB = boleto;
        int i = 0;
        String x = "";

        /*Tenemos que quietar la variable times, y hacer que nos diga la funcion cuantas veces tiene que i al
        * cine para que el sistema B sea mas barato que el A */
        do {
            valorUTB = valorUTB * perc;
            sistemaB += valorUTB;

            sistemaA += (double)boleto;
            i ++;
        } while(sistemaA < sistemaB); // corregir suma uno de mas
        //Cuadrar bien la relacion mayor que para que se ejecuen correctamente los bucles

        if (sistemaA < sistemaB){
            x = i + "\n" + "(with card the total price is " + (int)sistemaB + ", with tickets " + (int)sistemaA + ")";
        } else {
            x = i + "\n" + "(with card the total price is " + (int)sistemaB + ", with tickets " + (int)sistemaA + ")";
        }
        return x;
    }
}
