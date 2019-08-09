import java.io.File;

/*
 * @author yousef
 */

 public abstract class ParserFactory {
   public static FileParser getParsed(FileType type, File file) {
     FileParser result = null;
     switch (type) {
        case JSON:
          result = new JSONFileParser(file);
          break;

        case XML:
          result = new XMLFileParser(file);
          break;
     }
     return result;
   }
 }