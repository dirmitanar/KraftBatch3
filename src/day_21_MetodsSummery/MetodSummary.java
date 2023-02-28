package day_21_MetodsSummery;

public class MetodSummary {
    public static void main(String[] args) {


        f(5);
        System.out.println(m(5));
    }

    //f(x)=2x+5
    public static int f(int x) {
        System.out.println(2 * x + 5);
        return 2 * x + 5;

    }

    public static int m(int x) {
        return f(x) + 25;


        //kullanıcıdan bir sayı alan ve bu sayının
        // faktöriyelini döndüren bir metod yazınız.


    }
}