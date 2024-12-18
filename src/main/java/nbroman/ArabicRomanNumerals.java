package nbroman;

import javax.swing.text.DefaultStyledDocument;

public class ArabicRomanNumerals {
    //ameliorate la fonction convert
    public String convert(int nbr){
        // Vérification des bornes (1 <= nbr <= 50)
        if (nbr < 1 || nbr > 50) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 50.");
        }

        // Tableau des valeurs et des symboles romains
        int[] arabicNumbers = {50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Conversion en chiffres romains
        for (int i = 0; i < arabicNumbers.length; i++) {
            while (nbr >= arabicNumbers[i]) {
                roman.append(romanNumerals[i]);
                nbr -= arabicNumbers[i];
            }
        }

        return roman.toString();
    }

    }

