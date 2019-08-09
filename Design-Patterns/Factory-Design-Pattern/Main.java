import java.io.File;

/*
 * @author yousef
 */

public class Main {
  public static void main(String[] args) {
    try {
      File jsonFile = new File("SI2.xml");
      FileParser parsed = ParserFactory.getParsed(FileType.XML, jsonFile);
      System.out.print(parsed.ParseFile());
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    
  }
}