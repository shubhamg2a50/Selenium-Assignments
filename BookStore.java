package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStore {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://books.toscrape.com/");
	
	String title = driver.getTitle();
	if(title.equals("My Store")) {
		System.out.println("Test Passed Because title is: " + title);
	}
	else {
		System.out.println("Test Failed Because actual title is: " + title);
	}
	
	WebElement header = driver.findElement(By.cssSelector("a[href='catalogue/category/books/nonfiction_13/index.html']"));
	header.click();
	String header1 = driver.getTitle();
	System.out.println(header1);
	
	driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Add to basket'])[1]")).click();
	
	}
}
