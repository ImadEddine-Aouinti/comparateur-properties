package ump.propertiescomparator.comparator;

import ump.propertiescomparator.comparator.impl.AdvancedDiff;
import ump.propertiescomparator.comparator.impl.FuzzyDiff;
import ump.propertiescomparator.comparator.impl.SimpleDiff;
import ump.propertiescomparator.util.Logger;

public class ComparatorFactory {
    public PropertiesComparator getComparator(String type){
        switch (type.toLowerCase()){
            case "simple" :
                return new SimpleDiff();
            case "avance" :
                return new AdvancedDiff();
            case "Fuzzy" :
                return new FuzzyDiff();
            default:
                Logger.erreur("verifier le type de la comparison ");
        }
    }
}
