import java.util.Scanner;

public class Equationdegre {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Valeur de a  : ");
        int a=keyboard.nextInt();

        System.out.print("Valeur de b  : ");
        int b=keyboard.nextInt();

        System.out.print("Valeur de c  : ");
        int c =keyboard.nextInt();

        double delta=Math.pow(b,2)-4.0*a*c;

        if (delta==0)
    {
        double solution0=-(b/2.0*a);
        System.out.printf("la solution est %f",solution0);
    }
        if (delta>0){
            double solution1=(-b-Math.sqrt(delta))/2.0*a;
            double solution2=(-b+Math.sqrt(delta))/2.0*a;
            System.out.printf("la premiére solution  est %f \n ",solution1);
            System.out.printf("la  deuxieme solution est %f",solution2);
        }
        if (delta<0){
            System.out.printf("la solution est imaginaire");
        }
    }



}
