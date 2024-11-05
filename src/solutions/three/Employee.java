package solutions.three;

public class Employee implements IPayable{

    private int wage = 0;
    private int hours = 0;
    private int grossSales = 0;
    private int commissionRate = 0;
    private int baseSalary = 0;

    @Override
    public void getPaymentAmount() {

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

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        if (wage < 0) {
            System.out.println("請輸入大於0的整數");
        } else {
            this.wage = wage;
        }
        
    }

    public void setHours(int hours) {
        this.hours = hours;
        if (hours < 0) {
            System.out.println("請輸入大於0的整數");
        } else {
            this.hours = hours;
        }
    }

    public int getHours() {
        return hours;
    }
    
}
