package solutions.four;

public class Employee extends Earning implements IPayable, IInvoice{
    private String name;
    private String mobile;

    Employee(String name, String mobile) {
       setName(name);
       setMobile(mobile);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
       return "";
    }

    @Override
    public void getTax() {
       
    }

    @Override
    public void getPaymentAmount() {
       
    }

    @Override
    public void earnings() {
       
    }
    
}
