package solutions.three;

public class CommissionEmployee extends Employee{
    CommissionEmployee() {
        System.out.println("CommissionEmployee 建構式");
    }

    @Override
    public void getPaymentAmount() {
        int amount = super.getBaseSalary() + (super.getGrossSales() * super.getCommissionRate() / 100);
        System.out.println("CommissionEmployee 取得薪水為: " + amount);
    }

    @Override
    public String toString() {
        String result = "目前業績: " + super.getGrossSales() + "\r\n";
        result += "目前獎金比例(%): " + super.getCommissionRate() + "\r\n";
        result += "目前底薪: " + super.getBaseSalary() + "\r\n";
        return result;
    }
}
