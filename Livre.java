public class Livre extends Produit {

    public Livre(String nom, double prixHT) {
        super(nom, prixHT);
    }

    @Override
    public double getPrixTTC() {
        return this.prixHT * 1.055;
    }
    
    @Override
    public String toString() {
        return "[LIVRE] " + super.nom;
    }
}