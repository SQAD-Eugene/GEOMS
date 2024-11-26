import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_Selection {

    WebDriver driver;

    @FindBy(linkText = "Sample Selection")
    public WebElement Sam_Selection;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[1]/div[1]/div/select")
    public WebElement Region;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[1]/div[2]/div/select")
    public WebElement Province;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[1]/div[3]/div/select")
    public WebElement Survey;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[1]/div[4]/div/select")
    public WebElement Year;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[1]/div[5]/div/select")
    public WebElement Round;

    @FindBy (xpath = "//input[@placeholder='Replicate number']")
    public WebElement Rep_Num;

    @FindBy (xpath = "//input[@placeholder='Rotation group']")
    public WebElement Rot_Group;

    @FindBy (xpath = "//button[contains(.,'Clear')]")
    public WebElement btn_Clear;

    @FindBy (xpath = "//button[contains(.,'Submit')]")
    public WebElement btn_Submit;

    @FindBy (xpath = "//button[contains(.,'Cancel')]")
    public WebElement btn_Cancel;

    @FindBy (xpath = "//button[contains(.,'Generate')]")
    public WebElement btn_Generate;

    public Sample_Selection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}
