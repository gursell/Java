package day_Grupp;

import java.util.Scanner;

public class C01_Eskenarucgen {

    public static void main(String[] args) {

        /*
            Kullanicidan 3 tane pozitif  tam sayi alniz.
            bu uc sayinin ucgen olusturma durumunu kontrol ediniz
            eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

             üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan kücük olmali
             a+b>c>a-b
             a+c>b>a-c
             b+c>a>b-c
            a=b=c ise es kenar ucgen

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sirasiyla 3 tane kenar uzunlugu giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        if (sayi1 == sayi2 && sayi2==sayi3) {
        System.out.println("Girdiginiz ucgen bir eskenar ucgendir");
        } else {
            System.out.println("Girdiginiz ucgen bir eskenar ucgen degildir");
        }




    }
}
