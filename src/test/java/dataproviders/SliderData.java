package dataproviders;

import org.testng.annotations.DataProvider;

public class SliderData {
    @DataProvider (name = "slider data")
    public Object[][] sliderData(){
        return new Object[][]{
                {1.0},
                {4.0},
        };
    }
}
