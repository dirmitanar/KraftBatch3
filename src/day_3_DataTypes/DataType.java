package day_3_DataTypes;

public class DataType {
     /*
    Eğitim stratejimiz
    1-Tüm derslere katılmak
    2-Derslere katılım ortamımızı dikkatimizi daüıtacak unsurlardan arındırın.
    3-Önce dinle--> Anla
    4-Anladıüımı kodluyacağım--öğrenmiş olacağım
    5-not alın /*   // yorum  satırları kullanın
    6-follow the topics day by day-- kacan dersleri mutlaka sonraki derse kadar dinle
        cuma cumartesi tekrar yapın pazar gonu dinlenin
    7-Tekrar çalışmalarınızı ders kayıtları eşliğinde yaparsanız sizi organize eder daha verimli olur.

    Zorluklarımız
    syntax | siz dizimi javanın yazım kuralları
    logic | mantıksal kodlama
    bol bol tekrar yapacagız kodlama da syntax hatalrı ortadan kalkacak
    zamanla logic gelişecek. Mantıksal yaklaşımımız gelişecek.
    KİMSE RAKİBİNİZ DEĞİL KENDİNİZİ RAKİP EDİNECEKSİNİZ. BUGUN DÜNKÜ HALİNİZDEN İYİ OLMALI.
     */

    public static void main(String[] args){
        System.out.println("Hello");
        //java programlarının yürütülmesi için main method bir başlangıç noktasıdır.
        //Bir programda çok sayıda class lar olabilir en az bir tanesinde main method olmalıdır.
        //Main method olmazsa java - JVM programı execute etmez.
        //static public void main(String[] args){}
        //static public void main(String args[]){}

        //declaration //bildirim
        int number1;
        String sayMyName;

        //initialize or assigning
        number1 = 10;
        System.out.println(number1);
        sayMyName = "Adnan ";
//        System.out.println(sayMyName);

        //Declaration and assigning
        int number2 = 20;
        System.out.println(number2);
        System.out.println(number1+number2);// 30---> 36. satırdan gelen number1 ile number2 nin toplamı
        String sayMySurname = "Buyuk";
        System.out.println(sayMyName+sayMySurname);

        System.out.println("--------------");
        int i1,i2;
        int i3 = 40,i4 = 50;
        int i5,i6=60;

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i6);

        System.out.println("--------------");
        //DataTypes
        //primitive types       //memory used               Range of values
        byte b; //                  1 byte                     -128 to 127
        short s;//                  2 bytes                     -32768 to 32767
        int i;//                    4 bytes                     -2147..... to 2147......
        long l;//                   8 bytes                     -..................to ...............

        float f;//                  4 bytes(32bit)              -.......
        double d;//                 8 bytes(64bit)              -.......

        char c;//                   2 bytes UTF-16 standardı geregi
        boolean bl;//               1 bit

        b = -128;
        System.out.println(b);//-128
        b = 127;
        System.out.println(b);//127
        s = 1000;
        s = -32768;
        s = 32767;
        System.out.println(s);
        i = -213468387; //uç deger değil dikkat edin
        i = 2;
        System.out.println("i = " + i);
        l=3489554590080412784l;//int sınırlarını aşdıüı için java L veya l ile sayının long
        // tipinde bir değişkene declare edileceiğini belirtmemizi isiyor
        System.out.println(l);
        l=348955459;//burada ise int sınırlarını aşmadığı için hata vermiyor
        System.out.println(l);
        System.out.println("---------------");

        //Floating point number // decimal numbers default to double//
        //float and double
        //expressing currency// banka hesaplarının gosteriminde kullnılan tipler
        //float 4 byte | double 8 byte
        f =1.12345671234567F;//4 byte
        d =1.123456712344;//8 byte

        System.out.println("Hacı = "+f);
        System.out.println("d = " + d);
        System.out.println("-------------------");
        //Char
        //https://unicode-table.com/en/#basic-latin
        char ch = 'A';
        System.out.println(ch);//a

        int ascii = ch;
        System.out.println("ascii = " + ascii);
//        int x = 65;
//        char chA =(char) x;

        char chA = 65;
        System.out.println("chA = " + chA);//A
        char cha = 97;
        System.out.println("cha = " + cha);//a
        char chZ = 90;
        System.out.println("chZ = " + chZ);//Z
        char chz = 122;
        System.out.println("chz = " + chz);//z

        String A = "\u0041";
        System.out.println("A = " + A);

        //boolean ----true yada false
        bl=true;
        bl=false;
        System.out.println("bl = " + bl);

        int a = 10;
        int t = 10;
        boolean bln = a==t;
        System.out.println("bln = " + bln);//true

        int z = 30;
        bln = z == a+t;
        System.out.println("bln = " + bln);//flase

    }







}












