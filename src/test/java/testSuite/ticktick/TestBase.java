package testSuite.ticktick;

import io.cucumber.java.*;
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
}
