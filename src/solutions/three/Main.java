package solutions.three;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");

        HourlyEmployee he = new HourlyEmployee();
        he.setHours(10);
        he.setWage(500);
        he.getPaymentAmount();
        System.out.println(he.toString());
        
    }
}
