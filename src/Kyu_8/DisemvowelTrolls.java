package Kyu_8;

import java.util.Scanner;

public class DisemvowelTrolls {

    /*Trolls are attacking your comment section!
    A common way to deal with this situation is to remove all of the vowels from the trolls' comments,
    neutralizing the threat.
    Your task is to write a function that takes a string and return a new string with all vowels removed.
    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

    Note: for this kata y isn't considered a vowel.
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la palabra u oracion de la cual quieres que realicemos el conteo: ");
        String count = sc.nextLine().toLowerCase();
        String[] countF = count.split(" ");
        String[] vocales = {"a", "e","i", "o", "u"};

        for (int a = 0; a < countF.length; a++) {
            for (int i = 0; i < vocales.length; i++) {
                countF[a] = countF[a].replace(vocales[i], "");
            }
        }
        String ultimate = "";
        for (String c : countF) {
            ultimate += c + " ";
        }

        System.out.println(ultimate);
        //.replace(" ", "")
    }
}
