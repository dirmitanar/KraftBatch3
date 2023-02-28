package day_9_oprt;

public class Condition {
/*
    public static void main(String[] args) {

        boolean bl;

        System.out.println("---&& logical AND.....");
        //&& logical AND
        bl = true && true; //-----true
        System.out.println("bl = " + bl);
        bl = true && false;
        bl = false && true;
        bl = false && false;
        System.out.println("bl = " + bl);

        System.out.println("---|| logical Or.....");
        //|| logical OR
        bl = true || false;
        bl = false || true;
        bl = false || false;//----false
        System.out.println("bl = " + bl);
        bl = true || true;

        System.out.println("---^ bitwise.....");
        //^ bitwise axclusive OR
        //taraflar farklı ise true döndürür.
        bl = true ^ true;//false
        System.out.println("bl = " + bl);
        bl = true ^ false;//----true
        System.out.println("bl = " + bl);
        bl = false ^ true;//----true
        System.out.println("bl = " + bl);
        bl = false ^ false;//false
        System.out.println("bl = " + bl);

        System.out.println("----example 1------");
        //Example 1
        //Aşağıdakilerin aldığı degerleri soyleyiniz
        int a = 5;
        int b = 7;
        bl = true;

        bl = (a > b) && (b == 7);//false
        System.out.println("bl = " + bl);
        bl = a / b > 0 || (b > a);//true
        System.out.println("bl = " + bl);
        bl = a - b > 0 && b > a;//false
        System.out.println("bl = " + bl);

        System.out.println("----example2------");
        //Example 2
        //z nin nihayi değeri nedir.
        boolean x = false, y = false, z = true;
        x = !y;
        z = !x && x == z;//false
        System.out.println("z = " + z);




    task 2
    Askere alım şartları 20 yaşından küçük olmamak ve sağlıklı
    olmaktır.
    isSoldier boolean değişkenine askerlik şartlarını kontrol
    ettiriniz. İnt age ve boolean healty değişkenlerini kullanınız.

        int age = 20;
        boolean healty = true;

        boolean isSoldier = age >= 20 && healty == true;
        System.out.println("isSoldier :" + isSoldier);

    task 3
    kullanıcıdan bir sayı alın sayı hem 3 hem 5 bölünüyorsa veya
    her ikisini de bölünmüyorsa false veren bir boolean kontrolü
    sağlayın.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i = sc.nextInt();
        //15 için     true     true  ----> false
        //17 için     false    false ----> false
        //25 için     false    true  ----> true
        //9 için      true     false ---->true
        boolean b1 = i % 3 == 0 ^ i % 5 == 0;
        System.out.println("b1 = " + b1);

        // task 4
        Kullanıcıdan boy ve kilosunu sorun. Boyun son 2 rakamının
        ifade ettiği değer kilosunun 5 fazlası ve 10 eksiği aralığında
        ise true döndüren bir boolean kontrolü sağlayın.
         //
        System.out.println("lütfen boyunuzu giriniz");
        int boy = sc.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        int kilo = sc.nextInt();

        int lengthPram = boy % 100;
        System.out.println("lengthPram = " + lengthPram);
        // 180 boy için         70                     85
        boolean status = kilo >= lengthPram - 10 && kilo <= lengthPram + 5;
        System.out.println("status = " + status);


   */

}


