import java.util.Scanner;

public class Factorial {

    public static void main(String[] args ){
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of "+ num + "! is : " + factoroal(num));
    }

    private static int factoroal(int num) {
        if(num ==0 || num ==1)
            return 1;
        return num * factoroal(num -1 );
    }
}
