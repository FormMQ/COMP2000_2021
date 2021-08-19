import java.awt.Graphics;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Stage {
    Grid grid;
    Actor train;
    Actor car;
    Actor boat;
    List<Actor> actors;

    public Stage() {
        grid = new Grid();
        actors = new ArrayList<Actor>();
        actors.add(new Train(grid.cellAtColRow(0, 0)));
        actors.add(new Car(grid.cellAtColRow(0, 15)));
        actors.add(new Boat(grid.cellAtColRow(12, 9)));
    }

    public void paint(Graphics g, Point mouseLoc) {
        grid.paint(g, mouseLoc);
        for (Actor a : this.actors) {
            a.paint(g);
        }
    }
}
