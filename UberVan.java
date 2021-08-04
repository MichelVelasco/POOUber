import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, ArrayList<Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passengers;

    public UberVan(String license, Account driver, String brand, String model,
    Map<String, ArrayList<Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassengers(Integer passengers) {
        // TODO Auto-generated method stub
        super.setPassengers(passengers);
        if (passengers == 6){
            this.passengers = passengers;
        }else{
            System.out.println("Solo se pueden asignar 6 pasajeros");
        }
    }
}
