/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package propertiesconfig;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 *
 * @author cector
 */
public class PropertiesConfig {
    public static PropertiesConfig instance;
    
    static Properties pro;
    
    private PropertiesConfig(){
        pro = new Properties();
        try{
            pro.load(new FileInputStream("F:\\java\\NetBean_project\\propertiesConfig\\src\\propertiesconfig\\service.properties"));
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public static PropertiesConfig newInstance(){
        if(instance == null){
            instance = new PropertiesConfig();
        }
        return instance;
    }
    
    public static String getProperty(String key){
        if(instance == null){
            instance = PropertiesConfig.newInstance();           
        }
        if(key == null){
            return null;
        }
        String value = pro.getProperty(key);
        String temp = null;
        try{
            temp = new String(value.getBytes("ISO8859-1"), "UTF-8");
        }
        catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return temp;     
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username = PropertiesConfig.getProperty("passwork");
        System.out.println(username);    
    }
    
}
