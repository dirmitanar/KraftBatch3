package day_15_IfElseLoopSummar;

public class IfElseSwich {
    public static void main(String[] args) {
        //if else
        int x = 10;
        int y = 100;
        int z = 5;
        if (x > y && x == 10 || z + x >= 10) {
            System.out.println("ben yurudum");
        }
        if (x == y) {
            System.out.println("x y ye eşitttir.");
        } else {
            System.out.println("x y ye eşit değildir");
        }
        if (x == y) {
            System.out.println("x y ye eşittir");

        }
        if (x != y) {
            System.out.println("x y ye eşit değildir");
        }
        // type 4
        if (x == y) {
            System.out.println("x y ye eşittir");

        } else if (x > y) {
            System.out.println("x y den büyüktür");
        } else {
            System.out.println("y x den büyüktür");
        }
        System.out.println("________________________________________");
        int button=0;
        switch(button){
            case 0:
                System.out.println("ligt is on");
                break;
            case 1:
                System.out.println("light is off");
                break;
            default:
                System.out.println("no action");
                break;

        }
            button=1;
        if(false){
            switch (button) {
                case 0:
                    System.out.println("ligt is on ");
                    break;
                case 1:
                    System.out.println("light is off");
                    break;
                default:
                    System.out.println("no action");
                    break;
            }

            }else{
            System.out.println("elektirikler kesik");
            System.out.println("işik zaten kapalı");
        }






    }


}
