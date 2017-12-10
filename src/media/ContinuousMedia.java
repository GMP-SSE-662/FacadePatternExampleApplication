package media;

/**
 * <h1>Continuous Media</h1>
 * Continuous media is a media type that is not
 * broken into sections.
 */
public interface ContinuousMedia {
    /**
     * Prints the media instructions.
     */
    void printInstructions();

    /**
     * Plays the media.
     */
    void play();

    /**
     * Pauses the media.
     */
    void pause();

    /**
     * Jumps the playback location for the selected media forward.
     */
    void jumpForward();

    /**
     * Jumps the playback location for the selected media backward.
     */
    void jumpBackward();
}
