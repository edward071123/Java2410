package solutions.three;

public class SalariedEmployee extends Employee{
    private int grossSales = 0;
    private int commissionRate = 0;
    private int baseSalary = 0;

    SalariedEmployee() {
        System.out.println("SalariedEmployee 建構式");
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void getPaymentAmount() {
        int amount = this.baseSalary + (this.grossSales * this.commissionRate / 100);
        System.out.println("SalariedEmployee 取得薪水為: " + amount);
    }

    @Override
    public String toString() {
        String result = "目前業績: " + this.grossSales + "\r\n";
        result += "目前獎金比例(%): " + this.commissionRate + "\r\n";
        result += "目前底薪: " + this.baseSalary + "\r\n";
        return result;
    }
}
