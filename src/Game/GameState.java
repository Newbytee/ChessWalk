package Game;

import java.util.HashMap;

/**
 * @noinspection ALL
 */
public abstract class GameState {
    public static int mouseX = -1, mouseY = -1;
    public static int selected;
    public static int t;
    public static HashMap<Integer, Boolean> keyStates;
    public static boolean playerTurn, clearMovement, mouseRelease;
    public static int currentLevel;

    public static final int offsetX = 100, offsetY = 22;//Changing these for now makes the game break
    public static final int boardWidth = 800, boardHeight = 800;
    public static final int tileSize = 50;
}
