public class MethodTraning {
    public static void main(String[] args) throws Exception {
        System.out.println("========Method traning begin========");
        System.out.println("");

        System.out.print("Two numbers sum is: ");
        int twoNumSum = sum(3, 5);
        System.out.printf("%d", twoNumSum);

        System.out.println("");
        System.out.println("");
            
        System.out.print("The sum of numbers from start number to end number is: ");
        int startEndNumTotal = total(1, 10);
        System.out.printf("%d", startEndNumTotal);

        System.out.println("");
        System.out.println("");
        System.out.println("========Method traning end========");

    }

    private static int sum(int num1, int num2) {
    //    return num1 + num2;

        int result =  num1 + num2;

        return result;
    }

    public static int total(int num1, int num2) {
        int total = 0;
        for(int index = num1; index <= num2; index++) {
            total = total + index;
        }

        return total;
     }
}
