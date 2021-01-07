package EighthTask;
import java.util.List;

public class Train {
    private int totalQuantity;
    private int totalBaggage;
    private List<Transport> train;

    public Train(List<Transport> train) {
        this.totalQuantity = TotalQuantity(train);
        this.totalBaggage = TotalBaggage(train);
        this.train = train;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getTotalBaggage() {
        return totalBaggage;
    }

    public void setTotalBaggage(int totalBaggage) {
        this.totalBaggage = totalBaggage;
    }

    public List<Transport> getTrain() {
        return train;
    }

    public void setTrain(List<Transport> train) {
        this.train = train;
    }

    private int TotalQuantity(List<Transport> train){
        int sum = 0;
        for(Transport transport: train){
                sum += transport.getQuantity();
        }
        return sum;
    }

    private int TotalBaggage(List<Transport> train){
        int sum = 0;
        for(Transport transport: train){
            sum += transport.getBaggage();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Train{" +
                "totalQuantity=" + totalQuantity +
                ", totalBaggage=" + totalBaggage +
                ", train=" + train +
                '}';
    }
}
