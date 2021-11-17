package Tpfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Analogique extends Mecanisme implements AffichageInterface {


    public Analogique(String nom, double prixBase) {
        super(nom, prixBase);
    }



    @Override
    public String afficher() {

        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate time = LocalDate.now();

        String retour = "Type Mecanisme : Analogique  \n Prix : " +getPrixBase()+ "\n Date :" + dateFormater.format(time) ;

        return retour;


    }
    public String afficherDouble() {

        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate time = LocalDate.now();

        String str = "\n"+ super.afficher() + "\nDate :" + dateFormater.format(time);

        return str;


    }
}
