package Tpfinal;
import java.util.ArrayList;
import java.util.List;

public class Montres extends Produit  implements AffichageInterface{

    private Mecanisme mecanisme;
    private ArrayList<Accessoires> accessoires;




    public Montres(String nom, double prixBase) {

        super(nom, prixBase);
    }

    public Mecanisme getMecanisme() {
        return mecanisme;
    }

    public void setMecanisme(Mecanisme mecanisme) {
        this.mecanisme = mecanisme;
    }

    public ArrayList<Accessoires> getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(ArrayList<Accessoires> accessoires) {
        this.accessoires = accessoires;
    }

    @Override
    public double calculerPrix() {
        double nvPrix = 0;
        for (Accessoires accessoire : this.accessoires) {
            nvPrix += accessoire.getPrixBase();
        }

        return nvPrix + getPrixBase()+ mecanisme.getPrixBase();
    }






    @Override
    public String afficher() {
        String retour = "Montre : "+getNom()+ "\n prix :"+calculerPrix() +" \n Accessoires :" ;

        for (Accessoires accessoire : this.accessoires) {
            retour += "\n"+accessoire.afficher();
        }

        retour += "\n"+getMecanisme().afficher();

        return retour;
    }

    @Override
    public String affichageDouble() {
        return getMecanisme().affichageDouble();
    }
}


