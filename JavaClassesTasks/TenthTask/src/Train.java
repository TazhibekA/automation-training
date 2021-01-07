import java.sql.Time;

public class Train {
    private String destination;
    private int trainNumber;
    private Time departuretime;
    private int count;

    public Train() {
        this.destination = "";
        this.trainNumber = 0;
        this.departuretime = null;
        this.count = 0;
    }

    public Train(String destination, int trainNumber, Time departuretime, int count) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departuretime = departuretime;
        this.count = count;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Time getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Time departuretime) {
        this.departuretime = departuretime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
