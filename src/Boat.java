import java.awt.*;
import java.util.ArrayList;

public class Boat extends Actor {
    ArrayList<Polygon> shape = new ArrayList<Polygon>();

    public Boat(Cell inLoc) {
        loc = inLoc;
        Polygon leftSail = new Polygon();
        leftSail.addPoint(loc.x + 16, loc.y + 11);
        leftSail.addPoint(loc.x + 11, loc.y + 24);
        leftSail.addPoint(loc.x + 16, loc.y + 24);
        Polygon rightSail = new Polygon();
        rightSail.addPoint(loc.x + 18, loc.y + 7);
        rightSail.addPoint(loc.x + 24, loc.y + 24);
        rightSail.addPoint(loc.x + 18, loc.y + 24);
        Polygon body = new Polygon();
        body.addPoint(loc.x + 6, loc.y + 24);
        body.addPoint(loc.x + 29, loc.y + 24);
        body.addPoint(loc.x + 24, loc.y + 29);
        body.addPoint(loc.x + 11, loc.y + 29);
        this.shape.add(leftSail);
        this.shape.add(rightSail);
        this.shape.add(body);
    }

    public void paint(Graphics g) {
        for (Polygon x : this.shape) {
            g.drawPolygon(x);
        }
    }
}
