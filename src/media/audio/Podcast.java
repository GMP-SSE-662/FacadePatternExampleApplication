package media.audio;

import media.ContinuousMedia;

/**
 * <h1>Podcast</h1>
 * A Podcast is a form of Continuous Media.
 */
public class Podcast implements ContinuousMedia {
    private String name;

    /**
     * Constructs a new instance of a Podcast.
     * @param name the name of the Podcast.
     */
    public Podcast(String name) {
        this.name = name;
    }

    @Override
    public void printInstructions() {
        System.out.println("Podcast instructions:\nW: Play\nS: Pause\n" +
                "A: 30 Seconds Back\nD: 30 Seconds Forward");
    }

    @Override
    public void play() {
        System.out.println(String.format("Playing podcast: %s.", name));
    }

    @Override
    public void pause() {
        System.out.println(String.format("Pausing podcast: %s.", name));
    }

    @Override
    public void jumpForward() {
        System.out.println("Jumping 30 seconds forward.");
    }

    @Override
    public void jumpBackward() {
        System.out.println("Jumping 30 seconds backward.");
    }
}
