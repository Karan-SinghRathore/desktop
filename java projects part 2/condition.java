import java.util.Scanner;

public class condition {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if(a == b ){
            System.out.println("Equal");
        }
         
        else if(a>b){
                System.out.println("A is greater than b");    
            }
            else{
                System.out.println("A is smaller than b");
            }
        System.out.println("press 1 for Hello");
        System.out.println("press 2 for Namaste");
        System.out.println("press 3 for Bonjour");
        System.out.println("Enter your number");
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }

        
        sc.close();
     }
}
