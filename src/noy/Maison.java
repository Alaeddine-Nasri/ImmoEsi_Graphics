package noy;

import java.io.Serializable;
import java.time.LocalDate;

public class Maison extends Habitable implements Serializable {
    protected int nbr_etages;
    protected boolean garage;
    protected boolean jardin;
    protected boolean piscine;
    protected float surface_habitable;

    public Maison(String adresse, Wilaya wilaya, float surface, Proprietaire proprietaire, TypeDeTransaction transaction, float prix, boolean negociable, String descriptif, LocalDate date, String photos, int nbr_pieces, Boolean meuble, int nbr_etages, boolean garage, boolean jardin, boolean piscine, float surface_habitable)  {
        super(adresse, wilaya, surface, proprietaire, transaction, prix, negociable, descriptif, date, photos, nbr_pieces, meuble);
        this.nbr_etages = nbr_etages;
        this.garage = garage;
        this.jardin = jardin;
        this.piscine = piscine;
        this.surface_habitable = surface_habitable;

    }

    public int getNbr_etages() {
        return nbr_etages;
    }

    public boolean isGarage() {
        return garage;
    }

    public boolean isJardin() {
        return jardin;
    }

    public boolean isPiscine() {
        return piscine;
    }

    public float getSurface_habitable() {
        return surface_habitable;
    }

    public Maison(String adresse, Wilaya wilaya, float surface, Proprietaire proprietaire, TypeDeTransaction transaction, float prix, boolean negociable, String descriptif, LocalDate date, String photos, int nbr_etages, boolean garage, boolean jardin, boolean piscine, float surface_habitable) {
        super(adresse, wilaya, surface, proprietaire, transaction, prix, negociable, descriptif, date, photos);
        this.nbr_etages = nbr_etages;
        this.garage = garage;
        this.jardin = jardin;
        this.piscine = piscine;
        this.surface_habitable = surface_habitable;
    }


    public void afficher(){
        super.afficher();
        System.out.println("Surface habitable (en m²)" +surface_habitable);
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Nombre d'etages "+nbr_etages);
        if (jardin) System.out.print("Avec jardin- ");
        if(piscine)
            System.out.println("Avec piscine-  ");

        if(garage) System.out.println("Avec garage- ");
    }

    public float calculerprix(){
        float money=0;
         final float PRIX_1= 5000000;
         final float PRIX_2= 50000;
        final float PRIX_3= 1000;
         final float PRIX_4=100;
         final float PRIX_5=15000000;
         final float PRIX_6=70000;
        if (getTransaction() == TypeDeTransaction.vente){
            if ( getPrix() <= PRIX_1 ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
            else if ( (getPrix() > PRIX_1) && ( getPrix() <= PRIX_5) ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*25)/PRIX_3;
                }
            }
            else if ( getPrix() > PRIX_5 ){
                if (getWilaya().prixMetreCarre <= PRIX_6){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre> PRIX_6){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
            }
            if (garage || jardin || piscine){
                money = money + getPrix()*5/PRIX_3 ;
            }
        }

        else if (getTransaction() == TypeDeTransaction.location){
            if(getSurface() <= 60){
                if (getWilaya().prixMetreCarre<= PRIX_2){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*15)/PRIX_3;
                }
            }
            else if((getSurface() > 60) && (getSurface() < 150)){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2) {
                    money = getPrix() + (getPrix() * 35) / PRIX_3;
                }
            }
            else if(getSurface() >= 150){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
            if (piscine){money = money  + PRIX_2;}
        }

        else if (getTransaction() == TypeDeTransaction.echange){
            if ( getPrix() <= PRIX_1 ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
            else if ( (getPrix() > PRIX_1) && ( getPrix() <= PRIX_5) ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*25)/PRIX_3;
                }
            }
            else if ( getPrix() > PRIX_5 ){
                if (getWilaya().prixMetreCarre <= PRIX_6){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_6){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
            }
            if (garage || jardin || piscine){
                money = money + getPrix()*5/PRIX_3 ;
            }
        }
        return money;
    }

}
