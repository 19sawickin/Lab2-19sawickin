package lab2;

public class BeachChannelProvider implements VideoProvider {
    @Override
    public String getName() {
        return "Beach Channel";
    }

    @Override
    public String getTopVideos() {
        return "BeachAerial.mp4," + "PalmTrees.mp4," + "Sunset.mp4,";
    }
}
