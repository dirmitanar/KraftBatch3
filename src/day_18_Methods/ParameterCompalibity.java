package day_18_Methods;

public class ParameterCompalibity {
    public static void main(String[] args) {
        short sh = 5;
        int i = 5;
        double d = 5;
        int i2 = (int) d; // casting
        message(5);
        message(i);
        message(sh);
        message((int) d); // casting
    }

    public static void message(int a) {
        System.out.println(a + " is here");


    }
}
