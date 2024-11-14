import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String str = userInput.toLowerCase();
        System.out.println("Before removing Duplicates : " + str);
        Set<Character> removeDuplicates = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(removeDuplicates.add(ch)){
                result.append(ch);
            }
        }
        System.out.println("Altered String after Removing : " + result);
    }
}
