package noy;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Proprietaire implements Comparable<Proprietaire>, Serializable {
    protected String nom;
    private String num_tel;
    private String prenom;
    private String mail;
    private String adresse;
    private Boolean Selected= false;
    public static TreeSet<Bien> liste_proprietees =new TreeSet<Bien>();

    public Proprietaire(String nom, String num_tel, String prenom, String mail, String adresse, TreeSet<Bien> liste_proprietees) {
        this.nom = nom;
        this.num_tel = num_tel;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;
        this.liste_proprietees = liste_proprietees;
    }

    public static void setListe_proprietees(TreeSet<Bien> liste_proprietees) {
        Proprietaire.liste_proprietees = liste_proprietees;
    }

    public Boolean getSelected() {
        return Selected;
    }

    public void setSelected(Boolean selected) {
        Selected = selected;
    }

    public Proprietaire(String nom, String num_tel, String prenom, String mail, String adresse) {
        this.nom = nom;
        this.num_tel = num_tel;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;

    }
    public void afficher_biens_proprietaires(){
        Iterator<Bien> iterator= liste_proprietees.iterator();
        while (iterator.hasNext()){
            Bien it=iterator.next();
            it.afficher();
            System.out.println("------------------------------");
        }
    }
    public void afficher_proprietaire(){
        System.out.print("Nom: "+nom); System.out.println("  Prenom : "+prenom);
        System.out.println("adresse mail:  "+mail);
        System.out.println("Numero de telephone: "+num_tel);
        System.out.println("Adresse "+adresse);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proprietaire that = (Proprietaire) o;
        return nom.equals(that.nom) &&
                prenom.equals(that.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }

    @Override
    public int compareTo(Proprietaire proprietaire) {
        if(this.nom.compareTo(proprietaire.nom)>0)
            return 1;
        else return -1;
    }

    public String getNom() {
        return nom;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public TreeSet<Bien> getListe_proprietees() {
        return liste_proprietees;
    }
}
