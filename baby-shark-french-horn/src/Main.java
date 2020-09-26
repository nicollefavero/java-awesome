import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Main {

    public static void main(String[] args) {
        final String instrument = "FRENCH_HORN";

        Player player = new Player();

        Pattern pattern1 = new Pattern("V0 I[" + instrument + "] Dq Eq Gi Gi Gi Gs Gi Gs Gi");
        pattern1.add("V0 I[" + instrument + "] Di Ei Gi Gi Gi Gs Gi Gs Gi", 2).add("V0 I[" + instrument + "] Gi Gi F#h").repeat(4);

        player.play(pattern1);
    }
}
