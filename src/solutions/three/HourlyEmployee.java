package solutions.three;

public class HourlyEmployee extends Employee{
    HourlyEmployee() {
        System.out.println("HourlyEmployee 建構式");
    }

    @Override
    public void getPaymentAmount() {
        int amount = super.getWage() * super.getHours();
        System.out.println("HourlyEmployee gets payment amount: " + amount);
    }

    @Override
    public String toString() {
        String result = "目前工時:" + super.getHours() + "\r\n";
        result += "目前時薪:" + super.getWage() + "\r\n";
        return result;
    }
}
