import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i;
        sc.close();
        for(i=0;i<n ;i++) {
            System.out.println("Apna College");
        }
        // sc.close();
        


// important question - all even numbers till n
//        for(int i = 1; i <=n; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//
//        }
//        till here
//            System.out.println(n + "*" +i + "=" + n * i);
//        }
//        int i =0;
//        while(i < 11){
//            System.out.print(i + " ");
//            i++;
//        }
//        int i = 0;
//        do{
//            System.out.print(i + " ");
//            i++;
//        } while(i<11);

    }
}
