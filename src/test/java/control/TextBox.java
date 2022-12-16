package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        this.find();
        this.control.sendKeys(value);
    }

    public void cleanSetText(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void selectAllandReplace(String newText){
        this.find();
        this.control.sendKeys(Keys.chord(Keys.CONTROL,"a"), newText);
    }

}
