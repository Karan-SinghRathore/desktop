import java.util.Scanner;

public class array {
     public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] marks = new int[size];
        
        for(int i = 0; i<size ; i++){
            marks[i] = in.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        int x = in.nextInt();

        for(int i=0; i<marks.length; i++){
            if(marks[i]== x){
                System.out.println("x is found at index: "+ i);
            }
        }
    }    
}
