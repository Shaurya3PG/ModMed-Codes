package Practice;

public class pattern {
    public static void main(String[] args) {
        String name = "Shaurya";
        int position = 1;
        displayHighScorePosition(name, position);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000)
            return 1;
        else if(playerScore > 500 && playerScore < 1000)
            return 2;
        else if(playerScore > 100 && playerScore < 500)
            return 3;
        else
            return 4;

    }
}
