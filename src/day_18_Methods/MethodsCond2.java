package day_18_Methods;

import java.util.Scanner;

public class MethodsCond2 {
    public static void main(String[] args) {
        // kiloToOkka();
        message(4);  // parametreli olduğu için içi boş calışmaz
        message(10);
        yasHesap(1987);
        UssYazma(3, 2); //2 uzeri 3
        Aritmetic(6, 9);
        Aritmetic2(8,3,"+");
    }

    public static void mavi() {
        kiloToOkka();
    }


    public static void kiloToOkka() {

        Scanner sc = new Scanner(System.in);
        System.out.println("okkaya çevirmek istediğiniz kiloğram değerini girin");
        double kl = sc.nextDouble();
        System.out.println(kl / 1.283 + "okkadır");

    }

    public static void message(int a) { // parametreli metod
        System.out.println(a + " is here");
        System.out.println("5+10 = " + (a + 10) + " eder");


    }

    //bir metod yazın doğum yılınızı girince size yaşınızı versin
    public static void yasHesap(int yıl) {
        System.out.println("yaşınız = " + (2022 - yıl));


        // bir meyod yazın iki sayı kabul edip ilk sayıyı ikinci sayının üssü  yapsın

    }

    public static void UssYazma(int a, int b) {
        System.out.println(Math.pow(a, b));
    }

    //bir kod yazın iki sayı aksın aritmetik işlemi yazdırsın
    public static void Aritmetic(int a, int b) {
        System.out.println((a * b) + " = dir");

    }
    //bir metos yazın üç parametreli olsun ilk ikisi
    // işleme sokulacak sayıları üçüncüsü ise yapılacak işlemi versin.

    public static void Aritmetic2(double a, double b, String art) {
        if (art.equals("+")) {
            System.out.println(a + b);
        } else if (art.equals("-")){
            System.out.println(a-b);
        } else if (art.equals("*")){
            System.out.println(a*b);
        } else if (art.equals("/")) {
            System.out.println(a / b);
        }else{
            System.out.println("Not Aritmetic!");


        }


    }
}

