import java.util.Scanner;
class Tp15 {
    public static void main(String[] args) {


        Scanner clavier=new Scanner(System.in);
        int multi1=0;
        int multi2=0;
        int multi3=0;

        System.out.print("Entrez la taille du tableaux 1 : ");
        int tailleTab1=clavier.nextInt();
        System.out.print("Entrez la taille du tableaux 2  : ");
        int tailleTab2=clavier.nextInt();
        System.out.print("Entrez la taille du tableaux 3 : ");
        int tailleTab3=clavier.nextInt();

        // remplissage tableaux 1
        int tabVal1[]=new int[tailleTab1];
        System.out.println("Remplissage tableaux 1");
        for(int i=0;i<tailleTab1;i++) {
            System.out.printf("matrice[%d] : ", i);
            tabVal1[i] = clavier.nextInt();
            if (tabVal1[i] % 3 == 0) {
                multi1 += tabVal1[i];
            }
        }

        // remplissage tableaux 2
        int tabVal2[]=new int[tailleTab2];
        System.out.println("Remplissage tableaux 2");
        for(int i=0;i<tailleTab2;i++) {
            System.out.printf("matrice[%d] : ", i);
            tabVal2[i] = clavier.nextInt();
            if (tabVal2[i] % 3 == 0) {
                multi2 += tabVal2[i];
            }}
            // remplissage tableaux 3

            int tabVal3[] = new int[tailleTab3];
            System.out.println("Remplissage tableaux 3");
            for (int i = 0; i < tailleTab3; i++) {
                System.out.printf("matrice[%d] : ", i);
                tabVal3[i] = clavier.nextInt();
                if (tabVal3[i] %3 == 0) {
                    multi3 += tabVal3[i];
                }
            }
                int multi;
                multi = multi1 + multi2 + multi3;

                System.out.println("Affichage");
                System.out.printf("La somme des multiples de 3 est de %d", multi);


            }
        }
