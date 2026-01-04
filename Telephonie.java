public class Telephonie extends Produit {

    public Telephonie(String nom, double prixHT) {
        super(nom, prixHT);
    }

    @Override
    public double getPrixTTC() {
        return (this.prixHT * 1.20) + 2.50;
    }

    @Override
    public String toString() {
        return "[HIGH-TECH] " + super.nom;
    }
}