package configReader;

import java.io.*;
import java.util.Properties;

public class propertiesFile {
    static Properties prop=new Properties();
    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
        readPropertiesFile();
    }
    public static void readPropertiesFile(){

        try {
            InputStream input =new FileInputStream("C:/Users/rasik/SelenuimJava/src/test/java/configReader/config.properties");
            prop.load(input);
            System.out.println(prop.getProperty("browser"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writePropertiesFile(){
        try {
            OutputStream output=new FileOutputStream("C:/Users/rasik/SelenuimJava/src/test/java/configReader/config.properties");
            prop.setProperty("result","pass");
            prop.store(output,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
