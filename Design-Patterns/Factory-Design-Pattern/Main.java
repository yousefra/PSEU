import java.io.File;
import java.io.FileWriter;

/*
 * @author yousef
 */

public class Main {
  public static void main(String[] args) {
    try {
      // JSON PARSER
      File file = new File("SI1.json");
      FileParser parsed = ParserFactory.getParsed(FileType.JSON, file);

      // XML PARSER
      // File file = new File("SI2.xml");
      // FileParser parsed = ParserFactory.getParsed(FileType.XML, file);
      
      // Write the output
      FileWriter fw = new FileWriter("result.txt");    
      fw.write(parsed.ParseFile());    
      fw.close();

      System.out.println("Done.");

    } catch (Exception ex) {
      ex.printStackTrace();
    }

    
  }
}