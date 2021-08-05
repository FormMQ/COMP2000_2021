import javax.swing.JFrame;

import jdk.internal.org.jline.terminal.MouseEvent;

import java.awt.*;

public class Cell {
    // instance variables
    int x;
    int y;
    int size = 35;

    // Constructor
    public Cell(int xPos, int yPos) {
        x = xPos;
        y = yPos;

    }

    // Draw Cell
    public void drawCell(Graphics g) {
        g.drawRect(x, y, size, size);
    }

    /*public void mouseMoved() {
        break;
        //add getMousePosition compare to cell
        //change cell colour
    }*/
}
