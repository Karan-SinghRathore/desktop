import java.util.Scanner;

public class swtch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for Hello");
        System.out.println("press 2 for Namaste");
        System.out.println("press 3 for Bonjour");
        System.out.println("Enter your number");
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("bonjour");
            break;
            default:
            break;
        }

        sc.close();
        
    }
}
