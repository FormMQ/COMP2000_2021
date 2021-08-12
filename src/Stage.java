import java.awt.*;
import java.util.ArrayList;

class Stage {
    //constructor
    Grid grid;
    Train train;
    Boat boat;
    Car car;
    ArrayList<Actor> actors = new ArrayList<Actor>();
    public Stage() {
        grid = new Grid();
        car = new Car();
        boat = new Boat();
        train = new Train();
        actors.add(car);
        actors.add(boat);
        actors.add(train);
        for (Actor a:actors){
            break;
        } 
    }



    
}
