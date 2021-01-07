import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient(1,"Romanov", "", "", "","", "1131546","aaaa"));
        patients.add(new Patient(2,"Lenin", "", "", "","", "1565465","aaaa"));
        patients.add(new Patient(3,"Stalin", "", "", "" ,"", "2232323","бббб"));
        patients.add(new Patient(4,"Khrushchev", "", "", "" ,"", "2000000","бббб"));
        patients.add(new Patient(5,"Brezhnev", "", "", "" ,"", "1000000","сссс"));
        patients.add(new Patient(6,"Andropov", "", "", "" ,"", "2555555","сссс"));
        patients.add(new Patient(7,"Gorbachev", "", "", "" ,"", "3000000","бббб"));
        patients.add(new Patient(8,"Yeltsin", "", "", "" ,"", "4000000","сссс"));
        patients.add(new Patient(9,"Putin", "", "", "" ,"", "5000000","сссс"));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диагноз: ");
        String diagnose =  scanner.nextLine();

        for(Patient patient: patients){
            if(patient.getDiagnose().equals(diagnose)){
                System.out.println(patient.toString());
            }
        }


        System.out.println("Начало интервала: ");
        long begin = (long)scanner.nextInt();
        System.out.println("Конец интервала: ");
        long end = (long)scanner.nextInt();

        for(int i = 0;i < patients.size();i++){
            if(Long.parseLong(patients.get(i).getCardNumber())>=begin && Long.parseLong(patients.get(i).getCardNumber())<=end)
                System.out.println(patients.get(i).toString());
        }
    }
}
