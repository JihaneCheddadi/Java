package Agencedevoyage;

import java.util.ArrayList;

public class KitVoyage {
    private ArrayList<OptionsVoyage> voyage;
    private String depart;
    private String destination;

    public KitVoyage(String depart, String destination) {
        voyage = new ArrayList<>();
        this.depart = depart;
        this.destination = destination;
    }
    public double prix(){
        double totalPrixOptions=0.0;
        for (OptionsVoyage vacation :voyage){
            totalPrixOptions=+ vacation.prix();

        }
        return totalPrixOptions;
    }


    public String toString() {
        String chaine;
        chaine ="Voyage de" +depart+" à "+destination+", avec pour options : \n";
        for(OptionsVoyage vacation :voyage){
            chaine +="- "+vacation+"->"+vacation.prix()+" CHF";

        }
        chaine += "Prix total : "+prix()+" CHF";
        return chaine;
    }
    public void ajouterOption(OptionsVoyage vacation){
        if(vacation==null){
            System.out.println("Pas d'option a ajouter");
        }else{
            voyage.add(vacation);
        }

    }
    public void vider(){
        voyage.clear();
    }
    public int getNbOptions(){
        return voyage.size();
    }
}
