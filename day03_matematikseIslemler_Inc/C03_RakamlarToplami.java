package day03_matematikseIslemler_Inc;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir pozitif tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        /*
        Bu soruyu ileride loop ile yapacagiz
        ama simdilik ayni islemi basamak sayisi kadar
        kendimiz tekrar ettirecegiz
         */

        /*
        Java'da bir kod yazmaya baslamadan once
        algoritmayi tasarlayip ihtiyacimiz
        olan variable'lari olusturmaliyiz
         */

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //sayi : 1469 , birlerBasamagi=0 , rakamlarToplami=0

        birlerBasamagi=girilenSayi%10; //9
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //0+9=9
        girilenSayi=girilenSayi/10; //146

        //sayi : 146, birlerBasamagi=9 , rakamlarToplami=9

        birlerBasamagi=girilenSayi%10; //6
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //9+6=15
        girilenSayi=girilenSayi/10; //14

        //sayi : 14, birlerBasamagi=6 , rakamlarToplami=15

        birlerBasamagi=girilenSayi%10; //4
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //15+4=19
        girilenSayi=girilenSayi/10; //1

        //sayi : 1, birlerBasamagi=4 , rakamlarToplami=19

        birlerBasamagi=girilenSayi%10; //1
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //19+1=20
        girilenSayi=girilenSayi/10; //0,1==>0

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
