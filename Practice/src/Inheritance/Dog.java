package Inheritance;

public class Dog extends Animals{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String breed;

    public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String breed) {
        super(name, 1, size, weight, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.breed = breed;

    }
    private void chew(){
        System.out.println("Dog.chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called ");
        chew();
        super.eat();
    }
}
