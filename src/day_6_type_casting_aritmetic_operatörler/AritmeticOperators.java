package day_6_type_casting_aritmetic_operatörler;

public class AritmeticOperators {

    public static void main(String[] args) {

      /*  int sayi=4+5;
        System.out.print(sayi+12+" sayi"+3+3+3);

        int sayi=15%4;
        System.out.print("sayi : "+sayi);

        double x=5;
        x=x+1;
        System.out.print(x);

        double toplamBorc=99.99;
        int odeme=50;
       int kalanBorc=(int)(toplamBorc-odeme);
       //                 (49.99)
        System.out.println(kalanBorc);


        double toplamBorc=99.99;
       double odeme=50.00;
       double kalanBorc=toplamBorc-odeme;
        //                 (49.99)
        System.out.println(kalanBorc);



        double sayi=22;
        int bolen=5;
        double sonuc=sayi/bolen;
        System.out.print(sonuc);


            // int sayi=5+3-2;
            // int sayi=5*3-3;
            //  int sayi=15%4*(3-1);
            //  int sayi=35 + 12 / 3 % 2 ;
            //        35+4 % 2
            //         35+0
            //          35

            int sayi = 35 + 15 / 3 % 2 * (3 - 1);
            //       35+  15/ 3 %2 *2
            //        35+ 5%2*2
            //        35 +1*2
            //        35+2=37
            System.out.print(sayi);
        }
/*  int year=2022;
       int aliBirthYear=1990;
        int aliAge=year-aliBirthYear;

        System.out.print(aliAge); */

        int x = 2022;
        int y = 1990;
        int aliAge = x - y;
        System.out.println("Ali'nin yaşı: " + aliAge);
        System.out.print("Ahmet'in yaşı: " + (aliAge - 5));

    }

    public class DaireHesap {

        public static void main(String[] args) {
            double yariCap = 3;
            double pi = 3.14;
            double alan = pi * yariCap * yariCap;
            double cevre = 2 * pi * yariCap;

            System.out.println("Alan : " + alan + "\nCevre : " + cevre);

/* double f=350;
        double c=(f-32)/1.8;
        System.out.println(f+" fahrenheit="+c+" Celcius"); */


            // ℃=(℉-32) /1.8    (c*1.8)+32=f
            int c = 36;
            double f = (c * 1.8) + 32;
            System.out.println(c + " Celcius" + f + " fahrenheit= ");


        }


    }
}

