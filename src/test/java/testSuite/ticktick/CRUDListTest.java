package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDListTest extends TestBase {
    @Test
    public void verifyCRUDList() throws InterruptedException {
        String listCreated="MarceloEquiseList"+new Date().getTime();
        String listUpdated="NewListName"+new Date().getTime();

        mainPage.loginLabel.click();
        loginPage.emailTextBox.setText(user);
        loginPage.passwordTextBox.setText(password);
        loginPage.signInButton.click();
        //verification

        listSection.addNewListButton.click();
        listSection.newListNameTextBox.setText(listCreated);
        listSection.saveButton.click();
        Assertions.assertTrue(listSection.isListDisplayed(listCreated), "ERROR! List was not created");
        Thread.sleep(1000);

        listSection.getOptionsListLabel(listCreated).click();
        listSection.editListLabel.click();
        listSection.newListNameTextBox.selectAllandReplace(listUpdated);
        listSection.saveButton.click();
        Assertions.assertTrue(listSection.isListDisplayed(listUpdated), "ERROR! List was not created");
        Thread.sleep(1000);

        listSection.getOptionsListLabel(listUpdated).click();
        listSection.deleteListLabel.click();
        listSection.confirmDeleteList.click();
        listSection.getList(listUpdated).waitControlIsNotInThePage();
        Assertions.assertFalse(listSection.isListDisplayed(listUpdated),"ERROR! List was not deleted");
        Thread.sleep(1000);
    }
}
