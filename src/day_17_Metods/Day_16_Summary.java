package day_17_Metods;

import java.util.Scanner;

public class Day_16_Summary {
    public static void main(String[] args) {

       /* System.out.println("program başladı");
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                continue;}
                System.out.println(i+" merhaba");
            }
            System.out.println("proğram sonlanıyor");
        }
    }
//break programı sonlandırıp keser ama continue proğramı alttakibi görmeden başa alır.
//ikisinin de mantığı bir koşula bağlılık vardır.

        disloop:
        for (int i = 0; i < 5; i++) {
            System.out.println("dış loop");
            icloop:
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break disloop;
                }
                System.out.println(" iç loop ");
            }
        }
        // label atma: mesela bir programın bir yerinden cıkmak istiyorsun sürekli break yazman yerine
        // label atarak kodun bir yerine isimli label atınca ordan itibaren cıkar.mesela bir bankamatikte
        // geri tusu iç looptan cıkmaksa iptal tuşu direk label atmak gibi.
        //------------------------------------------------------------------------------------------------------

        // TASK

        //banka menüsü 1 hesabımdaki parayı görme
        //          2 para ekleme
        //          3 kart iade
        // para ekleme
        //  1 havale
        //   2 eft
        //   3 bir önceki menüye dön
        //   4 kart iade

        Scanner scan = new Scanner(System.in);
        int para = 2000;
        System.out.println("bankamıza hoşgeldiniz");
        System.out.println("yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 hesaptaki parayı görme");
        System.out.println("2para ekleme");
        System.out.println("3 kart iade");
        int x = scan.nextInt();
        if (x == 1) {
            System.out.println("hesaptaki para miktarı" + para);
        } else if (x == 2) {
            fistloop:
            while (true) {
                System.out.println("para ekleme sayfasına hoşgeldiniz");
                System.out.println(" 1 eft");
                System.out.println("2 havale");
                System.out.println("bir önceki menüye dön");
                System.out.println("kart iade");
                System.out.println("secim");
                int secim = scan.nextInt();
                if (secim == 1) {
                    System.out.println("eft yapıldı");
                } else if (secim == 2) {
                    System.out.println("havale yapıldı");
                } else if (secim == 3) {
                    break; // continiu firstloop da kullanılabilir break yerine
                } else if (secim == 4) {
                    break fistloop;
                } else {
                    System.out.println("hatalı giriş");
                    continue fistloop;
                }
            } */
            // ekrana 10 döngü içerecek bir for dongüsü içinde 5 döngü içerecek bir for loop döngüsü
            int j = 15;

            firsLoop:
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " i");
                for (; true; ) { // sonsuz for döngüsü bu demek
                    System.out.println(j);
                    j++;
                    if (j == 20) {
                        continue firsLoop;
                    }
                    if (j == 22) {
                        break firsLoop;
                    }
                    System.out.println("merhaba");
                }
            }
        }
    }









































