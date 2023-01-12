package day13_forLoops_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        Asagidaki sekli yazdiran bir program yaziniz ve satirda kac yildiz olacagi input olarak veriliyor
        kac satir oldugu
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         */

        int satirsayisi=4;
        int satirdakiyildizSayisi=8;

        for (int i = 1; i <=satirsayisi ; i++) {

            for (int j = 1; j <=satirdakiyildizSayisi ; j++) {
                System.out.println("* ");
            }
            System.out.println("");

        }


    }
}
