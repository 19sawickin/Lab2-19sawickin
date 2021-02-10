package lab2;

public class VideoPlayer extends cs15.labs.videoLabSupport.SupportVideoPlayer {

    private LoveChannelProvider _provider;
    private VillaChannelProvider _villaProvider;
    private BeachChannelProvider _beachProvider;

    public VideoPlayer() {
        _provider = new LoveChannelProvider();
        _villaProvider = new VillaChannelProvider();
        _beachProvider = new BeachChannelProvider();
    }

    @Override
    public void addProvidersToVideoPlayer() {
        this.getChannelChooser().addProvider(_provider);

    }

}
