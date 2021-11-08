import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Tp22DoublonsChar {


    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        //User saissi les deux  phrases
        System.out.print("Saississez votre phrase : ");
        String phrase=keyboard.nextLine();

        HashMap<Character,Integer> occurences = new HashMap<>();

        HashMap<Character,Integer> occurencesDoublon = new HashMap<>();

        char caractere[] = phrase.toCharArray();
        String maphrase = "";

        for(int i = 0; i < caractere.length; i++){
            // si la liste des occurence ne contient pas le caractere
            if(!occurences.containsKey(caractere[i]))
            {
                //l'ajouter a la list des occurence et l'ajouter a la phrase
                occurences.put(phrase.charAt(i),1);
                maphrase += caractere[i];
            }else {
                //sinon l'ajouter a la liste des doublons
                if(occurencesDoublon.get(phrase.charAt(i))==null){
                    occurencesDoublon.put(phrase.charAt(i),2);
                }else{
                    occurencesDoublon.replace(phrase.charAt(i),occurencesDoublon.get(phrase.charAt(i))+1);
                }
            }
        }
        System.out.println(phrase);
        System.out.println(maphrase);
        System.out.println(occurencesDoublon);

    }
}
