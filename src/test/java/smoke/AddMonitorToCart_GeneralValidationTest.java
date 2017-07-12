package smoke;

import enums.ProductTypes;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

//@Listeners(GenerateReport.class)
public class AddMonitorToCart_GeneralValidationTest extends BaseTest {

    String correctPassword = "bettersleep";
    String monitorType = "One Person";

    @Test
    public void addMonitorToCart_GeneralValidationTest(){

        HomePage home = HomePage.Instance;

        home.open();
        home.clickOnShopOurMonitorButton()
            .selectMonitorType(monitorType)
            .clickAddToCart();

        //Assert.assertTrue( home.header.validateMonitorInCart(monitorType) , "Expected Monitor was not found in Cart");
        Assert.assertTrue( home.header.validateItemContentByTitle(ProductTypes.MONITOR.toString(), monitorType), "Expected Monitor was not found in Cart");


    }

}
