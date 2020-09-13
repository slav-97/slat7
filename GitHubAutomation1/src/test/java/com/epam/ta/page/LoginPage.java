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


	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/ul/li[3]/div/div/div[2]/span")
	private WebElement buttonchek;


	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div/div/ul/li[3]/a/span")
	private WebElement mess;


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

		return incab.getText();
	}


}
