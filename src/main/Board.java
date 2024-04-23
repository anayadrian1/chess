package main;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class Board {
    // Gridpane to draw in
    private final GridPane gridPane;
    // Size of the squares in the grid
    private final double spaceSize;
    // Companion to the gridpane used to lookup specific boardspaces
    private List<List<BoardSpace>> board;
    // Keeps track of where the user wants to move from
    private BoardSpace from;
    // Keeps track of the last state of the board which is used to punish the computer
    private List<List<BoardSpace>> lastBoard;
    // Keeps track of the last move of the computer which is used to punish the computer
    //private Pair<main.BoardSpace, main.BoardSpace> lastMove;
    // Is the board in a winning state?
    private boolean hasWinner = false;
    // Is the board in auto mode?
    //private boolean autoMode = false;
    // Timer used to animate auto mode
    private AnimationTimer timer;

    public Board(GridPane pane, double spaceSize) {
        this.gridPane = pane;
        this.spaceSize = spaceSize;
        board = constructBoard();
    }

    public void reset() {
    }

    public List<List<BoardSpace>> constructBoard() {
        List<List<BoardSpace>> board = new ArrayList<>();
        //TODO Fill with constructBoard
        return board;
    }
}
