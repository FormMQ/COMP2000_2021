import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


//Used tutors example to work on. Will build upon for next weeks prac.


public class Main extends JFrame implements Runnable{
    
    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
        Grid grid = new Grid();    

        @Override
        public void paint(Graphics g) {
            grid.drawGrid(g);
        }
    }
        
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    @Override
    public void run() {
        while(true) {
            this.repaint();
        }
    }
}
