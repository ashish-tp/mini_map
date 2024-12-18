
import java.awt.image.BufferedImage;
import java.awt.Graphics;
public class Bird extends Actor{
  Cell inLoc;
  public Bird(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 2);
    strat = new EscapeMove();
 
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
