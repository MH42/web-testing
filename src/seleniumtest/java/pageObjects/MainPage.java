package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	private final WebDriver driver;
	// MainToolBar Elements	
	private WebElement fileDropdown;
	private WebElement personalDropdown;
	private WebElement toolsDropdown;
	private WebElement helpDropdown;
	private WebElement logoutButton;
	private WebElement searchInput;
	private WebElement searchButton;
	// FileDropDown Menu Elements
	private WebElement exitFileDropdown;
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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       this.fileDropdown = driver.findElement(By.cssSelector("div[eventproxy='isc_ToolStripMenuButton_0'] table tbody tr td table tbody tr td img"));
//        this.personalDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
//        this.toolsDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[3]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
//        this.helpDropdown = driver.findElement(By.xpath("//div[3]/div/div[2]/div/div[4]/div/table/tbody/tr/td/table/tbody/tr/td[1]"));
        this.logoutButton = driver.findElement(By.xpath("//img[contains(@src,'http://localhost:8080/frontend/sc/skins/Simplicity/images/actions/close.png')]"));
        this.searchInput = driver.findElement(By.name("isc_SearchBox_0"));
        this.searchButton = driver.findElement(By.xpath("//img[contains(@src,'http://localhost:8080/frontend/sc/skins/Simplicity/images/pickers/search_picker.gif')]"));
//        this.exitFileDropdown = driver.findElements(By.cssSelector("div[eventproxy='isc_Menu_0_body'] div table tbody tr[role='menuitem'] td")).get(1);
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
	/**
	 * Searching for given item
	 * @param item to search for
	 */
	public void search(String item){
		searchInput.clear();
		searchInput.sendKeys(item);
		searchButton.click();
	}
	/**
	 * Logging out from MainPage
	 */
	public void logout() throws NotFoundException {
		if(!(logoutButton.isDisplayed())){
			throw new NotFoundException("Logout not found");
		}
		logoutButton.click();
	}
	/**
	 * @return the fileDropdown
	 */
	public WebElement getFileDropdown() {
		return fileDropdown;
	}
	/**
	 * @param fileDropdown the fileDropdown to set
	 */
	public void setFileDropdown(WebElement fileDropdown) {
		this.fileDropdown = fileDropdown;
	}
	/**
	 * @return the personalDropdown
	 */
	public WebElement getPersonalDropdown() {
		return personalDropdown;
	}
	/**
	 * @param personalDropdown the personalDropdown to set
	 */
	public void setPersonalDropdown(WebElement personalDropdown) {
		this.personalDropdown = personalDropdown;
	}
	/**
	 * @return the toolsDropdown
	 */
	public WebElement getToolsDropdown() {
		return toolsDropdown;
	}
	/**
	 * @param toolsDropdown the toolsDropdown to set
	 */
	public void setToolsDropdown(WebElement toolsDropdown) {
		this.toolsDropdown = toolsDropdown;
	}
	/**
	 * @return the helpDropdown
	 */
	public WebElement getHelpDropdown() {
		return helpDropdown;
	}
	/**
	 * @param helpDropdown the helpDropdown to set
	 */
	public void setHelpDropdown(WebElement helpDropdown) {
		this.helpDropdown = helpDropdown;
	}
	/**
	 * @return the logoutButton
	 */
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	/**
	 * @param logoutButton the logoutButton to set
	 */
	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}
	/**
	 * @return the searchInput
	 */
	public WebElement getSearchInput() {
		return searchInput;
	}
	/**
	 * @param searchInput the searchInput to set
	 */
	public void setSearchInput(WebElement searchInput) {
		this.searchInput = searchInput;
	}
	/**
	 * @return the searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}
	/**
	 * @param searchButton the searchButton to set
	 */
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	/**
	 * @return the exitFileDropdown
	 */
	public WebElement getExitFileDropdown() {
		return exitFileDropdown;
	}
	/**
	 * @param exitFileDropdown the exitFileDropdown to set
	 */
	public void setExitFileDropdown(WebElement exitFileDropdown) {
		this.exitFileDropdown = exitFileDropdown;
	}
	
}
