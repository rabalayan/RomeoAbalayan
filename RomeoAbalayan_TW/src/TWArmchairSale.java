import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TWArmchairSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open website
		driver.get("https://www.templeandwebster.com.au/");
		
		//Select Search textbox and enter 'armchair' and hit Enter key
		driver.findElement(By.cssSelector("[name='keyword']")).click();
		driver.findElement(By.cssSelector("[name='keyword']")).sendKeys("armchair");
		driver.findElement(By.cssSelector("[name='keyword']")).sendKeys(Keys.ENTER);
		
		//Select White primary colour
		driver.findElement(By.xpath("//*[@id=\"att_6561_0\"]/a[5]/span")).click();
		
		//Select Under $250 price range
		driver.findElement(By.xpath("//*[@id=\"att_6561_2\"]/a[1]/span")).click();
		
		//Select Provincial Crossback Armchair
		driver.findElement(By.xpath("//*[@id=\"productbox_ABIN1012\"]/div[2]/div[1]/span/p")).click();
		
		//Select Quantity:2 in the dropdown
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")));
		sel.selectByIndex(1);
		
		//Click Add To Cart button
		driver.findElement(By.xpath("//*[@id=\"sbtn\"]")).click();
		
		//Get the total amount
		String strAmount = driver.findElement(By.xpath("//*[@id=\"txtTotalDisplay\"]")).getText();
		
		//Click No Thanks
		driver.findElement(By.xpath("//*[@id=\"freight_protection_component\"]/div[2]/label[2]/div")).click();
		
		//Click Check out now
		driver.findElement(By.xpath("//*[@id=\"btnCheckout\"]")).click();
		
		//Enter email address
		driver.findElement(By.xpath("//*[@id=\"checkout_login_form\"]/div/input")).sendKeys("romeo.test@mailinator.com");
		
		//Click Continue button
		driver.findElement(By.xpath("//*[@id=\"signinold\"]")).click();
		
		//Enter fullname
		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Romeo Abalayan");
		
		//Enter Address1
		driver.findElement(By.xpath("//*[@id=\"address_1\"]")).sendKeys("Address1");
		
		//Enter Address2
		driver.findElement(By.xpath("//*[@id=\"address_2\"]")).sendKeys("Address2");
		
		//Enter Suburb/Town
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("City");
		
		//Enter Postcode
		driver.findElement(By.xpath("//*[@id=\"postal_code\"]")).sendKeys("1234");
		
		//Enter Mobile Number
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567890");
		
		//Check This is a business address
		driver.findElement(By.xpath("//*[@id=\"shipaddress\"]/div[6]/div/label/span")).click();
		
		//Enter Company Name
		driver.findElement(By.xpath("//*[@id=\"company_name\"]")).sendKeys("Company Name");
		
		//Uncheck Authorise courier to leave parcel unattended
		driver.findElement(By.xpath("//*[@id=\"driver_instructions\"]/div[1]/div/label/span")).click();
		
		//click Continue button
		driver.findElement(By.xpath("//*[@id=\"shipaddress\"]/span/input")).click();
		
	}

}
