package PageObjectModel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TestCaseClass {

    private BasePage page;

    @Before
    public void beforeFunction() {
        this.page = new BasePage();
        page.setup();
    }

//    @After
//    public void closeFunction() {
//        page.getDriver().close();
//    }

    /**
     * Login in detailed
     */
    @Test
    public void loginTest() {

        BasePage basePage = new BasePage();
        basePage.setup();
        basePage.visit("https://www.youtube.com/");

        // Go to Sign In Page
        basePage.findElement(LocatorsCSS.signInBtn).click();

        // Login Flow -->
        AuthenticationFlow authenticationFlow = new AuthenticationFlow(basePage.getDriver());
        authenticationFlow.loginUserName("1testselenium1");

        // Wait for element
        basePage.waitForBy(LocatorsCSS.signInPasswordNext);
        authenticationFlow.loginPassword("testselenium");

        // Verify if logged in successfully
        WebElement loginAvatar = basePage.findElement(LocatorsCSS.loginAvatar);
        assertTrue("Login Profile Picture is displayed. Login Successfully", loginAvatar.isDisplayed());
    }

    /**
     * Search and click a term
     */
    @Test
    public void searchAndClickTest() {
        AuthenticationFlow loginFlow = new AuthenticationFlow(page.getDriver());
        loginFlow.login("1testselenium1", "testselenium");

        // search for term and click enter
        page.searchAndClickElement("kitten", LocatorsCSS.firstSearchResult);
    }

    /**
     * Play all music from playlist.
     */
    @Test
    public void playAllMusicTest() {
        AuthenticationFlow loginFlow = new AuthenticationFlow(page.getDriver());
        loginFlow.login("1testselenium1", "testselenium");

        // click myPlayList -> play all music
        page.findElement(LocatorsCSS.myPlaylist).click();
        page.findElement(LocatorsCSS.playAllBtn).click();
    }

    /**
     * Search a song and add it to playlist and verify it's added.
     * If song is already added remove it from playlist.
     */
    @Test
    public void addToPlaylistTest() {
        AuthenticationFlow loginFlow = new AuthenticationFlow(page.getDriver());
        loginFlow.login("1testselenium1", "testselenium");

        // search for term and click enter
        page.searchAndClickElement("maroon", LocatorsCSS.firstSearchResult);

        // click save to playlist
        page.waitForBy(LocatorsCSS.saveToPlayList);
        page.findElement(LocatorsCSS.saveToPlayList).click();

        // click save to playlist checkbox
        page.waitForBy(LocatorsCSS.saveToPlayListCheckbox);

        // get the String attribute of the checkbox element
        String checkboxClassName = page.getDriver().findElement(LocatorsCSS.saveToPlayListCheckbox)
                .findElement(LocatorsCSS.checkbox).getAttribute("class");

        if(!checkboxClassName.contains("checked")) {
            // click checkbox
            page.findElement(LocatorsCSS.saveToPlayListCheckbox).click();

            // wait for added notification
            page.waitForString(LocatorsXPath.addedNotification);
            assertTrue(LocatorsXPath.addedNotification, true);
        } else {
            // click checkbox
            page.findElement(LocatorsCSS.saveToPlayListCheckbox).click();

            // wait for removed notification
            page.waitForString(LocatorsXPath.removedNotification);
            assertTrue(LocatorsXPath.removedNotification, true);
        }

    }

    /**
     * Create a playlist
     */
    @Test
    public void createPlaylistTest() {
        AuthenticationFlow loginFlow = new AuthenticationFlow(page.getDriver());
        loginFlow.login("1testselenium1", "testselenium");

        String searchedTerm = "Maroon";
        // search for term and click enter
        page.searchAndClickElement(searchedTerm, LocatorsCSS.firstSearchResult);

        // click save to playlist
        page.waitForBy(LocatorsCSS.saveToPlayList);
        page.findElement(LocatorsCSS.saveToPlayList).click();

        // click create new playlist
        page.findElement(LocatorsCSS.createNewPlayList).click();

        // enter name of the playlist
        WebElement playListName = page.findElement(LocatorsCSS.playListName);
        page.waitForBy(LocatorsCSS.playListName);
        playListName.click();
        playListName.sendKeys(searchedTerm);

        // click create playlist
        page.findElement(LocatorsCSS.createNewPlayListBtn).click();

        //TODO: distruge playlistul

    }

}
