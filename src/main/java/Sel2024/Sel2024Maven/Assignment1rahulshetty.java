package Sel2024.Sel2024Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1rahulshetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Naveen Kumar");
		driver.findElement(By.name("email")).sendKeys("Naveenkumar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Naveen@123");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		WebElement SE = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select as= new Select(SE);
		
		as.selectByIndex(0);
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.name("bday")).sendKeys("18-06-1996");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		System.out.println("Alert success");
		
	}
	

}
