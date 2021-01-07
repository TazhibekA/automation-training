package FifthTask;



import java.util.List;

public class Disk {
    private double totalDuration;
    private List<Track> tracks;

    public Disk(List<Track> tracks) {
        this.totalDuration = TotalDuration(tracks);
        this.tracks = tracks;
    }



    private double TotalDuration(List<Track> tracks){
        double sum = 0;
        for(Track track :tracks){
            sum+=track.getDuration();
        }
        return sum;
    }

    private boolean HasDuration(int duration){
        for(Track track:tracks){
            if(track.getDuration()==duration) {
                return true;
            }
        }
        return false;
    }

    public Track FindDuration(int duration){
        if(this.HasDuration(duration)){
            for(Track track:tracks){
                if(track.getDuration()==duration) {
                    return track;
                }
            }
        }
        return null;
    }

    public double getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "totalDuration=" + totalDuration +
                ", tracks=" + tracks +
                '}';
    }
}
