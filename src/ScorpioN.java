import Modules.ScorpioBodyShell;
import Modules.ScorpioEngine;
import Modules.ScorpioNBodyShell;
import Modules.ScorpioNEngine;

public class ScorpioN extends Scorpio {

    public void makeScorpio(){
        System.out.println("Sporpio N me hu");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    }

    public void driveCar(){
        makeScorpio();
        System.out.println(" Driving ScorpioN ");
    }

}
