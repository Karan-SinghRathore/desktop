import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char s;
        sc.close();
        for(s='a';s<='z';s++){
            System.out.print(s + " ");
        }
        System.out.println( " " );

        for(s='Z';s>='A';s--){
            System.out.print(s + " ");
        }
        // sc.close();
    
//        System.out.println("Enter starting point: ");
//        int s = sc.nextInt();
//        System.out.println("Enter ending point: ");
//        int e = sc.nextInt();
//        System.out.println("Enter the table number: ");
//        int n = sc.nextInt();
//        while (s>=e){
//            System.out.println(n + " * "+ s +" = " + s*n );
//            s--;



    }
}
