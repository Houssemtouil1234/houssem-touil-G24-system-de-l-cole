public class semestre {
	 private int id;
	    private String nom;
	    public semestre (int id , String nom) {
	        this.id = id;
	        this.nom = nom;
	    }
	    public void afficher() {
	        System.out.println("ID du semestre: " + id);
	        System.out.println("Nom du semestre: " + nom);
	     }
	}

