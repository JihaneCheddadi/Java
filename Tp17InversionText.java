import java.util.HashMap;
import java.util.Scanner;
public class Tp17InversionText {
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
        System.out.println(inversePhrase);
}}
