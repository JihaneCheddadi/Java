import java.util.Objects;
import java.util.Scanner;
 class IdentifMdp {
  public static void main(String[] args) {
   Scanner keyboard=new Scanner(System.in);

   System.out.print("Votre identifiant: ");
    String identifiantSaissi=keyboard.nextLine();

   System.out.print("Votre Mot de passe: ");
   String mdpsaissi =keyboard.nextLine();
   String identifiantDeConnexion;
   String mdpDeConnexion;
   int nbrdeCo=0;
   do {
    System.out.print(" identifiant de connexion : ");
     identifiantDeConnexion=keyboard.nextLine();

    System.out.print(" Mot de passe de connexion: ");
    mdpDeConnexion =keyboard.nextLine();
    if (!Objects.equals(mdpsaissi, mdpDeConnexion) && !Objects.equals(identifiantDeConnexion, identifiantSaissi)){
     System.out.print(" Identifiants incorrect \n ");

    }
    nbrdeCo=nbrdeCo+1;
    System.out.printf(" il vous reste %d tentative  \n ",5-nbrdeCo);
   }while (!Objects.equals(mdpsaissi, mdpDeConnexion) && !Objects.equals(identifiantDeConnexion, identifiantSaissi)&& nbrdeCo<5);
if (nbrdeCo==5){
 System.out.printf("Vous avez saisi des mauvais identifiants %d fois, votre compte est bloqué”",nbrdeCo);
}else
    System.out.print("Bienvenu dans votre espace client");

  }
}
