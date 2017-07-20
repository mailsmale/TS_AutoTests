package pages;

import org.openqa.selenium.By;

/**
 * Created by userno-pass on 7/20/17.
 */
public class MagazineMainPage extends MagazineBasePage {

    private static MagazineMainPage instance;
    public static MagazineMainPage Instance = (instance != null) ? instance : new MagazineMainPage();
    public MagazineMainPage(){
        pageURL = "/magazine/";
    }


}
