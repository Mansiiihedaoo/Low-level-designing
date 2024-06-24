import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* SIMPLE FACTORY
       ScorpioFactory factory = new ScorpioFactory();
       Scorpio car1 = factory.createScorpio('p');
       car1.driveCar();*/

        // FACTORY METHOD PATTERN
        Collection<Scorpio> list = new ArrayList<>();
        Scorpio car1 = new ScorpioN();
        Scorpio car2 = new ScorpioClassic();
        list.add(car1);
        list.add(car2);
        for(Scorpio car : list){
            car.driveCar();

        }





    }
}