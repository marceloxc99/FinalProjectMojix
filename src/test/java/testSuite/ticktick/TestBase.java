package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.ListSection;
import page.ticktick.LoginPage;
import page.ticktick.MainPage;
import session.Session;
import util.GetProperties;

public class TestBase {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ListSection listSection = new ListSection();

    String user = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
