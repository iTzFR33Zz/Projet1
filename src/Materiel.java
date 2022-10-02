public class Materiel {

    // VARIABLES
    private String name;

    // CONSTRUCTEUR PAR DEFAUT
    public Materiel() {
        this.name = new String();
    }

    // CONSTRUCTEUR D'UN MATERIEL  
    public Materiel(String n) {
        this.name = new String(n);
    }

    // AFFICHER LE MATERIEL
    public void display() {
        System.out.println("Material: " + this.name);
    }

    // MODIFIER LE MATERIEL
    public void edit(String n) {
        this.name = n;
    }

    // SUPPRIMER LE MATERIEL
    public void delete() {
        this.name = null;
    }
}