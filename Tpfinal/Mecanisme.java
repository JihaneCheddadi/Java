package Tpfinal;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Mecanisme extends Produit implements AffichageInterface {
    public Mecanisme(String nom, double prixBase) {
        super(nom, prixBase);
    }




    @Override
    public String afficher() {
        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime time = LocalTime.now();
        return  "heure : "+dateFormater.format(time);
    }

    @Override
    public String affichageDouble() {
        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime time = LocalTime.now();
        return  "heure : "+dateFormater.format(time);
    }
}
