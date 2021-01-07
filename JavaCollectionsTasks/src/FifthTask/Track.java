package FifthTask;

public class Track implements Comparable<Track>{
    private String name;
    //duration in seconds
    private double duration;
    private MusicStyle style;

    public Track(String name, double duration, MusicStyle style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public MusicStyle getStyle() {
        return style;
    }

    public void setStyle(MusicStyle style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", style=" + style +
                '}';
    }

    @Override
    public int compareTo(Track o) {
        if (this.duration > o.duration)
            return 1;
        if (this.duration  < o.duration )
            return -1;
        else
            return 0;
    }
}
