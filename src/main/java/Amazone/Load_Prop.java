package Amazone;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Load_Prop {
    static Properties prop;
    static FileInputStream input;
    public String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream("src\\Resources\\java\\Config.properties");
            prop.load(input);
            input.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
