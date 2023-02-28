package day_14_Control_Loopscont_;



public class Nested_Forloop_ {
    public static void main(String[] args) {

        /*
        for (int i = 1; i <= 3; i++) {
            System.out.println("outer loop" + i + ". döndü");
            for (int j = 1; j < 5; j++) {
                System.out.println("\tinner loop" + j + ". kez döndü");
            }
        }


    }


    {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(i + " ");
            }
            System.out.println();


        }

        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {

                System.out.print("O");
            }
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("* ");

                System.out.print("");


            }

        }
        for (int e = 0; e < 5; e++) {
            System.out.println(" asya ");
            for (int a = 1; a < 3; a++) {

            }
            System.out.println(e + " aşk");

        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i < 6; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 9; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }


        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 6 - i; j > 0; j--) {
                System.out.print(" * ");

            }
            System.out.println();



        } */
        for (int i = 0; i <4 ; i++) {
            for (int j = 0,k=1; j <= i; j++) {
                System.out.println(k++ + " ");

            }

        }
    }
}