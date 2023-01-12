package day_Grupp;

import java.util.Scanner;

public class C03_KanBagisi {

        public static void main(String[] args) {

         /*
            Kullanicidan  yasini ve kilosunu aliniz
            18 yasindan kucuk ise kan bagisi yapamaz
            18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
            18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
        */

            Scanner scan= new Scanner(System.in);
            System.out.println("Lütfen Yasinizi Giriniz");
            int yas= scan.nextInt();
            System.out.println("Lütfen Kilonuzu Giriniz");
            int kilo= scan.nextInt();

            if (yas>=18 && kilo>=50){
                System.out.println("Kan Bagisi Yapabilirsiniz");

            } else  if (yas>0 && yas<18){
                System.out.println("18 yasindan Kücük oldugunuz icin Kan Bagisi Yapamazsiniz");

            } else if (kilo>0 && kilo<50) {
                System.out.println("50 kilodan az oldugunuz icin Kan Bagisi Yapamazsiniz");

            } else  {
                System.out.println("Hatali giris yaptiniz");
            }


        }
    }




