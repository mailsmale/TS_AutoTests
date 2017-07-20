package entities;

import org.openqa.selenium.By;
import pages.BasePage;

/**
 * Created by userno-pass on 7/20/17.
 */
public class MagazineRecentArticleEntity extends BaseEntity {

    String categoryName;
    String title;
    String authorName;
    String datePublished;

    public MagazineRecentArticleEntity(String categoryName, String title, String authorName, String datePublished) {
        this.categoryName = categoryName;
        this.title = title;
        this.authorName = authorName;
        this.datePublished = datePublished;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }





}
