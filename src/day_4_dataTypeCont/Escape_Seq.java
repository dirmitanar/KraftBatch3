package day_4_dataTypeCont;

public class Escape_Seq {
    public static class EscapeSeq {
        public static void main(String[] args) {

            /*
            \t tab
            \b konulduğu yerden backspace yapar
            \n yeni satıra geçer
            \r satır başı yaptırır.
            \' ekler
            \" ekler
            \\ \ ekler

             */

            System.out.println("\tHello word");
            System.out.println("Hello \bword");
            System.out.println("\nHello word");
            System.out.println("Hello\r word");
            System.out.println("\"Hello\"word");
            System.out.println("\\Hello\\word");


            System.out.println("Merhaba\t canım\n");
            System.out.println("\nHoşgeldiniz canım");
            System.out.println("..................");


            String str = "hello";
            String str2 = "Word";
            String str3 = str + "" + str2;// otomasyon framaworklarda buradaki gibi biçok string manuplation yapacağız.
            System.out.println("str3 = " + str3);

            System.out.println(str + 100);
            String str4 = str + 100;
            System.out.println("str4 = " + str4);

            int i = 50;
            String str5 = str + i;//hello100
            System.out.println("str5 = " + str5);

            //---------

            int y = 75;
            System.out.println(str + i + y);// hello5075
            System.out.println(i + y + str);// 125hello
            String str6 = i + y + str;
            System.out.println("str6 = " + str6);
            System.out.println("" + i + y + str);
            int sum = i + y;
            System.out.println(str + sum);

            // empty string vs null string

            String s = "";//empty
            String s1;
            s1 = null;


        }


    }
}
