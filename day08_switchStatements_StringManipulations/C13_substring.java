package day08_switchStatements_StringManipulations;

public class C13_substring {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        System.out.println(str.substring(1,3)); //1' de baslar 3' de biter demektir. //av ile biter.

        //3-1 karakter yaz veya 1'de basla 3'de bitir.

        System.out.println(str.substring(5,10)); //Guzel

        System.out.println(str.substring(0,12)); //Java Guzeldi

        //Son 3 karakter haric tum metni yazdiralim

        System.out.println(str.substring(0, str.length()-3)); //Java Guzel

    }
}
