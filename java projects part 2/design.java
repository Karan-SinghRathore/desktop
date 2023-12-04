import java.util.Scanner;

public class design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Rows of half pyramid");
        int n = 4;
        // int m = 5;
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
            for (int j = 1; j <= n; j++) {
                if(i==1 || n==1 || j==n-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
//            for(int j=2 ; j<=i ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//        for(int i=1; i<= n; i++){
//            for(int j=1;j<=i;j++){
//                int sum = i+j;
//                if(sum%2==0) {
//                    System.out.print("1" + " ");
//                }
//                else{
//                    System.out.print("0" + " ");
//                }
//v for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1; j<=2*(n-i); j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1; j<=2*(n-i); j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the size of Length");
//        int m = sc.nextInt();
//        System.out.println("The desired Rectangle is: ");
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++) {
//                if(i==1 || j==1 || i==n || j==m) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
}
