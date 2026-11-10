package dataproviders;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "loginCredentials")
    public Object[][] loginCredentials() {
        return new Object[][] {
                {"tomsmith", "SuperSecretPassword!",true},
                {"TomSmith", "supersecretpassword!",false},
                {"tom", "smith",false},
                {"tomsmith","",false},
                {"","",false},
        };
    }
}
