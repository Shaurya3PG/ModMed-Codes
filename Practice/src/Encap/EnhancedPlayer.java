package Encap;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, String weapon) {
        this.name = name;
        health = 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health = health - damage;
    }
    public void remainingHealth(){
        System.out.println(health + " is remaining");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
