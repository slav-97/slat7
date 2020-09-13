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
	private final String testik = "https://deal.by/p109452829-svetodiodnaya-girlyanda-okno.html?_openstat=by_prosale%3B%D0%BF%D1%80%D0%B0%D0%B7%D0%B4%D0%BD%D0%B8%D1%87%D0%BD%D0%BE%D0%B5+%D0%BE%D1%81%D0%B2%D0%B5%D1%89%D0%B5%D0%BD%D0%B8%D0%B5%3B%D0%A1%D0%B2%D0%B5%D1%82%D0%BE%D0%B4%D0%B8%D0%BE%D0%B4%D0%BD%D0%B0%D1%8F+%D0%B3%D0%B8%D1%80%D0%BB%D1%8F%D0%BD%D0%B4%D0%B0+%D0%BD%D0%B0+%D0%BE%D0%BA%D0%BD%D0%BE+%D0%A8%D1%82%D0%BE%D1%80%D0%B0+3%D0%A52+%D0%BC%3Bsearch";
	private final Logger logger = LogManager.getRootLogger();

	@FindBy(name = "search_term")
	private WebElement Search;

	@FindBy(id = "headline_block")
	private WebElement head;

	@FindBy(xpath = "//*[@data-qaid-id=\"150207\"]")
	private WebElement filt;

	@FindBy(className = "x-header__auth")
	private WebElement incab;

	@FindBy(className = "x-favorites-btn__icon")
	private WebElement like;

	@FindBy(className = "x-header__controls-counter")
	private WebElement mylikes;

	@FindBy(className = "x-product-conversion__item")
	private WebElement bay;

	@FindBy(className = "x-title")
	private WebElement baychek;

	@FindBy(className = "x-shc-total__main-control-holder")
	private WebElement baybutt;

	@FindBy(className = "besida-bubbleButton__root--3d3ek")
	private WebElement chat;

	@FindBy(className = "besida-notice__title--AlrBd")
	private WebElement chatchek;

	@FindBy(className = "besida-icon__root--3SZdl")
	private WebElement chatclose;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div/ul/li[4]/a")
	private WebElement makin1;

	@FindBy(className = "EasyToSellPromo__linkText--WaiT2")
	private WebElement makin2;

	@FindBy(className = "title__root--vWLq8")
	private WebElement makinchek;

	@FindBy(className = "EditClassified__container--2EJKs")
	private WebElement makinchekbutt;

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
		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(like));
		like.click();
		logger.info("add to wishes");
		WebElement cabchek1 = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(mylikes));
		return mylikes.getText();
	}

	public MainPage openItem()
	{
		driver.navigate().to(testik);
		logger.info("item open");
		return this;
	}


	public String addtocard()
	{
		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(bay));
		bay.click();
		logger.info("add to card");
		WebElement cabchek1 = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(baybutt));
		return baychek.getText();
	}

	public String chatOpen()
	{
		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(chat));
		chat.click();
		WebElement cabchek1 = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(chatclose));
		logger.info("chat open");
		return chatchek.getText();
	}

	public String making()
	{
		makin1.click();
		logger.info("my items");
		WebElement cabchek2 = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(makin2));
		makin2.click();
		logger.info("make item");
		WebElement cabchek3 = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(makinchekbutt));
		logger.info("page is open");
		return makinchek.getText();
	}

}
