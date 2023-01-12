package day12_forLoops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi alin
        //1'den o sayiya kadar (sayi dahil) tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi= scan.nextInt();

        int sayiToplami=0;

        for (int i = 1; i <=sayi ; i++) {
            sayiToplami+=i;
        }
        System.out.println("Toplam : " + sayiToplami);
    }
}
