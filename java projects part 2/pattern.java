// import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
