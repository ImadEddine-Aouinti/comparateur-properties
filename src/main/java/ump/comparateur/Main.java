package ump.comparateur;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage : java -cp target/classes ump.comparateur.Main <chemin_fichier_properties>");
            return;
        }
        String cheminFichier1 = args[0];
        String cheminFichier2 = args[1];
        ChargeProperties charger = new ChargeProperties();
        try {
            Properties props1 = charger.chargement(cheminFichier1);
            Properties props2 = charger.chargement(cheminFichier2);
            charger.afichage(props1);
            System.out.println("******************************");
            charger.afichage(props2);
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
