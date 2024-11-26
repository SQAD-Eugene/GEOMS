import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Maintenance {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/header/div/div[1]/div[1]/svg")
    public WebElement Burger_icon;

    @FindBy (xpath = "//button[contains(.,' Apply Filter ')]")
    public WebElement btn_filter;
    @FindBy(linkText = "Frame maintenance")
    public WebElement F_Maintenance;
    @FindBy(xpath ="//select[contains(.,'Select Survey')]")
    public WebElement Filter_Survey;

    @FindBy(xpath ="//select[contains(.,'Select Year')]")
    public WebElement Filter_Year;

    @FindBy(xpath ="//select[contains(.,'Select Round')]")
    public WebElement Filter_Round;


    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div[1]/div/div[2]/table/thead/tr/th[19]")
    public WebElement Actions;


    @FindBy(xpath= "//*[@id=\"2\"]")
    public WebElement Add_Action;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[1]/div/h1")
    public WebElement Add_Modal;

    @FindBy (xpath = "//input[@placeholder='Ex. Juan Dela Cruz']")
    public WebElement HH_Head;

    @FindBy (xpath = "//input[@placeholder='Ex. Purok 1']")
    public WebElement Add_HH;

    @FindBy (xpath = "//input[@placeholder='Ex: 4']")
    public WebElement TOT_HH_Members;

    @FindBy(xpath = "//*[@id=\"grid-remarks\"]")
    public WebElement Remarks;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[3]/div/button[1]")
    public WebElement btn_close;

    @FindBy (xpath = "//button[contains(.,' Submit ')]")
    public WebElement btn_submit;

    @FindBy(xpath ="/html/body/div[2]/div/div[6]/button[1]")
    public WebElement btn_success_modal_ok;
                      //*[@id="app"]/div[1]/div[2]/main/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[19]/div/button[2]/svg
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[19]/div/div/button[2]")
    public WebElement Update_Action;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[19]/div/div/button[3]")
    public WebElement Merge_Action;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[1]/div[1]/div/input")
    public WebElement txt_merge_search;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/main/div[3]/div/div/div[2]/div[2]/div[2]/button[1]/div/div")
    public WebElement data_merge;

    @FindBy (xpath = "//button[contains(.,'Discard')]")
    public WebElement btn_Yes_merge_notif;

    @FindBy (xpath = "//button[contains(.,' Close ')]")
    public WebElement btn_close_modal;

    @FindBy(xpath="/html/body/div[2]/div/div[6]/button[3]")
    public WebElement btn_Discard_merge_notif;

    @FindBy(xpath = "//*[@id=\"grid-update-code\"]")
    public WebElement Update_code;

    @FindBy(xpath = "//*[@id=\"filterSSU\"]")
    public WebElement Filter_SSU;

    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement txt_Search;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div/div[1]/div/div[2]/div/table")
    public WebElement Frame_table;

    @FindBy(xpath ="//select[contains(.,'---Select Update Code---')]")
    public WebElement Update_Modal;

    @FindBy(xpath ="//*[@id=\"grid-nhh\"]")
    public WebElement txt_Update_add;

    @FindBy (xpath = "//button[contains(.,' Close ')]")
    public WebElement btn_update_close;

    @FindBy (xpath = "//button[contains(.,' Submit ')]")
    public WebElement btn_update_submit;

    @FindBy(xpath ="//*[@id=\"grid-remarks\"]")
    public WebElement txt_Remarks;

    @FindBy (xpath = "//button[contains(.,'OK')]")
    public WebElement  btn_update_success_modal_ok;

    public Frame_Maintenance (WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;}}
   