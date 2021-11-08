import java.util.Scanner;
class Diametre {
     public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in);
         System.out.print("Diametre: ");
         double vdiam =keyboard.nextDouble();

      double surface;
      double rayon;
         rayon=vdiam/2;
         surface= Math.pow(rayon,2)*Math.PI;

         System.out.printf("la surface est  %f , le rayon est %f ",surface,rayon);

     }
}
