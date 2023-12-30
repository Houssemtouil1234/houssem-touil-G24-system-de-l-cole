
import java.util.Scanner;
class Enseignant extends Personne {
public Enseignant(int id, String nom, String prenom, int cin, String email) {
        super(id, nom, prenom, cin, email);
   }
    public void afficher() {
        System.out.println("Enseignant:");
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("CIN: " + cin);
        System.out.println("Email: " + email);
    public void modifierNote() {
        System.out.println("Note modifiée avec succès.")
     public void saisieNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir la note: ");
        double note = scanner.nextDouble();
        System.out.println("Note saisie avec succès: " + note)

      
    }
}
    }
}
