package Biblio;

public class  Oeuvre extends Auteur {
    private String titre;
    private String langue;
    private final String nomAuteurOeuvre=super.getNom();

    public Oeuvre(String titre,String nom,String langue) {
        super(nom);
        this.titre=titre;
        this.langue=langue;

    }

    public String getTitre() {
        return titre;
    }

    public String getNomAuteurOeuvre() {
        return nomAuteurOeuvre;
    }

    public String getLangue() {
        return langue;
    }
    public String Tostring(){

        return this.titre+","+this.nomAuteurOeuvre+", en" +this.langue;
    }

}
