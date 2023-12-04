import java.util.Scanner;

public class power {
    public static double powerNumber(double X, double n) {
        double sum = Math.pow(X, n);
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        double X = sc.nextDouble();
        System.out.println("Enter the value of n: ");
        double n = sc.nextDouble();
        System.out.println(powerNumber(X, n));
        sc.close();
    }
}
