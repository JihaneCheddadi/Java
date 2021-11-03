import java.util.Scanner;
 class Tp2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom=keyboard.nextLine();
        System.out.print("Votre Prénom :");
        String prenom=keyboard.nextLine();

        System.out.print("Votre age : ");
        int age=keyboard.nextInt();//int
        System.out.printf("Vous vous appelez %s %s et vous avez %d ans ",prenom,nom,age);
    }
}
