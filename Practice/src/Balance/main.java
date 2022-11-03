package Balance;

public class main {
    public static void main(String[] args) {

        bankAccount first = new bankAccount(812368,238746,"Shaurya","shaurya@gmail.com",987398734);
        first.setBalance(100000);
        System.out.println(first.getBalance());
        first.deposit(7364);
        System.out.println(first.getBalance());
        first.withdraw(923847);
        System.out.println(first.getCustomerName());


    }
}
