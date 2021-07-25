package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defination {
	
	
		WebDriver driver;
		@Given("Login Page")
		public void login_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RashmiSanghi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		    
		}



		@When("Click on SignUp Button")
		public void click_on_sign_up_button() {
		   driver.findElement(By.xpath("//a[text()=' Sign up! ']")).click();
		}
		
		@When("Firstname is {string}")
		public void firstname_is(String firstName) {
		  driver.findElement(By.name("firstname")).click();
		  driver.findElement(By.name("firstname")).sendKeys(firstName);
		}
		
		@When("Lastname is {string}")
		public void lastname_is(String lastName) {
			 driver.findElement(By.name("lastname")).click();
			  driver.findElement(By.name("lastname")).sendKeys(lastName);
		}
		
		
		@When("Mail id is {string}")
		public void mail_id_is(String mailId) {
			 driver.findElement(By.name("email")).click();
			  driver.findElement(By.name("email")).sendKeys(mailId);
		   
		}
		
		@When("Usetname is {string}")
		public void usetname_is(String userName) {
			 driver.findElement(By.name("username")).click();
			  driver.findElement(By.name("username")).sendKeys(userName);
		}
		
		
		@When("enter the {string}")
		public void enter_the(String pwd) {
			 driver.findElement(By.name("pass1")).click();
			  driver.findElement(By.name("pass1")).sendKeys(pwd);
			  driver.findElement(By.name("pass2")).click();
			  driver.findElement(By.name("pass2")).sendKeys(pwd);
		}
		
		@Then("click on register")
		public void click_on_register() {
		   driver.findElement(By.name("submit")).click();
		   driver.quit();
		}





}
