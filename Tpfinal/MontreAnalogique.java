package Tpfinal;

import java.util.ArrayList;

public class MontreAnalogique {
    public static void main(String[] args) {
        // Ajouter des accesoires

        ArrayList<Accessoires> accessoiresList = new ArrayList<>();
        accessoiresList.add(new  Accessoires("or", 1000, TypeAccessoires.bracelet));
        accessoiresList.add(new Accessoires("ferme", 500, TypeAccessoires.fermoir));
        accessoiresList.add(new Accessoires("or", 300, TypeAccessoires.boitier));
        accessoiresList.add(new Accessoires("Quartz", 400, TypeAccessoires.vitre));

        // Creation de montre

        Montres montres = new Montres("Mk or",500);

        montres.setAccessoires(accessoiresList);

        // Ajouter un mecanisme

        Analogique analogique =new Analogique("Analogique",200);
        montres.setMecanisme(analogique);

        System.out.println(montres.afficher());
        System.out.println(montres.affichageDouble());

    }
}
