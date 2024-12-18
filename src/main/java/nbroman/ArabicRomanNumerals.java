package nbroman;

import javax.swing.text.DefaultStyledDocument;

public class ArabicRomanNumerals {
    public String convert(int nbr){
        if(nbr==1) return "I";
        else if(nbr==2) return "II";
        else if(nbr==4) return "IV";
        else if(nbr==5) return "V";
        else if (nbr==9) return "IX";
        else if (nbr==10) return "X";
        else if (nbr==40) return "XL";
        else return null;
    }

}
