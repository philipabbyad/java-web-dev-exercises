package exercises.chapter7.technology.main;

import exercises.chapter7.technology.main.AbstractEntity;

public class Computer extends AbstractEntity {

    private String brand;
    private String operatingSystem;
    private double storageAvailableBytes = 1000000000;
    private int yearMade;

    public Computer(String aBrand, String aOperatingSystem, int aYearMade, double aStorageAvailableBytes) {
        this.brand = aBrand;
        this.operatingSystem = aOperatingSystem;
        this.yearMade = aYearMade;
        this.storageAvailableBytes = aStorageAvailableBytes;
    }

    //public Computer(String aBrand, String aOperatingSystem, int aYearMade) {
      //  this.brand = aBrand;
        //this.operatingSystem = aOperatingSystem;
        //this.yearMade = aYearMade;
    //}


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getStorageAvailableBytes() {
        return storageAvailableBytes;
    }

    public void setStorageAvailableBytes(double storageAvailableBytes) {
        this.storageAvailableBytes = storageAvailableBytes;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public boolean replaceYet(int currentYear) {
        return ((currentYear - this.yearMade) > 4);
    }

    public String addStorageYet() {
        if (storageAvailableBytes > 1000) {
            return "Storage not yet full!";
        } else {
            return "Storage almost full! Add storage soon.";
        }
    }


}
