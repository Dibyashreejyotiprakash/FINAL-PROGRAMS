package FILE_READER;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Reader {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./src/testdata.json"));
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject);
        String name = (String) jsonObject.get("name");
        System.out.println(name);
        String place1=(String)jsonObject.get("place");
        System.out.println(place1);

       /*// loop array
        JSONArray msg = (JSONArray) jsonObject.get("messages");
        Iterator<String> iterator = msg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		*/
	}
}
