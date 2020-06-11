package infprojekt;

public class Player extends Creature {
	public static final int MIN_DISTANCE = 100;

	public static final int MARGIN_HORIZ = 14;
	public static final int MARGIN_VERT = 2;
	public static final int DEFAULT_HEALTH = 100;
	public static final int DEFAULT_SPEED = 2;
	private Game game;

	public Player(Game game, Level level, int x, int y, SpriteSheet playerSprite) {
		super(game, "Player", level, playerSprite, x, y, Entity.DEFAULT_WIDTH, Entity.DEFAULT_HEIGHT, Player.DEFAULT_HEALTH, Player.DEFAULT_SPEED);
		this.game = game;
	}

	public void createBubbleIfNear(Entity entity, int line) {
		int x_d = entity.entityX - this.entityX;
		int y_d = entity.entityY - this.entityY;
		double dist = Math.sqrt(x_d*x_d + y_d * y_d);

		if (game.bubbleCreator.getCurrentBubbleI() != line && dist < MIN_DISTANCE) {
			game.bubbleCreator.createBubble(line);
		} else if (game.bubbleCreator.getCurrentBubbleI() == line && dist >= MIN_DISTANCE) {
			game.bubbleCreator.closeBubble();
		}
	}

	@Override
	public void update() {
		move();
		super.update();
		game.getGameCamera().centerOnEntity(this);
	}
}