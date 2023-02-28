package day_14_Control_Loopscont_;

import java.util.Scanner;

public class DoWhileLoops {
    // whileden farkı do while ilk basta calısır sonra true ise dönmeye devam eder.
    //mesela burada 99 100 den küçük olmasına rağmen yani condisın falseyken bile bir kere dönüp yazdırdı.
    public static void main(String[] args) {
        int speed=99;
        do{
            System.out.println(" selam canımmm");
        }while(speed>=100);

        System.out.println("--------------------------");
        int i=0;
        do {
            System.out.println("merhaba");
            i++;
        }while(i<3);
        // mesela bu örnekte condisin tru ve dedğimiz gibi 3 kere yazdırdı.dow.condişinin doğru ya da yalnış olmasına bakmaksızın ilk başta yazdırır.

        Scanner sc=new Scanner(System.in);
        int k;
        int number=5;
        do {
            System.out.println("sayıyı tahmin et");
            k = sc.nextInt();
        }while (k!=number);
        if(k==number);
        System.out.println("tebrikler");
        }

        }



