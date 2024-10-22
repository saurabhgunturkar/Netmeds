package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import utils.Base;

public class Test_Homepage extends Base {

    // @BeforeClass
    // public void initilizeReport(){
    // ExtentReporter.extentReportsFromBase64("Pepsodent_Test_Report");
    // }

    Homepage homepage;

    @BeforeMethod
    public void startup() {
        openBrowser();
    }

    @Test(priority = 1)
    public void verify_netmeds_opens_in_Browser() {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC01_Verify Netmeds", "To test the Netmeds opens
        // in browser");
        homepage.verifyNetmedsOpensinBrowser();
        homepage.verifyLogo();
    }

    @Test(priority = 2)
    public void Medicine_Module() {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC02_MedicineModule", "To test the dropdown
        // options of medicine module on HomePage");

        homepage.Medicine_Dropdown_Module("All Medicine");
        getDriver().navigate().back();
        homepage.Medicine_Dropdown_Module("Buy Again");
        getDriver().navigate().back();
        homepage.Medicine_Dropdown_Module("Order Online");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void ayush_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC03_WellnessModule-Ayush", "To test the Ayush
        // options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("ayush", "ayruvedic");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "unani");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "homeopathy");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "siddha");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("ayush", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void covid_essentials_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC04_WellnessModule-Covid Essentials", "To test
        // the Covid Essentials options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("covid essentials", "oxygencan");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "personalhomeessential");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "businessessential");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "maskglovesessential");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "travel");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("covid essentials", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void devices_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC05_WellnessModule-Devices", "To test the Devices
        // options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("devices", "breath");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "surgical");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "orthopaedics");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "measurements");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("devices", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void diabetes_support_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC06_WellnessModule-Diabetes Support", "To test
        // the Diabetes Support options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("diabetes support", "glucometer");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "sugarsubstitutes");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "diabetesmanagement");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "diabetescare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "lancetandteststrips");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("diabetes support", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void eyewear_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC07_WellnessModule-Eyewear", "To test the Eyewear
        // options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("eyewear", "eyeglass");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", "readinglass");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", "contactlens");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("eyewear", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void fitness_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC08_WellnessModule-Fitness", "To test the Fitness
        // options of Wellness module on HomePage");

        homepage.Wellness_Module_Elements("fitness", "weightmanagement");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "sportssupplements");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "smokingsupport");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "vitaminssupplements");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "familynutrition");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "healthfooddrink");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "ayruvedicsupplements");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("fitness", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void health_conditions_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC09_WellnessModule-Health Conditions", "To test
        // the Health Conditions options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("health conditions", "womencare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "bonejointpain");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "livercare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "pilescare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "weightcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "stomachcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "mentalcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "deaddicationcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "dibeticcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "cardiacare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "coldfevercare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "immunitycare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "lungcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("health conditions", "null");
        getDriver().navigate().back();

    }

    @Test(groups = "wellness")
    public void mom_and_baby_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC10_WellnessModule-Mom & Baby", "To test the Mom
        // & Baby options of Wellness module on HomePage");

        homepage.Wellness_Module_Elements("mom and baby", "babycare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "femininehygiene");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "babybathtime");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "maternitycare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "maternityaccessories");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("mom and baby", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void Personal_Care_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC11_WellnessModule-Personal Care", "To test the
        // Personal Care options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("personal care", "homehealth");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "seniorcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "facepersonalcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "handsfeet");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "oralcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bathshower");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bodycare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "personalcaretoolaccessories");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "lipcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "bathingaccessories");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("personal care", "null");
        getDriver().navigate().back();
    }

    @Test(groups = "wellness")
    public void sexual_wellness_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC12_WellnessModule-Sexual Wellness", "To test the
        // Sexual Wellness options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("sexual wellness", "condoms");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "massagersvibrators");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "sexualhealthsupplements");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "lubricants");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "sparygels");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("sexual wellness", "null");
        getDriver().navigate().back();

    }

    @Test(groups = "wellness")
    public void surgical_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC13_WellnessModule-Surgical", "To test the
        // Surgical options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("surgical", "respiratorysupplies");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "sugarconsumables");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "ivinfusion");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "surgicalinstrument");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "dressing");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "gicare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "urinarycare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "woundtreatment");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("surgical", "null");
        getDriver().navigate().back();

    }

    @Test(groups = "wellness")
    public void veterinary_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC14_WellnessModule-Veterinary", "To test the
        // veterinary options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("veterinary", "petcare");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("veterinary", "farmanimals");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("veterinary", "null");
        getDriver().navigate().back();

    }

    @Test(groups = "wellness")
    public void stores_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC15_WellnessModule-Stores", "To test the stores
        // options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("stores", "vitaminstore");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("stores", "dermacosmetics");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("stores", "diabetescenter");
        getDriver().navigate().back();

    }

    @Test(groups = "wellness")
    public void trending_module_in_wellness_module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC16_WellnessModule-Trending", "To test the
        // trending options of Wellness module on HomePage");
        homepage.Wellness_Module_Elements("trending", "cerave");
        getDriver().navigate().back();
        homepage.Wellness_Module_Elements("trending", "cetaphill");
        getDriver().navigate().back();

    }

    @Test
    public void HealthCorner_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC17_Health Corner Module", "To test the dropdown
        // options of Health Corner module on HomePage");
        homepage.HealthCorner_Dropdown_Module("healthlibrary");
        getDriver().navigate().back();
        homepage.HealthCorner_Dropdown_Module("allaboutcancers");
        getDriver().navigate().back();
        homepage.HealthCorner_Dropdown_Module("coronaawareness");
        getDriver().navigate().back();

    }

    @Test(groups = "beauty")
    public void fragrances_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC18_Beauty Module-Fragrances", "To test the
        // fragrances elements in Beauty module");
        homepage.beauty_module("fragrance", "men");
        getDriver().navigate().back();
        homepage.beauty_module("fragrance", "unisex");
        getDriver().navigate().back();
        homepage.beauty_module("fragrance", "women");
        getDriver().navigate().back();
        homepage.beauty_module("fragrance", "");
        getDriver().navigate().back();
    }

    @Test(groups = "beauty")
    public void hair_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC18_Beauty Module-Hair", "To test the hair
        // elements in Beauty module");
        homepage.beauty_module("hair", "haircare");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "haircolor");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "hairstyling");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "hairtoolsAccessories");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "scalpTreatments");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "shopbyhairtype");
        getDriver().navigate().back();
        homepage.beauty_module("hair", "");
        getDriver().navigate().back();

    }

    @Test(groups = "beauty")
    public void mensgrooming_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC19_Beauty Module-Mens Grooming", "To test the Mens Grooming
        // elements in Beauty module");
        homepage.beauty_module("mensgrooming", "beardCare");
        getDriver().navigate().back();
        homepage.beauty_module("mensgrooming", "shaving");
        getDriver().navigate().back();
        homepage.beauty_module("mensgrooming", "");
        getDriver().navigate().back();

    }

    @Test(groups = "beauty")
    public void makeup_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC20_Beauty Module-MakeUp", "To test the MakeUp
        // elements in Beauty module");
        homepage.beauty_module("makeup", "eyes");
        getDriver().navigate().back();
        homepage.beauty_module("makeup", "faceMakeup");
        getDriver().navigate().back();
        homepage.beauty_module("makeup", "lips");
        getDriver().navigate().back();
        homepage.beauty_module("makeup", "makeUpToolsBrushes");
        getDriver().navigate().back();
        homepage.beauty_module("makeup", "nails");
        getDriver().navigate().back();
        homepage.beauty_module("makeup", "");
        getDriver().navigate().back();

    }


    @Test(groups = "beauty")
    public void skincare_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC21_Beauty Module-SkinCare", "To test the SkinCare
        // elements in Beauty module");
        homepage.beauty_module("skincare", "aromatherapy");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "cleansers");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "eyecare");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "faceSkinCare");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "moisturizers");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "sunscreen");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "tonersSerums");
        getDriver().navigate().back();
        homepage.beauty_module("skincare", "");
        getDriver().navigate().back();

    }


    @Test(groups = "beauty")
    public void toolsAppliances_Beauty_Module() throws InterruptedException {
        homepage = new Homepage(getDriver());
        // ExtentReporter.createTest("TC21_Beauty Module-Tools & Appliances", "To test the Tools and Appliances
        // elements in Beauty module");
        homepage.beauty_module("toolsappliances", "faceskintools");
        getDriver().navigate().back();
        homepage.beauty_module("toolsappliances", "hairstylingtools");
        getDriver().navigate().back();
        homepage.beauty_module("toolsappliances", "massagetool");
        getDriver().navigate().back();

    }


    @AfterMethod
    public void tearDown() {
        closeBrowser();
        // ExtentReporter.flushReports();
    }

}
