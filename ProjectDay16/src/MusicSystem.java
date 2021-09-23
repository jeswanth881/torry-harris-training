public class MusicSystem {
    private String musicSystemName;
    private int noOfSpeakers;
    private boolean subWoofer;
    private int lcdScreenSize;

    public MusicSystem(String musicSystemName, int noOfSpeakers, boolean subWoofer, int lcdScreenSize) {
        this.musicSystemName = musicSystemName;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
        this.lcdScreenSize = lcdScreenSize;
    }

    public String getMusicSystemName() {
        return musicSystemName;
    }

    public void setMusicSystemName(String musicSystemName) {
        this.musicSystemName = musicSystemName;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public void setSubWoofer(boolean subWoofer) {
        this.subWoofer = subWoofer;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}