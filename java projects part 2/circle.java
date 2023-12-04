import java.util.Scanner;

public class circle {
    public static Double circumference(Double r) {
        return 3.14 * r * 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        Double r = sc.nextDouble();
        System.out.println(circumference(r));
        sc.close();
    }
}
