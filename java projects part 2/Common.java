import java.util.Scanner;

public class Common {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }
}
// public static int commonDivisor(int a, int b) {
// while (a != b) {
// if (a > b) {
// return a = a - b;
// } else {
// return b = b - a;
// }
// }
// return a % b;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first value");
// int a = sc.nextInt();
// System.out.println("Enter the second value");
// int b = sc.nextInt();
// System.out.println("The GCD of both the numbers are:" + commonDivisor(a, b));
// }
