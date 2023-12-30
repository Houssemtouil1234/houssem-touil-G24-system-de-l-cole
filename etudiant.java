

class Étudiant extends Personne {
    public Étudiant(int id, String nom, String prenom, int cin, String email) {
        super(id, nom, prenom, cin, email);
    }
    public void afficher() {
        System.out.println("Étudiant:");
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("CIN: " + cin);
        System.out.println("Email: " + email);
    }
}