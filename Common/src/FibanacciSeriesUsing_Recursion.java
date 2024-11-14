import java.util.Scanner;

public class FibanacciSeriesUsing_Recursion {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Fibanacci Series : ");
        for(int i=0; i < num;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int num) {
        if(num<=1){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
