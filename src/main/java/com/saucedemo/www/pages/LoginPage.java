package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    // Enter “standard_user” username
    By userNameField = By.id("user-name");
    // Enter “secret_sauce” password
    By passwordField = By.name("password");
    //Click on ‘LOGIN’ button
    By loginButton = By.xpath("//input[@id='login-button']");
    // Verify the text “Products”
    By productsText = By.xpath("//span[contains(text(),'Products')]");
    // Verify that six products are displayed on page
    By countProductsOnList = By.xpath("//div[@class='inventory_list']//div//div//div[@class='inventory_item_name']");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password) {
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getProductsText(){
        return getTextFromElement(productsText);
    }
    public void verifySixProducts(){
        getTextFromElement(countProductsOnList);
    }
    public int getCountProductsOnList(){
        List<WebElement>productList = driver.findElements(By.xpath(" By.xpath(//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']));"));
        return productList.size();
    }

}
