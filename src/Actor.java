import java.awt.image.BufferedImage;

public abstract class Actor implements ActorItemInterface {
  Cell loc;
  enum Player {Human, Bot};
  private Player player;
  int speed;
  int turns;
  protected MoveStrategy strat;
  protected String desc;
  protected BufferedImage img;

  public Actor(Cell l, BufferedImage i, String d, Player p, int s) {
    loc = l;
    img = i;
    player = p;
    speed = s;
    desc = d;
    strat = new RandomMove();
    turns = speed;
  }

  public boolean isHuman() {
    return player == Player.Human;
  }

  public boolean isBot() {
    return player == Player.Bot;
  }

}
