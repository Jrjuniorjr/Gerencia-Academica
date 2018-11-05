package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLUtil {
private static Properties properties;
    
    static{
        propertie s= new Properties();
        try {
            properties.load(new FileInputStream("PropertiesSQL.properties"));
        } catch (FileNotFoundException ex) {
           System.out.println("Arquivo PropertiesSql.properties nao encontrado!");
        } catch (IOException ex) {
           System.out.println("Erro ao ler arquivo PropertiesSql.properties");
        }
    }
    
    public static Properties getProperties(){ 
        if(properties == null){
            properties = new Properties();
            try {
                properties.load(new FileInputStream("PropertiesSql.properties"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return properties;
    }

}
