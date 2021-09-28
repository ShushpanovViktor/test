import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engines.Engine12V;
import engines.FSDEngine;
import passengers.PassengerIN;
import passengers.PassengerOUT;
import routes.Route13;
import routes.Route17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Beeper horn = new Horn();
        Beeper music = new FancyMusic();
        Beeper magic = new MagicSparks();
        Engine12V engine12V = new Engine12V();

        Lambo lambo = new Lambo(magic, engine12V);
        Viper viper = new Viper(music, new FSDEngine());

        Route13 route13 = new Route13();
        Route17 route17 = new Route17();
        PassengerIN passengerIN = new PassengerIN();
        PassengerOUT passengerOUT = new PassengerOUT();


        Bus17 bus17 = new Bus17(passengerIN,route17);
        Bus13 bus13 = new Bus13(passengerOUT,route13);


        //viper.scoopFuel();
        //viper.landToPlanet();
        //System.out.println(viper.checkBeep());
        //System.out.println(viper.checkSpeed());

        //System.out.println(lambo.checkBeep());
        //System.out.println(lambo.checkSpeed());


        System.out.println(passengerIN.goInOutBus());
        System.out.println(passengerOUT.goInOutBus());
        System.out.println(route13.nextStop());
        System.out.println(passengerIN.goInOutBus());
        System.out.println(passengerOUT.goInOutBus());
        System.out.println(route17.nextStop());
    }

}
