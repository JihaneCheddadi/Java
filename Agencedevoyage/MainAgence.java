package Agencedevoyage;

public class MainAgence {
    public static void main(String[] args) {
        OptionsVoyage op=new OptionsVoyage("jiji",25);
        System.out.println(op.toString());
        Transport tr =new Transport("Avion",25,true);
        System.out.println(tr.toString());
        Transport tr1=new Transport("taxi",25,false);
        System.out.println(tr1.toString());
        Sejour sej1=new Sejour("Gondwana",26,5,250);
        System.out.println(sej1.toString());

        KitVoyage voyage=new KitVoyage("Mirleft","Nantes");
        voyage.ajouterOption(new Transport("Taxi",25,false));
        voyage.ajouterOption(new Sejour("madrid",28,6,100));
        System.out.println(voyage.toString());
        System.out.println("\n");
        System.out.println(voyage.getNbOptions());
        System.out.println("\n");
        voyage.vider();
        System.out.println(voyage.toString());
    }



}
