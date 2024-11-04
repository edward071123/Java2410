package solutions.three;

public class CommissionEmployee extends Employee{
    private int wage = 0;
    private int hours = 0;

    CommissionEmployee() {
        System.out.println("CommissionEmployee 建構式");
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public void getPaymentAmount() {
       System.out.println("HourlyEmployee gets payment amount");
    }

    @Override
    public String toString() {
        return "HourlyEmployee";
    }
}
