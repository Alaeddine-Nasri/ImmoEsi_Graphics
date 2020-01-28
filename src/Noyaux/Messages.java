package Noyaux;

public class Messages {
    protected Bien bienconcerne;
    protected String message;
    protected String nom;
    protected String email;

    public Messages(String message,String email,String nom) {
        this.message = message;
        this.nom = nom;
        this.email = email;
    }



    public void afficher(){
      //  System.out.println("/ Adresse du bien concerné : "+bienconcerne.adresse);
        System.out.println("/ Message : "+message);

    }

    public String getMessage() {
        return message;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }
}
