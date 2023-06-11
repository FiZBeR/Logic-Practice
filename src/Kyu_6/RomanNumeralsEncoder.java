package Kyu_6;

public class RomanNumeralsEncoder {
    /*Description:

Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a string
containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

solution(1000); // should return 'M'

Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000

Remember that there can't be more than 3 identical symbols in a row.*/

    public static void main(String[] args) {

    }

    public static String roman(int a){
        String roman = "";
        String numeroStr = String.valueOf(a); // Convertir el número a cadena
        int[] digitos = new int[numeroStr.length()]; // Arreglo para almacenar los dígitos

        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Integer.parseInt(numeroStr.substring(i, i+1)); // Obtener cada dígito como una subcadena y convertirlo a int
        }

        if (digitos.length == 3){
            for (int i = 1; i <= digitos[0]; i++){
                roman += "M";
            }
        } else if (digitos.length == 2) {
            for (int i = 1; i < digitos[0]; i++){
                if (digitos[0] < 5){
                    for (int j = 0; j < 4; j++){
                        roman += "C";
                    }
                    roman += "D";
                } else {
                    i+=5;
                    roman += "D";
                    for (int j = 5; j < 9; j++){
                        roman += "C";
                    }
                }
            }
        } else if (digitos.length == 1) {
            for (int i = 1; i < digitos[0]; i++){

            }
        } else {
            for (int i = 1; i < digitos[0]; i++){

            }
        }

        return roman;
    }
}
