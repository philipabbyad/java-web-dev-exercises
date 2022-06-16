package exercises.chapter7.technology.main;

public class Laptop extends Computer {



    private boolean isTouchScreen;
    private boolean isAsleep;

    public Laptop(String aBrand, String aOperatingSystem, int aYearMade, double aStorageAvailableBytes, boolean aIsTouchScreen, boolean aIsAsleep) {
        super(aBrand, aOperatingSystem, aYearMade, aStorageAvailableBytes);
        this.isTouchScreen = aIsTouchScreen;
        this.isAsleep = aIsAsleep;
    }


    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

    public void turnOnSleepMode() {
        this.isAsleep = true;
    }


}
