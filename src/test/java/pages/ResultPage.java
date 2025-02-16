package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ResultPage extends Form {
	private final ILabel result = getElementFactory().getLabel
			(By.xpath("//a[@id=':R1jpmljb:']"), "Results");
	
	public ResultPage () {
		super(By.xpath("//span[@class='Text__StyledText-sc-17v1xeu-0 fsOMbO search-match']"), "Result");
	}
	
	public void clickUserLabel () {
		result.click();
	}
}
