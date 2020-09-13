using OpenQA.Selenium;

namespace PageObject.Extensions
{
    public static class WebElementExtensions
    {
        // Default property 'Enabled' always returns 'true'
        // 'Wait.Until(ExpectedConditions.ElementToBeClickable)' also doesn't help
        public static bool IsEnabled(this IWebElement webElement, string @class)
        {
            return webElement.GetAttribute("class").Contains(@class);
        }
    }
}