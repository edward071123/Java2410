package solutions.four;

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        Employee employee1 = new HourlyEmployee("David", "0911121001", 500, 40);
        System.out.println(employee1.toString());
        employee1.getTax();
        employee1.earnings();
        employee1.getPaymentAmount();

        System.out.println("=========================================================");

        Employee employee2 = new CommissionEmployee("Paul", "0911121002", 10000, 0.2, 30000);
        System.out.println(employee2.toString());
        employee2.getTax();
        employee2.earnings();
        employee2.getPaymentAmount();
        System.out.println("=========================================================");

        Employee employee3 = new SalariedEmployee("Lily", "0911121003", 1000, 0.1, 40000);
        System.out.println(employee3.toString());
        employee3.getTax();
        employee3.earnings();
        employee3.getPaymentAmount();

        System.out.println("=========================================================");

        Employee employee4 = new BasePlusCommissionEmployee("TOM", "0911121004", 10000, 0.2, 30000);
        System.out.println(employee4.toString());
        employee4.getTax();
        employee4.earnings();
        employee4.getPaymentAmount();

        System.out.println("=========================================================");
    }
}