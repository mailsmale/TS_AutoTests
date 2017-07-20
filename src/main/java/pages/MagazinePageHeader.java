package pages;

import org.openqa.selenium.By;

/**
 * Created by userno-pass on 7/20/17.
 */
public class MagazinePageHeader extends BasePage {

    private static MagazinePageHeader instance;
    public static MagazinePageHeader Instance = (instance != null) ? instance : new MagazinePageHeader();

    MagazinePageHeader(){
        instance = Instance;
        waitForPageToLoad();
    }


    private String topMenuItem = ".//div[@id='navbar-main']//a[text()='%s']";
    public MagazineCategoryPage openMagazineSleepCategoryPage(){
        return openMagazineCategoryPage(MagazineCategory.SLEEP);
    }
    public MagazineCategoryPage openMagazineHealCategoryPage(){
        return openMagazineCategoryPage(MagazineCategory.HEAL);
    }
    public MagazineCategoryPage openMagazinePlayCategoryPage(){
        return openMagazineCategoryPage(MagazineCategory.PLAY);
    }
    public MagazineCategoryPage openMagazineInBedWithCategoryPage(){
        return openMagazineCategoryPage(MagazineCategory.IN_BED_WITH);
    }

    private MagazineCategoryPage openMagazineCategoryPage(MagazineCategory category) {
        reporter.info("Open magazine category with the following name: " + category.name());
        clickOnElement(By.xpath(String.format(topMenuItem, category.name())));
        return MagazineCategoryPage.getCategoryPage(category);
    }


}

enum MagazineCategory {
    SLEEP("sleep/"), HEAL("heal/"), PLAY("play/"), IN_BED_WITH("in-bed-with/");
    private String URL;
    MagazineCategory(String URL){
        this.URL = URL;
    }
    public String getURL() {
        return URL;
    }

}
