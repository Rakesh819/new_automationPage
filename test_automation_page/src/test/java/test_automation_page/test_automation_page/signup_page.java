package test_automation_page.test_automation_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Start the Page. 
	     EdgeDriver driver = new EdgeDriver();
	     driver.get("https://automationexercise.com/");
	     driver.manage().window().maximize();
	     
	    // 2. Navigate to Sign up and Login Page. 
	     WebElement loGin = driver.findElement(By.xpath("//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[4]/a"));
	     loGin.click();
	     
	     //3. Sign up with Name, E-mail and Click
	     WebElement naMe = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/input[2]"));
	     naMe.sendKeys("RakeshKumar Palaniappan");
	     WebElement emailID = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/input[3]"));
	     emailID.sendKeys("rakesh08111999@gamil.com");
	     WebElement signUp = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[3]/div/form/button"));
	     signUp.click();
	     
	    // 4. Sign up page 
	     
	     //4.1 Radio button
	     WebElement radioButton  = driver.findElement(By.xpath("//*[@id=\'id_gender1\']"));
	     radioButton.click();
	     
	    //5. Password 
	     WebElement Pword = driver.findElement(By.xpath("//*[@id=\'password\']"));
	     Pword.sendKeys("R@kesh_08");
	     
	   // 6. Date Of Birth ( DropDown List )
	     
	    // 6.1 Date
	     WebElement drpDateEle = driver.findElement(By.xpath("//*[@id=\'days\']"));
	     Select drpDate = new Select(drpDateEle);
	     drpDate.selectByVisibleText("8");
	     
	     // 6.2 Month
	     WebElement drpMonthEle = driver.findElement(By.xpath("//*[@id=\'months\']"));
	     Select drpMonth = new Select(drpMonthEle);
	     drpMonth.selectByVisibleText("November");
	     
	     // 6.3 Year
	     WebElement drpYearEle = driver.findElement(By.xpath("//*[@id=\'years\']"));
	     Select drpYear = new Select(drpYearEle);
	     drpYear.selectByVisibleText("1999");
	 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 
	     
	   // 7. CheckBox
		WebElement newsletter = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/div/span/input"));
		newsletter.click();
		newsletter.isSelected();

		WebElement specialoffers = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[7]/div/span/input"));
		specialoffers.click();
		specialoffers.isSelected();
		
	   // 8. First Name
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\'first_name\']"));
		firstName.sendKeys("Rakesh Kumar");
		
	   // 9. Last Name
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\'last_name\']"));
		lastName.sendKeys("Palaniappan");

	   // 10. Company 
		WebElement comPany = driver.findElement(By.xpath("//*[@id=\'company\']"));
		comPany.sendKeys("Home");
	  
	  // 11. Address
		WebElement address1 = driver.findElement(By.xpath("//*[@id=\'address1\']"));
		address1.sendKeys("35 Vijayalakshmi Nagar");
		WebElement address2 = driver.findElement(By.xpath("//*[@id=\'address2\']"));
		address2.sendKeys("Karyanchavadi, Poonamallee");
		
		WebElement countryEle = driver.findElement(By.xpath("//*[@id=\'country\']"));
	    Select country = new Select(countryEle);
	    country.selectByValue("India");
	    
	    WebElement stateEle = driver.findElement(By.xpath("//*[@id=\'state\']"));
	    stateEle.sendKeys("Tamilnadu");
	    
	    WebElement cityEle = driver.findElement(By.xpath("//*[@id=\'city\']"));
	    cityEle.sendKeys("Chennai");
	    
	    WebElement zipCode = driver.findElement(By.xpath("//*[@id=\'zipcode\']"));
	    zipCode.sendKeys("600056");
	    
	    WebElement mobileNumber = driver.findElement(By.xpath("//*[@id=\'mobile_number\']"));
	    mobileNumber.sendKeys("9080747005");
	    
	    WebElement createAccount = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div/div[1]/form/button"));
	    createAccount.click();
	    
	    // 12. Continue
	    WebElement continueButton = driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div/div/a"));
	    continueButton.click();


	}

}
