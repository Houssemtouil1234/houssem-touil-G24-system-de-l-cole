
abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected int cin;
    protected String email;

    public Personne(int id, String nom, String prenom, int cin, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.email = email;
    }
    public abstract void afficher();
}
