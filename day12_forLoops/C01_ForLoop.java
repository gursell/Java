package day12_forLoops;

public class C01_ForLoop {
    public static void main(String[] args) {

        //1'den 100'e kadar olan sayilari yan yana
        //aralarinda bir bosluk birakarak yazdiralim

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i + " ");

        }

        //1' den 100'e kadar olan sayilardan
        //3 er 3 er devam ederek yazalim.

        for (int i = 1; i <=100 ; i+=3) {
            System.out.print (i + " ");
        }

        System.out.println( "");

        //1'den 100'e kadar olan sayilardan
        //3 ile bolunenleri yazalim.

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0) System.out.print(i + " ");

        }
    }
}
