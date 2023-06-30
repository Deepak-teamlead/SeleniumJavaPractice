package selenium_practice;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_Selenium {

    public static void main(String[] args) throws Exception{
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("./src/test/java/config/practice.properties");
        prop.load(fis);
        System.out.println("firstname is: "+prop.getProperty("firstname"));
        System.out.println("lastname is: "+prop.getProperty("lastname"));
        System.out.println("state is: "+prop.getProperty("state"));
    }

}
