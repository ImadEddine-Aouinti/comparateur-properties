package ump.comparateur;

import java.awt.*;
import java.io.FileInputStream ;
import java.io.IOException;
import java.util.Properties;


public class ChargeProperties {
    public Properties chargement(String path) throws IOException {
        Properties fichier = new Properties();
        try(FileInputStream file = new FileInputStream(path)){
            fichier.load(file);
        }
        return fichier ;
    }
    public void afichage (Properties fichier){
        for(String key : fichier.stringPropertyNames()){
            String value = fichier.getProperty(key);
            System.out.println(key + " = " + value);
        }
    }
}
