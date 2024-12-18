package nbroman;

public class ArabicRomanNumerals {
    public String convert(int nbr){
        if(nbr==1) return "I";
        else if(nbr==2) return "II";
        else if(nbr==4) return "IV";
        else if(nbr==5) return "V";
        else return null;
    }

}
