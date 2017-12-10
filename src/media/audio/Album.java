package media.audio;

import media.SegmentedMedia;

/**
 * <h1>Album</h1>
 * An Album is a form of media that is broken
 * into tracks, or songs.
 */
public class Album implements SegmentedMedia {
    private String name;

    /**
     * Constructs a new instance of an Album.
     * @param name the name of the Album.
     */
    public Album(String name) {
        this.name = name;
    }

    @Override
    public void printInstructions() {
        System.out.println("Album instructions:\nW: Play\nS: Pause\n" +
                "A: Previous Track\nD: Next Track");
    }

    @Override
    public void play() {
        System.out.println(String.format("Playing album: %s.", name));
    }

    @Override
    public void pause() {
        System.out.println(String.format("Pausing album: %s.", name));
    }

    @Override
    public void nextSegment() {
        System.out.println(String.format("Playing next track of %s.", name));
    }

    @Override
    public void previousSegment() {
        System.out.println(String.format("Playing previous track of %s", name));
    }
}
