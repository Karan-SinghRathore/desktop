import java.util.Scanner;

public class age {
    public static boolean ageVoter(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age to check the validity: ");
        int age = sc.nextInt();
        System.out.println(ageVoter(age));
        sc.close();
        
    }
}
