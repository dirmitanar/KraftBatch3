package day_19_MethodsCont2;

public class MetodOverloading {
    public static void main(String[] args) {
        // iki metod yazın dikdörtgenin alanını ve
        // çemberin alanını döndürsün
        CalculateArea(5,8);
        CalculateArea(3.14,3);
        Odev(5,"Asya",true);
        Odev(5,"ASYA",false);
    }

    public static void CalculateArea(int a, int b) {
        System.out.println(a * b);
    }
    public static void CalculateArea(double PI,int r){
        System.out.println(PI * r * r);
    }
    // bir metod yazın 3 parametreli.int string ve boolean.turu ise int ve string false ise
    // başka bir metodu çağırsın ve string değeri int.kadar döndesin.

    public static void Odev(int a,String s,boolean b){
        if(b){
            System.out.println(a+s);
        }else{
            Odev(a,s);
        }
    }
    public static void Odev(int a,String s){
        for (int i = 0; i < a; i++) {
            System.out.println(s);

        }

    }
}
