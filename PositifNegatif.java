import java.util.Scanner;
 class PositifNegatif {
     public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in);

         System.out.print("Valeur de a  : ");
         int a=keyboard.nextInt();

         if (a >0){
             System.out.println("Positif");}
         else{
             System.out.println("Negatif");
         }
         if (a==0)
         { System.out.println("le nombre est zéro");}
         if ( a/2==0) {
             System.out.println("pair");
         }else {
             System.out.println("Impair");
         }

     }

}
