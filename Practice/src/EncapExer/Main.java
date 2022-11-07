package EncapExer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(26,78,true);
        printer.addToner(67);
        int amount = printer.printedPages();
        System.out.println(amount);
    }
}
