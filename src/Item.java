import java.awt.image.BufferedImage;

public abstract class Item implements ActorItemInterface{
  Cell loc;
  protected String desc;
  protected BufferedImage image;

  public Item(Cell l, BufferedImage i, String d) {
    loc = l;
    image = i;
    desc = d;
  }
}
