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


    @Test(description = "JIRA-7568")
    public void MessegeChek()
    {
        User testUser = UserCreator.withCredentialsFromProperty();
        String expectedRepositoryName = "1";
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(testUser)
                .openMess();
        /*String createdRepositoryName = new MainPage(driver)
                .openPage()
                .search()
                .filter()
                .addtolist();*/

        //assertThat(createdRepositoryName, is(equalTo(expectedRepositoryName)));
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
