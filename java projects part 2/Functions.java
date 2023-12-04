import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateAvg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();
        int avg = calculateAvg(a, b, c);
        System.out.println("Average of 3 numbers is: " + avg);
        sc.close();
    }
}