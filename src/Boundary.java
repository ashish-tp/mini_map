import java.awt.image.BufferedImage;
import java.util.Optional;
import java.awt.Graphics;
abstract class Boundary extends Cell implements CellInterface {
  public Boundary(int col, int row, BufferedImage img) {
    super(col, row, img);
  }

  @Override
  public void paint(Graphics g, Optional<Item> i, Optional<Actor> a) {
    g.drawImage(img, x, y, size, size, null);
    if(i.isPresent()) {
      i.get().paint(g);
    }
    if(a.isPresent()) {
      a.get().paint(g);
    }
  }

  @Override
   public int leftOfComparison(Cell c) {
    return Integer.compare(col, c.col);
  }

  @Override
  public int aboveComparison(Cell c) {
    return Integer.compare(row, c.row);
  }

}
