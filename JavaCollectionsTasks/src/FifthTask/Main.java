package FifthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Track> trackList = new ArrayList<Track>(){{
            add(new Track("A",200,MusicStyle.CLASSIC));
            add(new Track("B",250,MusicStyle.ALTERNATIVE));
            add(new Track("C",300,MusicStyle.POP));
            add(new Track("D",350,MusicStyle.ELECTRONIC));
        }};

        Disk disk = new Disk(trackList);
        Collections.sort(disk.getTracks());
        System.out.println(disk.toString());
        System.out.println(disk.getTrackByDuration(250));
    }
}
