import java.awt.Graphics;

public interface ActorItemInterface {
    static int size = Cell.size;

    public void paint(Graphics g);
    public void setLocation(Cell inLoc);
    public Cell getLocation();
}
