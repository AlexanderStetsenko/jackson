import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by St on 02.04.2017.
 */
public class RunClass {
    public static void main(String[] args) throws MalformedURLException {
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL("https://gist.githubusercontent.com/anonymous/aaad48dc1830f8360e9fe41ad3d9dc72/raw/a3341d17ade7027abee77ec56601aa022af6faf4/person.json");

        try {
            // Convert JSON string from file to Object
            User user = mapper.readValue(DataJson.jsong, User.class);
            System.out.println(user);

            // Convert JSON string from file to Object
            User user1 = mapper.readValue(new File("E:\\Alex\\project\\JDI\\jackson\\src\\main\\resources\\user.json"), User.class);
            System.out.println(user1);

            //Convert JSON string from file to Object
            User user2 = mapper.readValue(url, User.class);
            System.out.println(user2);

            //Pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(prettyStaff1);

        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
