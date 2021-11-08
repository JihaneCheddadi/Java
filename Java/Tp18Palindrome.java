import java.util.HashMap;
import java.util.Scanner;

 class Tp18Palindrome {
     public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in);
         //User saissi la phrase
         System.out.print("Saississez votre phrase: ");
         String phrase=keyboard.nextLine();
         String inversePhrase ="";

         for(int i=0;i<phrase.length();i++){
             char c1=phrase.charAt(phrase.length()-i-1);
             inversePhrase += c1;

         }
         if (phrase.equals(inversePhrase)){
             System.out.printf(" %s C'est un palindrome",phrase);
         }else
         {
             System.out.printf(" %s C'est pas un palindrome ",phrase);
     }
}
 }