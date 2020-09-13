package com.epam.ta.page;

import com.epam.ta.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends AbstractPage
{
	private final Logger logger = LogManager.getRootLogger();
	private final String PAGE_URL = "https://my.deal.by/cabinet/sign-in";

	@FindBy(id = "phone_email")
	private WebElement inputLogin;

	@FindBy(id = "phoneEmailConfirmButton")
	private WebElement loginbutt;

	@FindBy(id = "enterPassword")
	private WebElement inputPassword;

	@FindBy(id = "enterPasswordConfirmButton")
	private WebElement passbutt;

	@FindBy(className = "b-content__header")
	private WebElement incab;

	@FindBy(className = "b-content__header-title")
	private WebElement header1;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/ul/li[3]/div/div/div[2]/span")
	private WebElement buttonchek;


	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/ul/li[4]/a/span")
	private WebElement mess;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/div[3]/div[2]/a/span")
	private WebElement buttonchekmess;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/ul/li[6]/a/span")
	private WebElement otziv;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/div[3]/div[2]/a/button")
	private WebElement buttonchekotz;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/ul/li[2]/div/div/div[2]/a")
	private WebElement order;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/div[3]/div[2]/div[2]/a")
	private WebElement buttonchekorder;


	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public LoginPage openPage()
	{
		driver.navigate().to(PAGE_URL);
		logger.info("Login page opened");
		return this;
	}

	public LoginPage login(User user)
	{
		inputLogin.sendKeys(user.getUsername());
		loginbutt.click();
		logger.info("logg in");
		WebElement input = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(inputPassword));
		inputPassword.sendKeys(user.getPassword());
		passbutt.click();
		logger.info("pass in");
		return this;
	}

	public String getLoggedInUserName()
	{
		driver.navigate().refresh();
		driver.navigate().refresh();
		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchek));
		return incab.getText();
	}

	public String openMess()
	{
		driver.navigate().refresh();
		driver.navigate().refresh();

		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchek));
		mess.click();
		WebElement cabchek2 = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchekmess));
		logger.info("messages open");

		return incab.getText();
	}

	public String openOtziv()
	{
		driver.navigate().refresh();
		driver.navigate().refresh();

		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchek));
		otziv.click();
		WebElement cabchek2 = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchekotz));
		logger.info("feedbacks open");

		return incab.getText();
	}

	public String myOrders()
	{
		driver.navigate().refresh();
		driver.navigate().refresh();

		WebElement cabchek = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchek));
		order.click();
		WebElement cabchek2 = new WebDriverWait(driver, 7)
				.until(ExpectedConditions.elementToBeClickable(buttonchekorder));
		logger.info("orders open");

		return header1.getText();
	}


}
