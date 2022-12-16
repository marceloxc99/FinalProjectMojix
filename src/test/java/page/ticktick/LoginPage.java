package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.xpath("//input[@id='emailOrPhone']"));
    public TextBox passwordTextBox = new TextBox(By.xpath("//input[@id='password']"));
    public Button signInButton = new Button(By.xpath("//button[text()='Sign In']"));
}
