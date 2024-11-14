import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Numbers ");
        for (int i= 0; i<size;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Before Sorted : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorted : " + Arrays.toString(arr));
    }
}
