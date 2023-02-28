package day_9_oprt;

import java.util.Scanner;

public class conditional_locial_Opr {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayı söyleyiniz");
        int x = scan.nextInt();


        if (x % 2 == 0) {
            System.out.println("bu sayı çifttir");

        } else {
            System.out.println("bu sayı tektir");
        }

        Scanner scan= new Scanner(System.in);
        System.out.println("sayı1:");
        int sayi1= scan.nextInt();
        System.out.println("sayı2:");
        int sayi2= scan.nextInt();

        if (sayi1>= sayi2) {
            System.out.println("en büyük sayı:" + sayi1);
        } else{
            System.out.println("en büyük sayı:" + sayi1);


        }

        Scanner scan=new Scanner(System.in);
        System.out.println(" iki sayı söyleyiniz");
        int x=scan.nextInt();
        System.out.println("");
        int y= scan.nextInt();
         if (x%y==0){
             System.out.println("tam bölünme sağlandı");



         } else{
             System.out.println("tam bölünme sağlanamadı, bölümden kalan: "+ x%y=);

        //     kullanıcıdan bir sayı alın bu sayı 2 ve 5 e tam bölünebiliyorsa ekrana bölünebilir diğer durumlarda bölünemez yazdıralım

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı söyleyin.");
        int x = scan.nextInt();
        if ((x % 2 == 0) && (x % 5 == 0)) {

            System.out.println("bölünebilir");

        } else {
            System.out.println("bölünemez");

        }
        //kullanıcıdan girmiş olduğu sayının negatif mi pozitif mi olduğunu ekrana yazan proğramı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı söyleyin.");
        int x = scan.nextInt();
        if (x > 0) {
            System.out.println("sayı negatif");
        } else  if (x<0) {
            System.out.println("sayı pozitif");
        }else {
            System.out.println("sayı sıfıra eşittir")

        // öğrenci vize sınavından aldığı notun % 40
        // final sınavından aldıgı notun %60 ı hesaplanaral yıl sonu notu belirtiliyor.
        //matematik sınavından yılsonu notu 50 nin üzerindeyse ekrana kaldınız yazzsın
        // 50 ve üzerindeyse ekrana geçtiniz yazsın.

        Scanner scan = new Scanner(System.in);
        System.out.println(" vize notunuzu söyleyin");
        int x = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println(" final notunuzu söyleyin");
        int y = scan.nextInt();

        double ortalama = ((x * 0.4) + (y * 0.6));
        if (ortalama >= 50) {
            System.out.println("geçtiniz");
        } else {
            System.out.println("bütünleme sınav notu");
            double bütünleme = scan.nextDouble();
            double yılsonunotu = (bütünleme + ortalama) / 2;
            if (yılsonunotu >= 50) {
                System.out.println("tebrikler geçtiniz");
            } else {
                System.out.println("kaldınız");
            }
         }

        // gün sayısı al kullanıcının girmiş oldugu  gün sonra haftanın hangi günü oldugunu bulan proğramı yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün sayısını girin");
        int x = scan.nextInt();
        int y= x%7;

        if(y==0) {
            System.out.println("salı");
        } else if (y==1){
                System.out.println("çarşamba");
        }  else if (y==2){
            System.out.println("perşembe");
        }  else if (y==3){
            System.out.println("cuma");
        } else if (y==4){
            System.out.println("cumartesi");
        } else if (y==5){
            System.out.println("pazar");
        } else   {
            System.out.println("pazartesi");


        int x=7;
        switch (x){
            case 5:
                System.out.println("x beşe eşittir");
            case 6:
                System.out.println("x 6 ya eşiittir");
                break;
            default:
                System.out.println("x 5 ve 6 ya eşit değildir");
                Scanner scan = new Scanner(System.in);
                */
                Scanner scan = new Scanner(System.in);
                System.out.println("lütfen gün sayısını girin");
                int x = scan.nextInt();
                int y= x%7;

                switch (y){
                    case 1:

                    System.out.println("salı");
                    break;

                    case 2:


                    System.out.println("çarşamba");
                    break;


                    case 3:
                        System.out.println("perşembe");
                        break;
                    case 4:
                        System.out.println("cuma");
                        break;
                    case 5:
                        System.out.println("cumartesi");
                        break;
                    case 6:
                        System.out.println("pazar");
                        break;
                    default:
                        System.out.println("pazartesi");
                }








        }






        }



