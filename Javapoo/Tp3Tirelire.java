package Javapoo;


import java.util.Scanner;

class Tirelire {
    private double montant;


    public void remplir(double montantAjouter) {
        if (montantAjouter > 0) {
            montant = montant + montantAjouter;
        }

    }

    public void puiser(double montantDeduire) {
        if (montant > montantDeduire) {
            montant = montant - montantDeduire;
        }
    }
        public void secouer() {

            if (montant > 0) {
                System.out.println("Bing Bing");
            }

        }

    public double getMontant() {
        return montant;
    }
    public String afficher(){
          String etat;
        if(montant==0){
            etat="Vous êtes sans le sou ";
        }else{
            etat="Vous avez : "+montant+" euros€ dans votre tirelire.";
        }
        return etat;
    }
    public void vider(){
          montant = 0;
    }
    public double calculerSolde(double budget){
        double reste =montant-budget;

            return reste;

        }

       /* public String calculerSolde(double budget){
            double reste =montant-budget;
            String vacance;
        if ( reste >0){
            vacance="Vous êtes assez riche pour partir en vacances ! il vous restera "+reste+"euros à la rentrée \n";
            return vacance;
        }else{
            vacance="Il vous manque "+Math.abs(reste)+" euros pour partir en vacances !\n";
            return vacance;
        }
    }*/

}

public class Tp3Tirelire {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
     Tirelire maTirelire=new Tirelire();

        System.out.println(maTirelire.afficher());
        System.out.println(maTirelire.afficher());
        maTirelire.remplir(550);
        maTirelire.secouer();
        System.out.println("Vous avez : "+ maTirelire.getMontant()+"dans votre tirelire. \n");
        maTirelire.puiser(15);
        System.out.println("Vous avez : "+ maTirelire.getMontant()+"dans votre tirelire. \n");
        System.out.println("Donnez le budget de vos vacances \n");
        double budget=keyboard.nextDouble();
        double reste= maTirelire.calculerSolde(budget);
        if(reste>0){
            System.out.println("Vous êtes assez riche pour partir en vacances ! il vous restera "+reste+"euros à la rentrée \n");
        }else{
            System.out.println("Il vous manque "+Math.abs(reste)+" euros pour partir en vacances !\n");
        }
    }
}
