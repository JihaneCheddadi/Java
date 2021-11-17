package Tpfinal;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DoubleMeca extends Mecanisme implements AffichageInterface{

    private Analogique analogique = new Analogique("",0);
    private Digital digital = new Digital("",0);


    public DoubleMeca(String nom, double prixBase) {
        super(nom, prixBase);
    }


    public Analogique getAnalogique() {
        return analogique;
    }

    public void setAnalogique(Analogique analogique) {
        this.analogique = analogique;
    }

    public Digital getDigital() {
        return digital;
    }

    public void setDigital(Digital digital) {
        this.digital = digital;
    }

    @Override
    public String afficher() {

        return "Type Mecanisme : Double \n Prix : "+getPrixBase() ;

    }

    @Override
    public String affichageDouble() {

        return " "+digital.affichageDouble() + "\n" + analogique.afficherDouble();
    }
}
