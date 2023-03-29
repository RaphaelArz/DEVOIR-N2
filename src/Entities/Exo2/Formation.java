package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public ArrayList<Participant> getLesParticipants() {
        return lesParticipants;
    }

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents(Formation uneFormation)
    {
        int nbPresent=0;
        for (Participant lesParticipants: uneFormation.getLesParticipants()){
            if (lesParticipants.isEstPresent()){
                nbPresent++;
            }
        }
        return nbPresent;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques(Formation uneFormation)
    {
        double nbkm=0;

                nbkm = nbkm + GetNombreDePresents(uneFormation) * 1.89;

        return nbkm;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence(Formation uneFormation)
    {
        int present=0;
        int inscrit=0;
        for (Participant lesParticipant : uneFormation.getLesParticipants()){
            inscrit++;
            if (lesParticipant.isEstPresent()){
                present ++;
            }
        }
        return present/inscrit;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        return  0;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public int getPrixFormation() {
        return prixFormation;
    }
}
