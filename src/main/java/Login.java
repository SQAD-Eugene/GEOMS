import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.className;

public class Login{

    WebDriver driver;

    @FindBy (xpath ="//small[@class='text-2xl uppercase hidden md:block' and text()='geo-enabled master sample selection and maintenance Application']")
    public  WebElement Proj_Title;

    @FindBy (xpath ="//label[@class='block uppercase text-white text-xs font-bold mb-2' and @for='grid-email']")
    public  WebElement lbl_email;

    @FindBy (xpath = "//label[@class='block uppercase text-white text-xs font-bold mb-2' and @for='grid-password']")
    public  WebElement lbl_password;

    @FindBy (xpath = "//h6[@class='text-sm' and text()='Forgot password?']")
    public  WebElement lbl_Forgot_password;

//    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/footer/footer/div/div/div[2]/div/small")
//    public  WebElement Sys_Version;

    @FindBy (xpath = "//input[@placeholder='Email']")
    public WebElement tf_emailAdd;

    @FindBy (xpath = "//*[@id=\"recaptcha-anchor\"]/div[3]")
    public WebElement btn_CAPT;
    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement tf_pw;

    @FindBy (xpath = "//button[contains(.,' Sign In ')]")
    public WebElement btn_login;

    @FindBy (xpath = "//input[@placeholder='12345678']")
    public WebElement txt_2FA;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/main/div/section[2]/div/div[3]/form/strong[1]")
    public WebElement lbl_email_error;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/main/div/section[2]/div/div[3]/form/strong")
    public WebElement lbl_password_error;

    public Login (WebDriver driver) {
        PageFactory.initElements(driver, this);
        driver = this.driver;
    }
}
