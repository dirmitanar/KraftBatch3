package day_11_Control_İf_;

import java.util.Scanner;

public class Control_Flow_İf_Java {
    public static void main(String[] args) {
       /* System.out.println("proğram başladı");
        int x = 11;
        if (8 >= 5 && x < 10) {
            ;
            System.out.println("sayısı besten büyüktür.");
            System.out.println("aysun merhaba");

        }
        System.out.println("program sonlandı");*2YNBT=A

        Scanner scan=new Scanner(System.in);


        System.out.println("1 ile 100 arasında bir sayi giriniz: ");
        int x = scan.nextInt();

        if(x%2==0){
            System.out.println(" bu sayı çifttir");
            System.out.println((x*20)+1);
            System.out.println("program sonlandı");

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int x = scan.nextInt();
        System.out.println("bir sayi daha giriniz: ");
        int y = scan.nextInt();
        if (x%y==0) {

            System.out.println("e tam bölünebiliyor");

        } else {
             int c= (x%y);

            System.out.println("tam bölünme sağlanamıyor bölümden kalan sayı "+c);

        Scanner scan = new Scanner(System.in);
        System.out.println("vize");
        int x = scan.nextInt();
        System.out.println("final");
        int y = scan.nextInt();

        if ((x + y) / 2 >= 50 && (x + y) / 2 < 70) {
            System.out.println("orta ile geçtiniz.");


        } else if ((x + y) / 2 >=70 && (x + y) / 2 < 85) {
            System.out.println("iyi ile geçtiniz");

        } else if ((x + y) / 2 >= 85) {
            System.out.println("pekiyi ile geçtiniz");


        }else {

            System.out.println("kaldın canım");*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı söyleyin.");
        int x = scan.nextInt();
        if ((x % 2 == 0) && (x % 5 == 0)) {
            System.out.println("sayı bölünebilir");
        } else if (x % 2 == 0) {
            System.out.println("sayı cok güzel");
        } else if (x % 5 == 0) {
            System.out.println("sayı cok cok güzel");
        } else {
            System.out.println("sayıyı beğenmedim");

        }

    }
}












