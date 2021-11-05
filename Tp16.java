import java.util.Scanner;
class Tp16 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);

        System.out.print("Entrez la taille du tableaux  : ");
        int tailleTab=clavier.nextInt();

        int tabVal[]=new int[tailleTab];
        System.out.println("Remplissage");
        for(int i=0;i<tailleTab;i++){
            System.out.printf("matrice[%d] : ",i);
            tabVal[i]=clavier.nextInt();
        }
        int grandN=tabVal[0];
        int petitN=tabVal[0];
        int positionGrand=0;
        int positionPetit=0;
        for (int i=0;i<tailleTab;i++) {
            if (tabVal[i] > grandN) {
                grandN = tabVal[i];
                positionGrand=i;
            }

            if (tabVal[i] < petitN) {
                petitN = tabVal[i];
                positionPetit=i;
            }


        }
        for (int i=0;i<tailleTab;i++){
            if (i==positionGrand){
                System.out.printf("%d (PG),",tabVal[i]);}
            if (i==positionPetit){
                System.out.printf("%d (Pp),",tabVal[i]);}
           else
            {
                System.out.printf("%d ,",tabVal[i]);
            }
        }
    }

}


