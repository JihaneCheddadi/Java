import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

class Tp21MajusculeApresEspace {


    public static void main(String[] args) {

        Scanner keyboard  = new Scanner(System.in);
        //User saissi la  phrase
        System.out.print("Saississez votre phrase : ");
        String phrase = keyboard.nextLine();

        Scanner maPhrase = new Scanner(phrase);

        String phraseMaj = "";

        while (maPhrase.hasNext()){
            String mot = maPhrase.next();
            String firstLetter = mot.substring(0,1).toUpperCase();
            phraseMaj += firstLetter + mot.substring(1) +" ";
        }
        System.out.println(phraseMaj);

    }
}
