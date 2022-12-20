package testSuite.ticktick;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;
import util.GetProperties;

import java.util.Date;

public class CRUDListTest extends TestBase {
    String listCreated="MarceloEquiseList"+new Date().getTime();
    String listUpdated="NewListName"+new Date().getTime();
    @Before @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }
    @After @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Given("User logins to ticktick page")
    public void verifyLogin() {
        mainPage.loginLabel.click();
        loginPage.emailTextBox.setText(user);
        loginPage.passwordTextBox.setText(password);
        loginPage.signInButton.click();
        Assertions.assertTrue(leftPanel.user.isControlDisplayed(), "ERROR! Login failed");
    }

    @When("User creates a new list")
    public void verifyCreateNewList() throws InterruptedException {
        listSection.addNewListButton.click();
        listSection.newListNameTextBox.setText(listCreated);
        listSection.saveButton.click();
        Assertions.assertTrue(listSection.isListDisplayed(listCreated), "ERROR! List was not created");
        Thread.sleep(1000);
    }

    @And("User updates the list")
    public void verifyUpdateList() throws InterruptedException {
        listSection.getOptionsListLabel(listCreated).click();
        listSection.editListLabel.click();
        listSection.newListNameTextBox.selectAllandReplace(listUpdated);
        listSection.saveButton.click();
        Assertions.assertTrue(listSection.isListDisplayed(listUpdated), "ERROR! List was not created");
        Thread.sleep(1000);
    }

    @And("User deletes the list")
    public void verifyDeleteList() {
        listSection.getOptionsListLabel(listUpdated).click();
        listSection.deleteListLabel.click();
        listSection.confirmDeleteList.click();
    }

    @Then("List should not be listed")
    public void verifyListWasDeleted() throws InterruptedException {
        listSection.getList(listUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(listSection.isListDisplayed(listUpdated),"ERROR! List was not deleted");
        Thread.sleep(1000);
    }
    @Test
    public void verifyCRUDList() throws InterruptedException {
        verifyLogin();
        verifyCreateNewList();
        verifyUpdateList();
        verifyDeleteList();
        verifyListWasDeleted();
    }
}
