package Practice;

public class secsAndMinsChal {
    public static void getDurationString(int minutes, int seconds){
        if(minutes >=0 && (seconds>=0 && seconds<=59)){
            int hours = minutes/60;
            minutes = minutes%60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s ");
        }
    }
    public static void getDurationString(int seconds){
        if(seconds >=0){
            int minutes = seconds/60;
            seconds = seconds%60;
            System.out.println(minutes + "m " + seconds + "s ");
        }
    }

    public static void main(String[] args) {
        getDurationString(374, 22);
        getDurationString(243);
    }
}
