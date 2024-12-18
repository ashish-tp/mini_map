import java.awt.Graphics;
import java.util.Optional;

public interface CellInterface {
    public void paint(Graphics g, Optional<Item> i, Optional<Actor> a);
    public int leftOfComparison(Cell c) ;
    public int aboveComparison(Cell c) ;
}
