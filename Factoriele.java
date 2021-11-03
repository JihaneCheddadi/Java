import java.util.Scanner;
 class Factoriele {
  public static void main(String[] args) {
   Scanner keyboard=new Scanner(System.in);

   System.out.print("Saisir le nombre   : ");
   int num=keyboard.nextInt();

   int fact=1;

   for ( int i=1;i<=num;i++){
     fact = fact*i;
   }
   System.out.printf("la Factorielle de %d est %d  : ",num,fact);
  }
}
