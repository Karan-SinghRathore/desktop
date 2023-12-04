import java.util.Scanner;
class Firstclass {
    public static void main(String args[]) {
        //For output
        System.out.print("Hello World with java\n");
        System.out.println("Hello World with java");
        System.out.print("*\n");
        System.out.println("**");
        System.out.print("***\n"); 
        System.out.println("****");
        int a =30 ;
        int b =20 ;
        int sum = a+b;
        System.out.println(sum);
        int dif = a-b ;
        System.out.println(dif);
        int mul = a*b;
        System.out.println(mul);
        a=10;
        b=5;
        int maz = a * b / a -b ;
        System.out.println(maz);
        int mas = (a*b)/(a-b);
        System.out.println(mas);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int t = sc.nextInt();
        System.out.println("Enter Second Number:");
        int p = sc.nextInt();
        int sumo = t + p;
        System.out.println("The Sum is:");
        System.out.println(sumo);
        int subo = t - p;
        System.out.println("The Difference is:");
        System.out.println(subo);
        int mulo = t * p;
        System.out.println("The Product is:");
        System.out.println(mulo);
        int divo = t / p;
        System.out.println("The Quotient is:");
        System.out.println(divo);
        sc.close();



    }
    
}
 