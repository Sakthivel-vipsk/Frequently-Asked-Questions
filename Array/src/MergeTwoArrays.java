import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,2,4,5,6,2};
        int[] mergeArr = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length;i++){
            mergeArr[i] = arr1[i];
        }
        for (int i=0; i<arr2.length;i++){
            mergeArr[arr1.length + i]= arr2[i];
        }
        System.out.println("Merged Arrays : "+ Arrays.toString(mergeArr));
    }
}
