import java.util.Scanner;
class Permutation {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Valeur de a  : ");
        int a=keyboard.nextInt();

        System.out.print("Valeur de b  : ");
        int b=keyboard.nextInt();

        System.out.print("Valeur de c  : ");
        int c =keyboard.nextInt();
        System.out.printf("la valeur de a = %d, la valeur de b = %d,la valeur de c = %d)",a,b,c);
        int boite =b;
        b = a;
        a = c;
        c = boite;

        System.out.printf("la valeur de a = %d, la valeur de b = %d,la valeur de c = %d)",a,b,c);
}}
