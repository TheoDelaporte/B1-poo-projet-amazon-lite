
public abstract class Produit {

    protected String nom;
    protected double prixHT;

    public Produit(String nom, double prixHT) {
        this.nom = nom;
        this.prixHT = prixHT;
    }

    public abstract double getPrixTTC();

    public String toString() {
        return "Produit : " + this.nom + " | Prix HT : " + this.prixHT + " €";
    }

    public String getNom() {
        return this.nom;
    }
}
