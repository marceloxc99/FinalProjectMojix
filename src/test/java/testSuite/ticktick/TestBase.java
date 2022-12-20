package testSuite.ticktick;

import page.ticktick.LeftPanel;
import page.ticktick.ListSection;
import page.ticktick.LoginPage;
import page.ticktick.MainPage;
import util.GetProperties;

public class TestBase {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ListSection listSection = new ListSection();
    LeftPanel leftPanel = new LeftPanel();

    String user = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();
}
