import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Dog extends Actor {
  public Dog(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 1);
    strat = new ChaseMove();
  }

  @Override
  public void paint(Graphics g) {
    g.drawImage(img, loc.x, loc.y, size, size, null);
  }

  @Override
  public void setLocation(Cell inLoc) {
    loc=inLoc;
  }

  @Override
  public Cell getLocation() {
    return loc;
  }
  
}
