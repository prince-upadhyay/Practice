import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class OportunityCreation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TC User 2\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        // Disable notifications in Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Create a new ChromeDriver instance with the options
        WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();
        
     // Navigate to the Salesforce login page
        driver.get("https://test.salesforce.com/");

        Thread.sleep(5000);

        // Enter the username
        WebElement usernameField = driver.findElement(By.xpath("//*[@id='username']"));
        usernameField.sendKeys("samyak.wahane@riverbed.com.asm");
        System.out.println("Username entered");

        Thread.sleep(5000);

        // Enter the password
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
        passwordField.sendKeys("Indb1234!@#$");
        System.out.println("Password entered");

        // Click the login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='Login']"));
        loginButton.click();
        
        WebElement search = driver.findElement(By.xpath("//button[normalize-space()='Search...']"));
        search.click();
        System.out.println("Clicked on search");
        Thread.sleep(10000);
        WebElement EnterText = driver.findElement(By.xpath("//input[@placeholder='Search...' and @part='input']"));
        EnterText.sendKeys("Lakshmi Venkatanarasimhan");
        Thread.sleep(5000);
        WebElement User = driver.findElement(By.xpath("//div[@aria-label='Lakshmi Venkatanarasimhan']//div[@class='slds-clearfix slds-text-heading--label-normal slds-show slds-truncate']"));
        User.click();
        EnterText.sendKeys("user detail");
        Thread.sleep(5000);
        WebElement UserDetail = driver.findElement(By.xpath("//div[@title='User Detail']"));
        UserDetail.click();
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement iframeElement = driver.findElement(By.xpath("//td[normalize-space()='Name']"));
        Thread.sleep(5000);
        WebElement iframeElement1 = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Login']"));
        iframeElement1.click();
        
        Thread.sleep(20000);
        driver.navigate().to("https://riverbed--asm.sandbox.lightning.force.com/lightning/r/SBQQ__Quote__c/aBLDV000000AxDE4A0/view");
        Thread.sleep(5000);
        WebElement EditLinesButton=driver.findElement(By.xpath("//button[text()='Edit Lines']"));
        EditLinesButton.click();
        
//        Thread.sleep(5000);
//        JavascriptExecuter js=((JavascriptExecuter)driver);
//        String str = "document.querySelector('#sbPageContainer').shadowRoot.querySelector('#content > sb-line-editor').shadowRoot.querySelector('#actions > sb-custom-action:nth-child(5)').shadowRoot.querySelector('#mainButton')";
   	 
        //    js.executeScript(str+".click();");
      //sb-custom-action/paper-button[text()='Add Products']
      //iframe[@name='vfFrameId_1692363133169']

	}

}
