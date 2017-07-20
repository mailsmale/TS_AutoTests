package magazine;

import entities.MagazineRecentArticleEntity;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MagazineCategoryPage;
import utils.BaseTest;

/**
 * Created by userno-pass on 7/20/17.
 */
public class CheckMagazineMainPageSliderArticle extends BaseTest {


    @Test
    public void Magazine_ArticleInSliderCheck() throws Exception {
        HomePage home = HomePage.Instance;
        home.open();
        MagazineCategoryPage categoryPage = home.
                header.clickMagazineItem().
                header.openMagazineSleepCategoryPage();
        MagazineRecentArticleEntity sliderEntity = categoryPage.getArticleEntityFromSlider();
        MagazineRecentArticleEntity entityByID = categoryPage.getRecentArticleEntityByID("post-6317");
        Assert.assertTrue(sliderEntity.getCategoryName().equals(entityByID.getCategoryName()) &&
                                    sliderEntity.getTitle().equals(entityByID.getTitle()) &&
                                    sliderEntity.getDatePublished().equals(entityByID.getDatePublished()) ,"Articles are not equal!");

    }


}
