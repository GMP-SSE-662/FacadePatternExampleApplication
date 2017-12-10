import media.ContinuousAdapter;
import media.SegmentedMedia;
import media.audio.Album;
import media.audio.Audiobook;
import media.audio.Podcast;
import media.visual.Movie;

/**
 * <h1>The Main Class</h1>
 * Upon execution, the main method is called.
 */
public class Main {

    /**
     * The main method, called upon Main execution.
     * @param args unused parameter.
     */
    public static void main(String[] args) {
        String input = "";
        SegmentedMedia selectedMedia;
        ConsoleInput in = new ConsoleInput();
        while (!input.equalsIgnoreCase("e")) {
            System.out.println("Please specify which media you would like to consume: ");
            System.out.println("A. Album\nB. Audiobook\nC. Podcast\nD. Movie\nE. Quit");
            input = in.getInput();
            switch (input.toUpperCase()) {
                case "A":
                    selectedMedia = new Album("Freedom Goblin");
                    break;
                case "B":
                    selectedMedia = new Audiobook("Head First Design Patterns");
                    break;
                case "C":
                    selectedMedia = new ContinuousAdapter(new Podcast("Hello Internet"));
                    break;
                case "D":
                    selectedMedia = new ContinuousAdapter(new Movie("Arrival"));
                    break;
                case "E":
                    continue;
                default:
                    System.out.println("Please enter valid input.");
                    continue;
            }

            selectedMedia.printInstructions();
            System.out.println("E. Quit");

            while (!input.equalsIgnoreCase("e")) {
                input = in.getInput();
                switch (input.toUpperCase()) {
                    case "W":
                        selectedMedia.play();
                        break;
                    case "A":
                        selectedMedia.previousSegment();
                        break;
                    case "S":
                        selectedMedia.pause();
                        break;
                    case "D":
                        selectedMedia.nextSegment();
                    case "E":
                        continue;
                    default:
                        System.out.println("Please enter valid input");
                        break;
                }
            }
            System.out.println("Do you desire to play a new form of media? (y/n)");
            input = in.getInput().equalsIgnoreCase("n") ? "e" : "";
        }
    }
}
