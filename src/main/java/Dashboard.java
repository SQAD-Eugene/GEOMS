import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    WebDriver driver;

    @FindBy(linkText = "Dashboard")
    public WebElement D_board;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[1]/div[1]/div[1]/div[1]/div/select")
    public WebElement dd_Survey;

    @FindBy(xpath = "//*[@id=\"horizontal-list-radio-license\"]")
    public WebElement rad_S_round;

    @FindBy(xpath = "//*[@id=\"horizontal-list-radio-id\"]")
    public WebElement rad_M_round;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div/select")
    public WebElement dd_Yr_from;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/select")
    public WebElement dd_Rd_from;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/select")
    public WebElement dd_Yr_to;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/select")
    public WebElement dd_Rd_to;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div/div[1]/div/select")
    public WebElement dd_Year;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/div/div/div[2]/div/select")
    public WebElement dd_Round;

    @FindBy (xpath = "//button[contains(.,' Close ')]")
    public WebElement btn_close;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[1]/div[1]/div[1]/div[3]/div/select")
    public WebElement dd_domain;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[1]/div[1]/div[1]/div[4]/div/select")
    public WebElement dd_updatecode;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[1]/div[1]/div[1]/div[7]/button")
    public WebElement btn_filter1;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[2]/div[1]/div[2]/button")
    public WebElement btn_filter2;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[2]/div[1]/div[1]/div[1]/div/select")
    public WebElement  dd_f_survey;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[2]/div[1]/div[1]/div[2]/div/select")
    public WebElement dd_f_domain;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div/div[2]/div[1]/div[1]/div[3]/div/select")
    public WebElement dd_f_updatecode;


    public Dashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}