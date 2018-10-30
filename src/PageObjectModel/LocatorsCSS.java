package PageObjectModel;

import org.openqa.selenium.By;

public class LocatorsCSS {

// by name
        public static By search = By.name("search_query");
// --> by name <--

// by cssSelector

        // Login Flow Selectors -->
        public static By signInBtn = By.cssSelector("ytd-button-renderer.style-scope:nth-child(5) > a:nth-child(1) " +
            "> paper-button:nth-child(1) > yt-formatted-string:nth-child(1)");

        public static By signInEmail = By.cssSelector("html.CMgTXc body#yDmH0d.nyoS7c.SoDlKd.EIlDfe div.H2SoFe.LZgQXe.TFhTPc " +
            "div#initialView.RAYh1e.LZgQXe.qmmlRd div.xkfVF div#view_container.JhUD8d.SQNfcc.vLGJgb div.zWl5kd " +
            "div.DRS7Fe.bxPAYd.k6Zj8d div.pwWryf.bxPAYd div.Wxwduf.Us7fWe.JhUD8d div.WEQkZc div.bCAAsb " +
            "form content section.TgkVnd div.dMArKd.bxPAYd.k6Zj8d content " +
            "div.cDSmF div.rFrNMe.KSczvd.uyaebd.vHVGub.zKHdkd.sdJrJc.Tyc9J " +
            "div.aCsJod.oJeWuf div.aXBtI.Wic03c div.Xb9hP input#identifierId.whsOnd.zHQkBf"
        );

        public static By signInEmailNext = By.cssSelector("#identifierNext > content:nth-child(3) > span:nth-child(1)");

        public static By signInPassword = By.cssSelector(".I0VJ4d > div:nth-child(1) > input:nth-child(1)");

        public static By signInPasswordNext = By.cssSelector("#passwordNext > content:nth-child(3) > span:nth-child(1)");

        public static By loginAvatar = By.cssSelector("#avatar-btn");

        // --> Login Flow Selectors <--

        // Other Flows->

        public static By myPlaylist = By.cssSelector("ytd-guide-section-renderer.style-scope:nth-child(2) " +
                "> div:nth-child(2) > ytd-guide-entry-renderer:nth-child(3) > a:nth-child(1) > span:nth-child(3)");

        public static By playAllBtn = By.cssSelector("yt-formatted-string.ytd-thumbnail-overlay-side-panel-renderer");

        public static By firstSearchResult = By.cssSelector("ytd-video-renderer.style-scope:nth-child(1) > " +
                "div:nth-child(1) > ytd-thumbnail:nth-child(1) > a:nth-child(1) > yt-img-shadow:nth-child(1) " +
                "> img:nth-child(1)");

        public static By saveToPlayList = By.cssSelector("ytd-button-renderer.style-scope:nth-child(4) " +
                "> a:nth-child(1) > yt-icon-button:nth-child(1) > button:nth-child(1)");

        public static By saveToPlayListCheckbox = By.cssSelector("ytd-playlist-add-to-option-renderer.style-scope:nth-child(2) " +
                "> paper-checkbox:nth-child(1) > div:nth-child(1)");

        public static By checkbox = By.cssSelector("#checkbox");

        public static By createNewPlayList = By.cssSelector("yt-icon.ytd-compact-link-renderer:nth-child(2)");

        public static By playListName = By.cssSelector("#input-1");

        public static By createNewPlayListBtn = By.cssSelector("yt-formatted-string.ytd-button-renderer:nth-child(1)");

        public static By addedToPlalistNotification = By.cssSelector("yt-notification-action-renderer.style-scope:nth-child(2) " +
                "> paper-toast:nth-child(1) > span:nth-child(1)");

        public static By removedFromPlalistNotification = By.cssSelector("yt-notification-action-renderer.style-scope:nth-child(2) " +
                "> paper-toast:nth-child(1) > span:nth-child(1)");



        //public static By removed = By.

        // --> Other Flows <--
// --> by cssSelector <--






}
