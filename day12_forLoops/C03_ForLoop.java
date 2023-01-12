package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis sayilarini alin.
        //Sinirlar dahil olmak uzere, sinirlar ve aralarindaki sayilardan
        //5 ile bolunebilenleri yazdirin.
        //Not: kullanici once buyuk sayi, sonra kucuk sayi girebilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic sayisini giriniz"); //90
        int bas= scan.nextInt();
        System.out.println("bitis degerini giriniz"); //57
        int bitis= scan.nextInt();

        if(bas>bitis){
            for (int i = bas; i >=bitis ; i--) {
                if (i%5==0) System.out.print(i + " ");
            }

        }else{ //bas<bitis

        for (int i = bas; i <=bitis ; i++) {
            if (i%5==0) System.out.print(i + " ");
        }

        }
    }
}
