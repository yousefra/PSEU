import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/*
 * @author yousef
 */

public class XMLFileParser implements FileParser {

  private File xmlFile;

  public XMLFileParser(File xmlFile) {
    this.xmlFile = xmlFile;
  }

  @Override
  public String ParseFile() {
    String result = "";
    try {
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(this.xmlFile);

      NodeList nList = doc.getElementsByTagName("note");

      for (int temp = 0; temp < nList.getLength(); temp++) {
        Node nNode = nList.item(temp);
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          result += "Type: Note\n" +
                    "------------------\n" +
                    "To: " + eElement.getElementsByTagName("to").item(0).getTextContent() + "\n" +
                    "From: " + eElement.getElementsByTagName("from").item(0).getTextContent() + "\n" +
                    "Heading: " + eElement.getElementsByTagName("heading").item(0).getTextContent() + "\n" +
                    "Body: " + eElement.getElementsByTagName("body").item(0).getTextContent() + "\n";

        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
}