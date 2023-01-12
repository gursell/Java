package day08_switchStatements_StringManipulations;

public class C09_equalsIgnoreCase {
    public static void main(String[] args) {

        /*
        equalsIgnoreCase () verilen iki metinsel esitligine
        buyuk-kucuk harf hassasiyeti olmadan bakar
         */

        String isim1="Kadir";
        String isim2="kadir";
        String isim3="Kadir ";

        System.out.println(isim1.equals(isim2)); //false
        System.out.println(isim1.equalsIgnoreCase(isim2)); //true

        System.out.println(isim1.equals(isim3)); //false
        System.out.println(isim1.equalsIgnoreCase(isim3));//false
    }
}
