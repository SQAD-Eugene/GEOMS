import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Account {
    WebDriver driver;

    @FindBy(linkText = "User Accounts")
    public WebElement sidebar_User_AccountPFP;
    @FindBy(linkText = "User Accounts")
    public WebElement sidebar_User_Account;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/div/select")
    public WebElement dd_Filter_user;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div/div/select")
    public WebElement dd_Region;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div/div[1]/div[3]/div/div/select")
    public WebElement dd_Prov;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[1]/div[1]/div/div[1]/div/div[1]/div[4]/div/div/select")
    public WebElement dd_Stat;

    @FindBy(xpath ="//button[contains(.,' Apply Filter ')]")
    public WebElement btn_filter;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement txt_search;

    @FindBy(xpath ="//button[contains(.,' Add Personnel ')]")
    public WebElement btn_Add_Personnel;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div")
    public WebElement Modal_addpersonnel;

    @FindBy(xpath = "//input[@placeholder='First name']")
    public WebElement txt_Fname;

    @FindBy(xpath = "//input[@placeholder='Middle name']")
    public WebElement txt_Mname;

    @FindBy(xpath = "//input[@placeholder='Last name']")
    public WebElement txt_Lname;

    @FindBy(xpath = "//input[@placeholder='Email Address']")
    public WebElement txt_EmailAdd;

    @FindBy(xpath = "//textarea[@placeholder='Address']")
    public WebElement txt_Add;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[6]/div[1]/div/select")
    public WebElement dd_Role;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[6]/div[2]/div/select")
    public WebElement dd_Office;

    @FindBy(xpath ="//button[contains(.,' Close ')]")
    public WebElement btn_close;

    @FindBy(xpath ="//button[contains(.,' Submit ')]")
    public WebElement btn_submit;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[1]/div[2]/small")
    public WebElement Fname_Error;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[3]/div[2]/small")
    public WebElement Lname_Error;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[4]/div[2]/small")
    public WebElement Email_Error;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div/div[5]/div[2]/small")
    public WebElement Address_Error;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div[8]/div[1]/strong/div")
    public WebElement Role_Error;

    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/main/div[2]/div/div/div[2]/form/div[8]/div[2]/strong/div")
    public WebElement Office_Error;




    public User_Account(WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}
