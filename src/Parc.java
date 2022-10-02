import java.util.ArrayList;

public class Parc {
    
  // VARIABLES
  private String name;
  private ArrayList<Materiel>list;

  // CONSTRUCTEUR PAR DEFAUT
  public Parc() {}

  // CONSTRUCTEUR D'UN PARC
  public Parc(String n) {
    this.name = n;
    this.list = new ArrayList<Materiel>();
  }

  // AJOUTER UN MATERIEL AU PARC
  public void addMaterial(Materiel m) {
    this.list.add(m);
  }

  // SUPPRIMER UN MATERIEL DU PARC
  public void delMaterial(Materiel m) {
    this.list.remove(m);
  }

  // AFFICHER LE PARC AVEC CES MATERIELS
  public void display() {
    System.out.println("Parc : " + name);
  }

  // SAUVEGARDER LE PARC
  public void save() {

  }

  // RESTAURER LE PARC
  public void restore() {

  }

  // MAIN POUR LA CREATION DES PARCS
  public static void main(String[] args) {
    Parc p = new Parc("Parc1");
    Materiel m1 = new Materiel("Routeur");
    Materiel m2 = new Materiel("Switch");
    p.addMaterial(m1);
    p.addMaterial(m2);
    p.display();
  };
}
