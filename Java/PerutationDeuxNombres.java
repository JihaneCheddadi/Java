import java.util.Scanner;
class PerutationDeuxNombres {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Valeur de x  : ");
        int x=keyboard.nextInt();

        System.out.print("Valeur de b  : ");
        int y=keyboard.nextInt();
        System.out.printf("la valeur de x = %d, la valeur de y = %d \n",x,y);
        int boite=x ;
       x=y;
       y=boite;

        System.out.printf("la valeur de x = %d, la valeur de y = %d",x,y);
    }
}
