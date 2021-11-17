package Tpfinal;

import java.util.ArrayList;

public class Accessoires extends Produit implements AffichageInterface {

    private TypeAccessoires type;

    public Accessoires(String nom, double prixBase, TypeAccessoires type) {
        super(nom, prixBase);
        this.type = type;
    }

    public TypeAccessoires getType() {
        return type;
    }

    public void setType(TypeAccessoires type) {
        this.type = type;
    }


    @Override
    public String afficher() {
        return
                "Nom : "+ getType()+ " "+ getNom()+"\n"+
                "Prix : " +getPrixBase();
    }

    @Override
    public String affichageDouble() {
        return " ";
    }
}

