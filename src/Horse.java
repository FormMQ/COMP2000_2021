import javax.management.monitor.MonitorNotification;

public class Horse extends Actor {
    private Motif icon;

        public Horse(Cell inLoc, float inRedness) {
            setLocation(inLoc);
            redness = inRedness;
            turns = 1;
            moves = 2;
            setPoly();
        }
        @Override
        protected void setPoly() {
            icon = new Motif("images/chess/Chess_tile_n1.png");
        }
        @Override
        public void paint(Graphics g) {
            icon.draw(g, loc.x, loc.y, new Color(redness, 0f, 1f-redness));
        }
    }
