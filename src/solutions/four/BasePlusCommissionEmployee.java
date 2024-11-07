package solutions.four;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    BasePlusCommissionEmployee(String name, String mobile, int grossSales, double commissionRate, int baseSalary) {
        super(name, mobile, grossSales, commissionRate * 1.3, baseSalary);
    }
}
