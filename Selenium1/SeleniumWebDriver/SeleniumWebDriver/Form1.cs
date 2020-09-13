using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SeleniumWebDriver
{
    public partial class Form1 : Form
    {
        IWebDriver BrouserGoogleChrome;
        IWebDriver BrouserGoogleChromeSecondTest;

        public Form1()
        {
            InitializeComponent();
        }

        private void StartFirstTestButtonClick_Click(object sender, EventArgs e)
        {
            //№2  Тестирование строки поиска товара
            BrouserGoogleChrome = new OpenQA.Selenium.Chrome.ChromeDriver();
            BrouserGoogleChrome.Manage().Window.Maximize();
            BrouserGoogleChrome.Navigate().GoToUrl("https://deal.by/");

            IWebElement SearhInputLine = BrouserGoogleChrome.FindElement(By.Name("search_term"));

            SearhInputLine.SendKeys("еда" + OpenQA.Selenium.Keys.Enter);
            //Ожидаемый результат: произойдет перенаправление на список ссылок относящийся к слову еда
        }

        private void StopFirstTestButton_Click(object sender, EventArgs e)
        {
            BrouserGoogleChrome.Quit();
        }

        private void StartSecondTestButton_Click(object sender, EventArgs e)
        {
            //№3  Тестирование фильтрации услуг
            BrouserGoogleChromeSecondTest = new OpenQA.Selenium.Chrome.ChromeDriver();
            BrouserGoogleChromeSecondTest.Manage().Window.Maximize();
            BrouserGoogleChromeSecondTest.Navigate().GoToUrl("https://deal.by/");

            IWebElement SearhInputLine = BrouserGoogleChromeSecondTest.FindElement(By.Name("search_term"));

            SearhInputLine.SendKeys("еда" + OpenQA.Selenium.Keys.Enter);
            Thread.Sleep(6000);
            IWebElement SearhInputLine2 = BrouserGoogleChromeSecondTest.FindElement(By.XPath("//span[text()='Ланч боксы']"));

            SearhInputLine2.Click();
            //Ожидаемый результат: на странице будут присутствовать только ланч боксы
        }

        private void StopSecondTestButton_Click(object sender, EventArgs e)
        {
            BrouserGoogleChromeSecondTest.Quit();
        }
    }
}
