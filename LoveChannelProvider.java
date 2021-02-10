package lab2;

public class LoveChannelProvider implements VideoProvider {

    public LoveChannelProvider() {
    }

    public String showAMovie() {
        return "Dinner.mp4";
    }

    @Override
    public String getName() {
        return "Love Channel";
    }

    @Override
    public String getTopVideos() {
        return "Dinner.mp4," + "CoupleWalking.mp4," + "Proposal.mp4";
    }
}
