package page.ticktick;

import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Label loginLabel = new Label(By.xpath("//li[5]/a[@href='/signin']"));
}
