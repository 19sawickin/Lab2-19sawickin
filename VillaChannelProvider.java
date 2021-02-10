package lab2;

public class VillaChannelProvider implements VideoProvider {
    @Override
    public String getName() {
        return "Villa Channel";
    }

    @Override
    public String getTopVideos() {
        return "VillaTour.mp4," + "VillaAerial.mp4," + "Poolside.mp4,";
    }
}
