import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class DataAdapterXMLToJSON implements DataAdapter {
    private UsersInterface users;

    public DataAdapterXMLToJSON(UsersInterface users) {
        this.users = users;
    }

    @Override
    public String getData() {
        return convertXMLToJSON(users.getData());
    }

    public String convertXMLToJSON(String xml) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            String jsonPrettyPrintString = xmlJSONObj.toString(4);
            return jsonPrettyPrintString;
        } catch(JSONException e) {
            return e.toString();
        }
    }
}
