package ERPtrainingsampleproject.Maveneclipseproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecuter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


  public class TestArgos
   {
	public static WebDriver driver;
	private static JavascriptExecuter JavascriptExecuter;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver/geckodriver.exe");	
		driver = new FirefoxDriver();
		
		LaunchArgosUrl();
		searchproduct();
		Thread.sleep(1000);
		SelectProduct();
		Thread.sleep(2000);
		Gototrolley();
		
		
			}		



	public static void LaunchArgosUrl() {
		driver.get("https:www.argos.co.uk/");
		System.out.println("Pass - Argos Website loaded");
	}
   public static void searchproduct() {
	   WebElement searchbox=driver.findElement(By.xpath("//input[@id='searchTerm']"));
			searchbox.sendKeys("6875136");
			WebElement searchButton=driver.findElement(By.xpath("//button[@class='_2mKaC']"));
			searchButton.click();
			driver.findElement(By.xpath("//span[@class='product-title']"));
			Boolean AppleMacbookAirDisplayed = driver.findElement(By.xpath("//h1[@class='h2 product-name-main']"))
					.isDisplayed();

			if (AppleMacbookAirDisplayed) {
				System.out.println("Pass - product loaded");
			} else {
				System.out.println("Fail - product not loaded");
			}
			}
   
   public static void SelectProduct() throws InterruptedException {
		Select dropdownproduct = new Select(driver.findElement(By.id("add-to-trolley-quantity")));
		dropdownproduct.selectByIndex(0);
dropdownproduct.selectByIndex(0);
JavascriptExecuter = (JavascriptExecuter) driver;
Thread.sleep(2000);
WebElement Addtotrolley = driver.findElement(By.xpath("\"//button[@class='Buttonstyles__Button-q93iwm-2 klBGXd']\""));

System.out.println("Pass - Product added to trolley");

   }
   
  

public static void Gototrolley() {
	   WebElement Gototrolley=driver.findElement(By.xpath("//a[@class='Buttonstyles__Button-q93iwm-2 klBGXd']"));
	   Gototrolley.click();
	   System.out.println("Pass - Trolley page loaded");
	   
   }
	   
   private static void wishlistlink() {
	  
			WebElement Wishlistlink = driver.findElement(By.xpath("//header[@id='haas-v2']//a[3]"));
			Wishlistlink.click();
			System.out.println("Pass - Wishlist page loaded");
		
		}
		private static void startshopping() {
			
			WebElement Startshopping = driver.findElement(By.xpath("//a[@class='button WishlistEmpty__button__MlafK']"));
			Startshopping.click();

			driver.navigate().to("https://www.argos.co.uk/");
			System.out.println("Pass - Argos home page loaded");
		}
		
		
		public static void Clickstore() {
			WebElement Clickstore = driver.findElement(By.xpath("//span[@class='_3l0Ci'][contains(text(),'Stores')]"));
			Clickstore.click();
			System.out.println("Pass - Clicked on Store menu");
		}

		public static void Storefinder() {
			WebElement Textbox = driver.findElement(By.name("search"));
			Textbox.sendKeys("ig26fe");
			WebElement SearchButton = driver.findElement(By.xpath("//button[@class='sc-search-bar-btn btn btn-block']"));
			SearchButton.click();
			System.out.println("Pass - store finder for the postcode worked successfully");
		}

		public static void GoToTrolley1() {
			WebElement Trolley = driver.findElement(By.xpath("//header[@id='haas-v2']//a[4]"));
			Trolley.click();
			System.out.println("Pass - Trolley page loaded again!");
		}
		
		
		public static void DeliveryMethod() throws InterruptedException {
			WebElement Deliverypostcode = driver.findElement(By.xpath(
					"//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']"));
			Deliverypostcode.sendKeys("ig26fe");

			Thread.sleep(1000);

			WebElement Delivery = driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden "));
		}
			public static void ContinueWithDelivery(){
			
				WebElement continuewithdelivery = driver
						.findElement(By.xpath("//span[contains(text(),'Continue with delivery')]"));
				continuewithdelivery.click();
				System.out.println("Pass - Continue with Delivery option");
			}
				
				public static void Createaccount() {
					WebElement Createaccountlink = driver.findElement(By.xpath("//a[contains(text(),'Create an account now')]"));
					Createaccountlink.click();

					WebElement enterEmailAddress = driver.findElement(By.id("email"));
					enterEmailAddress.sendKeys("Roja1133@gmail.com");

					WebElement continueWithEmailAddress = driver
							.findElement(By.xpath("//button[@class='Buttonstyles__Button-q93iwm-2 buQekk']"));
					continueWithEmailAddress.click();
					System.out.println("Pass - Create account option selected");
						
				}
				public static void Deliverydetails() throws InterruptedException {
					Select drptitle = new Select(driver.findElement(By.id("delivery_personTitle")));
					drptitle.selectByValue("Mrs");

					WebElement Firstname = driver.findElement(By.id("delivery_firstName"));
					Firstname.sendKeys("Roja");

					WebElement Lastname = driver.findElement(By.id("delivery_lastName"));
					Lastname.sendKeys("Cherukuri");

					WebElement Mobiln0 = driver.findElement(By.id("delivery_phone"));
					Mobiln0.sendKeys("+447740828045");
					
					Thread.sleep(2000);


					WebElement postcode = driver.findElement(By.id("lookupPostcode"));
					postcode.sendKeys("Hp2 7Dg");
					Thread.sleep(1000);


					WebElement findaddress = driver.findElement(By.xpath("//button[@name='findAddress']"));
					findaddress.click();

					

					Select SelectAddress = new Select(driver.findElement(By.xpath("//select[@id='addressResults']")));
					SelectAddress.selectByIndex(13);
  
					Thread.sleep(2000);

					WebElement confirmAddress = driver.findElement(By.xpath("//button[@name='continue']"));
					confirmAddress.click();

					System.out.println("Pass - Delivery details entered and address confirmed using address finder");
				
	}}