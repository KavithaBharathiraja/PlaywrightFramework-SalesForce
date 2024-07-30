package pages;


import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import base.Basepage;

public class HomePage extends Basepage{
	 public HomePage(Page page) {
	        super(page);
	    }

	    public String getTitle() {
	        return page.title();
	    }

	    public void takeScreenshot(String filePath) {
	    		
	        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")));
	       
	    }
	    
	    

		
      
}
