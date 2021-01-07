package ThirdTask;

public class ElectronicAppliance implements Comparable<ElectronicAppliance>{
    private int power;
    private boolean on;

    public ElectronicAppliance(int power, boolean on) {
        this.power = power;
        this.on = on;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public int compareTo(ElectronicAppliance o) {
        if (this.power > o.power)
            return 1;
        if (this.power < o.power)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "ElectronicAppliance{" +
                "power=" + power +
                ", on=" + on +
                '}';
    }
}
