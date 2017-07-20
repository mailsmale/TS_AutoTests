package pages;

import entities.MagazineRecentArticleEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by userno-pass on 7/20/17.
 */
public class MagazineBasePage extends BasePage {

    public MagazinePageHeader header = MagazinePageHeader.Instance;



    protected final By topSlider = By.xpath(".//li[contains(@class,'is-selected') and contains(@class,'slide')]");

    protected final By topSliderActiveCategoryNameSpan  =
            By.xpath(".//*[@class='cat-links']");
    protected final By topSliderArticleTitleLink  =
            By.xpath(".//div[@class='slide-header']/h3/a");
    protected final By topSliderArticleDatePublishedSpan  =
            By.xpath(".//span[@class='entry-date']");

    private String recentPostArticlePath =
            ".//section[@class='recent-posts']/article%s";
    protected By recentPostArticle =
            By.xpath(String.format(recentPostArticlePath, ""));
    protected final By recentPostArticleCategoryName =
            By.xpath(".//span[@class='cat-links']");
    protected final By recentPostArticleTitle =
            By.xpath(".//h3[@class='entry-title']");
    protected final By recentPostArticleAuthorName =
            By.xpath(".//span[@class='entry-author']/a");
    protected final By recentPostArticleDatePublished =
            By.xpath(".//span[@class='entry-date']");

    public MagazineRecentArticleEntity getArticleEntityFromSlider(){
        reporter.info("Getting article entity from slider");
        WebElement slider = findElement(topSlider);
        return new MagazineRecentArticleEntity(
                slider.findElement(topSliderActiveCategoryNameSpan).getText(),
                slider.findElement(topSliderArticleTitleLink).getText(),
                null,
                slider.findElement(topSliderArticleDatePublishedSpan).getText()
        );
    }

    public MagazineRecentArticleEntity getRecentArticleEntityByID(String articleID) {
        reporter.info("Getting article entity by id: " + articleID);
        WebElement article = findElement(By.xpath(String.format(recentPostArticlePath, "[@id='" +  articleID + "']")));
        System.out.println(article.findElement(recentPostArticleCategoryName).getText());
        return new MagazineRecentArticleEntity(
                article.findElement(recentPostArticleCategoryName).getText(),
                article.findElement(recentPostArticleTitle).getText(),
                article.findElement(recentPostArticleAuthorName).getText(),
                article.findElement(recentPostArticleDatePublished).getText()
        );
    }




}
