import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Certification {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div[1]/div/div[1]/div/select")
    public WebElement dd_Survey;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div/select")
    public WebElement dd_Year;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div/select")
    public WebElement dd_Round;

    @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div[1]/div/div[1]/div/div[5]/div/select")
    public WebElement dd_Province;

    @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div[1]/div/div[1]/div/div[6]/div/select")
    public WebElement dd_Update_code;

    @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div[1]/div/div[6]/div/select")
    public WebElement dd_Update_codePFP;

    @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[1]/div/div[1]/div/div[7]/div/select")
    public WebElement dd_SSU;

    @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div[1]/div/div[1]/div/div[8]/button")
    public WebElement btn_Certify;

    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement txt_Search;

    @FindBy(linkText = "Certification")
    public WebElement Certification;

    @FindBy (xpath = "//button[contains(.,' Apply Filter ')]")
    public WebElement btn_filter;




    public Certification (WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}
