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

    public void verifyNetmedsOpensinBrowser(){
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
                //helperObj.verifyURL_Contains_Keyword("buyagain", "verified BuyAgain Page");
                break;
            case "Order Online":
                helperObj.clickOnElement(homePageUi.orderOnline, "Clicked on Order_Online element");
                //helperObj.verifyURL_Contains_Keyword("order-medicine", "verified OrderOnline Page");
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
                        helperObj.clickOnElement(homePageUi.personalCare, "By default, Clicked on personalCare element");
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
                        helperObj.verifyURL_Contains_Keyword("surgical/respiratory-supplies", "verified respiratorySupplies Page");
                        break;
                    case "sugarconsumables":
                        helperObj.clickOnElement(homePageUi.surgicalConsumables, "Clicked on sugarSubstitutes element");
                        helperObj.verifyURL_Contains_Keyword("surgical/surgical-consumables", "verified sugarSubstitutes Page");
                        break;
                    case "ivinfusion":
                        helperObj.clickOnElement(homePageUi.IvInfusion, "Clicked on IvInfusion element");
                        helperObj.verifyURL_Contains_Keyword("surgical/iv-infusion", "verified IvInfusion Page");
                        break;
                    case "surgicalinstrument":
                        helperObj.clickOnElement(homePageUi.surgicalInstrument,
                                "Clicked on surgicalInstrument element");
                        helperObj.verifyURL_Contains_Keyword("surgical/surgical-instrument", "verified surgicalInstrument Page");
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
                        helperObj.verifyURL_Contains_Keyword("surgical/wound-treatment", "verified woundTreatment Page");
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

}