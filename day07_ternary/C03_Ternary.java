package day07_ternary;

import day02_scanner_dataCasting.C02_Scanner;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z' ? (char) (harf - 32) : harf);

    }
}