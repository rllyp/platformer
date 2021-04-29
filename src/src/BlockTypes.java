package src;

/**
 * Contains lists of blocks and their variants
 * 
 * @author Riley Power
 * @version April 26 2021
 */
public class BlockTypes {
	// The list of every possible block
	public static final String[] blockList = { "ground", "groundcorner", "groundcorneroutside", "dirt", "brick", "grid",
			"lavatop", "lavabase", "lavacorner", "gay" };

	public static final String[] enemyList = { "firehopper" };

	// The list of all the blocks that can harm the player
	public static final String[] lethalBlocks = { "lavatop", "lavacorner" };
}// BlockTypes