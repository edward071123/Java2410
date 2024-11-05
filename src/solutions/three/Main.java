package solutions.three;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");

        Employee he = new HourlyEmployee();
        he.setHours(10);
        he.setWage(500);
        he.getPaymentAmount();
        System.out.println(he.toString());

        System.out.println("=============================");

        Employee ce = new CommissionEmployee();
        ce.setGrossSales(1000);
        ce.setCommissionRate(50);
        ce.setBaseSalary(30000);
        ce.getPaymentAmount();
        System.out.println(ce.toString());
    }
}
