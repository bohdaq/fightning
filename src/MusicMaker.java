import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class MusicMaker {
    public static void main(String[] args){
//        w - whole duration
//        h - half duration
//        q - quarter duration
//        i - eighth duration
//        s - sixteenth duration
//        t - thirty-second duration
//        x - sixty-fourth duration
//        n - 1/128th duration

//        maj - Major
//        min - Minor
//        maj7 - Major 7th
//        min7 - Minor 7th
//        dim - Diminished
//        aug - Augmented
//        aug7 - Augmented 7th
//        sus - Sustained
//        add9 - Add 9


        Player player = new Player();
//        player.play("Cmaj7wa120d30 DCmaj7h Edimh FCmaj7h Gmajh ACadd9 Baug7i");
//        player.play("Cmaj7wa120d10");
//        player.play("T180 Cw Aw");
//        player.play("V0 I[Piano] A V1 I[Flute] C V0 B V1 D");
        Pattern song = new Pattern();

        Pattern doubleMeasureRest = new Pattern("Rw Rw");
        // Create the first voice
        Pattern round1 = new Pattern("V0 A C E");
        round1.add(song);

        // Create the second voice
        Pattern round2 = new Pattern("V1 D D");
        round2.add(doubleMeasureRest);
        round2.add(song);

        // Create the third voice
        Pattern round3 = new Pattern("V2 G G");
        round3.add(doubleMeasureRest);
        round3.add(doubleMeasureRest);
        round3.add(song);

        // Put the voices together
        Pattern roundSong = new Pattern();
        roundSong.add(round1);
        roundSong.add(round2);
        roundSong.add(round3);

        // Play the song!
        player.play(roundSong);
    }

}
