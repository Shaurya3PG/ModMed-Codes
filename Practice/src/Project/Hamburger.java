package Project;

public class Hamburger {
    private String breadType;
    private boolean meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;

    public Hamburger(String breadType, boolean meat, boolean lettuce,
                     boolean tomato, boolean carrot) {
        this.breadType = breadType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public String getBreadType() {
        return breadType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }
}
