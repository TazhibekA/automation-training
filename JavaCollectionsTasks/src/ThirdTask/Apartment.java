package ThirdTask;
import java.util.List;

public class Apartment {
    private double totalPower;
    private List<ElectronicAppliance> electronicAppliances;

    public Apartment(List<ElectronicAppliance> electronicAppliances) {
        this.totalPower = TotalPower(electronicAppliances);
        this.electronicAppliances = electronicAppliances;
    }

    private double TotalPower(List<ElectronicAppliance> electronicAppliances){
        double sum = 0;
        for(ElectronicAppliance electronicAppliance: electronicAppliances){
            if(electronicAppliance.isOn())
            sum += electronicAppliance.getPower();
        }
        return sum;
    }

    public double getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(double totalPower) {
        this.totalPower = totalPower;
    }

    public List<ElectronicAppliance> getElectronicAppliances() {
        return electronicAppliances;
    }

    public void setElectronicAppliances(List<ElectronicAppliance> electronicAppliances) {
        this.electronicAppliances = electronicAppliances;
    }

    public ElectronicAppliance getElectronicApplianceByPower(int power){
            for(ElectronicAppliance electronicAppliance:electronicAppliances) {
                if (electronicAppliance.getPower() == power) {
                    return electronicAppliance;
                }
            }
        return null;
    }

    public boolean isElectronicApplianceWithPowerPresent(int power){
        return getElectronicApplianceByPower(power) != null;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "totalPower=" + totalPower +
                ", electronicAppliances=" + electronicAppliances +
                '}';
    }
}
