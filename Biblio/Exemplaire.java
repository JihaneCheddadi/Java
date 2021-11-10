package Biblio;

public class Exemplaire extends Oeuvre {


    public Exemplaire(String titre, String nom, String langue) {
        super(titre, nom, langue);
        System.out.println("Nouvelle exemplaire -->");
    }
    public Exemplaire(Exemplaire Exem){
        super(Exem.getTitre(),Exem.getNom(),Exem.getLangue() );
        System.out.println("Copie d’un exemplaire de -->");

    }

    @Override
    public String Tostring() {
        return super.Tostring();
    }

    //@Override
    //public String getOeuvre() {
    //    return super.getTitre();
    //}
}
