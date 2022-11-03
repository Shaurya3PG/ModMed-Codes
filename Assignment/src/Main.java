public class Main
{
    public static void main(String[] args)
    {
        Car honda = new Car("honda",Fuel.DIESEL,Type.NEW,"India");
        Bike ducati = new Bike("ducati",Fuel.PETROL,Type.USED,null);
        Human sourabh = new Human(2,"sourabh", honda, ducati);
        System.out.println(sourabh);
    }
}
