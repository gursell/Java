package day_Grupp;

import java.util.Scanner;

public class Day02_Tamkare {

    public static void main(String[] args) {

        /*
        Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
        Scanner reader= new Scanner(System.in);
        System.out.println("Please enter a positive integer number");

        int num= reader.nextInt();
        double squareRoot= Math.sqrt(num);
        System.out.println(squareRoot);

        if (squareRoot*squareRoot == num){
            System.out.println("Entered number is a perfect square number");
        } else System.out.println("Entered number is NOT a perfect square number");
        reader.close();
    }

}
