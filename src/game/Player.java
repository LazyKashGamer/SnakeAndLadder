package game;

/**
 * Player class contains information and behavior of Player.
 * 
 * @author Jirayu Laungwilawan
 *
 */
public class Player {

	private String name;

	private Piece piece;

	private boolean isFreeze;

	public Player(String name) {
		this.name = name;
		this.piece = new Piece();
		this.isFreeze = false;
	}

	/**
	 * Check if the player freeze.
	 * 
	 * @return true if the player freeze otherwise false.
	 */
	public boolean isFreeze() {
		return isFreeze;
	}

	/**
	 * Freeze the player
	 */
	public void freeze() {
		this.isFreeze = true;
	}

	/**
	 * 
	 * Unfreeze the player
	 */
	public void unFreeze() {
		this.isFreeze = false;
	}

	/**
	 * Player roll the dice
	 * 
	 * @param die
	 *            that rolled
	 * @return the face value of the dice
	 */
	public int roll(Die die) {
		die.roll();
		return die.getFace();
	}

	/**
	 * Get the name of the player
	 * 
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * Move the piece step from the old position
	 * 
	 * @param board
	 *            that piece is on
	 * @param steps
	 *            that want to take
	 */
	public void movePiece(Board board, int steps) {
		board.movePiece(piece, steps);
	}

	/**
	 * Get the piece of the player
	 * 
	 * @return the piece of the player
	 */
	public Piece getPiece() {
		return piece;
	}
}
