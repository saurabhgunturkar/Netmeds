package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageUi;
import utils.Base;
import utils.ExtentReporter;
import utils.WebDriverHelper;

public class Homepage extends Base {

    public static ExtentTest test = ExtentReporter.eTest;
    WebDriver driver;
    WebDriverHelper helperObj;
    WebElement webElement;

    HomePageUi homePageUi = new HomePageUi();

    public Homepage(WebDriver driver) {
        this.driver = driver;
        helperObj = new WebDriverHelper(driver, test, webElement);
    }

    public void verifyNetmedsOpensinBrowser() {
        helperObj.verifyURL("https://www.netmeds.com/", "Netmeds opens in browser");
    }

    public void verifyLogo() {
        boolean isLogoDisplayed = driver.findElement(homePageUi.logo2).isDisplayed();
        Assert.assertTrue(isLogoDisplayed, "The logo should be displayed on the homepage.");
    }

    public void Medicine_Dropdown_Module(String eleName) {
        helperObj.hoverAnElement(homePageUi.medicine, "Hovered on Medicine option");
        switch (eleName) {
            case "All Medicine":
                helperObj.clickOnElement(homePageUi.allMedicine, "Clicked on All_Medicine element");
                helperObj.verifyURL_Contains_Keyword("prescriptions", "verified All_Medicine Page");
                break;
            case "Buy Again":
                helperObj.clickOnElement(homePageUi.buyAgain, "Clicked on Buy_Again element");
                // helperObj.verifyURL_Contains_Keyword("buyagain", "verified BuyAgain Page");
                break;
            case "Order Online":
                helperObj.clickOnElement(homePageUi.orderOnline, "Clicked on Order_Online element");
                // helperObj.verifyURL_Contains_Keyword("order-medicine", "verified OrderOnline
                // Page");
                break;
            default:
                System.out.println("Medicine Dropdown Module Testing is failed");
                break;
        }
    }

    public void Wellness_Module_Elements(String mainEle, String subEle) throws InterruptedException {
        helperObj.jsScrollAtTheTop();
        helperObj.mouseCursorOffsetPosition(16, 46);
        helperObj.hoverAnElement(homePageUi.wellness, "Hovered on Wellness element");
        // helperObj.mouseCursorOffsetPosition(16, 46);
        // Thread.sleep(2000);
        switch (mainEle.toLowerCase()) {
            case "ayush":
                switch (subEle.toLowerCase()) {
                    case "ayruvedic":
                        helperObj.clickOnElement(homePageUi.ayurvedic, "Clicked on Ayruvedic Element");
                        helperObj.verifyURL_Contains_Keyword("ayush/ayurvedic", "verified Ayruvedic Page");
                        break;
                    case "unani":
                        helperObj.clickOnElement(homePageUi.unani, "Clicked on Unani Element");
                        helperObj.verifyURL_Contains_Keyword("ayush/unani", "verified Unani Page");
                        break;
                    case "homeopathy":
                        helperObj.clickOnElement(homePageUi.homeopathy, "Clicked on Homeopathy Element");
                        helperObj.verifyURL_Contains_Keyword("ayush/homeopathy", "verified Ayruvedic Page");
                        break;
                    case "siddha":
                        helperObj.clickOnElement(homePageUi.siddha, "Clicked on Siddha Element");
                        helperObj.verifyURL_Contains_Keyword("ayush/siddha", "verified Siddha Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.ayush, "By default, Clicked on Ayush Element");
                        helperObj.verifyURL_Contains_Keyword("ayush", "verified Ayush Page");
                        break;
                }
                break;
            case "covid essentials":
                switch (subEle.toLowerCase()) {
                    case "oxygencan":
                        helperObj.clickOnElement(homePageUi.oxygenCan, "Clicked on OxygenCan element");
                        helperObj.verifyURL_Contains_Keyword("covid-essentials/oxygen-can", "OxygenCan  Page");
                        break;
                    case "personalhomeessential":
                        helperObj.clickOnElement(homePageUi.personalHomeEssentials,
                                "Clicked on PersonalHomeEssentials element");
                        helperObj.verifyURL_Contains_Keyword("covid-essentials/personal-home-essentials",
                                "verified PersonalHomeEssentials Page");
                        break;
                    case "businessessential":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.businessEssentails,
                                "Clicked on BusinessEssentails element");
                        helperObj.verifyURL_Contains_Keyword("business-essentials",
                                "verified BusinessEssentails Page");
                        break;
                    case "maskglovesessential":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.maskGloves, "Clicked on MaskGlovesEssentials element");
                        helperObj.verifyURL_Contains_Keyword("covid-essentials/mask-gloves-protective-equipment",
                                "verified MaskGlovesEssentials Page");
                        break;
                    case "travel":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.travelEssentials, "Clicked on TravelEssentials element");
                        helperObj.verifyURL_Contains_Keyword("covid-essentials/travel-essentials",
                                "verified TravelEssentials Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.covidEssentials,
                                "By default, clicked on Covid Essentials element");
                        helperObj.verifyURL_Contains_Keyword("covid-essentials", "verified covidEssentials Page");
                        break;
                }
                break;
            case "devices":
                switch (subEle.toLowerCase()) {
                    case "breath":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.breathEasy, "Clicked on BreathEasy element");
                        helperObj.verifyURL_Contains_Keyword("devices/breathe-easy", "verified BreathEasy Page");
                        break;
                    case "surgical":
                        helperObj.jsScrollByIndex(260);
                        helperObj.clickOnElement(homePageUi.surgicalAcessories,
                                "Clicked on Surgical Accessories element");
                        helperObj.verifyURL_Contains_Keyword("devices/surgical-accessories",
                                "verified Surgical Accessories Page");

                        break;
                    case "orthopaedics":
                        helperObj.jsScrollByIndex(260);
                        helperObj.clickOnElement(homePageUi.orthopedics, "Clicked on Orthopaedics element");
                        helperObj.verifyURL_Contains_Keyword("devices/orthopaedics", "verified Orthopedics Page");
                        break;
                    case "measurements":
                        helperObj.jsScrollByIndex(270);
                        helperObj.clickOnElement(homePageUi.measurements, "Clicked on Measurements element");
                        helperObj.verifyURL_Contains_Keyword("devices/measurements", "verified Measurements Page");
                        break;
                    default:
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.devices, "By default, clicked on Devices Element");
                        helperObj.verifyURL_Contains_Keyword("devices", "verified Devices Page");
                        break;
                }
                break;
            case "diabetes support":
                switch (subEle.toLowerCase()) {
                    case "glucometer":
                        helperObj.clickOnElement(homePageUi.glucometers, "Clicked on Glucometer element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support/glucometers",
                                "verified Glucometer Page");
                        break;
                    case "sugarsubstitutes":
                        helperObj.clickOnElement(homePageUi.sugarSubstitutes, "Clicked on sugarSubstitutes element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support/sugar-substitutes",
                                "verified SugarSubstitutes Page");
                        break;
                    case "diabetesmanagement":
                        helperObj.clickOnElement(homePageUi.diabetesManagementSupplements,
                                "Clicked on diabetesManagementSupplements element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support/diabetes-management-supplements",
                                "verified diabetesManagementSupplements Page");
                        break;
                    case "diabetescare":
                        helperObj.clickOnElement(homePageUi.diabetesCareAyruveda,
                                "Clicked on diabetesCareAyruveda element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support/diabetes-care-ayurveda",
                                "verified diabetesCareAyruveda Page");
                        break;
                    case "lancetandteststrips":
                        helperObj.clickOnElement(homePageUi.lancetsTestStrips, "Clicked on lancetsTestStrips element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support/lancets-test-strips",
                                "verified lancetsTestStrips Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.diabetesSupport,
                                "By default, clicked on DiabetesSupport element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-support", "verified DiabetesSupport Page");
                        break;
                }
                break;
            case "eyewear":
                helperObj.jsScrollByIndex(200);
                switch (subEle.toLowerCase()) {
                    case "eyeglass":
                        helperObj.clickOnElement(homePageUi.eyeGlasses, "Clicked on EyeGlasses Element");
                        helperObj.verifyURL_Contains_Keyword("eyewear/eye-glasses", "verified EyeGlasses Page");
                        break;
                    case "readinglass":
                        helperObj.clickOnElement(homePageUi.readingGlasses, "Clicked on ReadingGlasses Element");
                        helperObj.verifyURL_Contains_Keyword("eyewear/reading-glasses", "verified ReadingGlasses Page");
                        break;
                    case "contactlens":
                        helperObj.clickOnElement(homePageUi.contactLenses, "Clicked on ContactLenses Element");
                        helperObj.verifyURL_Contains_Keyword("eyewear/contact-lenses-ew",
                                "verified ContactLenses Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.eyewear, "By default, clicked on Eyewear element");
                        helperObj.verifyURL_Contains_Keyword("eyewear", "verified Eyewear Page");
                        break;
                }
                break;
            case "fitness":

                helperObj.jsScrollByIndex(340);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "weightmanagement":
                        helperObj.clickOnElement(homePageUi.weightManagement, "Clicked on WeightManagement element");
                        helperObj.verifyURL_Contains_Keyword("fitness/weight-management",
                                "verified WeightManagement Page");
                        break;
                    case "sportssupplements":
                        helperObj.clickOnElement(homePageUi.sportsSupplements, "Clicked on SportsSupplements element");
                        helperObj.verifyURL_Contains_Keyword("fitness/sports-supplements",
                                "verified SportsSupplements Page");
                        break;
                    case "smokingsupport":
                        helperObj.clickOnElement(homePageUi.smokingSupport, "Clicked on SmokingSupport element");
                        helperObj.verifyURL_Contains_Keyword("fitness/smoking-cessation-support",
                                "verified SmokingSupport Page");
                        break;
                    case "vitaminssupplements":
                        helperObj.clickOnElement(homePageUi.vitaminsSupplements,
                                "Clicked on VitaminsSupplements element");
                        helperObj.verifyURL_Contains_Keyword("fitness/vitamins-and-supplements",
                                "verified VitaminsSupplements Page");
                        break;
                    case "familynutrition":
                        helperObj.clickOnElement(homePageUi.familyNutrition, "Clicked on FamilyNutrition element");
                        helperObj.verifyURL_Contains_Keyword("fitness/family-nutrition",
                                "verified FamilyNutrition Page");
                        break;
                    case "healthfooddrink":
                        helperObj.clickOnElement(homePageUi.healthFoodDrinks, "Clicked on HealthFoodDrinks element");
                        helperObj.verifyURL_Contains_Keyword("fitness/health-food-and-drinks",
                                "verified HealthFoodDrinks Page");
                        break;
                    case "ayruvedicsupplements":
                        helperObj.clickOnElement(homePageUi.ayruvedicSupplements,
                                "Clicked on AyruvedicSupplements element");
                        helperObj.verifyURL_Contains_Keyword("fitness/ayurvedic-supplements",
                                "verified AyruvedicSupplements Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.fitness, "By default, clicked on Fitness element");
                        helperObj.verifyURL_Contains_Keyword("fitness", "verified Fitness Page");
                        break;
                }
                break;
            case "health conditions":
                helperObj.jsScrollByIndex(50);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "womencare":
                        helperObj.clickOnElement(homePageUi.womenCare, "Clicked on WomenCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/women-s-care",
                                "verified WomenCare Page");
                        break;
                    case "bonejointpain":
                        helperObj.clickOnElement(homePageUi.boneJointPain, "Clicked on BoneJointPain element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/bone-and-joint-pain",
                                "verified BoneJointPain Page");
                        break;
                    case "livercare":
                        helperObj.clickOnElement(homePageUi.liverCare, "Clicked on LiverCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/liver-care", "verified LiverCare Page");
                        break;
                    case "pilescare":
                        helperObj.clickOnElement(homePageUi.pilesCare, "Clicked on PilesCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/piles-care", "verified PilesCare Page");
                        break;
                    case "weightcare":
                        helperObj.clickOnElement(homePageUi.weightCare, "Clicked on WeightCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/weight-care",
                                "verified WeightCare Page");
                        break;
                    case "stomachcare":
                        helperObj.clickOnElement(homePageUi.stomachCare, "Clicked on StomachCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/stomach-care",
                                "verified StomachCare Page");
                        break;
                    case "mentalcare":
                        helperObj.clickOnElement(homePageUi.mentalCare, "Clicked on MentalCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/mental-care",
                                "verified MentalCare Page");
                        break;
                    case "deaddicationcare":
                        helperObj.clickOnElement(homePageUi.deaddicition, "Clicked on De-Addicition element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/de-addiction",
                                "verified De-Addicition Page");
                        break;
                    case "dibeticcare":
                        helperObj.clickOnElement(homePageUi.diabeticCare, "Clicked on DiabeticCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/diabetic-care",
                                "verified DiabeticCare Page");
                        break;
                    case "cardiacare":
                        helperObj.jsScrollByIndex(250);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.cardiacCare, "Clicked on CardiacCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/cardiac-care",
                                "verified CardiacCare Page");
                        break;
                    case "coldfevercare":
                        helperObj.jsScrollByIndex(200);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.coldFever, "Clicked on ColdFever element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/cold-and-fever",
                                "verified ColdFever Page");
                        break;
                    case "immunitycare":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.immunityCare, "Clicked on ImmunityCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/immunity-care",
                                "verified ImmunityCare Page");
                        break;
                    case "lungcare":
                        helperObj.jsScrollByIndex(270);
                        helperObj.clickOnElement(homePageUi.lungCare, "Clicked on LungCare element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions/lung-care", "verified LungCare Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.healthConditions,
                                "By default, clicked on Health Conditions element");
                        helperObj.verifyURL_Contains_Keyword("health-conditions", "verified HealthConditions Page");
                        break;
                }
                break;
            case "mom and baby":
                helperObj.jsScrollByIndex(350);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "babycare":
                        helperObj.clickOnElement(homePageUi.babyCare, "Clicked on BabyCare element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby/baby-care", "verified BabyCare Page");
                        break;
                    case "femininehygiene":
                        helperObj.clickOnElement(homePageUi.feminineHygiene, "Clicked on FeminineHygiene element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby/feminine-hygiene",
                                "verified FeminineHygiene Page");
                        break;
                    case "babybathtime":
                        helperObj.clickOnElement(homePageUi.babyBathTime, "Clicked on BabyBathTime element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby/baby-bath-time", "verified BabyBathTime Page");
                        break;
                    case "maternitycare":
                        helperObj.clickOnElement(homePageUi.maternityCare, "Clicked on MaternityCare element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby/maternity-care", "verified MaternityCare Page");
                        break;
                    case "maternityaccessories":
                        helperObj.clickOnElement(homePageUi.maternityAccessories,
                                "Clicked on MaternityAccessories element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby/maternity-accessories",
                                "verified MaternityAccessories Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.momBaby, "By default, Clicked on Mom & Baby element");
                        helperObj.verifyURL_Contains_Keyword("mom-baby", "verified Mom & Baby Page");
                        break;
                }
                break;
            case "personal care":
                helperObj.jsScrollByIndex(50);
                // Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "homehealth":
                        helperObj.clickOnElement(homePageUi.homeHealth, "Clicked on homeHealth element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/home-health", "verified homeHealth Page");
                        break;
                    case "seniorcare":
                        helperObj.clickOnElement(homePageUi.seniorCare, "Clicked on seniorCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/senior-care", "verified seniorCare Page");
                        break;
                    case "facepersonalcare":
                        helperObj.clickOnElement(homePageUi.facePersonalCare, "Clicked on FacePersonalCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/face-personal-care",
                                "verified FacePersonalCare Page");
                        break;
                    case "handsfeet":
                        helperObj.clickOnElement(homePageUi.handsFeet, "Clicked on handsFeet element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/hands-feet", "verified handsFeet Page");
                        break;
                    case "oralcare":
                        helperObj.clickOnElement(homePageUi.oralCare, "Clicked on OralCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/oral-care", "verified OralCare Page");
                        break;
                    case "bathshower":
                        helperObj.clickOnElement(homePageUi.bathShower, "Clicked on BathShower element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/bath-shower", "verified BathShower Page");
                        break;
                    case "bodycare":
                        helperObj.clickOnElement(homePageUi.bodyCare, "Clicked on BodyCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/body-care", "verified BodyCare Page");
                        break;
                    case "personalcaretoolaccessories":
                        helperObj.clickOnElement(homePageUi.personalCareToolsAccessories,
                                "Clicked on personalCareToolsAccessories element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/personal-care-tools-accessories",
                                "verified personalCareToolsAccessories Page");
                        break;
                    case "lipcare":
                        helperObj.clickOnElement(homePageUi.lipCare, "Clicked on LipCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/lip-care", "verified LipCare Page");
                        break;
                    case "bathingaccessories":
                        helperObj.jsScrollByIndex(250);
                        helperObj.clickOnElement(homePageUi.bathingAccessories,
                                "Clicked on BathingAccessories element");
                        helperObj.verifyURL_Contains_Keyword("personal-care/bathing-accessories",
                                "verified BathingAccessories Page");
                        break;
                    default:
                        // helperObj.jsScrollAtTheTop();
                        helperObj.clickOnElement(homePageUi.personalCare,
                                "By default, Clicked on personalCare element");
                        helperObj.verifyURL_Contains_Keyword("personal-care", "verified personalCare Page");
                        break;
                }
                break;
            case "sexual wellness":
                helperObj.jsScrollByIndex(350);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "condoms":
                        helperObj.clickOnElement(homePageUi.condoms, "Clicked on Condoms element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness/condoms", "verified Condoms Page");
                        break;
                    case "massagersvibrators":
                        helperObj.clickOnElement(homePageUi.massagersVibrators,
                                "Clicked on massagersVibrators element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness/massagers-vibrators",
                                "verified massagersVibrators Page");
                        break;
                    case "sexualhealthsupplements":
                        helperObj.clickOnElement(homePageUi.sexualHealthSupplements,
                                "Clicked on sexualHealthSupplements element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness/sexual-health-supplements",
                                "verified sexualHealthSupplements Page");
                        break;
                    case "lubricants":
                        helperObj.clickOnElement(homePageUi.lubricants, "Clicked on Lubricants element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness/lubricants", "verified Lubricants Page");
                        break;
                    case "sparygels":
                        helperObj.clickOnElement(homePageUi.spraysGels, "Clicked on SpraysGels element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness/sprays-gels", "verified SpraysGels Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.sexualWellness, "Clicked on sexualWellness element");
                        helperObj.verifyURL_Contains_Keyword("sexual-wellness", "verified sexualWellness Page");
                        break;
                }
                break;
            case "surgical":
                helperObj.jsScrollByIndex(50);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "respiratorysupplies":
                        helperObj.clickOnElement(homePageUi.respiratorySupplies,
                                "Clicked on respiratorySupplies element");
                        helperObj.verifyURL_Contains_Keyword("surgical/respiratory-supplies",
                                "verified respiratorySupplies Page");
                        break;
                    case "sugarconsumables":
                        helperObj.clickOnElement(homePageUi.surgicalConsumables, "Clicked on sugarSubstitutes element");
                        helperObj.verifyURL_Contains_Keyword("surgical/surgical-consumables",
                                "verified sugarSubstitutes Page");
                        break;
                    case "ivinfusion":
                        helperObj.clickOnElement(homePageUi.IvInfusion, "Clicked on IvInfusion element");
                        helperObj.verifyURL_Contains_Keyword("surgical/iv-infusion", "verified IvInfusion Page");
                        break;
                    case "surgicalinstrument":
                        helperObj.clickOnElement(homePageUi.surgicalInstrument,
                                "Clicked on surgicalInstrument element");
                        helperObj.verifyURL_Contains_Keyword("surgical/surgical-instrument",
                                "verified surgicalInstrument Page");
                        break;
                    case "dressing":
                        helperObj.clickOnElement(homePageUi.dressing, "Clicked on dressing element");
                        helperObj.verifyURL_Contains_Keyword("surgical/dressing", "verified Dressing Page");
                        break;
                    case "gicare":
                        helperObj.clickOnElement(homePageUi.giCare, "Clicked on giCare element");
                        helperObj.verifyURL_Contains_Keyword("surgical/gi-care", "verified giCare Page");
                        break;
                    case "urinarycare":
                        helperObj.clickOnElement(homePageUi.urinaryCare, "Clicked on urinaryCare element");
                        helperObj.verifyURL_Contains_Keyword("surgical/urinary-care", "verified urinaryCare Page");
                        break;
                    case "woundtreatment":
                        helperObj.clickOnElement(homePageUi.woundTreatment, "Clicked on woundTreatment element");
                        helperObj.verifyURL_Contains_Keyword("surgical/wound-treatment",
                                "verified woundTreatment Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.surgical, "By default, Clicked on Surgical element");
                        helperObj.verifyURL_Contains_Keyword("surgical", "verified Surgical Page");
                        break;
                }
                break;
            case "veterinary":
                helperObj.jsScrollByIndex(200);
                switch (subEle.toLowerCase()) {
                    case "petcare":
                        helperObj.clickOnElement(homePageUi.petcare, "Clicked on Petcare element");
                        helperObj.verifyURL_Contains_Keyword("veterinary/petcare", "verified Petcare Page");
                        break;
                    case "farmanimals":
                        helperObj.clickOnElement(homePageUi.farmAnimals, "Clicked on farmAnimals element");
                        helperObj.verifyURL_Contains_Keyword("veterinary/farm-animals", "verified farmAnimals Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.veterinary, "By default, Clicked on veterinary element");
                        helperObj.verifyURL_Contains_Keyword("veterinary", "verified Veterinary Page");
                        break;
                }
                break;
            case "stores":
                helperObj.jsScrollByIndex(350);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "vitaminstore":
                        helperObj.clickOnElement(homePageUi.vitaminStore, "Clicked on vitaminStore element");
                        helperObj.verifyURL_Contains_Keyword("the-vitamin-store", "verified vitaminStore Page");
                        break;
                    case "dermacosmetics":
                        helperObj.clickOnElement(homePageUi.dermaCosmetics, "Clicked on dermaCosmetics element");
                        helperObj.verifyURL_Contains_Keyword("derma-cosmetics", "verified dermaCosmetics Page");
                        break;
                    case "diabetescenter":
                        helperObj.clickOnElement(homePageUi.diabetesCenter, "Clicked on diabetesCenter element");
                        helperObj.verifyURL_Contains_Keyword("diabetes-center", "verified diabetesCenter Page");
                        break;
                    default:
                        break;
                }
                break;
            case "trending":
                helperObj.jsScrollByIndex(350);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "cerave":
                        helperObj.clickOnElement(homePageUi.ceraVe, "Clicked on ceraVe element");
                        helperObj.verifyURL_Contains_Keyword("brands/cerave", "verified ceraVe Page");
                        break;
                    case "cetaphill":
                        helperObj.clickOnElement(homePageUi.cetaphill, "Clicked on cetaphill element");
                        helperObj.verifyURL_Contains_Keyword("brands/cetaphil", "verified cetaphill Page");
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("Wellness Module Testing is failed");
                break;
        }
    }

    public void HealthCorner_Dropdown_Module(String eleName) throws InterruptedException {
        helperObj.hoverAnElement(homePageUi.healthCorner, "Hovered on Health Corner option");
        Thread.sleep(2000);
        switch (eleName.toLowerCase()) {
            case "healthlibrary":
                helperObj.clickOnElement(homePageUi.healthLibrary, "Clicked on HealthLibrary element");
                helperObj.verifyURL_Contains_Keyword("health-library", "verified HealthLibrary Page");
                break;
            case "allaboutcancers":
                helperObj.clickOnElement(homePageUi.allAboutCancers, "Clicked on AllAboutCancers element");
                helperObj.verifyURL_Contains_Keyword("cancer-awareness-is-power", "verified AllAboutCancers Page");
                break;
            case "coronaawareness":
                helperObj.clickOnElement(homePageUi.coronaAwareness, "Clicked on CoronaAwareness element");
                helperObj.verifyURL_Contains_Keyword("corona-awareness", "verified CoronaAwareness Page");
                break;
            default:
                System.out.println("HealthCorner Dropdown Module Testing is failed");
                break;
        }
    }

    public void beauty_module(String mainEle, String subEle) throws InterruptedException {
        helperObj.jsScrollAtTheTop();
        helperObj.mouseCursorOffsetPosition(16, 46);
        helperObj.hoverAnElement(homePageUi.beauty, "Hovered on Beauty element");
        Thread.sleep(2000);
        switch (mainEle.toLowerCase()) {
            case "fragrance":
                switch (subEle.toLowerCase()) {
                    case "men":
                        helperObj.clickOnElement(homePageUi.men, "clicked on Men element");
                        helperObj.verifyURL_Contains_Keyword("fragrances/men", "verified Fragrances-Men Page");
                        break;
                    case "unisex":
                        helperObj.clickOnElement(homePageUi.unisex, "clicked on Unisex element");
                        helperObj.verifyURL_Contains_Keyword("fragrances/unisex", "verified Fragrances-Unisex Page");
                        break;
                    case "women":
                        helperObj.clickOnElement(homePageUi.women, "clicked on Women element");
                        helperObj.verifyURL_Contains_Keyword("fragrances/women", "verified Fragrances-Women Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.fragrances, "clicked on Fragrances page");
                        break;
                }
                break;
            case "hair":
                switch (subEle.toLowerCase()) {
                    case "haircare":
                        helperObj.jsScrollByIndex(100);
                        helperObj.clickOnElement(homePageUi.haircare, "clicked on Haircare element");
                        helperObj.verifyURL_Contains_Keyword("hair/hair-care", "verified Hair-Haircare Page");
                        break;
                    case "haircolor":
                        helperObj.jsScrollByIndex(100);
                        helperObj.clickOnElement(homePageUi.haircolor, "clicked Haircolor element");
                        helperObj.verifyURL_Contains_Keyword("hair/hair-color", "verified Hair-Haircolor Page");
                        break;
                    case "hairstyling":
                        helperObj.jsScrollByIndex(100);
                        helperObj.clickOnElement(homePageUi.hairstyling, "clicked on Hairstyling element");
                        helperObj.verifyURL_Contains_Keyword("hair/hair-styling", "verified Hair-Hairstyling Page");
                        break;
                    case "hairtoolsaccessories":
                        helperObj.jsScrollByIndex(150);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.hairtoolsAccessories,
                                "clicked on HairtoolsAccessories element");
                        helperObj.verifyURL_Contains_Keyword("hair/hair-tools-accessories",
                                "verified Hair-HairToolsAccessories Page");
                        break;
                    case "scalptreatments":
                        helperObj.jsScrollByIndex(170);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.scalpTreatments, "clicked on Haircare element");
                        helperObj.verifyURL_Contains_Keyword("hair/scalp-treatment",
                                "verified Hair-ScalpTreatments Page");
                        break;
                    case "shopbyhairtype":
                        helperObj.jsScrollByIndex(180);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.shopByHairType, "clicked on ShopByHairType element");
                        helperObj.verifyURL_Contains_Keyword("hair/shop-by-hair-type",
                                "verified Hair-ShopByHairType Page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.hair, "clicked on Hair page");
                        break;
                }
                break;
            case "mensgrooming":
                helperObj.jsScrollByIndex(300);
                Thread.sleep(2000);
                switch (subEle.toLowerCase()) {
                    case "beardcare":
                        helperObj.clickOnElement(homePageUi.beardCare, "clicked on BeardCare page");
                        helperObj.verifyURL_Contains_Keyword("men-s-grooming/beard-care",
                                "verified the MensGrooming-Beardcare page");
                        break;
                    case "shaving":
                        helperObj.clickOnElement(homePageUi.shaving, "clicked on Shaving page");
                        helperObj.verifyURL_Contains_Keyword("men-s-grooming/shaving",
                                "verified the MensGrooming-Shaving page");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.mensGromming, "clicked on MensGrooming page");
                        break;
                }
                break;
            case "makeup":
                switch (subEle.toLowerCase()) {
                    case "eyes":
                        helperObj.clickOnElement(homePageUi.eyes, "clicked on Eyes page");
                        helperObj.verifyURL_Contains_Keyword("make-up/eyes",
                                "verified the MakeUp-Eyes page");
                        break;
                    case "facemakeup":
                        helperObj.clickOnElement(homePageUi.faceMakeup, "clicked on FaceMakeUp page");
                        helperObj.verifyURL_Contains_Keyword("make-up/face-makeup",
                                "verified the MakeUp-FaceMakeUp page");
                        break;
                    case "lips":
                        helperObj.clickOnElement(homePageUi.lips, "clicked on Lips page");
                        helperObj.verifyURL_Contains_Keyword("make-up/lips",
                                "verified the MakeUp-Lips page");
                        break;
                    case "makeuptoolsbrushes":
                        helperObj.clickOnElement(homePageUi.makeUpToolsBrushes, "clicked on MakeUpToolsBrushes page");
                        helperObj.verifyURL_Contains_Keyword("make-up/make-up-tools-brushes",
                                "verified the MakeUp-Make-Up-Tools-Brushes page");
                        break;
                    case "nails":
                        helperObj.clickOnElement(homePageUi.nails, "clicked on  Nails page");
                        helperObj.verifyURL_Contains_Keyword("make-up/nails",
                                "verified the MakeUp-Nails page");
                        break;
                    default:
                        break;
                }
                break;
            case "skincare":
                switch (subEle.toLowerCase()) {
                    case "aromatherapy":
                        helperObj.clickOnElement(homePageUi.aromatherapy, "cliked on Aromatherapy element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/aromatherapy",
                                "verified Skincare-Aromatherapy element");
                        break;
                    case "cleansers":
                        helperObj.clickOnElement(homePageUi.cleansers, "cliked on Cleansers element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/cleansers",
                                "verified Skincare-Cleansers element");
                        break;
                    case "eyecare":
                        helperObj.clickOnElement(homePageUi.eyecare, "cliked on Eyecare element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/eye-care",
                                "verified Skincare-Eyecare element");
                        break;
                    case "faceskincare":
                        helperObj.clickOnElement(homePageUi.faceSkinCare, "cliked on FaceSkinCare element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/face-skin-care",
                                "verified Skincare-FaceSkinCare element");
                        break;
                    case "masks":
                        helperObj.clickOnElement(homePageUi.masks, "cliked on Masks element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/masks",
                                "verified Skincare-Masks element");
                        break;
                    case "moisturizers":
                        helperObj.clickOnElement(homePageUi.moisturizers, "cliked on Moisturizers element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/moisturizers",
                                "verified Skincare-Moisturizers element");
                        break;
                    case "sunscreen":
                        helperObj.clickOnElement(homePageUi.sunscreen, "cliked on Sunscreen element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/sunscreen",
                                "verified Skincare-Sunscreen element");
                        break;
                    case "tonersserums":
                        helperObj.clickOnElement(homePageUi.tonersSerums, "cliked on TonersSerums element");
                        helperObj.verifyURL_Contains_Keyword("skin-care/toners-serums",
                                "verified Skincare-TonersSerums element");
                        break;
                    default:
                        helperObj.clickOnElement(homePageUi.skincare, "clicked on Skincare element");
                        break;
                }

                break;
            case "toolsappliances":
                switch (subEle.toLowerCase()) {
                    case "faceskintools":
                    helperObj.jsScrollByIndex(300);
                    Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.faceSkintools, "cliked on FaceSkintools element");
                        helperObj.verifyURL_Contains_Keyword("tools-appliances/face-skin-tools",
                                "verified Tools & Appliances-FaceSkintools element");
                        break;
                    case "hairstylingtools":
                    helperObj.jsScrollByIndex(300);
                    Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.hairStylingTools, "cliked on HairStylingTools element");
                        helperObj.verifyURL_Contains_Keyword("tools-appliances/hair-styling-tools",
                                "verified Tools & Appliances-HairStylingTools element");
                        break;
                    case "massagetool":
                    helperObj.jsScrollByIndex(300);
                    Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.massageTool, "cliked on FaceSkintools element");
                        helperObj.verifyURL_Contains_Keyword("tools-appliances/massage-tools",
                                "verified Tools & Appliances-MassageTool element");
                        break;
                    default:
                    helperObj.jsScrollByIndex(300);
                    Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.toolsAppliances, "clicked on ToolsAndAppliances element");
                        break;
                }
                break;
            default:
                System.out.println("Error!!!!: Beauty Module Testing is failed");
                break;
        }
    }

    public void footer_module(String mainEle, String subEle) throws InterruptedException{
        switch (mainEle.toLowerCase()) {
            case "company":
                switch (subEle.toLowerCase()) {
                    case "aboutnetmeds":
                        helperObj.jsScrollByIndex(2500);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.aboutnetmeds, "Clicked on AboutNetmeds element");
                        helperObj.verifyURL_Contains_Keyword("about-us", "Verified About-US page");
                        break;
                        case "customerspeak":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.customerSpeak, "Clicked on CustomerSpeak element");
                        helperObj.verifyURL_Contains_Keyword("testimonial", "Verified CustomerSpeak page");
                        break;
                        case "inthenews":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.inthenews, "Clicked on News element");
                        helperObj.verifyURL_Contains_Keyword("news", "Verified News page");
                        break;
                        case "career":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.career, "Clicked on Career element");
                        helperObj.switchToNewWindow("Careers");
                        // helperObj.switchToNewWindow("Homepage");
                        // helperObj.verifyURL_Contains_Keyword("career", "Verified Career page");
                        break;
                        case "contact":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.contact, "Clicked on Contact element");
                        // helperObj.verifyURL_Contains_Keyword("contact-us", "Verified Contact page");
                        break;
                    default:
                        System.err.println("Company module testing is failed");
                        break;
                }
                break;
            case "policies":
                switch (subEle.toLowerCase()) {
                    case "termsandconditions":
                    helperObj.jsScrollByIndex(2500);
                    Thread.sleep(2000);
                    helperObj.clickOnElement(homePageUi.termsAndConditions, "Clicked on termsAndConditions element");
                    helperObj.verifyURL_Contains_Keyword("terms-and-conditions", "Verified termsAndConditions page");
                        break;
                        case "privacypolicy":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.privacyPolicy, "Clicked on PrivacyPolicy element");
                        helperObj.verifyURL_Contains_Keyword("privacy-policy", "Verified PrivacyPolicy page");
                        break;
                        case "feesandpaymentspolicy":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.feesandPaymentsPolicy, "Clicked on FeesAndPaymentsPolicy element");
                        helperObj.verifyURL_Contains_Keyword("fees-and-payments-policy", "Verified FeesAndPaymentsPolicy page");
                        break;
                        case "shippinganddeliverypolicy":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.shippingandDeliveryPolicy, "Clicked on ShippingandDeliveryPolicy element");
                        helperObj.verifyURL_Contains_Keyword("shipping-and-delivery-policy", "Verified shippingandDeliveryPolicy page");
                        break;
                        case "returnrefundandcancellationpolicy":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.returnRefundandCancellationPolicy, "Clicked on ReturnRefundandCancellationPolicy element");
                        helperObj.verifyURL_Contains_Keyword("return-refund-and-cancellation-policy", "Verified ReturnRefundandCancellationPolicy page");
                        break;
                        case "editorialpolicy":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.editorialPolicy, "Clicked on EditorialPolicy element");
                        helperObj.verifyURL_Contains_Keyword("editorial-policy", "Verified EditorialPolicy page");
                        break;
                    default:
                    System.err.println("Policy module testing is failed");
                        break;
                }
                
                break;
                case "shopping":
                switch (subEle.toLowerCase()) {
                    case "browsbyatoz":
                    helperObj.jsScrollByIndex(2500);
                    Thread.sleep(2000);
                    helperObj.clickOnElement(homePageUi.browsByAtoZ, "Clicked on BrowsByAtoZ element");
                    helperObj.verifyURL_Contains_Keyword("prescriptions", "Verified BrowsByAtoZ page");
                        break;
                        case "browsbymanufacture":
                        helperObj.jsScrollByIndex(2500);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.browsByManufacture, "Clicked on BrowsByManufacture element");
                        helperObj.verifyURL_Contains_Keyword("manufacturers", "Verified BrowsByManufacture page");
                        break;
                        case "healtharticles":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.healthArticles, "Clicked on HealthArticles element");
                        helperObj.verifyURL_Contains_Keyword("health-library", "Verified HealthArticles page");
                        break;
                        case "offercoupons":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.offerCoupons, "Clicked on OfferCoupons element");
                        helperObj.verifyURL_Contains_Keyword("offers", "Verified OfferCoupons page");
                        break;
                        case "faqs":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.fAQs, "Clicked on FAQs element");
                        helperObj.verifyURL_Contains_Keyword("faqs", "Verified FAQs page");
                        break;
                    default:
                    System.err.println("Shopping module testing is failed");
                        break;
                }
                break;
                case "categories":
                switch (subEle.toLowerCase()) {
                    case "fitness2":
                        helperObj.jsScrollByIndex(2500);
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.fitness2, "clicked on Fitness category element");
                        break;
                        case "devices2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.devices2, "clicked on Devices category element");
                        break;
                        case "personalcare2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.personalCare2, "clicked on PersonalCare category element");
                        break;
                        case "ayurveda2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.ayurveda2, "clicked on Ayurveda category element");
                        break;
                        case "homeopathy2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.homeopathy2, "clicked on Homeopathy category element");
                        break;
                        case "treatments2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.treatments2, "clicked on Treatments2 category element");
                        break;
                        case "sexualwellness2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.sexualWellness2, "clicked on SexualWellness category element");
                        break;
                        case "surgicals2":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.Surgicals2, "clicked on Surgicals category element");
                        break;
                    default:
                    System.err.println("Product categories testing is failed");
                        break;
                }
                break;
                case "socialmedia":
                switch (subEle.toLowerCase()) {
                    case "patientsalike":
                    helperObj.jsScrollByIndex(2500);
                    Thread.sleep(2000);
                    helperObj.clickOnElement(homePageUi.patientsAlike, "clicked on Patients Alike category element");
                    helperObj.switchToNewWindow("patientsalike");
                    break;
                        case "facebook":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.facebook, "clicked on Facebook category element");
                        helperObj.switchToNewWindow("facebook");
                        break;
                        case "twitter":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.twitter, "clicked on Twitter category element");
                        helperObj.switchToNewWindow("twitter");
                        break;
                        case "linkedin":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.linkedIn, "clicked on LinkedIn category element");
                        helperObj.switchToNewWindow("linkedin");
                        break;
                        case "youtube":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.youtube, "clicked on Youtube category element");
                        helperObj.switchToNewWindow("youtube");
                        break;
                        case "instagram":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.instagram, "clicked on Instagram category element");
                        helperObj.switchToNewWindow("instagram");
                        break;
                        case "referearn":
                        helperObj.jsScrollAtTheBottom();
                        Thread.sleep(2000);
                        helperObj.clickOnElement(homePageUi.ReferEarn, "clicked on Refer & Earn category element");
                        helperObj.switchToNewWindow("referearn");
                        break;
                    default:
                    System.err.println("SocialMedia module testing is failed");
                        break;
                }
                break;
            default:
            System.out.println("Elements of footer module Testing is failed");
                break;
        }
    }

}