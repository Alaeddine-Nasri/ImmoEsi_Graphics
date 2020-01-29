package noy;

import java.io.Serializable;
import java.time.LocalDate;

public class Terrain extends NonHabitable implements Serializable {

    public Terrain(String adresse, Wilaya wilaya, float surface, Proprietaire proprietaire, TypeDeTransaction transaction, float prix, boolean negociable, String descriptif, LocalDate date, String photos, int nbr_facades, String etat_juridique)  {
        super(adresse, wilaya, surface, proprietaire, transaction, prix, negociable, descriptif, date, photos, nbr_facades, etat_juridique);
    }
    public Terrain(String adresse, Wilaya wilaya) {
        super(adresse, wilaya);
    }
    @Override
    public float calculerprix(){
        float money=0;
        final float PRIX_1= 5000000;
         final float PRIX_2= 50000;
         final float PRIX_3= 1000;
         final float PRIX_4=100;
        final float PRIX_5=15000000;
        final float PRIX_6=70000;
        if (getTransaction() == TypeDeTransaction.vente){
            if ( getPrix() < PRIX_1 ){
                if (getWilaya().prixMetreCarre < PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
            else if ( (getPrix() > PRIX_1) && ( getPrix() <PRIX_5) ){
                if (getWilaya().prixMetreCarre < PRIX_2){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*25)/PRIX_3;
                }
            }
            else if ( getPrix() > PRIX_5 ){
                if (getWilaya().prixMetreCarre <PRIX_6){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_6){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
            }
            if (getNbr_facades() > 1){
                money = money + money*(getNbr_facades()-1)*5/PRIX_3;
            }
        }

        else if (getTransaction() == TypeDeTransaction.location){
            if(getSurface() < 60){
                if (getWilaya().prixMetreCarre <= PRIX_2){
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
            else if(getSurface() > 150){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
        }

        else if (getTransaction() == TypeDeTransaction.echange){
            if ( getPrix() < PRIX_1 ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*3)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*35)/PRIX_3;
                }
            }
            else if ( (getPrix() > PRIX_1) && ( getPrix() <PRIX_5) ){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*25)/PRIX_3;
                }
            }
            else if ( getPrix() > PRIX_5 ){
                if (getWilaya().prixMetreCarre < PRIX_6){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre >= PRIX_6){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
            }
            if (getNbr_facades() > 1){
                money = money + money*(getNbr_facades()-1)*5/PRIX_3;
            }
            if ( getWilaya().matricule != 12 ){
                money = money + ((money*25)/10000);
            }
        }
        return money;
    }
}
