package media;

/**
 * <h1>Continuous Media Adapter</h1>
 * A Continuous Media Adapter adapts a Continuous
 * Media object so that it can be interfaced as
 * a Segmented Media object.
 */
public class ContinuousAdapter implements SegmentedMedia {
    private ContinuousMedia media;

    /**
     * Constructs a new instance of Continuous Media Adapter.
     * @param media the Continuous Media adaptee object.
     */
    public ContinuousAdapter(ContinuousMedia media) {
        this.media = media;
    }

    @Override
    public void printInstructions() {
        media.printInstructions();
    }

    @Override
    public void play() {
        media.play();
    }

    @Override
    public void pause() {
        media.pause();
    }

    @Override
    public void nextSegment() {
        media.jumpForward();
    }

    @Override
    public void previousSegment() {
        media.jumpBackward();
    }
}
