import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Survey_Management {

    WebDriver driver;

    @FindBy(linkText = "Survey Management")
    public static WebElement sidebar_Survey_management;

    @FindBy(xpath ="//button[contains(.,'Add Survey')]")
    public static WebElement btn_Add_survey;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div")
    public WebElement Modal_Add_survey;

    @FindBy(xpath = "//*[@id=\"grid-mun-name\"]")
    public WebElement txt_name_survey;

    @FindBy(xpath = "//*[@id=\"grid-bgy-name\"]")
    public WebElement txt_survey_abbreviation;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[3]/div/button[2]")
    public WebElement btn_add_survey_submit;

    @FindBy(xpath ="//button[contains(.,'Close')]")
    public WebElement btn_add_survey_close;

    @FindBy(xpath = "/html/body/div[2]/div/div[6]/button[1]")
    public WebElement Modal_added_success;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/div/select")
    public WebElement Flt_status;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div/div/div[2]/div[1]/div/button[2]")
    public WebElement btn_SC;

    @FindBy(xpath ="//*[@id=\"filterYear\"]")
    public WebElement dd_SC;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/button")
    public WebElement btn_Add_Year;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[2]/div/button[2]/span")
    public WebElement btn_add_round;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[3]/div[1]/label")
    public WebElement lbl_year;

    @FindBy(xpath ="/html/body/div/div[1]/div[2]/main/div[3]/div/div/div[2]/div[3]/div[1]/input")
    public WebElement txt_year;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[3]/div[2]/label")
    public WebElement lbl_round;

    @FindBy(xpath ="/html/body/div/div[1]/div[2]/main/div[3]/div/div/div[2]/div[3]/div[2]/input")
    public WebElement txt_round;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/button")
    public WebElement btn_Year;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[3]/div/button[2]")
    public WebElement btn_Add_YR_RD_submit;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[3]/div/button[1]")
    public WebElement btn_Add_YR_RD_close;

    @FindBy(xpath ="/html/body/div[2]/div/div[6]/button[1]")
    public WebElement modal_success_btn_ok;

    @FindBy(xpath ="//*[@id=\"filterYear\"]")
    public WebElement dd_Year_List;

    @FindBy(xpath ="//*[@id=\"filterRound\"]")
    public WebElement dd_Round_List;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[2]/div/div/div/div[2]/button")
    public WebElement btn_add_Round;

    @FindBy(xpath ="/html/body/div/div[1]/div[2]/main/div[3]/div/div/div[2]/div[3]/div[2]/input")
    public WebElement btn_txt_round;
    public Survey_Management(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}