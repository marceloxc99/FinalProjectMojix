package page.ticktick;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ListSection {
    public Button addNewListButton = new Button(By.xpath("//section[1]//button[2]"));
    public TextBox newListNameTextBox = new TextBox(By.id("edit-project-name"));
    public Label newListColorLabel = new Label(By.xpath("//div[@style='background-color: white;']"));
    public Button saveButton = new Button(By.xpath("//button[text()='Save']"));
    public Label editListLabel = new Label(By.xpath("//*[text()='Edit']"));
    public Label deleteListLabel = new Label(By.xpath("//*[text()='Delete']"));
    public Button confirmDeleteList = new Button(By.xpath("//button[text()='Delete']"));

    public ListSection(){}

    public boolean isListDisplayed(String nameList){
        Label listCreated = new Label(By.xpath("//button/p[text()='"+nameList+"']"));
        return listCreated.isControlDisplayed();
    }
    public Label getOptionsListLabel(String nameList){
        Label optionsListLabel = new Label(By.xpath("//button[*='"+nameList+"']//*[name()='use' and @*='#more-for-folder']"));
        return optionsListLabel;
    }
    public Label getList(String nameList){
        Label list = new Label(By.xpath("//button/p[text()='"+nameList+"']"));
        return list;
    }
}
