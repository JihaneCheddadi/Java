import java.util.Scanner;
 class MoisCorrespendant {
     public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in);


         System.out.print("Le mois souhaité  : ");
         int mois=keyboard.nextInt();
         if (mois==1){
             System.out.print("Le mois est  : Janvier");
         }
         if (mois==2){
             System.out.print("Le mois est  : fevrier");
         }
         if (mois==3){
             System.out.print("Le mois est  : Mars");
         }
         if (mois==4){
             System.out.print("Le mois est  : Avril");
         }
         if (mois==5){
             System.out.print("Le mois est  : Mai");
         }
         if (mois==6){
             System.out.print("Le mois est  : Juin");
         }
         if (mois==7){
             System.out.print("Le mois est  : Juillet");
         }
         if (mois==8){
             System.out.print("Le mois est  : Aout");
         }
         if (mois==9){
             System.out.print("Le mois est  : septembre");
         }
         if (mois==10){
             System.out.print("Le mois est  : Octobre");
         }
         if (mois==11){
             System.out.print("Le mois est  : Novembre");
         }
         if (mois==12){
             System.out.print("Le mois est  : Decembre");
         }
         if (mois >12 || mois<1){

                 System.out.print("Erreur réésayer");
             }

     }
}
