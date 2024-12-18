import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Fish extends Item {
  public Fish(Cell loc, BufferedImage img, String desc) {
    super(loc, img, desc);
  }

  @Override
  public void paint(Graphics g) {
    g.drawImage(image, loc.x, loc.y, size, size, null);    
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
