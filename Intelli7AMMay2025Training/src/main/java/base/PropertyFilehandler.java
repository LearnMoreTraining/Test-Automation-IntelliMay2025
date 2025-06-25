package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilehandler {

    public static String getData(String key , String file){
        FileInputStream fis = null;
        try {

            if(file.equals("framework")){
                fis = new FileInputStream(new File("src/main/resources/config/frameworkconfi.properties"));
            }
            else if(file.equals("data")){
                fis = new FileInputStream(new File("src/main/resources/config/testdata.properties"));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();

        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      return  prop.getProperty(key);
    }
}
