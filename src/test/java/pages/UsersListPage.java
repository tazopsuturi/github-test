package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class UsersListPage extends Form {
	private final ILabel userName = getElementFactory().getLabel
			(By.xpath("//span[@class='Text__StyledText-sc-17v1xeu-0 hBjWst']"), "User Name");
	
	public UsersListPage () {
		super(By.xpath("//span[@class='Text__StyledText-sc-17v1xeu-0 hBjWst']"), "Users List");
	}
	
	public void clickUserName () {
		userName.click();
	}
}
