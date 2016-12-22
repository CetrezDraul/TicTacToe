package fr.alexislavaud.tictactoe.ui;

/**
 * Created by Alexis Lavaud on 22/12/2016.
 */
public final class TicTacToeBoard extends UiComponent {
    private char[][] boardPieces;

    public TicTacToeBoard() {
        this.boardPieces = new char[3][3];
    }

    private void renderGrid(float lineSize) {
        /* Draw vertical lines */
        for (int i = 0; i < 3; i++) {

        }
    }

    @Override
    public void render() {
        renderGrid(10.0f);
    }
}
