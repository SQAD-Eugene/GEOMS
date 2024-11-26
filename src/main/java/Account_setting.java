import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_setting {
    WebDriver driver;

    @FindBy(linkText = "Account Setting")
    public WebElement Acc_Setting;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div[1]/p")
    public WebElement User_info;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div[2]/h1")
    public WebElement User_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div[2]/div[1]/p")
    public WebElement Cont_number;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div[2]/div[2]/p")
    public WebElement Email;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[2]/div[1]/p")
    public WebElement User_loc;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[2]/div[2]/p")
    public WebElement User_Prov;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[2]/div[2]/div[1]/p")
    public WebElement User_position_and_prov;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[2]/div[2]/div[2]/p")
    public WebElement User_prov;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[1]/div[1]/div/input")
    public WebElement F_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[1]/div[2]/div/input")
    public WebElement M_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[1]/div[3]/div/input")
    public WebElement L_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[2]/div[2]/div/input")
    public WebElement P_number;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[2]/div[3]/div/select")
    public WebElement Role;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[1]/div/textarea")
    public WebElement Address;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div/select")
    public WebElement Region;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div/select")
    public WebElement Prov;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[1]/div[1]/div/input")
    public WebElement Modal_F_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[2]/div/div/input")
    public WebElement Modal_M_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[3]/div[1]/div/input")
    public WebElement Modal_L_name;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[4]/div[2]/div[1]/div/input")
    public WebElement Modal_P_number;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[5]/div[1]/div/input")
    public WebElement Modal_E_mail;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[6]/div[1]/div/textarea")
    public WebElement Modal_Address;

    @FindBy (xpath = "//button[contains(.,'Cancel')]")
    public WebElement Modal_btn_close;

    @FindBy (xpath = "//button[contains(.,'Update')]")
    public WebElement Modal_btn_update;

    @FindBy (xpath = "//button[contains(.,'Edit')]")
    public WebElement Modal_btn_Edit;


    public Account_setting(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}
