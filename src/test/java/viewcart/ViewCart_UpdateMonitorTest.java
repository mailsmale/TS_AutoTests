package viewcart;

import annotations.TestName;
import entities.ItemEntity;
import entities.UserEntity;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;
import utils.EntitiesFactory;
import utils.FileIO;

public class ViewCart_UpdateMonitorTest extends BaseTest {

    @Test
    @TestName(name="Monitor Update test")
    public void viewCart_UpdateMonitorTest() throws Exception {

        //init test entities
        ItemEntity item = EntitiesFactory.getItem( FileIO.getDataFile("Default_Monitor.json") );
        ItemEntity updateditem = EntitiesFactory.getItem( FileIO.getDataFile("Updated_Monitor.json") );

        //init pages
        HomePage home = HomePage.Instance;
        MonitorPage prodPage = MonitorPage.Instance;
        ViewCartPage cartPage = ViewCartPage.Instance;

        //open home page and add Monitor to cart
        home.open();
        home.clickOnShopOurMonitorButton()
                .selectMonitorType(item.getType())
                .clickAddToCart();

        home.header.clickOnViewCartButton().clickOnEditProduct(item.getTitle());

        prodPage
                .selectMonitorType(updateditem.getType())
                .clickUpdateCart();

        Assert.assertTrue(cartPage.itemDisplayedOnViewCartPage(updateditem), "Updated item was not displayed");

    }
}
