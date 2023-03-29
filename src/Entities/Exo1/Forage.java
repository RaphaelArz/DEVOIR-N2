package Entities.Exo1;

public class Forage extends Captage
{
    private int diametre;

    public Forage( int idCaptage,String nom,int hauteur, int debitMaximum,int diametre)
    {
        super(idCaptage,nom,hauteur,debitMaximum);
        this.diametre = diametre;
    }

    public double getVolume(){
        return Math.PI*diametre*hauteur;
    }
}
