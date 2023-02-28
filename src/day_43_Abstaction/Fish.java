package day_43_Abstaction;

public class Fish extends Animal{
    @Override
    public void eat() {
        System.out.println("balıklar balık yer");

    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("kuşlar yüzer");

    }







}
