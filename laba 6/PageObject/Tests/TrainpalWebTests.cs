using System;
using System.Linq;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Edge;
using PageObject.Extensions;
using PageObject.Page_Models;

namespace PageObject.Tests
{
    [TestFixture]
    public class TrainpalWebTests
    {
        private IWebDriver _webDriver;

        [SetUp]
        public void StartBrowserEdge()
        {
            _webDriver = new EdgeDriver
            {
                Url = "https://www.mytrainpal.com/"
            };
        }

        [Test]
        public void Trainpal_TryClickOnDateFromPast_DateDisabled()
        {
            var homePage = new TrainpalHomePage(_webDriver);
            var yesterdayDate = DateTime.Now.AddDays(-1);
            homePage.OpenCalendar();
            var dates = homePage.GetCalendarDates();
            var yesterdayElement = dates.FirstOrDefault(d => d.Text.Equals(yesterdayDate.Day.ToString()));
            Assert.IsFalse(!yesterdayElement.IsEnabled("disbled") ||
                           DateTime.Now.Day == 1 && !homePage.CalendarPrevMonthButton.IsEnabled("isClr"));
        }

        [Test]
        public void Trainpal_TryClickOnDateFromFutureMoreThanSixMonth_DateDisabled()
        {
            var homePage = new TrainpalHomePage(_webDriver);
            var tomorrowDate = DateTime.Now.AddDays(1).Day;
            var futureDayElement = GetFutureDay(homePage, tomorrowDate);
            Assert.IsFalse(!futureDayElement.IsEnabled("disbled") ||
                           !homePage.CalendarNextMonthButton.IsEnabled("isClr"));
        }

        private IWebElement GetFutureDay(TrainpalHomePage homePage, int tomorrow)
        {
            homePage.OpenCalendar();
            for (var i = 0; i < 6; i++)
            {
                homePage.CalendarNextMonthButton.Click();
            }
            var dates = homePage.GetCalendarDates();
            return dates.FirstOrDefault(d => d.Text.Equals(tomorrow.ToString()));
        }

        [TearDown]
        public void QuitDriver()
        {
            _webDriver.Quit();
        }
    }
}