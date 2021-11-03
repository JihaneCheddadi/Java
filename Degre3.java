import java.util.Scanner;
class Degre3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Valeur de a  : ");
        int a=keyboard.nextInt();

        System.out.print("Valeur de b  : ");
        int b=keyboard.nextInt();

        System.out.print("Valeur de c  : ");
        int c =keyboard.nextInt();

        System.out.print("Valeur de   x   : ");
        double x =keyboard.
                nextDouble();



        double poly=(((a+b)/2.0)*Math.pow(x,3))+((Math.pow((a+b),2)*Math.pow(x,2)))+a+b+c;

        System.out.printf("la valeur du polynome est = %f",poly);
    }}
