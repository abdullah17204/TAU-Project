package dataproviders;

import org.testng.annotations.DataProvider;

public class HoversData {
    @DataProvider(name = "indexes")
    public Object[][] indexes()
    {
        return new Object[][] {
                {"1","user1"},
                {"2","user2"},
                {"3","user3"},
        };
    }
}
