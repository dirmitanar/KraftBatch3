package day_43_Abstaction;

public  abstract class Animal {

    public abstract void eat();
    public  abstract void move();

    String name;

    public Animal(String name) {
        this.name = name;
    }

    class main{
        public static void main(String[] args) {
            Fish afish=new Fish("nemo");
            afish.eat();
            afish.move();





        }


    }
}
