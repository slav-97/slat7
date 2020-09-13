package com.epam.ta.page;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import com.epam.ta.model.User;
import com.epam.ta.service.UserCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends AbstractPage
{
	private final String BASE_URL = "https://deal.by/";
	private final Logger logger = LogManager.getRootLogger();

	@FindBy(name = "search_term")
	private WebElement Search;

	@FindBy(id = "headline_block")
	private WebElement head;

	@FindBy(xpath = "//*[@data-qaid-id=\"150207\"]")
	private WebElement filt;

	@FindBy(className = "x-header__auth")
	private WebElement incab;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[5]/div/div[3]/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div/div/div/span")
	private WebElement like;

	@FindBy(className = "x-header__controls-counter")
	private WebElement mylikes;


	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}



	@Override
	public MainPage openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Main page is open");
		return this;
	}

	public String retName()
	{
		//WebElement header = new WebDriverWait(driver, 8)
		//		.until(ExpectedConditions.elementToBeClickable(filt));


		logger.info("Returning name is getted");
		try {
			TimeUnit.SECONDS.sleep(7);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return head.getText();
	}

	public MainPage search()
	{

		Search.sendKeys("еда");
		Search.sendKeys(Keys.ENTER);
		logger.info("Search is gone");

		return this;
	}

	public MainPage filter()
	{
		WebElement filter = new WebDriverWait(driver, 9)
				.until(ExpectedConditions.elementToBeClickable(filt));
		filt.click();
		logger.info("Filter is clicked");
		try {
			TimeUnit.SECONDS.sleep(7);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public String getLoggedInUserName()
	{
		WebElement cabchek = new WebDriverWait(driver, 8)
				.until(ExpectedConditions.elementToBeClickable(incab));
		return incab.getText();
	}

	public String addtolist()
	{
		WebElement cabchek = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(like));
		like.click();
		logger.info("add to wishes");

		return mylikes.getText();
	}

}
