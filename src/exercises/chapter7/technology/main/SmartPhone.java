package exercises.chapter7.technology.main;

import exercises.chapter7.technology.main.Computer;

public class SmartPhone extends Computer {

    private boolean screenIsCracked;


    public SmartPhone(String aBrand, String aOperatingSystem, int aYearMade, double aStorageAvailableBytes, boolean aScreenIsCracked) {
        super(aBrand, aOperatingSystem, aYearMade, aStorageAvailableBytes);
        this.screenIsCracked = aScreenIsCracked;
    }


    public boolean isScreenIsCracked() {
        return screenIsCracked;
    }

    public void setScreenIsCracked(boolean screenIsCracked) {
        this.screenIsCracked = screenIsCracked;
    }

    public String makeCall() {
        return "ring ring..... ring ring..... ring ring.....";
    }




}
