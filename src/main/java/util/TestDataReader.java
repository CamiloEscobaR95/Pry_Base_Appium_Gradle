package util;

import java.util.ResourceBundle;

public class TestDataReader {

    public static ResourceBundle resourceBundle() {
            return ResourceBundle.getBundle("login_credentials");
    }

    public static String getTestData(String key) {
        return resourceBundle().getString(key);
    }
}
