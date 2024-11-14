import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Enter a char to count from a given string : ");
        char str = sc.next().charAt(0);
        int count =0;
        for(int i =0; i<userInput.length();i++){
            if(userInput.charAt(i)== str){
                count++;
            }
        }
        System.out.println( str + " is repeated " + count + " times.");
    }
}
