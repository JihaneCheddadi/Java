import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre age : ");
        int age=keyboard.nextInt();
        int  anneeCourante;
        anneeCourante=2021;
        int anneeDeNaissance = anneeCourante-age;
        System.out.printf("votre année de naissance est %d",anneeDeNaissance);

    }
}
