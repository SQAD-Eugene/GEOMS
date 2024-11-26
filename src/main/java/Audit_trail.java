import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Audit_trail {

    WebDriver driver;

    @FindBy(linkText = "Audit Trail")
    public WebElement Audit_trail;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div/select")
    public WebElement dd_F_module;

    @FindBy (xpath = "//input[@placeholder='Search..']")
    public WebElement txt_Search;


    public Audit_trail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }

}
