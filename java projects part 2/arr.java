import java.util.*;

public class arr {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] marks = new int[size];
        
        for(int i = 0; i<size ; i++){
            marks[i] = in.nextInt();
        }
        in.close();
        // marks[0]= 97;
        // marks[1]= 95;
        // marks[2]= 98;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i = 0; i<size ; i++ ) {
            System.out.println(marks[i]);
        }

    }
}