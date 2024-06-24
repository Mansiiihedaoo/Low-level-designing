import Modules.ScorpioBodyShell;
import Modules.ScorpioClassicBodyShell;
import Modules.ScorpioClassicEngine;
import Modules.ScorpioEngine;

public class ScorpioClassic extends Scorpio{

    public void makeScorpio(){
        System.out.println("Sporpio Classic me hu");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScorpioClassicBodyShell();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println(" Driving ScorpioClassic ");
    }
}
