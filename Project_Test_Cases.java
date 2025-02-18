package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Project_Test_Cases {

	ChromeDriver cd;

	@Test
	public void Register() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		cd = new ChromeDriver(co);
		cd.get("https://javabykiran.com/liveproject/index.html");
		WebElement R = cd.findElement(By.className("text-center"));
		R.click();
		WebElement box = cd.findElement(By.id("name"));
		box.sendKeys("Rupali");
		WebElement box1 = cd.findElement(By.id("mobile"));
		box1.sendKeys("987654321");
		WebElement box2 = cd.findElement(By.id("email"));
		box2.sendKeys("rupali@gmail.com");
		WebElement box3 = cd.findElement(By.id("password"));
		box3.sendKeys("abc@pq");
		WebElement box4 = cd.findElement(By.tagName("button"));
		box4.click();
	}

	@Test
	public void LoginWithRegistered() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		cd = new ChromeDriver(co);
		cd.get("https://javabykiran.com/liveproject/index.html");
		WebElement box = cd.findElement(By.id("email"));
		box.sendKeys("rupali@gmail.com");
		WebElement box1 = cd.findElement(By.id("password"));
		box1.sendKeys("abc@pq");
		WebElement box2 = cd.findElement(By.tagName("button"));
		box2.click();
	}
	@Test
	public void LoginWithGiven() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		cd = new ChromeDriver(co);
		cd.get("https://javabykiran.com/liveproject/index.html");
		WebElement box = cd.findElement(By.id("email"));
		box.sendKeys("kiran@gmail.com");
		WebElement box1 = cd.findElement(By.id("password"));
		box1.sendKeys("123456");
		WebElement box2 = cd.findElement(By.tagName("button"));
		box2.click();
	}
	@Test
	public void AddUser() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		cd = new ChromeDriver(co);
		cd.get("https://javabykiran.com/liveproject/index.html");
		WebElement box = cd.findElement(By.id("email"));
		box.sendKeys("kiran@gmail.com");
		WebElement box1 = cd.findElement(By.id("password"));
		box1.sendKeys("123456");
		WebElement box2 = cd.findElement(By.tagName("button"));
		box2.click();
		WebElement u = cd.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a"));
		u.click();
		WebElement AU = cd.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		AU.click();
		WebElement name = cd.findElement(By.id("username"));
		name.sendKeys("Swara");
		WebElement mob = cd.findElement(By.id("mobile"));
		mob.sendKeys("798654321");
		WebElement email = cd.findElement(By.id("email"));
		email.sendKeys("Swara@gmail.com");
		WebElement courses = cd.findElement(By.id("course"));
		courses.sendKeys("Testing");
		WebElement Gender = cd.findElement(By.id("Female"));
		Gender.click();
		WebElement State = cd.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		State.click();
		WebElement MH = cd.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select/option[2]"));
		MH.click();
		WebElement pass = cd.findElement(By.id("password"));
		pass.sendKeys("123@45");
		WebElement Sub = cd.findElement(By.id("submit"));
		Sub.click();
	}
	@Test
	public void  Logout() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		cd = new ChromeDriver(co);
		cd.get("https://javabykiran.com/liveproject/index.html");
		WebElement box = cd.findElement(By.id("email"));
		box.sendKeys("kiran@gmail.com");
		WebElement box1 = cd.findElement(By.id("password"));
		box1.sendKeys("123456");
		WebElement box2 = cd.findElement(By.tagName("button"));
		box2.click();		
		WebElement LO = cd.findElement(By.className("navbar-custom-menu"));
		LO.click();
	}
}