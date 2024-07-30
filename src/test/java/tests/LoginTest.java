package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.Config;
import static org.assertj.core.api.Assertions.assertThat;
public class LoginTest extends BaseTest {

    
    @Test
	public void testLogin() {
        LoginPage loginPage = new LoginPage(page);
        
        
        loginPage.navigate();
        
        // Perform login and wait for navigation to complete
        page.waitForNavigation(() -> {
            loginPage.login(Config.USERNAME, Config.PASSWORD);
           
        });
       
       HomePage homePage = new HomePage(page);
        page.waitForFunction("document.title === 'Lightning Experience'");
        assertThat(homePage.getTitle()).isEqualTo("Lightning Experience");
        
        homePage.takeScreenshot("home_page_screenshot.png");

        
    }
}