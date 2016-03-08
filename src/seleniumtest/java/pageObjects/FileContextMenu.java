package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileContextMenu {
	
	private WebDriver driver;
	private WebElement file;
	private Actions action;
	
	/**
	 * @param driver
	 */
	public FileContextMenu(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(WebElement file) {
		this.file = file;
	}
	
	public void click(String item) throws Exception{
		action = new Actions(driver);
		
		switch (item) {
		case "Download":
			action.contextClick(file)
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Preview":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Cut":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Copy":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Delete":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Add bookmark":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Send by email":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Paste as link":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkout":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Checkin":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Lock":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Unlock":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Index":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark indexable":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark unindexable":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Mark immutable":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		case "Sign":
			action.contextClick(file)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_RIGHT)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.RETURN).build().perform();
			break;
		default:
			throw new Exception("Unknown Item.");
		}
	}

}
