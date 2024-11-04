package solutions.three;

public class HourlyEmployee extends Employee{
    private int wage = 0;
    private int hours = 0;

    HourlyEmployee() {
        System.out.println("HourlyEmployee 建構式");
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

    @Override
    public void getPaymentAmount() {
        int amount = this.wage * this.hours;
        System.out.println("HourlyEmployee gets payment amount: " + amount);
    }

    @Override
    public String toString() {
        String result = "目前工時:" + this.hours + "\r\n";
        result += "目前時薪:" + this.wage + "\r\n";
        return result;
    }
}
