import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Produit> panier = new ArrayList<>();

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n--- AMAZON LITE ---");
            System.out.println("1. Ajouter un Livre");
            System.out.println("2. Ajouter un Smartphone");
            System.out.println("3. Voir mon panier");
            System.out.println("4. Payer (Total TTC)");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            
            String nomTemp;
            double prixTemp;

            switch (choix) {
                case 1:
                    System.out.print("Titre du livre : ");
                    scanner.nextLine();
                    nomTemp = scanner.nextLine();
                    System.out.print("Prix HT : ");
                    prixTemp = scanner.nextDouble();
                    
                    panier.add(new Livre(nomTemp, prixTemp));
                    System.out.println("Livre ajouté !");
                    break;

                case 2:
                    System.out.print("Modèle du téléphone : ");
                    scanner.nextLine();
                    nomTemp = scanner.nextLine();
                    System.out.print("Prix HT : ");
                    prixTemp = scanner.nextDouble();

                    panier.add(new Telephonie(nomTemp, prixTemp));
                    System.out.println("Smartphone ajouté !");
                    break;

                case 3:
                    System.out.println("--- VOTRE PANIER ---");
                    if (panier.isEmpty()) {
                        System.out.println("Le panier est vide.");
                    } else {
                        for (int i = 0; i < panier.size(); i++) {
                            Produit p = panier.get(i);
                            System.out.println("[" + i + "] " + p.toString() + " -> " + String.format("%.2f", p.getPrixTTC()) + " € TTC");
                        }
                    }
                    break;

                case 4:
                    double total = 0;
                    
                    System.out.println("--- TICKET DE CAISSE ---");
                    for (Produit article : panier) {
                        double prixArticle = article.getPrixTTC();
                        total += prixArticle;
                        
                        System.out.println("+ " + article.getNom() + " : " + String.format("%.2f", prixArticle) + " €");
                    }
                    System.out.println("------------------------");
                    System.out.println("TOTAL À PAYER : " + String.format("%.2f", total) + " €");
                    
                    continuer = false;
                    break;

                case 5:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }
}