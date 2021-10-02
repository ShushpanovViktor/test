import passengers.Passenger;
import routes.Route;

public abstract class Bus {
    private Passenger passenger;
    private Route route;

    public Bus(Passenger passenger, Route route) {
        this.passenger = passenger;
        this.route = route;
    }

    public String stopBus(){
        return passenger.goInOutBus();
    }

    public String currentStop() {
        return route.nextStop();
    }

}
