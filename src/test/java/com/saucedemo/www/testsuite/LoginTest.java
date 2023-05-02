package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

        LoginPage loginPage = new LoginPage();

   @Test
   public void userShouldLoginSuccessfullyWithValidCredentials(){
       loginPage.enterUserName("standard_user");
       loginPage.enterPassword("secret_sauce");
       loginPage.clickOnLoginButton();
       String expectedText = "Products";
       System.out.println("expectedText"  +  expectedText);
       String actualText = loginPage.getProductsText();
       System.out.println("actualText"  +  actualText);
       Assert.assertEquals(loginPage.getProductsText(),expectedText,"Text doesn't match");

   }
  @Test
  public void verifyThatSixProductsAreDisplayedOnPage(){
      loginPage.enterUserName("standard_user");
      loginPage.enterPassword("secret_sauce");
      loginPage.clickOnLoginButton();
      String expectedNumberOfProducts = "6";
      System.out.println("expectedNumberOfProducts"  +  expectedNumberOfProducts);
      String actualNumberOfProducts = String.valueOf(loginPage.getCountProductsOnList());
      System.out.println("actualNumberOfProducts"  +  actualNumberOfProducts);
      Assert.assertEquals(actualNumberOfProducts,expectedNumberOfProducts,"Total number of products");


  }


}
