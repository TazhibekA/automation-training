import java.util.Random;

public class Car  implements Runnable{
    private int WAITING_TIME;
    private int id;

    public Car(int WAITING_TIME, int id) {
        this.WAITING_TIME = WAITING_TIME;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWAITING_TIME() {
        return WAITING_TIME;
    }

    public void setWAITING_TIME(int WAITING_TIME) {
        this.WAITING_TIME = WAITING_TIME;
    }

    @Override
    public String toString() {
        return "Car{" +
                "WAITING_TIME=" + WAITING_TIME +
                ", id=" + id +
                '}';
    }

    @Override
    public void run() {


    }
}
