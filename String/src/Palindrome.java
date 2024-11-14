import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String userInput = sc.nextLine();
        String ogString = userInput.toLowerCase();
        //Using manual
        if(ogString.equals(palindrome(userInput))){
            System.out.println("It's a Palindrome !");
        }
        else {
            System.out.println("Not a Palindrome !");
        }

        //Using StringBuilder

        String str = new StringBuilder(userInput).reverse().toString();
        System.out.println(str);
        if(userInput.toLowerCase().equals(str.toLowerCase()))
        {
            System.out.println("It's a palindrome !");

        }
        else {
            System.out.println("It's not a palindrome !");
        }

    }

    private static String palindrome(String userInput) {

        String reversedString ="";
        for(int i = userInput.length()-1; i>=0;i-- ){
            reversedString += userInput.charAt(i);
        }
     return reversedString.toLowerCase() ;
    }
}
