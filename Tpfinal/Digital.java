package Tpfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Digital extends Mecanisme implements AffichageInterface {

    private static final LocalTime TIME=  LocalTime.of(6,30);

    public Digital(String nom, double prixBase) {
        super(nom, prixBase);
    }

    @Override
    public String afficher() {

        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        String retour = "Type Mecanisme : Digital \n Prix : " +getPrixBase()+ "\n" + super.afficher() ;

        return retour;

    }

    @Override
    public String affichageDouble() {
        DateTimeFormatter dateFormater = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        String retour = " \n Heure reveil :" + TIME;

        return retour;
    }
}
