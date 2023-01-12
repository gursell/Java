package day08_switchStatements_StringManipulations;

public class C11_Length {
    public static void main(String[] args) {

        //String'in kac karakterden olustugunu bize dondurur

        String str=" Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());//35

        //Bu String'in son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1));//u

        //Sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));//g

    }
}
