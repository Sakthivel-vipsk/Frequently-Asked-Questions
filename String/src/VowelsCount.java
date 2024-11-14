import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
       String str = userInput.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                count++;
            }
        }
        System.out.println("Using normal way Vowels Count :" + count);


        //if i want to remove duplicate counts
        Set<Character> uniqueVowels= new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                uniqueVowels.add(ch);
            }
        }
        System.out.println("removing dulplicate Vowels Count :" + uniqueVowels.size());
    }
}
