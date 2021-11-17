package Tpfinal;

import java.util.ArrayList;

public class MontreDigital {
    public static void main(String[] args) {

        // Ajouter des accesoires

        ArrayList<Accessoires> accessoiresList = new ArrayList<>();
        accessoiresList.add(new  Accessoires("céramique", 2500, TypeAccessoires.bracelet));
        accessoiresList.add(new Accessoires("boucle déployante", 1000, TypeAccessoires.fermoir));
        accessoiresList.add(new Accessoires("bois", 900, TypeAccessoires.boitier));
        accessoiresList.add(new Accessoires("Verre saphir", 550, TypeAccessoires.vitre));

        // Creation de montre

        Montres montres = new Montres("Rolex",1000);

        montres.setAccessoires(accessoiresList);

        // Ajouter un mecanisme

        Digital digital=new Digital("Digital",800);
        montres.setMecanisme(digital);

        System.out.println(montres.afficher());
        System.out.println(montres.affichageDouble());

    }
}
