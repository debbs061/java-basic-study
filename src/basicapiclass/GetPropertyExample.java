package basicapiclass;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("[" + key + "]" + value);

        }
    }
}
