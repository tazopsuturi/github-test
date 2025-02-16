package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
	private final IButton searchButton = getElementFactory().getButton(By.xpath
			("//span[@class='flex-1']"), "Search Button");
	private final ILabel inputLabel = getElementFactory().getLabel(By.xpath
			("//input[@id='query-builder-test']"), "Input Label");
	private final ILabel searchResult = getElementFactory().getLabel(By.xpath
			("//span[@class='ActionListItem-label text-normal']"), "Search Result");
	
	public MainPage () {
		super(By.xpath("//span[@class='flex-1']"), "Main Page");
	}
	
	public void clickSearchButton () {
		searchButton.click();
	}
	
	public void enterSearchText (String text) {
		inputLabel.getElement().sendKeys(text);
	}
	
	public void clickSearchResult () {
		searchResult.state().waitForDisplayed();
		searchResult.click();
	}
}
