import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	private final WebDriver driver;
	// MainToolBar Elements	
	public WebElement fileDropdown;
	public WebElement personalDropdown;
	public WebElement toolsDropdown;
	public WebElement helpDropdown;
	public WebElement logoutButton;
	public WebElement searchInput;
	public WebElement searchButton;
	
	/**
	 * Default Mainpage Constructor
	 * @param driver is the WebDriver to use
	 */
	public MainPage(WebDriver driver) {
		this.driver = driver;
		
		/*
		 * using xpath as location strategy is not optimal
		 * feel free to change
		*/
        this.fileDropdown = driver.findElement(By.xpath("//div[6]/div/div[2]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
        this.personalDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
        this.toolsDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[3]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
        this.helpDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[4]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
        this.logoutButton = driver.findElement(By.xpath("//div[6]/div/table/tbody/tr/td/table/tbody/tr/td[1]/img"));
        this.searchInput = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[8]/div/form/table/tbody[2]/tr[2]/td/table/tbody/tr/td[1]/input"));
        this.searchButton = driver.findElement(By.xpath("/div[6]/div/div[2]/div/div[8]/div/form/table/tbody[2]/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td/span/img"));
        
        }
	public boolean isLoaded(){
		//TODO
		return false;
	}
	public void load(){
		//TODO
	}
	public void close(){
		//TODO
	}
	public void search(String item){
		this.searchInput.sendKeys(item);
		this.searchButton.click();
	}
}
