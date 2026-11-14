package dataproviders;

import org.testng.annotations.DataProvider;

public class EmailData {
    @DataProvider (name = "Emails")
    public Object[][] Emails()
    {
        return new Object[][]{
                {"John@Doe.com"},
                {"Test@test.com"},
                {""},
        };
    }
}
