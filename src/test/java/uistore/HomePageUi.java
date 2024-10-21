package uistore;

import org.openqa.selenium.By;

public class HomePageUi {
    public By logo = By.cssSelector("img[src='https://www.netmeds.com/images/cms/aw_rbslider/slides/1704908302_1704906198_1673595841_1663609483_netmeds-new-logo.svg']");
    public By logo2 = By.xpath("//div[@class='logo']");
    // public By deliverTo = By.id("id=\"delivery_details\"");
    // public By pincodeField = By.id("rel_pincode");
    // public By searchFiled = By.className("input-text algolia-search-input aa-input headerSearchBox");
    // public By uploadElement = By.linkText("Upload");
    // // xpath("//a[@class='mini_banner_partercode']");
    // public By offersElement = By.linkText("Offers");
    // public By cartElement = By.cssSelector("div[class='text']");
    // public By signInAndsignUp = By.linkText("Sign in / Sign up");

 
    public By medicine = By.xpath("//a[text()=' Medicine']");
    public By allMedicine = By.xpath("//a[text()='All Medicines']");
    public By buyAgain = By.xpath("//a[text()='Buy Again']");
    public By orderOnline = By.xpath("//a[text()='Order Online']");

    public By wellness = By.linkText("Wellness");
        public By ayush = By.xpath("//a[text()='Ayush']");
        public By ayurvedic = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Ayurvedic']");
        public By unani = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Unani']");
        public By homeopathy = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Homeopathy']");
        public By siddha = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Siddha']");

    public By covidEssentials = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Covid Essentials']");
        public By oxygenCan = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Oxygen Can']");
        public By personalHomeEssentials = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Personal & Home Essentials']");
        public By businessEssentails = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Business Essentials']");
        public By maskGloves = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Mask, Gloves & Protective Equipment']");
        public By travelEssentials = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Travel Essentials']");

    public By devices = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Devices']");
        public By breathEasy = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Breathe Easy']");
        public By surgicalAcessories = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Surgical Accessories']");
        public By measurements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Measurements']");
        public By orthopedics = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Orthopaedics']");

    public By diabetesSupport = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Diabetes Support']");
        public By glucometers = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Glucometers']");
        public By sugarSubstitutes = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Sugar Substitutes']");
        public By diabetesManagementSupplements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Diabetes Management Supplements']");
        public By diabetesCareAyruveda = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Diabetes Care Ayurveda']");
        public By lancetsTestStrips = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Lancets & Test Strips']");

    public By eyewear = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Eyewear']");
        public By eyeGlasses = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Eye Glasses']");
        public By readingGlasses = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Reading Glasses']");
        public By contactLenses = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Contact Lenses (EW)']");
    
    public By fitness = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Fitness']");
        public By weightManagement = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Weight Management']");
        public By sportsSupplements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Sports Supplements']");
        public By smokingSupport = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Smoking Cessation Support']");
        public By vitaminsSupplements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Vitamins And Supplements']");
        public By familyNutrition = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Family Nutrition']");
        public By healthFoodDrinks = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Health Food And Drinks']");
        public By ayruvedicSupplements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Ayurvedic Supplements']");

    public By healthConditions = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Health Conditions']");
        public By womenCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()=\"Women's Care\"]");
        public By boneJointPain = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Bone And Joint Pain']");
        public By liverCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Liver Care']");
        public By pilesCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Piles Care']");
        public By weightCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Weight Care (EW)']");
        public By stomachCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Stomach Care']");
        public By mentalCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Mental Care']");
        public By deaddicition = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='De-Addiction']");
        public By diabeticCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Diabetic Care']");
        public By cardiacCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Cardiac Care']");
        public By coldFever = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Cold And Fever']");
        public By immunityCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Immunity Care']");
        public By lungCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Lung Care']");

    public By momBaby = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Mom & Baby']");
        public By babyCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Baby Care']");
        public By feminineHygiene = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Feminine Hygiene']");
        public By maternityCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Maternity Care']");
        public By babyBathTime = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Baby Bath Time']");
        public By maternityAccessories = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Maternity Accessories']");


    public By personalCare = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Personal Care']");
        public By homeHealth = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Home & Health']");
        public By seniorCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Senior Care']");
        public By facePersonalCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Face Personal Care']");
        public By handsFeet = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Hands & Feet']");
        public By oralCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Oral Care']");
        public By bathShower = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Bath & Shower']");
        public By bodyCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Body Care']");
        public By personalCareToolsAccessories = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Personal Care Tools & Accessories']");
        public By lipCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Lip Care']");
        public By bathingAccessories = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Bathing Accessories']");

    public By sexualWellness = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Sexual Wellness']");
        public By condoms = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Condoms']");
        public By massagersVibrators = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Massagers/Vibrators']");
        public By sexualHealthSupplements = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Sexual Health Supplements']");
        public By lubricants = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Lubricants']");
        public By spraysGels = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Sprays/Gels']");


    public By surgical = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Surgical']");
        public By respiratorySupplies = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Respiratory Supplies']");
        public By surgicalConsumables = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Surgical Consumables']");
        public By IvInfusion = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Iv Infusion']");
        public By surgicalInstrument = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Surgical Instrument']");
        public By dressing = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Dressing']");
        public By giCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Gi Care']");
        public By urinaryCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Urinary Care']");
        public By woundTreatment = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Wound Treatment']");

    public By veterinary = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Veterinary']");
        public By petcare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Petcare']");
        public By farmAnimals = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Farm Animals']");

    public By stores = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Stores']");
        public By vitaminStore = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Vitamin Store']");
        public By dermaCosmetics = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Derma Cosmetics']");
        public By diabetesCenter = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Diabetes Center']");

    public By trending = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Trending']");
        public By ceraVe = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='CeraVe']");
        public By cetaphill = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Cetaphill']");

    public By healthCorner = By.xpath("//a[text()=' Health Corner']");
        public By healthLibrary = By.xpath("//a[text()='Health Library']");
        public By allAboutCancers = By.xpath("//a[text()='All About Cancers']");
        public By coronaAwareness = By.xpath("//a[text()='Corona Awareness']");

        
    public By beauty = By.xpath("//a[text()='Beauty']");
        public By fragrances = By.xpath("//a[text()='Fragrances']");
            public By men = By.xpath("//a[text()='Men']");
            public By unisex = By.xpath("//a[text()='Unisex']");
            public By women = By.xpath("//a[text()='Women']");

        public By hair = By.xpath("//a[text()='Hair']");
            public By haircare = By.linkText("Hair Care");
            public By haircolor = By.xpath("Hair Color");
            public By hairstyling = By.xpath("//a[text='Hair Styling']");
            public By hairtoolsAccessories = By.linkText("Hair Tools & Accessories");
            public By scalpTreatments = By.linkText("Scalp Treatments");
            public By shopByHairType = By.linkText("Shop By Hair Type");
        
        public By mensGromming = By.linkText("Men's Grooming");
            public By beardCare = By.linkText("Beard Care");
            public By shaving = By.linkText("Shaving");
        
        public By makeup = By.xpath("//a[text()='Make-Up']");
            public By eyes = By.linkText("Eyes");
            public By faceMakeup = By.linkText("Face Makeup");
            public By lips = By.xpath("//a[text()='Lips']");
            public By makeUpToolsBrushes = By.linkText("Make-Up Tools & Brushes");
            public By nails = By.linkText("Nails");
        
        public By toyesGamesinBeauty = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Toys & Games']");
        
        public By skincare = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Skin Care']");
            public By aromatherapy = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Aromatherapy']");
            public By cleansers = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Cleansers']");
            public By eyecare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Eye Care']");
            public By faceSkinCare = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Face Skin Care']");
            public By masks = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Masks']");
            public By moisturizers = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Moisturizers']");
            public By sunscreen = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Sunscreen']");
            public By tonersSerums = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Toners & Serums']");

        public By toolsAppliances = By.xpath("//p[@class='MegaMenu_subheading']/a[text()='Tools & Appliances']");
            public By faceSkintools = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Face/Skin Tools']");
            public By hairStylingTools = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Hair Styling Tools']");
            public By massageTool = By.xpath("//ul[@class='MegaMenu_mmCategoryList']/li/a[text()='Massage Tools']");











}
