package Javapoo;


class Patient {
    private String nom;
    private String prenom;
    private  int age;
    private  double poid;
    private  double taille;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double imc() {
        return poid/(taille*taille);

    }






}


    class Tp2calculImc {

        public static void main(String[] args) {

            Patient premierPatient=new Patient();
            premierPatient.setNom("Cheddadi");
            premierPatient.setPrenom("Jihane");
            premierPatient.setTaille(1.64);
            premierPatient.setPoid(74.3);
            premierPatient.setAge(29);
            System.out.println("nom : "+premierPatient.getNom());
            System.out.println("prenom : "+premierPatient.getPrenom());
            System.out.println("age : "+premierPatient.getAge());
            System.out.println("imc :"+premierPatient.imc());
            System.out.println("Taille : "+premierPatient.getTaille());
            System.out.println("Poids : "+premierPatient.getPoid());
        }
    }