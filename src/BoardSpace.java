import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class BoardSpace {
    // Stackpane to stack the rectangle, shape, and border on top of each other
    private final StackPane stackPane;
    // Rectangle that represents the background of the space
    private final Rectangle rect;
    // What row is this space in
    private final int row;
    // What col is this space in
    private final int col;
    // What squid lives here, this can be null
    private Piece piece;
    // The highlight around the border of the space, this can be null
    private Rectangle highlight;

    // Telescoping constructors
    public BoardSpace(Rectangle rect, int row, int col) {
        this(rect, row, col, null);
    }

    public BoardSpace(Rectangle rect, int row, int col, Piece piece) {
        this(new StackPane(), rect, row, col, piece, null);
    }

    public BoardSpace(StackPane stackPane, Rectangle rect, int row, int col, Piece piece, Rectangle highlight) {
        this.stackPane = stackPane;
        this.rect = rect;
        this.row = row;
        this.col = col;
        this.piece = piece;
        this.highlight = highlight;

        reDraw();
    }

    public BoardSpace(Piece newPiece, BoardSpace boardSpace) {
        this(
                null,
                null,
                boardSpace.row,
                boardSpace.col,
                newPiece,
                null
        );
    }

    /**
     * This function recomputes the JavaFX representation
     * of this space
     */
    private void reDraw() {
        if (stackPane != null) {
            stackPane.getChildren().clear();
            stackPane.getChildren().add(rect);
            if (piece != null) {
                //stackPane.getChildren().add(piece.getShape());
            }
            if (highlight != null) {
                stackPane.getChildren().add(highlight);
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Piece getPiece() {
        return piece;
    }

    public StackPane getStackPane() {
        return stackPane;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        reDraw();
    }
}
