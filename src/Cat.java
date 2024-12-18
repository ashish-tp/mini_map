
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Cat extends Actor{
  public Cat(Cell loc, BufferedImage img, String desc, Player player) {
    super(loc, img, desc, player, 3);
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
