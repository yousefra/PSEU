import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {
    private static String XML_STRING =
            "<root>\n" +
            "  <worried>all</worried>\n" +
            "  <deep>\n" +
            "    <also>nice</also>\n" +
            "    <sheep>\n" +
            "      <also>-1680238763</also>\n" +
            "    </sheep>\n" +
            "    <tropical>1661708281.6961722</tropical>\n" +
            "    <gather>molecular</gather>\n" +
            "  </deep>\n" +
            "  <over>-254144732.35029173</over>\n" +
            "  <chosen>effort</chosen>\n" +
            "</root>";

    private static String JSON_STRING =
            "{\"root\": {\n" +
            "    \"over\": -2.5414473235029173E8,\n" +
            "    \"deep\": {\n" +
            "        \"tropical\": 1.6617082816961722E9,\n" +
            "        \"also\": \"nice\",\n" +
            "        \"gather\": \"molecular\",\n" +
            "        \"sheep\": {\"also\": -1680238763}\n" +
            "    },\n" +
            "    \"worried\": \"all\",\n" +
            "    \"chosen\": \"effort\"\n" +
            "}}";

    @Test
    public void XMLToJSONTest() {
        UsersInterface users = new Users(XML_STRING);
        DataAdapter adapter = new DataAdapterXMLToJSON(users);

        assertEquals(JSON_STRING, adapter.getData());
    }
}