package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import utils.Base;

public class TestRunner extends Base{

    // @BeforeClass
    // public void initilizeReport(){
    //     ExtentReporter.extentReportsFromBase64("Pepsodent_Test_Report");
    // }

    Homepage homepage;

    @BeforeMethod
    public void startup(){
        openBrowser();
    }

    @Test(priority = 1)
    public void verify_netmeds_opens_in_Browser(){
        homepage =new Homepage(getDriver());
        // ExtentReporter.createTest("TC01_Verify Netmeds", "To test the Netmeds opens in browser");
        homepage.verifyNetmedsOpensinBrowser();
        homepage.verifyLogo();
    }

    @Test(priority = 2)
    public void Medicine_Module(){
        homepage =new Homepage(getDriver());
        // ExtentReporter.createTest("TC02_MedicineModule", "To test the dropdown options of medicine module on HomePage");

        homepage.Medicine_Dropdown_Module("All Medicine");getDriver().navigate().back();
        homepage.Medicine_Dropdown_Module("Buy Again");getDriver().navigate().back();
        homepage.Medicine_Dropdown_Module("Order Online");getDriver().navigate().back();
    }

    @Test(priority = 3)
    public void wellness_Module(){
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC03_WellnessModule", "To test the options of Wellness module on HomePage");

        homepage.Wellness_Module_Elements("ayush", "ayruvedic"); getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "unani"); getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "homeopathy"); getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "siddha"); getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", null); getDriver().navigate().back();

        homepage.Wellness_Module_Elements("covid essentials", "oxygencan");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "personalhomeessential");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "businessessential");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "maskglovesessential");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "travel");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("devices", "breath");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "surgical");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "orthopaedics");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "measurements");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("diabetes support", "glucometer");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "sugarsubstitutes");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "diabetesmanagement");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "diabetescare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "lancetandteststrips");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("eyewear", "eyeglass");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", "readinglass");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", "contactlens");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("fitness", "weightmanagement");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "sportssupplements");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "smokingsupport");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "vitaminssupplements");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "familynutrition");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "healthfooddrink");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "ayruvedicsupplements");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("health conditions", "womencare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "bonejointpain");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "livercare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "pilescare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "weightcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "stomachcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "mentalcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "deaddicationcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "dibeticcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "cardiacare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "coldfevercare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "immunitycare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "lungcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("mom and baby", "babycare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "femininehygiene");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "babybathtime");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "maternitycare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "maternityaccessories");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("personal care", "homehealth");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "seniorcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "facepersonalcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "handsfeet");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "oralcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bathshower");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bodycare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "personalcaretoolaccessories");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "lipcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bathingaccessories");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("sexual wellness", "condoms");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "massagersvibrators");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "sexualhealthsupplements");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "lubricants");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "sparygels");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("surgical", "respiratorysupplies");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "sugarsubstitutes");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "ivinfusion");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "surgicalinstrument");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "dressing");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "gicare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "urinarycare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "woundtreatment");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("veterinary", "petcare");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("veterinary", "farmanimals");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("veterinary", null);getDriver().navigate().back();

        homepage.Wellness_Module_Elements("stores", "vitaminstore");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("stores", "dermacosmetics");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("stores", "diabetescenter");getDriver().navigate().back();

        homepage.Wellness_Module_Elements("trending", "cerave");getDriver().navigate().back();
        homepage.Wellness_Module_Elements("trending", "cetaphill");getDriver().navigate().back();

    }

    @Test(priority = 4)
    public void HealthCorner_Module(){
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC04_Health Corner Module", "To test the dropdown options of Health Corner module on HomePage");
        homepage.HealthCorner_Dropdown_Module("healthlibrary");getDriver().navigate().back();
        homepage.HealthCorner_Dropdown_Module("allaboutcancers");getDriver().navigate().back();
        homepage.HealthCorner_Dropdown_Module("coronaawareness");getDriver().navigate().back();

    }
    




    @AfterMethod
    public void tearDown(){
        closeBrowser();
        // ExtentReporter.flushReports();
    }



    
}
