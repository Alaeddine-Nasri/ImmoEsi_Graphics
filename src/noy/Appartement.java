package noy;

import java.io.Serializable;
import java.time.LocalDate;

public class Appartement extends Habitable implements Serializable {
    private int etage;
    private boolean duplex;
    private boolean simplexe;
    private boolean studio;
    private boolean ascenseur;

    public Appartement(String adresse, Wilaya wilaya, float surface, Proprietaire proprietaire, TypeDeTransaction transaction, float prix, boolean negociable, String descriptif, LocalDate date, String photos, int nbr_pieces, Boolean meuble, int etage, boolean duplex) {
        super(adresse, wilaya, surface, proprietaire, transaction, prix, negociable, descriptif, date, photos, nbr_pieces, meuble);
        this.etage = etage;
        this.duplex = duplex;
    }
    public Appartement(String adresse, Wilaya wilaya, float surface, Proprietaire proprietaire, TypeDeTransaction transaction, float prix, boolean negociable, String descriptif, LocalDate date, String photos, int nbr_pieces, Boolean meuble, int etage, boolean duplex,boolean ascenseur,boolean studio) {
        super(adresse, wilaya, surface, proprietaire, transaction, prix, negociable, descriptif, date, photos, nbr_pieces, meuble);
        this.etage = etage;
        this.duplex = duplex;
        this.ascenseur=ascenseur;
        this.studio=studio;
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.println("Etage "+etage);
        if(duplex) System.out.println("Ce bien est un duplexe");
        if(simplexe) System.out.println("Ce bien est un simplexe");
        if (studio) System.out.println("Ce bien est in studio");
        if(ascenseur) System.out.println("Ascenseur disponible");
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
            if (etage < 3){
                money = money + PRIX_2;
            }
        }

        else if (getTransaction() == TypeDeTransaction.location){
            if(getSurface() <= 60){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*1)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2){
                    money = getPrix() + (getPrix()*15)/PRIX_3;
                }
            }
            else if((getSurface() > 60) && (getSurface() <= 150)){
                if (getWilaya().prixMetreCarre <= PRIX_2){
                    money = getPrix() + (getPrix()*2)/PRIX_4;
                }
                else if (getWilaya().prixMetreCarre > PRIX_2) {
                    money = getPrix() + (getPrix() * 25) / PRIX_3;
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
            if (etage < 3){
                money = money + 5000;
            }
            else if ((etage > 5) && !ascenseur){
                money = money - 500*getSurface();
            }
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
            else if ( (getPrix() > PRIX_1) && ( getPrix() <=PRIX_5) ){
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
            if (etage < 3){
                money = money + PRIX_2;
            }
        }
        return money;
    }
}
