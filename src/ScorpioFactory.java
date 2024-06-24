public class ScorpioFactory {
    public Scorpio createScorpio( char type){
        // SIMPLE FACTORY
        switch(type){
            case 'N': return new ScorpioN();
            case 'C': return new ScorpioClassic();
            default: return new Scorpio();
        }
    }
}
