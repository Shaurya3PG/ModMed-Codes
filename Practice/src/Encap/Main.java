package Encap;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.health = 80;
//        player.name = "Shaurya";
//        player.weapon = "Sword";
//        player.loseHealth(56);
//        System.out.println(player.healthRemaining());
//        player.loseHealth(67);
//        System.out.println(player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Shaurya","Sword");
        player.loseHealth(66);
        player.remainingHealth();
        System.out.println("health now is " +  player.getHealth());
    }
}
