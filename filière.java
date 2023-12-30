
public class Filiere {
    private int id;
    private String nom;
    public Filiere(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public void afficher() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
    }
}


