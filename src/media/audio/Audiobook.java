package media.audio;

import media.SegmentedMedia;

/**
 * <h1>Audiobook</h1>
 * An Audiobook is a form of media that is
 * broken into chapters.
 */
public class Audiobook implements SegmentedMedia {
    private String name;

    /**
     * Constructs a new instance of an Audiobook.
     * @param name the name of the Audiobook.
     */
    public Audiobook(String name) {
        this.name = name;
    }

    @Override
    public void printInstructions() {
        System.out.println("Audiobook instructions:\nW: Play\nS: Pause\n" +
                "A: Previous Chapter\nD: Next Chapter");
    }

    @Override
    public void play() {
        System.out.println(String.format("Playing audiobook: %s.", name));
    }

    @Override
    public void pause() {
        System.out.println(String.format("Pausing audiobook: %s.", name));
    }

    @Override
    public void nextSegment() {
        System.out.println(String.format("Playing next chapter of %s.", name));
    }

    @Override
    public void previousSegment() {
        System.out.println(String.format("Playing previous chapter of %s", name));
    }
}
