package ump.propertiescomparator.loader;

import ump.propertiescomparator.util.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesLoader {
    public Map<String,String> load (String filepath) throws IOException {
        Map<String,String> resultatFile = new HashMap<>();
        Properties props = new Properties();
        if(!filepath.endsWith(".properties")){
            Logger.erreur("verifier le type de fichier ");
            throw new IllegalArgumentException("Le fichier doit être un .properties");
        }
        try(FileInputStream file= new FileInputStream(filepath)){
            props.load(file);
        }catch(Exception e){
            Logger.erreur("Erreur lors du chargement du fichier : " + e.getMessage());
            throw e;

        }
        for(String key : props.stringPropertyNames()){
            resultatFile.put(key, props.getProperty(key));
        }
        return resultatFile ;
    }
}
