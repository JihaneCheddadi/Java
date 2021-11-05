import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
 class Tp23ManipArray {
     public static void main(String[] args) {

         ArrayList<String> langageDeProg=new ArrayList<>();
         ArrayList<String> langageDeProgSanssuppression=new ArrayList<>();
         ArrayList<String> langageDeProgASupprimer=new ArrayList<>();

         Scanner keyboard=new Scanner(System.in);
         System.out.print("Combien de language de programmation vous souhaitez :");
         int nbreLangage=keyboard.nextInt();


         for(int i=0;i<nbreLangage;i++){
             System.out.println("Entrez le langage souhaiter : ");
             langageDeProg.add(keyboard.next().toLowerCase());

         }

         for(int i=0;i<langageDeProg.size();i++){

             langageDeProgSanssuppression.add(langageDeProg.get(i));
         }


         System.out.print("Combien de language de programmation vous souhaitez supprimer :");
         int nbreLangageASupprimer=keyboard.nextInt();


         for(int i=0;i<nbreLangageASupprimer;i++){
             System.out.println("Entrez le langage a supprimer : ");
              langageDeProgASupprimer.add(keyboard.next());
              String langasupp = langageDeProgASupprimer.get(i);
             langageDeProg.removeIf(lang -> Objects.equals(lang, langasupp));
         }





         for(int k=0;k<langageDeProgSanssuppression.size();k++){
             System.out.printf("Language %d : %s\n",(k+1),langageDeProgSanssuppression.get(k));
         }
         System.out.println("le tableaux avec les elements supprimer ");
         for(int b=0;b<langageDeProg.size();b++){
             System.out.printf("Language %d : %s\n",(b+1),langageDeProg.get(b));
         }







     }
}
