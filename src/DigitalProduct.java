public class DigitalProduct extends Product {
    private String platform;         // platforma de pe care se ruleaza programul
    private String language;        // in ce limba (romana sau engleza)
    private String fileFormat;     // formatul  fisierelor de exemplu pdf , txt , mp4
    private double fileSize;      // dimensiunea fisierului
    private String licenseKey;   // cheie de licenta


    public DigitalProduct() { //Constructor fara parametri Implicit
        super();
        this.platform = "Unknown";
        this.language = "Unknown";
        this.fileFormat = "Unknown";
        this.fileSize = 0.0;
        this.licenseKey = "Unknown";
    }

    public DigitalProduct(String name, double price, String platform, String language, String fileFormat, double fileSize, String licenseKey) { // Constructor cu  parametri
        super(name, price);
        this.platform = platform;
        this.language = language;
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
        this.licenseKey = licenseKey;

    }




    public DigitalProduct(DigitalProduct copy) { // CONSTUCOTR DE COPIERE
        super(copy);
        this.platform = copy.platform;
        this.language = copy.language;
        this.fileFormat = copy.fileFormat;
        this.fileSize = copy.fileSize;
        this.licenseKey = copy.licenseKey;
    }


    public String getPlatform() {
        return platform;
    }

    public String getLanguage() {
        return language;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getLicenseKey() {
        return licenseKey;
    }


    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void setFileSize(double fileSize) {
        if (fileSize >= 0) {
            this.fileSize = fileSize;
        }
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }


    @Override
    public String toString() {
        return String.format(
                " ------- Digital Product -------\n" +
                        "Name: %s\n" +
                        "Platform: %s\n" +
                        "Language: %s\n" +
                        "File Format: %s\n" +
                        "File Size: %.2f\n" +
                        "License Key: %s\n" +
                        "Price: %.2f euros\n",
                name, platform, language, fileFormat, fileSize, licenseKey, price
        );
    }


    @Override
    public double calculatePrice() {
        if (this.price > 200) {
            return this.price * 0.85;  // reduce pretul cu 15% reducere daca pretul este mai mare de 200 de lei
        } else
            return this.price;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + " | Platform: " + platform + " | Language: " + language +
                " | File Format: " + fileFormat + " | File Size: " + fileSize + " MB" + " | LicenseKey: " + licenseKey + " | Price: " + calculatePrice() + " euros");
    }
}



