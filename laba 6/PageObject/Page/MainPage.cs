using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.PageObjects;

namespace PageObject.Page
{
    class MainPage
    {
       

        [FindsBy(How = How.Name, Using = "search_term")]
        private IWebElement Poisk;

        public MainPage(IWebDriver browser)
        {
            PageFactory.InitElements(browser, this);
        }

        public MainPage InputPoisk(string q)
        {
            Poisk.SendKeys(q);
            Poisk.SendKeys(Keys.Enter);          
            return this;
        }

        

        [FindsBy(How = How.XPath, Using = @"//span[text()='Ланч боксы']")]
        private IWebElement inputFilter;

        public MainPage InputFilter(string filt)
        {
            inputFilter.FindElement(By.XPath("//span[text()='" + filt + "']"));
            inputFilter.Click();            
            return this;
        }



    }
}
