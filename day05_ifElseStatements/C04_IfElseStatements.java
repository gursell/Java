package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
       //kullanicidan bir harf isteyin.
       //girilen karakter kucuk harf ise, onu buyuk harf olarak yazdirin,
       //yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);

        if (girilenChar >= 'a' && girilenChar<='z') {
            System.out.println(girilenChar-32);
        } else {
            System.out.println(girilenChar);

        }


    }


}
