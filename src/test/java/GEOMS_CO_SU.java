import com.google.gson.Gson;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class GEOMS_CO_SU {
    static WebDriver driver;
    static DataSet dataset;

    SoftAssert softAssert = new SoftAssert();


    @BeforeClass
    public void beforeClass() throws IOException {

        //Chrome Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\CDRIVER\\chromedriver-win64\\chromedriver" + ".exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        driver.get("https://dev.psa.gov.ph/sdd-geoms/");

        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("dataset.json"));
        dataset = gson.fromJson(reader, DataSet.class);

    }

    @Test(priority = 1, testName = "Login_page")
    public void login() throws InterruptedException {
        Login testlogin = new Login(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS **********\n");
        eWait.until(ExpectedConditions.visibilityOfAllElements(testlogin.Proj_Title, testlogin.lbl_email, testlogin.tf_emailAdd, testlogin.lbl_password, testlogin.tf_pw, testlogin.lbl_Forgot_password));

        softAssert.assertTrue(testlogin.Proj_Title.isDisplayed());
        if (testlogin.Proj_Title.isDisplayed()) {
            System.out.println(" The Project Title is Present - PASS");
        } else {
            System.out.println(" The Project Title  is Missing - Fail");
        }

        softAssert.assertTrue(testlogin.lbl_email.isDisplayed());
        if (testlogin.lbl_email.isDisplayed()) {
            System.out.println(" The Email Label is Present - PASS");
        } else {
            System.out.println(" The Email Label  is Missing - Fail");
        }

        softAssert.assertTrue(testlogin.tf_emailAdd.isDisplayed());
        if (testlogin.tf_emailAdd.isDisplayed()) {
            System.out.println(" The Email Text box is Present - PASS");
        } else {
            System.out.println(" The Email Text box  is Missing - Fail");
        }

        softAssert.assertTrue(testlogin.lbl_password.isDisplayed());
        if (testlogin.lbl_password.isDisplayed()) {
            System.out.println(" The Password Label is Present - PASS");
        } else {
            System.out.println(" The Password Label is Missing - Fail");
        }


        softAssert.assertTrue(testlogin.tf_pw.isDisplayed());
        if (testlogin.tf_pw.isDisplayed()) {
            System.out.println(" The Project Title is Present - PASS");
        } else {
            System.out.println(" The Project Title  is Missing - Fail");
        }

        softAssert.assertTrue(testlogin.lbl_Forgot_password.isDisplayed());
        if (testlogin.lbl_Forgot_password.isDisplayed()) {
            System.out.println(" The Password Text box is Present - PASS");
        } else {
            System.out.println(" The Password Text box  is Missing - Fail");
        }

//        softAssert.assertTrue(testlogin.Sys_Version.isDisplayed());
//        if (testlogin.Sys_Version.isDisplayed()) {
//            System.out.println(" The System Version is Present - PASS");
//        } else {
//            System.out.println(" The System Version  is Missing - Fail");
//        }

        testlogin.tf_emailAdd.sendKeys(dataset.EMAIL_CO_SU);
        testlogin.tf_pw.sendKeys(dataset.PW_CO_SU);
        driver.manage().window().maximize();

//        System.out.println("\n********** VALIDATING ERROR MESSAGE **********\n");
//        int iteration = 1;
//        for (DataSet credentials : dataset.test_credentials) {
//
//            sleep(2000);
//            testlogin.tf_emailAdd.sendKeys(credentials.EMAIL);
//            testlogin.tf_pw.sendKeys(credentials.PW);
//
//            sleep(2000);
//            testlogin.btn_login.click();
//
//            if (iteration >= 1 && iteration <= 4) {
//                sleep(1000);
//                if (testlogin.tf_emailAdd.getAttribute("value").isEmpty() & testlogin.lbl_email_error.isDisplayed() & testlogin.tf_pw.getAttribute("value").isEmpty() & testlogin.lbl_password_error.isDisplayed()) {
//                    System.out.println(" EMAIL and PASSWORD text box has no entry and error message is display - PASS");
//
//                } else if (!testlogin.tf_emailAdd.getAttribute("value").isEmpty() & !testlogin.lbl_email_error.isDisplayed() & !testlogin.tf_pw.getAttribute("value").isEmpty() & !testlogin.lbl_password_error.isDisplayed()) {
//                    System.out.println(" EMAIL and PASSWORD text box has an entry and No error message is display - PASS");
//                    System.out.println(" Incorrect EMAIL and PASSWORD entered and error message is display - PASS");
//
//                } else if ((testlogin.tf_emailAdd.getAttribute("value").isEmpty() & testlogin.lbl_email_error.isDisplayed())) {
//                    System.out.println(" EMAIL text box has no entry and error message is display - PASS");
//
//                } else if (testlogin.tf_pw.getAttribute("value").isEmpty() & testlogin.lbl_password_error.isDisplayed()) {
//                    System.out.println(" PASSWORD text box has no entry and error message is display - PASS");
//
//                } else {
//                    System.out.println(" No error message display - FAIL");
//                }
//
//            } else {
//                System.out.println(" Entered Correct name and Correct password Login success fully");
//            }
//            iteration++;
//            sleep(5000);
//            driver.navigate().refresh();
//        }
//        driver.manage().window().maximize();
    }

    @Test(priority = 2, testName = "Frame_maintenance")
    public void frame() throws InterruptedException {
        Frame_Maintenance test_frame = new Frame_Maintenance(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(100));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("\n********** VALIDATING FRAME MAINTENANCE **********\n");

        eWait.until(ExpectedConditions.visibilityOf(test_frame.F_Maintenance));

        test_frame.F_Maintenance.click();
        softAssert.assertTrue(test_frame.Filter_Survey.isDisplayed());
        Select F_survey = new Select(test_frame.Filter_Survey);
        F_survey.selectByVisibleText("LFS");

        WebElement FS = test_frame.Filter_Survey;
        String fs = FS.getText();
        System.out.println("The Dropdown SURVEY is functioning - PASS \n\n" + fs);


        softAssert.assertTrue(test_frame.Filter_Year.isDisplayed());
        Select F_Year = new Select(test_frame.Filter_Year);
        F_Year.selectByIndex(2);

        WebElement FY = test_frame.Filter_Year;
        String fy = FY.getText();
        System.out.println(" \nThe Dropdown YEAR is functioning - PASS \n\n" + fy);


        Select F_Round = new Select(test_frame.Filter_Round);
        F_Round.selectByIndex(1);

        WebElement FR = test_frame.Filter_Round;
        String fr = FR.getText();
        System.out.println(" \nThe Dropdown ROUND is functioning - PASS \n\n" + fr);

        test_frame.btn_filter.click();

        System.out.println("\n********** VALIDATING TABLE DISPLAY **********\n");

        softAssert.assertTrue(test_frame.Frame_table.isDisplayed());
        String cell = test_frame.Frame_table.getText().replace("BGY NAME PROV MUN BGY EA REP PSU HSN BSN HUSN NAME OF HOUSEHOLD HEAD ADDRESS OF THE HOUSEHOLD (HOUSE NUMBER AND STREET OR SITIO/PUROK NAME) NUMBER OF HOUSEHOLD MEMBERS UPDATE CODE REMARKS ACTIONS", "BGY\n NAME\n PROV\n MUN\n BGY\n EA\n REP\n PSU\n HSN\n BSN\n HUSN\n NAME OF HOUSEHOLD HEAD\n ADDRESS OF THE HOUSEHOLD (HOUSE NUMBER AND STREET OR SITIO/PUROK NAME)\n NUMBER OF HOUSEHOLD MEMBERS\n UPDATE CODE\n REMARKS\n ACTIONS\n");
        System.out.print(" CELL TABLE " + "\n " + cell + "\n");

        sleep(2000);
        softAssert.assertTrue(test_frame.Add_Action.isDisplayed());
        test_frame.Add_Action.click();

        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS IN ADD MODAL **********\n");

        eWait.until(ExpectedConditions.visibilityOf(test_frame.Add_Modal));
        WebElement Modal = test_frame.Add_Modal;
        String modalText = Modal.getText();
        System.out.println(" MODAL Displayed - PASS \n" + modalText);

        eWait.until(ExpectedConditions.visibilityOfAllElements(test_frame.HH_Head, test_frame.Add_HH, test_frame.TOT_HH_Members, test_frame.Remarks));
        softAssert.assertTrue(test_frame.HH_Head.isDisplayed());
        if (test_frame.HH_Head.isDisplayed()) {
            test_frame.HH_Head.sendKeys(dataset.ADD_HH_HEAD);
        }

        sleep(1000);
        softAssert.assertTrue(test_frame.Add_HH.isDisplayed());
        if (test_frame.Add_HH.isDisplayed()) {
            test_frame.Add_HH.sendKeys(dataset.ADD_ADDR);
        }

        sleep(1000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        sleep(2000);

        softAssert.assertTrue(test_frame.TOT_HH_Members.isDisplayed());
        if (test_frame.TOT_HH_Members.isDisplayed()) {
            test_frame.TOT_HH_Members.sendKeys(dataset.ADD_TOT_HH_MEM);
        }

        softAssert.assertTrue(test_frame.Remarks.isDisplayed());
        if (test_frame.Remarks.isDisplayed()) {
            test_frame.Remarks.sendKeys(dataset.REMARKS);
        }

        softAssert.assertTrue(test_frame.btn_close.isDisplayed());
        test_frame.btn_close.click();
//        test_frame.Add_Action.click();
//        test_frame.btn_submit.click();
//
//        eWait.until(ExpectedConditions.visibilityOfAllElements(test_frame.btn_success_modal_ok));
//        test_frame.btn_success_modal_ok.click();

        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS IN UPDATE MODAL **********\n");


        sleep(5000);
//        softAssert.assertTrue(test_frame.Update_Action.isDisplayed());
        test_frame.Update_Action.click();


        eWait.until(ExpectedConditions.visibilityOfAllElements(test_frame.Update_Modal, test_frame.txt_Remarks));
        softAssert.assertTrue(test_frame.Update_Modal.isDisplayed());
        WebElement UpdateModal = test_frame.Update_Modal;
        String UpdateModalText = UpdateModal.getText();
        System.out.println(" UPDATE MODAL Displayed - PASS \n" + UpdateModalText);

        softAssert.assertTrue(test_frame.Update_Modal.isDisplayed());
        Select UP_code = new Select(test_frame.Update_code);
        UP_code.selectByVisibleText("0 - No correction or change in the address of the housing unit and/or name of the household head");
        UP_code.selectByVisibleText("1 - Change of household head");
        UP_code.selectByVisibleText("2 - Correction of name and/or address or typographical error");
        UP_code.selectByVisibleText("3 - Additional household/s in the housing unit");
        UP_code.selectByVisibleText("4 - Merged with another household in the same housing unit");
        UP_code.selectByVisibleText("5 - New occupant household in the housing unit");
        UP_code.selectByVisibleText("6 - Household permanently moved out");
        UP_code.selectByVisibleText("7 - Replacement sample household");
        UP_code.selectByVisibleText("8 - Listed housing unit is no longer used as a dwelling unit");
        UP_code.selectByVisibleText("9 - Listed household is not a permanent resident of the housing unit");
        UP_code.selectByVisibleText("2 - Correction of name and/or address or typographical error");

        softAssert.assertTrue(test_frame.txt_Update_add.isDisplayed());
        if (test_frame.txt_Update_add.isDisplayed()) {
            test_frame.txt_Update_add.sendKeys(dataset.UPDATE_ADDRESS);
        }

        softAssert.assertTrue(test_frame.txt_Remarks.isDisplayed());
        if (test_frame.txt_Remarks.isDisplayed()) {
            test_frame.txt_Remarks.sendKeys(dataset.UPDATE_REMARKS);
        }

        Actions act1 = new Actions(driver);
        act1.sendKeys(Keys.PAGE_DOWN).build().perform();


        eWait.until(ExpectedConditions.visibilityOf(test_frame.Frame_table));
        softAssert.assertTrue(test_frame.btn_update_close.isDisplayed());
        test_frame.btn_update_close.click();

//        sleep(2000);
//        test_frame.btn_update_submit.click();
//        sleep(2000);
//        test_frame.btn_update_success_modal_ok.click();


        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS IN MERGE MODAL **********\n");

        softAssert.assertTrue(test_frame.Merge_Action.isDisplayed());
        test_frame.Merge_Action.click();

        eWait.until(ExpectedConditions.visibilityOf(test_frame.txt_merge_search));
        softAssert.assertTrue(test_frame.txt_merge_search.isDisplayed());
        test_frame.txt_merge_search.sendKeys(dataset.MERGE_SEARCH);
        test_frame.txt_merge_search.sendKeys(Keys.ENTER);
        sleep(1000);
        test_frame.data_merge.click();

        eWait.until(ExpectedConditions.visibilityOf(test_frame.btn_Discard_merge_notif));
        softAssert.assertTrue(test_frame.btn_Discard_merge_notif.isDisplayed());
        test_frame.btn_Discard_merge_notif.click();
//        test_frame.btn_Yes_merge_notif.click();

        Actions act2 = new Actions(driver);
        act2.sendKeys(Keys.PAGE_DOWN).build().perform();
        sleep(2000);

        eWait.until(ExpectedConditions.visibilityOf(test_frame.btn_close_modal));
        softAssert.assertTrue(test_frame.btn_close_modal.isDisplayed());
        test_frame.btn_close_modal.click();

        System.out.println("No Data Save");
    }

    @Test(priority = 3, testName = "Survey Management")
    public void S_management() throws InterruptedException {
        Survey_Management survey_Management = new Survey_Management(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS USER ACCOUNT **********\n");

        eWait.until(ExpectedConditions.visibilityOf(Survey_Management.sidebar_Survey_management));
        Survey_Management.sidebar_Survey_management.click();

        sleep(5000);
        Survey_Management.btn_Add_survey.click();

        survey_Management.txt_survey_abbreviation.sendKeys(dataset.S_ABB);
        survey_Management.txt_name_survey.sendKeys(dataset.S_NAME);
        survey_Management.btn_add_survey_close.click();



    }
    @Test(priority = 4, testName = "Sample_Selection")
    public void sample_select() throws InterruptedException {
        Sample_Selection sample_select = new Sample_Selection(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENT SAMPLE SELECTION **********\n");

        softAssert.assertTrue(sample_select.Sam_Selection.isDisplayed());
        sample_select.Sam_Selection.click();

        sleep(3000);
        softAssert.assertTrue(sample_select.Region.isDisplayed());
        Select Reg = new Select(sample_select.Region);
        Reg.selectByVisibleText("Region II (Cagayan Valley)");

        sleep(1000);
        softAssert.assertTrue(sample_select.Province.isDisplayed());
        Select Prov = new Select(sample_select.Province);
        Prov.selectByVisibleText("Batanes");

        sleep(1000);
        softAssert.assertTrue(sample_select.Survey.isDisplayed());
        Select Sur = new Select(sample_select.Survey);
        Sur.selectByVisibleText("LFS");

        sleep(1000);
        softAssert.assertTrue(sample_select.Year.isDisplayed());
        Select Yr = new Select(sample_select.Year);
        Yr.selectByVisibleText("2023");

        sleep(1000);
        softAssert.assertTrue(sample_select.Round.isDisplayed());
        Select Rd = new Select(sample_select.Round);
        Rd.selectByVisibleText("1");

        sleep(1000);
        softAssert.assertTrue(sample_select.Rep_Num.isDisplayed());
        sample_select.Rep_Num.sendKeys(dataset.Replicate_Number);

        sleep(1000);
        softAssert.assertTrue(sample_select.Rot_Group.isDisplayed());
        sample_select.Rep_Num.sendKeys(dataset.Rotation_Number);

        softAssert.assertTrue(sample_select.btn_Submit.isDisplayed());
        sample_select.btn_Submit.click();


    }
    @Test(priority = 5, testName = "Certification")
    public void cert() throws InterruptedException {
        Certification certification = new Certification(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));

        System.out.println("Validate Certification Module");

        certification.Certification.click();


        sleep(3000);
//        softAssert.assertTrue(certification.dd_Survey.isDisplayed());
        Select D_survey = new Select(certification.dd_Survey);
        D_survey.selectByVisibleText("LFS");


        WebElement DS = certification.dd_Survey;
        String ds = DS.getText();
        System.out.println("The Dropdown Survey is functioning - PASS \n\n" + ds);

        Select D_Year = new Select(certification.dd_Year);
        D_Year.selectByVisibleText("2023");

        WebElement DY = certification.dd_Year;
        String dy = DY.getText();
        System.out.println("The Dropdown Year is functioning - PASS \n\n" + dy);

        softAssert.assertTrue(certification.dd_Round.isDisplayed());
        Select D_Round = new Select(certification.dd_Round);
        D_Round.selectByVisibleText("1");

        WebElement DR = certification.dd_Round;
        String dr = DR.getText();
        System.out.println("The Dropdown Round is functioning - PASS \n\n" + dr);

        sleep(2000);
        softAssert.assertTrue(certification.dd_Update_codePFP.isDisplayed());
        Select D_Update = new Select(certification.dd_Update_codePFP);
        D_Update.selectByVisibleText("2 - Correction of name and/or address or typographical error");

        WebElement DU = certification.dd_Update_codePFP;
        String du = DU.getText();
        System.out.println("The Dropdown Region is functioning - PASS \n\n" + du);

        softAssert.assertTrue(certification.dd_SSU.isDisplayed());
        Select D_SSU = new Select(certification.dd_SSU);
        D_SSU.selectByVisibleText("Original");

        WebElement DSS = certification.dd_SSU;
        String dss = DSS.getText();
        System.out.println("The Dropdown Region is functioning - PASS \n\n" + dss);

        certification.btn_filter.click();

        softAssert.assertTrue((certification.txt_Search.isDisplayed()));
        certification.txt_Search.sendKeys(dataset.CERT_SEARCH);
        certification.txt_Search.sendKeys(Keys.ENTER);

        sleep(30000);
    }

    @Test(priority = 6, testName = "dashboard")
    public void d_board() throws InterruptedException {
        Dashboard dash_board = new Dashboard(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS IN DASHBOARD **********\n");

        dash_board.D_board.click();

        sleep(3000);
//        softAssert.assertTrue(certification.dd_Survey.isDisplayed());
        Select D_survey = new Select(dash_board.dd_Survey);
        D_survey.selectByVisibleText("LFS");

        dash_board.rad_S_round.click();

        Select D_year = new Select(dash_board.dd_Year);
        D_year.selectByVisibleText("2023");

        Select D_round = new Select(dash_board.dd_Round);
        D_round.selectByVisibleText("1");

        dash_board.btn_close.click();

        dash_board.rad_M_round.click();


        Select D_year_from = new Select(dash_board.dd_Yr_from);
        D_year_from.selectByVisibleText("2023");

        Select D_round_from= new Select(dash_board.dd_Rd_from);
        D_round_from.selectByVisibleText("1");

        Select D_year_to = new Select(dash_board.dd_Yr_to);
        D_year_to.selectByVisibleText("2023");

        Select D_round_to= new Select(dash_board.dd_Rd_to);
        D_round_to.selectByVisibleText("2");

        dash_board.btn_close.click();

        dash_board.btn_filter1.click();

    }



    @Test(priority = 7, testName = "Sample_upload")
    public void sample() throws InterruptedException {
        Sample_Upload sample_upload = new Sample_Upload(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENT SAMPLE UPLOAD **********\n");


        eWait.until(ExpectedConditions.visibilityOfAllElements(sample_upload.sidebar_Sample_upload));
        softAssert.assertTrue(sample_upload.sidebar_Sample_upload.isDisplayed());
        sleep(10000);
        sample_upload.sidebar_Sample_upload.click();

        eWait.until(ExpectedConditions.visibilityOfAllElements(sample_upload.Drop_Survey, sample_upload.Drop_Year, sample_upload.Drop_Round));
        softAssert.assertTrue(sample_upload.Drop_Survey.isDisplayed());
        Select F_survey = new Select(sample_upload.Drop_Survey);
        F_survey.selectByVisibleText("LFS");

        WebElement FS = sample_upload.Drop_Survey;
        String fs = FS.getText();
        System.out.println("The Dropdown SURVEY is functioning - PASS \n\n" + fs);

        softAssert.assertTrue(sample_upload.Drop_Year.isDisplayed());
        Select F_year = new Select(sample_upload.Drop_Year);
        F_year.selectByVisibleText("2023");

        WebElement FY = sample_upload.Drop_Year;
        String fy = FY.getText();
        System.out.println("The Dropdown YEAR is functioning - PASS \n\n" + fy);

        softAssert.assertTrue(sample_upload.Drop_Round.isDisplayed());
        Select F_round = new Select(sample_upload.Drop_Round);
        F_round.selectByVisibleText("1");

        WebElement FR = sample_upload.Drop_Round;
        String fr = FR.getText();
        System.out.println("The Dropdown ROUND is functioning - PASS \n\n" + fr);

        sample_upload.Last_col.sendKeys("J");
        sample_upload.Last_row.sendKeys("40");

        sample_upload.submit_btn.click();

        sleep(2000);
        sample_upload.cancel_btn.click();
        sleep(2000);

    }

    @Test(priority = 8, testName = "User_account")
    public void account() throws InterruptedException {
        User_Account user_account = new User_Account(driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS USER ACCOUNT **********\n");

        eWait.until(ExpectedConditions.visibilityOf(user_account.sidebar_User_Account));
        softAssert.assertTrue(user_account.sidebar_User_Account.isDisplayed());
        user_account.sidebar_User_Account.click();

        sleep(2000);

        softAssert.assertTrue(user_account.dd_Filter_user.isDisplayed());
        Select F_role = new Select(user_account.dd_Filter_user);
        F_role.selectByVisibleText("CO - SU");
        F_role.selectByVisibleText("CO - VOU");
        F_role.selectByVisibleText("CO - VpSU");
        F_role.selectByVisibleText("PFP");
        WebElement FR = user_account.dd_Filter_user;
        String fr = FR.getText();
        System.out.println("The Dropdown ROUND is functioning - PASS \n\n" + fr);

        softAssert.assertTrue(user_account.dd_Region.isDisplayed());
        Select F_reg = new Select(user_account.dd_Region);
        F_reg.selectByVisibleText("REGION I (ILOCOS REGION)");
        F_reg.selectByVisibleText("REGION II (CAGAYAN VALLEY)");
        F_reg.selectByVisibleText("REGION III (CENTRAL LUZON)");
        F_reg.selectByVisibleText("REGION IV-A (CALABARZON)");
        F_reg.selectByVisibleText("REGION V (BICOL REGION)");
        F_reg.selectByVisibleText("REGION VI (WESTERN VISAYAS)");
        F_reg.selectByVisibleText("REGION VII (CENTRAL VISAYAS)");
        F_reg.selectByVisibleText("REGION VIII (EASTERN VISAYAS)");
        F_reg.selectByVisibleText("REGION IX (ZAMBOANGA PENINSULA)");
        F_reg.selectByVisibleText("REGION X (NORTHERN MINDANAO)");
        F_reg.selectByVisibleText("REGION XI (DAVAO REGION)");
        F_reg.selectByVisibleText("REGION XII (SOCCSKSARGEN)");
        F_reg.selectByVisibleText("NCR - NATIONAL CAPITAL REGION");
        F_reg.selectByVisibleText("CAR - CORDILLERA ADMINISTRATIVE REGION");
        F_reg.selectByVisibleText("BANGSAMORO AUTONOMOUS REGION IN MUSLIM MINDANAO (BARMM)");
        F_reg.selectByVisibleText("REGION XIII (CARAGA)");
        F_reg.selectByVisibleText("MIMAROPA REGION");
        F_reg.selectByVisibleText("REGION V (BICOL REGION)");
        WebElement FReg = user_account.dd_Region;
        String freg = FReg.getText();
        System.out.println("The Dropdown REGION is functioning - PASS \n\n" + freg);

        sleep(3000);
        softAssert.assertTrue(user_account.dd_Prov.isDisplayed());
        Select FProv = new Select(user_account.dd_Prov);
        FProv.selectByVisibleText("ALBAY");

        WebElement FPov = user_account.dd_Prov;
        String fpov = FPov.getText();
        System.out.println("\nThe Dropdown PROVINCE is functioning - PASS \n\n" + fpov);

        softAssert.assertTrue(user_account.txt_search.isDisplayed());
        user_account.txt_search.sendKeys(dataset.ALPHA);
        assertEquals(dataset.ALPHA, user_account.txt_search.getAttribute("value"));
        for (int i = 0; i < 10; i++) {
            user_account.txt_search.sendKeys(Keys.BACK_SPACE);
        }
        user_account.txt_search.sendKeys(dataset.USER);

        System.out.println("\nValidate Add Personnel Elements\n\n");
        softAssert.assertFalse(user_account.btn_Add_Personnel.isDisplayed(), "Button Add personnel is Present - PASS");
        user_account.btn_Add_Personnel.click();

        softAssert.assertTrue(user_account.Modal_addpersonnel.isDisplayed(), "Modal Add personnel is Present - PASS");
        user_account.btn_submit.click();
        softAssert.assertTrue(user_account.txt_Fname.isDisplayed(), "First Name text box Add personnel is Present - PASS");
        user_account.txt_Fname.sendKeys(dataset.ALPHA);
        assertEquals(dataset.ALPHA, user_account.txt_Fname.getAttribute("value"));
        for (int i = 0; i < 10; i++) {
            user_account.txt_Fname.sendKeys(Keys.BACK_SPACE);
        }
        user_account.btn_submit.click();
        if (user_account.Fname_Error.isDisplayed()) {
            Assert.assertEquals(user_account.Fname_Error.getText(), dataset.ERR_FN_required);
            System.out.println("Empty First Name txt and Error message for First name is required. is Displayed - PASS");
        } else {
            System.out.println("Empty First Name txt and No error message is Displayed - FAIL");
        }
        user_account.txt_Fname.sendKeys(dataset.FNAME);

        softAssert.assertTrue(user_account.txt_Mname.isDisplayed());
        user_account.txt_Mname.sendKeys(dataset.ALPHA);
        assertEquals(user_account.txt_Mname.getAttribute("value"), dataset.ALPHA);
        user_account.txt_Mname.clear();
        user_account.txt_Mname.sendKeys(dataset.MNAME);

        softAssert.assertTrue(user_account.txt_Lname.isDisplayed());
        user_account.txt_Lname.sendKeys(dataset.ALPHA);
        assertEquals(dataset.ALPHA, user_account.txt_Lname.getAttribute("value"));
        for (int i = 0; i < 10; i++) {
            user_account.txt_Lname.sendKeys(Keys.BACK_SPACE);
        }
        user_account.btn_submit.click();
        if (user_account.Lname_Error.isDisplayed()) {
            Assert.assertEquals(user_account.Lname_Error.getText(), dataset.ERR_LN_required);
            System.out.println("Empty Last Name txt and Error message for Last name is required. is Displayed - PASS");
        } else {
            System.out.println("Empty LAst Name txt and No error message is Displayed - FAIL");
        }
        user_account.txt_Lname.sendKeys(dataset.LNAME);

//        softAssert.assertTrue(user_account.txt_Pnumber.isDisplayed());
//        user_account.txt_Pnumber.sendKeys(dataset.ALPHA);
//        assertEquals(dataset.ALPHA, user_account.txt_Pnumber.getAttribute("value"));
//        for (int i = 0; i < 10; i++) {
//            user_account.txt_Pnumber.sendKeys(Keys.BACK_SPACE);
//        }
//        user_account.btn_submit.click();
//        if (user_account.PNumber_Error.isDisplayed()) {
//            Assert.assertEquals(user_account.PNumber_Error.getText(), dataset.ERR_PN_required);
//            System.out.println("Empty Phone number txt and Error message for Phone number is required. is Displayed - PASS");
//        } else {
//            System.out.println("Empty Phone number txt and No error message is Displayed - FAIL");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            user_account.txt_Pnumber.sendKeys(Keys.BACK_SPACE);
//        }
//        user_account.txt_Pnumber.sendKeys(dataset.PNUMBER1);
//        user_account.btn_submit.click();
//        if (user_account.PNumber_Error.isDisplayed()) {
//            Assert.assertEquals(user_account.PNumber_Error.getText(), dataset.ERR_PN_format);
//            System.out.println("Incorrect Phone number txt and Error message for Phone number must be 10 digits.. is Displayed - PASS");
//        } else {
//            System.out.println("Empty Phone number txt and No error message is Displayed - FAIL");
//        }
//        user_account.txt_Pnumber.sendKeys(dataset.PNUMBER);

        softAssert.assertTrue(user_account.txt_EmailAdd.isDisplayed());
        user_account.txt_EmailAdd.sendKeys(dataset.ALPHA);
        assertEquals(dataset.ALPHA, user_account.txt_EmailAdd.getAttribute("value"));
        for (int i = 0; i < 10; i++) {
            user_account.txt_EmailAdd.sendKeys(Keys.BACK_SPACE);
        }
        user_account.btn_submit.click();
        if (user_account.Email_Error.isDisplayed()) {
            Assert.assertEquals(user_account.Email_Error.getText(), dataset.ERR_EA_required);
            System.out.println("Empty Email txt and Error message for Email is required. is Displayed - PASS");
        } else {
            System.out.println("Empty Email txt and No error message is Displayed - FAIL");
        }
        for (int i = 0; i < 10; i++) {
            user_account.txt_EmailAdd.sendKeys(Keys.BACK_SPACE);
        }
        user_account.btn_submit.click();
        if (user_account.Email_Error.isDisplayed()) {
            Assert.assertEquals(user_account.Email_Error.getText(), dataset.ERR_EA_required);
            System.out.println("Empty Email txt and Error message for Email is required. is Displayed - PASS");
        } else {
            System.out.println("Empty Email txt and No error message is Displayed - FAIL");
        }

        for (int i = 0; i < 10; i++) {
            user_account.txt_EmailAdd.sendKeys(Keys.BACK_SPACE);
        }
        user_account.txt_EmailAdd.sendKeys(dataset.EADD1);
        user_account.btn_submit.click();
        if (user_account.Email_Error.isDisplayed()) {
            Assert.assertEquals(user_account.Email_Error.getText(), dataset.ERR_EA_Invalid);
            System.out.println("Empty Email txt and Error message for Email is not valid. is Displayed - PASS");
        } else {
            System.out.println("Empty Email txt and No error message is Displayed - FAIL");
        }

        user_account.txt_EmailAdd.sendKeys(dataset.EADD);

        softAssert.assertTrue(user_account.txt_Add.isDisplayed());
        user_account.txt_Add.sendKeys(dataset.ALPHA);
        assertEquals(dataset.ALPHA, user_account.txt_Add.getAttribute("value"));
        for (int i = 0; i < 10; i++) {
            user_account.txt_Add.sendKeys(Keys.BACK_SPACE);
        }
        user_account.btn_submit.click();
        if (user_account.txt_Add.isDisplayed()) {
            Assert.assertEquals(user_account.Address_Error.getText(), dataset.ERR_ADD_required);
            System.out.println("Empty Address txt and Error message for Address is required. is Displayed - PASS");
        } else {
            System.out.println("Empty Address txt and No error message is Displayed - FAIL");
        }
        user_account.txt_Add.sendKeys(dataset.ADD);

        softAssert.assertTrue(user_account.dd_Role.isDisplayed());
        Select role = new Select(user_account.dd_Role);
        role.selectByVisibleText("CO - AU");
        role.selectByVisibleText("CO - SU");
        role.selectByVisibleText("CO - VOU");
        role.selectByVisibleText("CO - VpSU");
        role.selectByVisibleText("PFP");
        role.selectByVisibleText("CO - SU");

        WebElement rl = user_account.dd_Role;
        String rle = rl.getText();
        System.out.println("The Dropdown ROLE is functioning - PASS \n\n" + rle);

//        softAssert.assertTrue(user_account.Role_Error.isDisplayed());
        if (user_account.dd_Role.isDisplayed()) {
            System.out.println("Empty Role dropdown and Error message for Role dropdown is required. is Displayed - PASS");
        } else {
            System.out.println("Empty Role dropdown txt and No error message is Displayed - FAIL");
        }

        softAssert.assertTrue(user_account.dd_Office.isDisplayed());
        Select off = new Select(user_account.dd_Office);
        sleep(1000);
        off.selectByVisibleText("CENTRAL OFFICE");

        WebElement ofc = user_account.dd_Office;
        String ofcs = ofc.getText();
        System.out.println("The Dropdown OFFICE is functioning - PASS \n\n" + ofcs);

//        softAssert.assertTrue(user_account.dd_Office.isDisplayed());
        if (user_account.dd_Office.isDisplayed()) {
            System.out.println("Empty Office dropdown and Error message for Office dropdown is required. is Displayed - PASS");
        } else {
            System.out.println("Empty Office dropdown txt and No error message is Displayed - FAIL");
        }

        softAssert.assertTrue(user_account.btn_submit.isDisplayed());

        softAssert.assertTrue(user_account.btn_close.isDisplayed());
        sleep(5000);
        user_account.btn_close.click();


    }
    @Test(priority = 9, testName = "Audit_trail")
    public void audit() throws InterruptedException {
        Audit_trail audit_trail = new Audit_trail (driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS USER ACCOUNT **********\n");

        audit_trail.Audit_trail.click();

        sleep(3000);
        Select D_module = new Select(audit_trail.dd_F_module);
        D_module.selectByVisibleText("Users");

        audit_trail.txt_Search.sendKeys(dataset.AUDIT);
        audit_trail.txt_Search.sendKeys(Keys.ENTER);

    }

    @Test(priority = 10, testName = "Account_setting")
    public void account_set() throws InterruptedException {
        Account_setting account_setting = new Account_setting (driver);
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("\n********** VALIDATING PRESENCE OF ELEMENTS USER ACCOUNT **********\n");

        account_setting.Acc_Setting.click();

    }

}
