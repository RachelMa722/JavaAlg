import java.util.Scanner;
 
public class CheckPalindrome {
    
   public static void main(String args[]) {
       
      String input, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string to check palindrome:");
      input = sc.nextLine();
 
      int length = input.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + input.charAt(i);
 
      if (input.equals(rev))
         System.out.println(input+" is a palindrome.");
      else
         System.out.println(input+" is not a palindrome.");
 
   }
}
