package Customer;

public class Main {
    public static void main(String[] args) {
        VipCustomer cus1 = new VipCustomer();
        cus1.setName("Shaurya");
        cus1.setEmail("iauwhds@jkashd.com");
        cus1.setCreditLimit(7538);
        System.out.println(cus1.getName());
        System.out.println(cus1.getCreditLimit());
        System.out.println(cus1.getEmail());

        VipCustomer cus2 = new VipCustomer("shaurya",635);
        System.out.println(cus2.getName());
        System.out.println(cus2.getCreditLimit());
        System.out.println(cus2.getEmail());

        VipCustomer cus3 = new VipCustomer("Hi", 87364, "sha@hjag.com");
        System.out.println(cus3.getName());
        System.out.println(cus3.getCreditLimit());
        System.out.println(cus3.getEmail());
    }
}
