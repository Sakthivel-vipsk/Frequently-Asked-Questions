import java.util.Scanner;

public class SumOfOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter the Numbers ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("Sum of Odd num : " + sum);
    }
}
