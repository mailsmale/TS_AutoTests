package pages;

/**
 * Created by userno-pass on 7/20/17.
 */
public class MagazineCategoryPage extends MagazineBasePage {

    private static MagazineCategoryPage instance;
    public MagazineCategoryPage(MagazineCategory category){
        pageURL = "/magazine/category/" + category.getURL();
    }

    public static MagazineCategoryPage getCategoryPage (MagazineCategory category) {
        return new MagazineCategoryPage(category);
    }





}
