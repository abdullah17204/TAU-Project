package dataproviders;

import org.testng.annotations.DataProvider;

public class SliderData {
    @DataProvider (name = "slider data")
    public Object[][] sliderData(){
        return new Object[][]{
                {-1.0},
                {0.2},
                {4.0},
                {6.0},
        };
    }
}
