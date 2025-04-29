package ComposiciónAsociación;
import java.awt.*;

public class LineTest {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Line linea = new Line(p1,p2);
        String linea1 = linea.toString();
    }

}
