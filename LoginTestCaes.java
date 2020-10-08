package CRM;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCaes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.apptivo.com/");
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text() = 'Log In']").click();
		//Test case1:
		driver.findElementById("login_email").sendKeys("mohrith@berijam.com");
		driver.findElementById("login_password").sendKeys("welcome123");
		driver.findElementByXPath("//Button[@type='button']").click();
		Thread.sleep(8000);
		String ErrorMessage1 = driver.findElementById("loginmessage").getText();
		
		System.out.println(ErrorMessage1);
		
		if(ErrorMessage1.contains("Email or Password is incorrect"))
		{ 			System.out.println("Test case 1 is passed"); 		}
		else
		{			System.out.println("Test case 1 is failed");		}
		
		//Test case2:
		driver.findElementById("login_email").clear();
		driver.findElementById("login_email").sendKeys("mohith@berijam.com");
		driver.findElementById("login_password").clear();
		driver.findElementById("login_password").sendKeys("welcorme123");
		driver.findElementByXPath("//Button[@type='button']").click();
		Thread.sleep(5000);		
		String ErrorMessage2 = driver.findElementById("loginmessage").getText();
		
		System.out.println(ErrorMessage2);
		
		if(ErrorMessage2.contains("Email or Password is incorrect"))
		{ 			System.out.println("Test case 2 is passed"); 		}
		else
		{			System.out.println("Test case 2 is failed");		}
		
		//Test case3:
		driver.findElementById("login_email").clear();
		driver.findElementById("login_email").sendKeys("mohyith@berijam.com");
		driver.findElementById("login_password").clear();
		driver.findElementById("login_password").sendKeys("werlcome123");
		driver.findElementByXPath("//Button[@type='button']").click();
		Thread.sleep(5000);
		String ErrorMessage3 = driver.findElementById("loginmessage").getText();
		
		System.out.println(ErrorMessage3);
		
		if(ErrorMessage2.contains("Email or Password is incorrect"))
		{ 			System.out.println("Test case 3 is passed"); 		}
		else
		{			System.out.println("Test case 3 is failed");		}
		
		
				
		//Test case4:
		driver.findElementById("login_email").clear();
		driver.findElementById("login_email").sendKeys("mohith@berijam.com");
		driver.findElementById("login_password").clear();
		driver.findElementById("login_password").sendKeys("welcome123");
		driver.findElementByXPath("//Button[@type='button']").click();
		Thread.sleep(10000);
		
		String username = driver.findElementByXPath("//font[text()='Mohith Mukesh']").getText();
		
		System.out.println(username);
		
		if(username.contains("Mohith"))
		{ 			System.out.println("Test case 4 is passed"); 		}
		else
		{			System.out.println("Test case 4 is failed");		}
		
		
	}

}
