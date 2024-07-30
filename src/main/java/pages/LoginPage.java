package pages;



import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;

import base.Basepage;

public class LoginPage extends Basepage {
	private String usernameSelector = "input#username";
    private String passwordSelector = "input#password";
    private String loginButtonSelector = "input#Login";

    public LoginPage(Page page) {
        super(page);
    }

    public void navigate() {
        // Navigate to the Salesforce login page
        page.navigate("https://login.salesforce.com/");
        // Wait for the page to load completely
        page.waitForLoadState(LoadState.NETWORKIDLE);
    }

    public void login(String username, String password) {
        // Fill in the username and password
        page.fill(usernameSelector, username);
        page.fill(passwordSelector, password);
        // Click the login button
        page.click(loginButtonSelector);
     
        
    }
}
