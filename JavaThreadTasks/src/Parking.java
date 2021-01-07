import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Parking {
    // Parking place occupied = true; free - false
    private static final boolean[] PARKING_PLACES = new boolean[5];
    // Set fair to true that for method aсquire() garantie order
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(500);
        }
    }


    public static class Car implements Runnable {

        private int carNumber;
        private static int WAITING_TIME = 5000;

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.printf("Car №%d drive to parking \n", carNumber);

            try {
                SEMAPHORE.acquire();
                int parkingNumber = -1;
                synchronized (PARKING_PLACES) {
                    for (int i = 0; i < 5; i++) {
                        if (!PARKING_PLACES[i]) {
                            PARKING_PLACES[i] = true;
                            parkingNumber = i;
                            System.out.printf("Car №%d Parked on №%d place.\n", carNumber, i);
                            break;
                        }
                    }
                }
              
                Thread.sleep(WAITING_TIME);

                synchronized (PARKING_PLACES) {
                    //Free space for car
                    PARKING_PLACES[parkingNumber] = false;
                }

                SEMAPHORE.release();
                System.out.printf("Car №%d leave the parking.\n", carNumber);

            } catch (InterruptedException e) {
            }
        }
    }
//    private int id;
//    List<ParkingPlace> places = new ArrayList<ParkingPlace>();
//
//    public Parking(List<ParkingPlace> places) {
//        this.places.addAll(places);
//    }
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public List<ParkingPlace> getPlaces() {
//        return places;
//    }
//
//    public void setPlaces(List<ParkingPlace> places) {
//        this.places = places;
//    }
//
//    private boolean searchFreeParkingPlace(ParkingPlace place, Car car) {
//        if (place.getCar() == null) {
//            place.setCar(car);
//            places.remove(place);
//            return true;
//        }
//        return false;
//    }

//    public synchronized ParkingPlace tryReserve(Car car) {
//        for (ParkingPlace place : places) {
//            if (searchFreeParkingPlace(place, car)) {
//                return place;
//            }
//        }
//        Thread.sleep();
//
//
//    }


}
