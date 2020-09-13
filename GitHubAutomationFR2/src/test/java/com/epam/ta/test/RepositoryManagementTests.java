package com.epam.ta.test;

import com.epam.ta.model.User;
import com.epam.ta.page.LoginPage;
import com.epam.ta.page.MainPage;
import com.epam.ta.service.UserCreator;
import com.epam.ta.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class RepositoryManagementTests extends CommonConditions {
    protected static final int REPOSITORY_NAME_POSTFIX_LENGTH = 6;
    protected static final String REPOSITORY_DESCRIPTION = "auto-generated test repo";

/*
    //работа поиска
    @Test(description = "JIRA-7566")
    public void CanFind()
    {
        //User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Результаты поиска по запросу «еда» в Беларуси.";
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .search()
                .retName();

        assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
    }

//работа фильтра
    @Test(description = "JIRA-7567")
    public void CanFindandFilter()
    {

        String expectedRepositoryName = "Результаты поиска по запросу «еда» в категории ланч боксы в Беларуси.";
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .search()
                .filter()
                .retName();

        assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
    }

//проверка сообщений
    @Test(description = "JIRA-7568")
    public void MessegeChek()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Сообщения";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .openMess();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
//добавление в избранное
    @Test(description = "JIRA-7569")
    public void AddToWish()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "1";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .openItem()
                .addtolist();

        assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
    }

//добавление в корзину
    @Test(description = "JIRA-7570")
    public void AddToCard()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Светодиодная гирлянда на окно Штора 3Х2 м";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .openItem()
                .addtocard();

        assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
    }


    //проверка отзывов
    @Test(description = "JIRA-7571")
    public void OtzivChek()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Отзывы";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .openOtziv();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }

    //проверка текущих заказов
    @Test(description = "JIRA-7571")
    public void OrdersNow()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Заказы";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .myOrders();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
//работа чата
    @Test(description = "JIRA-7572")
    public void TestChat()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Нет сообщений";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .chatOpen();

        assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
    }*/

    //добавление объявления
    @Test(description = "JIRA-7573")
    public void Making()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7574")
    public void Making1()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7575")
    public void Making2()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7576")
    public void Making3()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7576")
    public void Making4()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7577")
    public void Making5()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7578")
    public void Making6()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7579")
    public void Making7()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7580")
    public void Making8()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7581")
    public void Making9()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }
    
     @Test(description = "JIRA-7582")
    public void Making10()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "Возможности покупателя";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .getLoggedInUserName();
        String createdRepositoryName = new MainPage(driver)
                .openPage()
                .making();
        assertThat(loggedInUserName, is(equalTo(expectedRepositoryName)));

    }

   /* @Test(description = "JIRA-7567")
    public void newProjectsAreEmpty()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String testRepositoryName = StringUtils.generateRandomRepositoryNameWithPostfixLength(REPOSITORY_NAME_POSTFIX_LENGTH);
        String isCurrentRepositoryEmpty = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .retName();

       // assertThat("is", "newly created repository is not empty");
    }*/
}
