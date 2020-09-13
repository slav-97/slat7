using System.Collections.Generic;
using OpenQA.Selenium;
using SeleniumExtras.PageObjects;
using PageFactory = SeleniumExtras.PageObjects.PageFactory;

namespace PageObject.Page_Models
{
    public class TrainpalHomePage
    {
        private readonly IWebDriver _driver;
        private readonly string _dateFieldClass = "\"date-head_0350a\"";

        [FindsBy(How = How.XPath, Using = "//div[@class=\"active_1a1d7\"]")]
        private IWebElement _countryTab;

        [FindsBy(How = How.XPath, Using = "//div[@class=\"cm-date_fa53b\"]")]
        private IWebElement _calendarField;

        public IWebElement CalendarPrevMonthButton => GetWebElement($"//div[@class={_dateFieldClass}]/div[1]");

        public IWebElement CalendarNextMonthButton => GetWebElement($"//div[@class={_dateFieldClass}]/div[2]");

        public TrainpalHomePage(IWebDriver driver)
        {
            _driver = driver;
            PageFactory.InitElements(_driver, this);
        }

        public IEnumerable<IWebElement> GetCalendarDates()
        {
            var datesList = GetWebElement("//ul[@class=\"day-wrap_b13a0\"]");
            return datesList.FindElements(By.TagName("li"));
        }

        public void OpenCalendar()
        {
            _countryTab.Click();
            _calendarField.Click();
        }

        private IWebElement GetWebElement(string xPath)
        {
            return _driver.FindElement(By.XPath(xPath));
        }
    }
}
