import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args){
        System.out.println("Enter the size of an Array ");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println(" Enter the Elements ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the no(K) that you want to find the largest element : ");
        int num = sc.nextInt();
        int kth_element = arr[arr.length -num];
        System.out.println(num +" larges element : " + kth_element);
    }
}
