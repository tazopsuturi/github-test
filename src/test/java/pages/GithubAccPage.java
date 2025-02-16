package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class GithubAccPage extends Form {
	public GithubAccPage () {
		super(By.xpath("//span[@class='p-nickname vcard-username d-block']"), "Github Account Page");
	}
	
	public String getURL () {
		return getBrowser().getCurrentUrl();
	}
	
	public boolean isCorrectAccount (String account) {
		return getURL().contains(account);
	}
}
