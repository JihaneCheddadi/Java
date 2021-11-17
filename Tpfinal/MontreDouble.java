package Tpfinal;

import java.util.ArrayList;


public class MontreDouble {

    public static void main(String[] args) {


       // Ajouter des accesoires

        ArrayList<Accessoires> accessoiresList = new ArrayList<>();
        accessoiresList.add(new  Accessoires("Cuir", 500, TypeAccessoires.bracelet));
        accessoiresList.add(new Accessoires("Boucle", 100, TypeAccessoires.fermoir));
        accessoiresList.add(new Accessoires("Argent", 150, TypeAccessoires.boitier));
        accessoiresList.add(new Accessoires("Quartz", 300, TypeAccessoires.vitre));

        // Creation de montre

        Montres montres = new Montres("Mk",100);

        montres.setAccessoires(accessoiresList);

        // Ajouter un mecanisme

        DoubleMeca doublemeca = new DoubleMeca("Double",200);

        montres.setMecanisme(doublemeca);

        System.out.println(montres.afficher());
        System.out.println(montres.affichageDouble());

        //affichage de produit
        System.out.println("Produit a l'unité");

             Accessoires braceletcuir= new  Accessoires("Cuir", 500, TypeAccessoires.bracelet);
             System.out.println(braceletcuir.afficher());

            Accessoires fermoiror= new  Accessoires("or", 200, TypeAccessoires.fermoir);
            System.out.println(fermoiror.afficher());

            Analogique mecanismeanalogique=new Analogique("Meca analogique",150);
        System.out.println(mecanismeanalogique.afficher());
    }
}
