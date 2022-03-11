package common;
import org.json.simple.JSONObject;

public class PayloadBuilder {

    public static JSONObject createNewUserObject() {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Morongwa");
        jsonObject.put("job", "Test Engineer");

        return jsonObject;

    }

    public static JSONObject UpdateUserObject() {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Morongwa");
        jsonObject.put("job", "Test Engineer");

        return jsonObject;
    }


}
