
  import java.util.Scanner;
public class Module {
    private int id;
    private String nom;
    private int filiereId;
    private int vamesteId;
    private int enseignantId;
    private double note;
    public Module(int id, String nom, int filiereId, int vamesteId, int enseignantId) {
        this.id = id;
        this.nom = nom;
        this.filiereId = filiereId;
        this.vamesteId = vamesteId;
        this.enseignantId = enseignantId;
        this.note = 0.0;
    }
    public void afficher() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Filiere ID: " + filiereId);
        System.out.println("Vameste ID: " + vamesteId);
        System.out.println("Enseignant ID: " + enseignantId);

}
    public void saisieNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la nouvelle note: ");
        double nouvelleNote = scanner.nextDouble();
         this.note = nouvelleNote;
         System.out.println("Note saisie avec succès.");
    }
}
