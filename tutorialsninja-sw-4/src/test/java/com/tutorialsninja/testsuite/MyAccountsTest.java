package com.tutorialsninja.testsuite;

import com.tutorialsninja.basetest.BaseTest;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyAccountsTest extends BaseTest {
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    //1.1 create method with name "selectMyAccountOptions" it has one parameter name "option" of type string
    public void selectMyAccountOptions(String option) {
        listOfProductsElement(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"), option);
    }

    @Test
    // 1.	Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // * 1.1	Click on My Account Link.
        homepage.clickOnAccountLink();

        // * 1.2	Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");

        // * 1.3	Verify the text “Register Account”.
        registerPage.verifyRegisterAccountText();
    }

    @Test
    //2.	Test name verifyUserShouldNavigateToLoginPageSuccessfully()
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // * 2.1	Click on My Account Link.
        homepage.clickOnAccountLink();
        // * 2.2	Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        selectMyAccountOptions("Login");
        // * 2.3	Verify the text “Returning Customer”.
        registerPage.verifyTextReturningCustomerOnLoginPage();
    }

    @Test
    // * 3.	Test name verifyThatUserRegisterAccountSuccessfully()
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        // * 3.1	Click on My Account Link.
        homepage.clickOnAccountLink();

        // * 3.2	Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        selectMyAccountOptions("Register");

        // * 3.3	Enter First Name
        registerPage.enterFirstName("Michel");

        // * 3.4	Enter Last Name
        registerPage.enterLastName("Jackson");

        // * 3.5	Enter Email
        final String randomEmail;
        randomEmail = RegisterPage.randomEmail();
        registerPage.enterEmail(randomEmail);

        // * 3.6	Enter Telephone
        registerPage.enterTelephoneNumber("09876543212");

        // * 3.7	Enter Password
        registerPage.enterPassword("0987654");

        // * 3.8	Enter Password Confirm
        registerPage.enterConfirmPassword("0987654");

        // * 3.9	Select Subscribe Yes radio button
        registerPage.clickOnSubscribeRadioButton();

        // * 3.10	Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicyCheckBox();

        // * 3.11	Click on Continue button
        Thread.sleep(2000);
        registerPage.clickOnContinueButton();

        // * 3.12	Verify the message “Your Account Has Been Created!”
        String actualMessage = myAccountPage.verifyTheMessageYourAccountHasBeenCreated();
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect message displayed!");

        // * 3.13	Click on Continue button
        myAccountPage.clickOnContinueAccountButton();

        // 3.14 Click on My Account Link.
        homepage.clickOnAccountLink();

        // * 3.15	Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        selectMyAccountOptions("Logout");

        // * 3.16	Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");

        // * 3.17	Click on Continue button
        Thread.sleep(2000);
        myAccountPage.clickOnContinueLogOutButton();
    }

    @Test
    // * 4.	Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        // * 4.1	Click on My Account Link.
        homepage.clickOnAccountLink();

        // * 4.2	Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        selectMyAccountOptions("Login");

        // * 4.3	Enter Email address

        registerPage.enterEmail("robert_jackson@gmail.com");

        // * 4.5	Enter Password
        registerPage.enterPassword("12345678");

        // * 4.6	Click on Login button
        myAccountPage.clickOnLoginButton();

        // * 4.7	Verify text “My Account”
        Thread.sleep(2000);
        String actualText = myAccountPage.verifyTheTextMyAccount();
        String expectedText = "My Account";
        Assert.assertEquals(actualText, expectedText, "Incorrect my account text displayed!");

        // 4.8  Click on My Account Link.
        homepage.clickOnAccountLink();

        // * 4.9	Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        selectMyAccountOptions("Logout");

        // * 4.10	Verify the text “Account Logout”
        String actualLogoutText = myAccountPage.verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");

        // * 4.11	Click on Continue button
        myAccountPage.clickOnContinueLogOutButton();
    }
}
