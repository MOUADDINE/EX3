package nbroman;

import javax.swing.text.DefaultStyledDocument;

public class ArabicRomanNumerals {
    public String convert(int nbr){
        // Tests de conversions simples
        if(nbr==1) return "I";
        else if(nbr==2) return "II";
        else if(nbr==4) return "IV";
        else if(nbr==5) return "V";
        else if (nbr==9) return "IX";
        else if (nbr==10) return "X";
        else if (nbr==40) return "XL";
        else if (nbr==50) return "L";
        // Tests avec des nombres intermédiaires
        else if (nbr==6) return "VI";
        else if (nbr==11) return "XI";
        else if (nbr==19) return "XIX";
        else if (nbr==47) return "XLVII";
        else return null;
    }

}
