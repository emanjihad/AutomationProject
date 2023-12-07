package firstautomationprojectPSUT;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.TextField;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyTestCaese {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	
	public void setup() {
		driver.get("http://127.0.0.1:5500/myfile.html");
		driver.manage().window().maximize();
	}
	
	@Test(invocationCount = 10)
	public void myFirstTest() throws InterruptedException {
		  
		  
		  
		 
		  Random rand = new Random();
		  
		  String[] randomColor = {"#00ced1","00ced1","00ced1","00ced1"};
		  
		  String[] randomDate = {"05/01/1992","04/03/1998","03/06/2000"};
		  
		  String[] randomMonth = {"October","November","December","Augest","Jule"};
		  
		  String[] randomUsername = {"ahmad","mohamad","fahd","fawzi"};
		  String[] randomPasword = {"300ced1","340ced1","030ced1","00ced1"};
		  
		  int randomIndexColor = rand.nextInt(randomColor.length);
		  
		  int randomIndexDate = rand.nextInt(randomDate.length);
		  
		  int randomIndexMonth = rand.nextInt(randomMonth.length);
		  
		  int randomIndexusername = rand.nextInt(randomUsername.length);
		  int randomIndexpasword = rand.nextInt(randomPasword.length);
		  
		  
        WebElement colorInput = driver.findElement(By.name("select the colore"));
        
        WebElement dateInput = driver.findElement(By.name("select the date"));
       
        
        
        WebElement monthInput = driver.findElement(By.name("select the month"));
        
        WebElement userInput = driver.findElement(By.name("select the username"));
        
        WebElement paswordInput = driver.findElement(By.name("select the password"));
        
        		
		  
		  colorInput.sendKeys(randomColor[randomIndexColor]);
		  dateInput.sendKeys(randomDate[randomIndexDate]);
		  monthInput.sendKeys(randomMonth[randomIndexMonth]);
		  
		  userInput.sendKeys(randomUsername[randomIndexusername]);
		  
		  paswordInput.sendKeys(randomPasword[randomIndexpasword]);
		  
		  Thread.sleep(2000);
		  userInput.clear();
		  paswordInput.clear();
		  
		  
		
		
		  
		  
		  
		  
		  
			 
		  
		 
		  
		
		
	}
	
	
	
	
	
	
	@AfterTest
	public void  postTesting() {}
	
	

}


