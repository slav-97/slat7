using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using PageObject.Page;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.PageObjects;

namespace PageObject
{
    [TestClass]
    public class Test
    {
        IWebDriver Browser;
        private static string HomePage = "https://deal.by/";

        [TestMethod]
        public void TestSearch()
        {
            Browser = new ChromeDriver();
            Browser.Navigate().GoToUrl(HomePage);

            

            MainPage orderCarPage = new MainPage(Browser)
                .InputPoisk("еда");
           
           
            Browser.Quit();
        }

        [TestMethod]
        public void TestFilter()
        {
            Browser = new ChromeDriver();
            Browser.Navigate().GoToUrl(HomePage);

            MainPage orderCarPage = new MainPage(Browser)
                .InputPoisk("еда")
                .InputFilter("Ланч боксы");

            Browser.Quit();
        }
    }
}
