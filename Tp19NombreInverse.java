import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
 class Tp19NombreInverse {
     public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in);
         //User saissi le nombre
         System.out.print("Saississez votre nombre: ");
         String num=keyboard.nextLine();
         String chaineInverse="";
         int tailleChaine=num.length();

        //si le nombre est négatif on met le - en premier dans la chaine inversé
         if ((byte)num.charAt(0)==45) {
             chaineInverse += String.valueOf(num.charAt(0));
         }

            for(int i=0;i<tailleChaine;i++){
                int index = tailleChaine-(i+1);
                // si le caractere est different du code ascii du moins on inverse la chaine
                if ((byte)num.charAt(index)!=45) {
                    char caractere = num.charAt(index);
                    chaineInverse = chaineInverse+ String.valueOf(caractere);
                }
            }

         System.out.print(chaineInverse);

     }
}
