package DrawPanel;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics ghost){

        super.paintComponent(ghost);

        int width = getWidth();
        int heigth = getHeight();

        ghost.drawLine(0, heigth, 10, width );
        ghost.drawLine(0, heigth, 20, width);
        ghost.drawLine(0, heigth,30, width);
        ghost.drawLine(0, heigth,40, width);
        //ghost.drawLine(0, heigth, width, 0);

    }
}
