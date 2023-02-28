package day_18_Methods;

public class Medhods_Cont_3 {
    public static void main(String[] args) {
        // sum 1 işlemleri

        sum(); // konsolda bi sonuc vermez souda almalısın
        System.out.println(sum());
        int i= sum();
        System.out.println("i = " + i);
        System.out.println((sum() + 10));
        System.out.println(  sum2(sum(),5));


         // sum 2 işlemleri

         System.out.println( "sum 2 = "+ sum2(5, 10));
        System.out.println(sum2(5,20)+sum()); // 30  yani 25 + önceki metoddan gelen 5 30 eder



    }


    // return type metod: sonunda bir işlem bir value döndüren type denir.
     public static int sum(){
         return 5;
     }
    public static int sum2(int a,int b) {
        int i = a + b;

        return i;
    }



    }

