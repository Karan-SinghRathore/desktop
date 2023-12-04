import java.util.Scanner;

public class cal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("1) for Addition");
        System.out.println("2) for Subtraction");
        System.out.println("3) for Multiplication");
        System.out.println("4) for Division");
        System.out.println("Enter your choice");
        int but = sc.nextInt();
        switch (but) {
            case 1 -> {
                int sum = a + b;
                System.out.println("The sum is: ");
                System.out.println(sum);
            }
            case 2 -> {
                int diff = a - b;
                System.out.println("The Difference is: ");
                System.out.println(diff);
            }
            case 3 -> {
                int mul = a * b;
                System.out.println("The Multiplication is: ");
                System.out.println(mul);
            }
            case 4 -> {
                double div = (double) a / b;
                System.out.println("The Division is: ");
                System.out.println(div);
            }
            default -> System.out.println("Invalid Input");
        }
        sc.close();
    }
}
