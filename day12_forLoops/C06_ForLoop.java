package day12_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan pzoitif bir sayi alip,
        //sayinin rakamlar toplamini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt(); //12657
        int ilkGirilenSayi=sayi;

        //islemin kac kere tekrar edilecegini bulmak icin
        //basamak sayisina ihtiyacim var

        String sayiStr=sayi+"";
        int basSayisi= sayiStr.length();

        int birlerBas=0;
        int rakamlarToplami=0;

        for (int i = 1; i <=basSayisi ; i++) {

            birlerBas=sayi%10;
            rakamlarToplami+=birlerBas;
            sayi=sayi/10;

        }
        System.out.println("Rakamlar toplami : " + rakamlarToplami);

    }
}
