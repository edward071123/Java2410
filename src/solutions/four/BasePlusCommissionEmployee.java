package solutions.four;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    BasePlusCommissionEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile, grossSales, commissionRate * 1.3, baseSalary);
    }

    @Override
    public String toString() {
        String result = "以下為BasePlusCommission員工基本資料\r\n";
        result += "姓名: " + this.getName() + "\r\n";
        result += "手機: " + this.getMobile() + "\r\n";
       return result;
    }
}
