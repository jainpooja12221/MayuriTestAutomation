package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert; 


public class Test {

WebDriver driver;



@Given("^user is on Home page$")
public void user_is_on_Home_page()
{
	System.setProperty("webdriver.gecko.driver", "E:\\Learning\\Installation_Setup\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://www.automationPractice.com"); 
   
}

@When("^user navigates to sign in page$")
public void user_navigates_to_sign_in_page()
{
	
	driver.findElement(By.linkText("Sign in")).click();
}

//Code for valid scenario
@When("^user enters valid \"(.*?)\"$")
public void user_enters_valid(String email)
{
	driver.findElement(By.id("email_create")).sendKeys(email);
       
}

@When("^user clicks on Create an account$")
public void user_clicks_on_Create_an_account()
{
	driver.findElement(By.id("SubmitCreate")).click();
}

@Then("^user should be able to register successfully$")
public void user_should_be_able_to_register_successfully() 
{
	
	if(driver.findElement(By.id("submitAccount"))!= null)
	{
		System.out.println("Element is Present");
	}
	else
	{
		System.out.println("Element is Absent");
	}
	
	driver.close();
}

//Code for Invalid scenario
@When("^user enters invalid \"([^\"]*)\"$")
public void user_enters_invalid(String emailAddress)
{
	driver.findElement(By.id("email_create")).sendKeys(emailAddress);
}


@SuppressWarnings("deprecation")
@Then("^error message should be displayed$")
public void error_message_should_be_displayed()
{
	String actualError = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();
	System.out.println(actualError);
	String expectedError = "Invalid email address.";
	//Assert.assertEquals(expectedError, actualError);
	
	/* if(actualError!=expectedError)
	{
		System.out.println("Testcase Failed");
	}
	else
	{
		System.out.println("Testcase Passed");
	} */
	
	if(actualError.compareTo(expectedError)==0)
	{
		System.out.println("Testcase Passed");
	}
	else
	{
		System.out.println("Testcase Failed");
	}
	driver.quit();
}


}


