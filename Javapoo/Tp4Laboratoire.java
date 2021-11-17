package Javapoo;


class Souris{

 private int poids;
 private int age;
 private String couleur;
 private int esperanceVie;
 private boolean iscloned;
 private final int ESPERANCE_VIE_DEFAUT=36;
 private final int AGE=0;

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = AGE;
        this.esperanceVie = ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle sourie ! \n");
    }

    public Souris(Souris souris){
       this.poids=souris.poids;
        this.couleur= souris.couleur;
        this.age=souris.age;
        this.esperanceVie=(4*souris.esperanceVie)/5;
        this.iscloned=true;
        System.out.println("Clonage d’une souris !\n");
    }
    public int getEsperanceVie() {
        return esperanceVie;
    }

    public int getAge() {
        return age;
    }
    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isIscloned() {
        return iscloned;
    }

    public String toString(){

          return iscloned? "Une souris "+this.couleur+", clonée,de "+this.age+" mois et pesant "+ this.poids+" grammes ":"Une souris "+this.couleur+" de "+this.age+" mois et pesant "+ this.poids+" grammes ";



    }

    public void vieillir() {

        this.age++;
        if((iscloned) && ( this.age > (0.5*this.esperanceVie))){
            this.couleur="verte";

        }
    }
    public void evolue(){
        while(this.age<this.esperanceVie){
            vieillir();
        }
    }


}
public class Tp4Laboratoire {
    public static void main(String[] args) {
        Souris nouvelleSouris=new Souris(26,"gris");
        System.out.println(nouvelleSouris.getEsperanceVie());
        Souris dexiemeSouris=new Souris(50,"gris");
        Souris sourisClonee=new Souris(nouvelleSouris);
        System.out.println(sourisClonee.getEsperanceVie());
        System.out.println(nouvelleSouris);
        System.out.println(dexiemeSouris);
        System.out.println(sourisClonee);
        sourisClonee.evolue();
        System.out.println(sourisClonee);
        dexiemeSouris.evolue();
        System.out.println(dexiemeSouris);
    }
}
