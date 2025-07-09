package ump.propertiescomparator.util;

public class Logger {
    private static Logger instance ;
    private Logger(){
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance ;
    }
    public static void erreur(String msg){
        System.err.println("ERREUR :"+msg);
    }
    public static void info(String msg){
        System.out.println("INFO :"+msg);
    }
}
