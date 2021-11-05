import java.util.HashMap;
import java.util.Scanner;
class Tp20Annagrammes {


    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        //User saissi les deux  phrases
        System.out.print("Saississez votre phrase 1: ");
        String phrase1=keyboard.nextLine();
        System.out.print("Saississez votre phrase 2: ");
        String phrase2=keyboard.nextLine();
        //Effacement des espaces
        phrase1= phrase1.replaceAll("\\s+", "");
        phrase2= phrase2.replaceAll("\\s+", "");
        //création des deux Hashmaps
        HashMap<Character,Integer> occurences1=new HashMap<>();
        HashMap<Character,Integer> occurences2=new HashMap<>();

        // calcul occurences pour chaque character
        for(int i=0;i<phrase1.length();i++){
            if(occurences1.get(phrase1.charAt(i))==null){
                occurences1.put(phrase1.charAt(i),1);
            }else{
                occurences1.replace(phrase1.charAt(i),occurences1.get(phrase1.charAt(i))+1);
            }

        }
        for(int i=0;i<phrase2.length();i++){
            if(occurences2.get(phrase2.charAt(i))==null){
                occurences2.put(phrase2.charAt(i),1);
            }else{
                occurences2.replace(phrase2.charAt(i),occurences2.get(phrase2.charAt(i))+1);
            }

        }
        //System.out.println(occurences1);
        //System.out.println(occurences2);
        if(occurences1.equals(occurences2)){
            System.out.printf(" %s est une anagramme de %s ",phrase1,phrase2);
        }else{
            System.out.printf(" %s n'est pas anagramme de %s ",phrase1,phrase2);
        }


    }


}
