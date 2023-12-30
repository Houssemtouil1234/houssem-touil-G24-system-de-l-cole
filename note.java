
public class Note {
    private int idNote;
    private float note;
    private int etudiantId;
    private int moduleId; 
    public Note(int idNote, float note, int etudiantId, int moduleId) {
        this.idNote = idNote;
        this.note = note;
        this.etudiantId = etudiantId;
        this.moduleId = moduleId;
    }
    public void afficher() {
        System.out.println("ID de la note: " + idNote);
        System.out.println("Note: " + note);
        System.out.println("ID de l'étudiant: " + etudiantId);
        System.out.println("ID du module: " + moduleId);
    }
}


