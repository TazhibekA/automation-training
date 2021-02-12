package ThirdTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElectronicAppliance> electronicApplianceList =  new ArrayList<ElectronicAppliance>(){{
            add(new Iron(13,true));
            add(new Vacuum(12,false));
        }};
        Apartment apartment = new Apartment(electronicApplianceList);
        Collections.sort(apartment.getElectronicAppliances());
        System.out.println(apartment.toString());
        System.out.println(apartment.getElectronicApplianceByPower(12));
    }
}
