import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_Upload {
    WebDriver driver;

    @FindBy(linkText = "Sample Upload")
    public WebElement sidebar_Sample_upload;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div/div[1]/div/select")
    public WebElement Drop_Survey;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div/div[2]/div/select")
    public WebElement Drop_Year;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div/div[3]/div/select")
    public WebElement Drop_Round;

    @FindBy (xpath = "//input[@placeholder='Excel last column']")
    public WebElement Last_col;

    @FindBy (xpath = "//input[@placeholder='Excel last row']")
    public WebElement Last_row;

    @FindBy (xpath = "//button[contains(.,' submit ')]")
    public WebElement submit_btn;

    @FindBy (xpath = "//button[contains(.,' cancel ')]")
    public WebElement cancel_btn;

    @FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/form/div[2]/button")
    public WebElement btn_Upload;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/form/div[1]/input")
    public WebElement btn_file;

    public Sample_Upload(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}