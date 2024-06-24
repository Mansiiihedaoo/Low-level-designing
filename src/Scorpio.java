import Modules.IBodyShell;
import Modules.IEngine;
import  Modules.ScorpioEngine;
import Modules.ScorpioBodyShell;

public class Scorpio {
    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio(){
        System.out.println("Scorpio class me hu ");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }


    public void driveCar(){
        makeScorpio();
        System.out.println(" I am inside scorio parent class ");

    }
}
