package test_automation_page.test_automation_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_page {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
	    driver.get("https://automationexercise.com/");
	    driver.manage().window().maximize();
	    
	    WebElement loGin = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
	    loGin.click();
	    // 13. Email Address
	    WebElement EmailAddress = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/input[2]"));
	    EmailAddress.sendKeys("rakesh08111999@gamil.com");
	    
	    // 14. Password 
	    WebElement PassWord = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/input[3]"));
	    PassWord.sendKeys("R@kesh_08");
	    
	    // 15. Login
	    WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/button"));
	    LoginButton.click();
	    
	    // 16. Product Page
	    WebElement productPage = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[2]/a"));
	    productPage.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	   
	    /*         -----------------Search By Products-----------------------------   */
	    // 17. Search Product
	    WebElement searchProduct = driver.findElement(By.xpath("//*[@id=\'search_product\']"));
	    searchProduct.sendKeys("TSHIRTS");
	    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\'submit_search\']/i"));
	    searchButton.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    // 18. Add to Cart
	    // 18.1 Product One
	    WebElement addToCart1 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
	    addToCart1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\'cartModal\']/div/div/div[3]/button"));
	    continueShopping.click();
	    //18.2 Product Two
	    WebElement addToCart2 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/a"));
	    addToCart2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement continueShopping2 = driver.findElement(By.xpath("//*[@id=\'cartModal\']/div/div/div[3]/button"));
	    continueShopping2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	    //19. Cart Page
	    WebElement cartPage = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[3]/a"));
	    cartPage.click();
	 
	    // 20. Delete Product
	    WebElement DeleteButton = driver.findElement(By.xpath("//*[@id=\'product-2\']/td[6]/a"));
	    DeleteButton.click();
	    
	   //21. Proceed to Checkout
	    WebElement ProceedToCheckOut = driver.findElement(By.xpath("//*[@id=\'do_action\']/div[1]/div/div/a"));
	    ProceedToCheckOut.click();
	    
	   // 22. Place the order
	    WebElement PlaceTheOrder = driver.findElement(By.xpath("//*[@id=\'cart_items\']/div/div[7]/a"));
	    PlaceTheOrder.click();
	   
	  // 23. Payment Details
	    //23.1 Cardholder name 
	    WebElement cardName = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[1]/div/input"));
	    cardName.sendKeys("Rakeshkumar");
	    //23.2 Card Number
	    WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[2]/div/input"));
	    cardNumber.sendKeys("213435677890");
	    //23.3 CCV
	    WebElement ccvNumber = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[3]/div[1]/input"));
	    ccvNumber.sendKeys("322");
	    WebElement expMonth = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[3]/div[2]/input"));
	    expMonth.sendKeys("11");
	    WebElement expYear = driver.findElement(By.xpath("//*[@id=\'payment-form\']/div[3]/div[3]/input"));
	    expYear.sendKeys("2025");
	    //23.4 Place the order
	    WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\'submit\']"));
	    placeOrder.click();
	   
	  // 24. Download Invoice
	    WebElement inVoice = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div/a"));
	    inVoice.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	    
	 //25. Continue 
	    WebElement continueButton = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div/div/a"));
	    continueButton.click();
	    
	//26. Logout)
	    WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
	    logoutButton.click();

	}

}
