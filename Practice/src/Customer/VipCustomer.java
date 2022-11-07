package Customer;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("name",0,"email@gmail.com");
        System.out.println("Empty constructor called");
    }
    public VipCustomer(String name, double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default@emaill.com";
        System.out.println("2 paras const called");
    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("3 para cons called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
