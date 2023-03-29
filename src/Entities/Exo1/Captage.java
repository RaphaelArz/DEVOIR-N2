package Entities.Exo1;

public class Captage
{
    public int getIdCaptage() {
        return idCaptage;
    }

    private int idCaptage;
    private String nom;
    int hauteur;
    private int debitMaximum;

    public Captage(int idCaptage, String nom, int hauteur, int debitMaximum) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMaximum = debitMaximum;
    }
    public double getVolume(){
        return getVolume();
    }
    public String getDescription(){
        return "nom="+nom+"Hauteur="+hauteur+"m";

    }

}
