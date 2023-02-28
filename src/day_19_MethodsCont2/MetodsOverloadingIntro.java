package day_19_MethodsCont2;

public class MetodsOverloadingIntro {
    public static void main(String[] args) {
        /*sum1(5);
        sum2(5,10);
        sum3(5,10,15);*/

        sum(5);
        sum(5,10);
        sum(5,10,15);
        sum(5);
        sum(5.0);
        sum('a',"abc");
        sum((short)5);  // burada naoroving casting yaparak inteciri sorta skstırdık
        // asagıda medod içinde verdiğimiz alanları yukarda
        // metod ismiyle değer vererek çagırıp konsola yazdırabiliyoruz.
    }
 /* KÖTÜ UYGULAMA METOD OVERLOADİNG UYGULANMAMIŞ
public static void sum1(int a){
    System.out.println(a+10);
}
public static void sum2(int a,int b){
    System.out.println(a+b+10);
}
public static void sum3(int a,int b, int c){
    System.out.println(a+b+c+10);
}

*/

    public static void sum(int a) {;
        System.out.println(a + 10);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b + 10);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c + 10);

    }
    public static void sum(){}
    public static void sum(double a){}
    public static void sum(int a,double b){}
    public static void sum(double a,int b){}
    public static void sum(String s){}
    public static void sum(char s, String f){}
    public static void sum(char c, String g,int d){}
}