package EncapExer;

public class Printer {
    private int tonerLevel = 0;
    private int pages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pages = pages;
        this.isDuplex = isDuplex;
    }

    public void addToner(int level) {
        if (tonerLevel + level <= 100) {
            tonerLevel = tonerLevel + level;
        } else {
            System.out.println("Overflow");
            System.exit(0);

        }
    }

    public int printedPages(){
        System.out.print("The printer pages are ");
        if(isDuplex){
            if(pages%2 == 0) {
                return pages / 2;
            }
            else {
                return pages / 2 + 1;
            }
        }
        else{
            return pages;
        }
    }

}
