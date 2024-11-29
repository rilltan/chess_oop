package uk.ac.cam.rdw48.chess;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    public Knight(Position piecePosition, PieceColor pieceColor, Board board) {
        super(piecePosition, pieceColor, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();

        // directions a knight can travel in.
        final int[][] nextPosDeltas =
                new int[][] {
                        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
                        {2, 1}, {-2, 1}, {2, -1}, {-2, -1}
                };

        // iterate through all possible positions, getting any valid next positions
        for (int[] posDeltaPair : nextPosDeltas) {
            position.addPosAtDelta(posDeltaPair[0], posDeltaPair[1], board(), nextPositions);
        }

        return nextPositions;
    }

    @Override
    public char icon() {
        boolean colourSwitch = pieceColor == PieceColor.BLACK;

        return colourSwitch ? '♞' : '♘';
    }

    @Override
    public int value() {
        return 3;
    }

    @Override
    public char name() {
        return 'N';
    }
}
