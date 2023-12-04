import java.util.Scanner;
public class volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Length");
        double length = sc.nextDouble();
        System.out.println("Enter the value of Width");
        double width = sc.nextDouble();
        System.out.println("Enter the value of Height");
        double height = sc.nextDouble();
        final double volume = (length * width * height);
        System.out.println("Volume of the box is: " + volume);
        sc.close();
    }
}
