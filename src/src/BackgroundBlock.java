package src;

/**
 * Literally just the block class but easy to skip over in collision detection
 * 
 * @author Riley
 * @version May 2, 2021
 */
public class BackgroundBlock extends Block {

	/**
	 * BackgroundBlock constructor
	 * 
	 * @param x       The X position of the block
	 * @param y       The Y position of the block
	 * @param id      The id of this block to find it later
	 * @param type    The type of block to be
	 * @param canKill If the block is lethal to the player or not
	 */
	public BackgroundBlock(int x, int y, String id, String type, boolean canKill) {
		super(x, y, id, type, canKill);
	}// BackgroundBlock

}// Background Block