
import passengers.Passenger;
import routes.Route;

public class Bus13 extends Bus {
    public Bus13(Passenger passenger, Route route) {
        super(passenger, route);
    }

    public void crash() {
        System.out.println("Bus is crashed. All passengers was undied");
    }
}