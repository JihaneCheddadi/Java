package Agencedevoyage;

public class Transport extends OptionsVoyage {
    private boolean isLong;
    public final int TARIF_LONG=1500;
    public final int TARIF_BASE=200;

    public Transport(String nom, double prixForf, boolean isLong) {
        super(nom, prixForf);
        this.isLong = isLong;
    }


    public double prix() {
        if (isLong){
            return TARIF_LONG+super.prix();
        }else {
            return TARIF_BASE+super.prix() ;
        }

    }


}

