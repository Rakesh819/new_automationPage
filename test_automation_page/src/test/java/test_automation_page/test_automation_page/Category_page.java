package test_automation_page.test_automation_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Category_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    
        /* -------------Categories---------------*/
	

   // 18. categories Veiw products
    WebElement category_Men = driver.findElement(By.xpath("//*[@id=\'accordian\']/div[2]/div[1]/h4/a"));
    category_Men.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //19. Click T-shirt
    WebElement T_shirt = driver.findElement(By.xpath("//*[@id=\'Men\']/div/ul/li[2]/a"));
    T_shirt.click();

  // 20. View Product
    WebElement ViewProduct = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a"));
    ViewProduct.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
  // 21. Add Quantity
    WebElement addQuantity = driver.findElement( By.xpath("//*[@id=\'quantity\']"));
    addQuantity.clear();
    addQuantity.sendKeys("2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
  //22. Add to Cart
    WebElement addToCart =driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
    addToCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  /*  
 // 23. View Cart
    WebElement ViewCart = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[2]/a/u"));
    ViewCart.click();*/
    
   
// 24. Continue Shopping
    WebElement ContinueShopping = driver.findElement(By.xpath("//*[@id=\'cartModal\']/div/div/div[3]/button"));
    ContinueShopping.click();
/*
    WebElement addToCart2 = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[5]/div/div[1]/div[1]/a"));
    addToCart2.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement ContinueShopping1 = driver.findElement(By.xpath("//*[@id=\'cartModal\']/div/div/div[3]/button"));
    ContinueShopping1.click();
    */
    //19. Cart Page
    WebElement cartPage = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[3]/a"));
    cartPage.click();
 /*
    // 20. Delete Product
    WebElement DeleteButton = driver.findElement(By.xpath("//*[@id=\'product-2\']/td[6]/a"));
    DeleteButton.click();
  */  
   //21. Proceed to Checkout
    WebElement ProceedToCheckOut = driver.findElement(By.xpath("//*[@id=\'do_action\']/div[1]/div/div/a"));
    ProceedToCheckOut.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
   // 22. Place the order
    WebElement PlaceTheOrder = driver.findElement(By.xpath("/html/body/section/div/div[7]/a"));
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
    
  //26. Logout
    WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
    logoutButton.click();


	}

}
