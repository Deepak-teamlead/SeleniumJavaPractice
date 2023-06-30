package selenium_practice;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;

public class Reading_Excel_Data_APache_POI {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("./src/test/java/files/Practice.xlsx"); // ./src/test/java/files/Practice.xlsx
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        System.out.println(sheet.getLastRowNum());
    }
}
