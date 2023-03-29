package Entities.Exo1;

public class Cuve extends Captage
{
    private int largeur;
    private int longeur;

    public Cuve( int idCaptage, String nom, int hauteur, int debitMaximum,int largeur, int longeur) {
        super(idCaptage,nom,hauteur,debitMaximum);
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public double getVolume(){
        return longeur*largeur;
    }
}
