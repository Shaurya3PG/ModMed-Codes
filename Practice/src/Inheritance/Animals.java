package Inheritance;

public class Animals {
    private int brain;
    private String name;
    private int body;
    private int weight;
    private int size;

    public Animals(String name, int brain, int size,
                   int weight, int body) {
        this.name = name;
        this.size = size;
        this.body = body;
        this.weight = weight;
        this.brain = brain;
    }
    public void eat(){
        System.out.println("main eat");

    }
    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}
