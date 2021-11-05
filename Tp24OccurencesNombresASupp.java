
import java.util.ArrayList;
import java.util.Scanner;
class Tp24OccurencesNombresASupp {

    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);

        ArrayList<Integer> nombresOcc=new ArrayList<>();
        ArrayList<Integer> nombresOccsanssuppresion=new ArrayList<>();
        ArrayList<Integer> nombresAsuppresion=new ArrayList<>();

        Scanner keyb=new Scanner(System.in);

        System.out.print("Combien de nombres vous entrez? :");
        int cNombre=keyb.nextInt();

        //recuperation des nombres
        for(int i=0;i<cNombre;i++){
            System.out.printf("Entrez le nombre %d : ",(i+1));
            nombresOcc.add(keyb.nextInt());
        }

        //        Affiche les nombres
        for(int i=0;i<nombresOcc.size();i++){
            System.out.printf("Nombre %d : %d\n",(i+1),nombresOcc.get(i));
        }

        for(int i=0;i<nombresOcc.size();i++){

            nombresOccsanssuppresion.add(nombresOcc.get(i));
        }

            System.out.println("Entrez le nombre a supprimer : ");
            int nombreASupprimer =keyboard.nextInt();



        for(int i=0;i<nombresOcc.size();i++){


            if((nombresOcc.get(i)).equals(nombreASupprimer)){
                    nombresOcc.remove(i);
                }

            }

        for(int k=0;k<nombresOccsanssuppresion.size();k++){
            System.out.printf("Language %d : %s\n",(k+1),nombresOccsanssuppresion.get(k));
        }
        System.out.println("le tableaux avec les elements supprimer ");
        for(int b=0;b<nombresOcc.size();b++){
            System.out.printf("Language %d : %s\n",(b+1),nombresOcc.get(b));
        }




    }
}
