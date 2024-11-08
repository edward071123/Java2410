package solutions.four;

public class SalariedEmployee extends Employee{
    private int grossSales = 0;
    private double commissionRate = 0.00;
    private int baseSalary = 0;

    SalariedEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
        setBaseSalary(baseSalary);
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        String result = "以下為Salaried員工基本資料\r\n";
        result += "姓名: " + this.getName() + "\r\n";
        result += "手機: " + this.getMobile() + "\r\n";
       return result;
    }

    @Override
    public void getTax() {
       double tax = (this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary()) * 0.05;
       System.out.println("取得稅額: " + tax);
    }

    @Override
    public void getPaymentAmount() {
        double earnings = this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary();
        double tax = (this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary()) * 0.05;
        double paymentAmount = earnings - tax;
        System.out.println("取得員工扣稅所得: " + paymentAmount);
    }

    @Override
    public void earnings() {
       double earnings =this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary();
       System.out.println("取得員工未扣稅所得: " + earnings);
    }
    
}
