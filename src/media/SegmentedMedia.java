package media;

/**
 * <h1>Segmented Media</h1>
 * Segmented media is a media type with clearly
 * defined segments (chapters, songs, etc.).
 */
public interface SegmentedMedia {
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
     * Places the playback location forward to the next segment of the media.
     */
    void nextSegment();

    /**
     * Places the playback location back to the previous segment of the media.
     */
    void previousSegment();
}
