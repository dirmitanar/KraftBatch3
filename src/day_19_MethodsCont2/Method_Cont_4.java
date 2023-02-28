package day_19_MethodsCont2;

public class Method_Cont_4 {

    // öNEMLİ!!! BİR METODU  YUKARIDA, METOD VE SOUT İÇİNDE ÇAĞIRMAZSAN ÇALIŞMIYOR.
    // bir metod yazın blooen deger döndürsün iki sayı alıp sayıların son rakamı
    // aynı ise true değilse false döndürsün
    public static void main(String[] args) {
        //System.out.println(SonRakamKontrol(102, 87));
        //System.out.println(SonRakamKontrol(35, 45));
        //System.out.println(PrimeNumber(60));
        //System.out.println(PozitifeCevirme(-45));
        System.out.println(OrtalamaCevirme(56,98,78));
    }

    public static boolean SonRakamKontrol(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }
    //Bir metod yazın boolean değer kabul etsin bir sayı asal ise turue döndürsün.

    public static boolean PrimeNumber(int a) {
        if (a == 0 || a == 1) {
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    // bir metod yazın yerilen sayı negatifse pozitife, pozitifse pozitif olarak versin.
    public static int PozitifeCevirme(int a) {
        if (a < 0) {
            return -a;

        } else {
            return a;
        }

        //   return a<0 ?-a:a;      2. yol TÖRNİRİ YÖNTEMİ
        //   return Math.abs(a);       3.yol
    }

    public static char OrtalamaCevirme(double a, double b, double c){
        double d =(a+b+c) / (3 );
        if( d>=76&&d<=100) {
           return 'A';
        } else if (d>=51&&d<=75) {
            return 'B';
        }else{
            return 'C';
        }
    }

}