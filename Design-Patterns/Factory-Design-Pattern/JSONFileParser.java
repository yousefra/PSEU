import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * @author yousef
 */

public class JSONFileParser implements FileParser {

  private FileReader jsonFile;

  public JSONFileParser(File jsonFile) {
    try {
      this.jsonFile = new FileReader(jsonFile);
    } catch(FileNotFoundException ex) {
      ex.printStackTrace();
    }
  }
  
  @Override
  public String ParseFile() {
    String result = "";
    try{
      JSONParser parser = new JSONParser();
      JSONObject json = (JSONObject) parser.parse(this.jsonFile);
      JSONObject note = (JSONObject) json.get("note");
      String to = (String) note.get("to");
      String from = (String) note.get("from");
      String heading = (String) note.get("heading");
      String body = (String) note.get("body");
      result +=
        "Type: Note\n" +
        "------------------\n" +
        "To: " + to + "\n" +
        "From: " + from + "\n" +
        "Heading: " + heading + "\n" +
        "Body: " + body + "\n" ;
      
    } catch(IOException ex) {
      ex.printStackTrace();
    } catch(ParseException ex) {
      ex.printStackTrace();
    }
    return result;
  }

}