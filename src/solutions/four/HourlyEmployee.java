package solutions.four;

public class HourlyEmployee extends Employee {
    private int wage = 0;
    private int hours = 0;

    HourlyEmployee(String name, String mobile, int wage, int hours) {
        super(name, mobile);
        setWage(wage);
        setHours(hours);
    }

    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }
    
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        String result = "以下為員工基本資料\r\n";
        result += "姓名: " + super.getName() + "\r\n";
        result += "手機: " + super.getMobile() + "\r\n";
       return result;
    }

    @Override
    public void getTax() {
       double tax = this.getWage() * this.getHours() * 0.05;
       System.out.println("取得稅額: " + tax);
    }

    @Override
    public void getPaymentAmount() {
        int earnings = this.getWage() * this.getHours();
        double tax = this.getWage() * this.getHours() * 0.05;
        double paymentAmount = earnings - tax;
        System.out.println("取得員工扣稅所得: " + paymentAmount);
    }

    @Override
    public void earnings() {
       int earnings = this.getWage() * this.getHours();
       System.out.println("取得員工未扣稅所得: " + earnings);
    }
}
