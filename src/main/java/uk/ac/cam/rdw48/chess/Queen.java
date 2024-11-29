package uk.ac.cam.rdw48.chess;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    public Queen(Position piecePosition, PieceColor pieceColor, Board board) {
        super(piecePosition, pieceColor, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();

        position.getAllDiagonalMoves(8, board(), nextPositions);
        position.getAllStraightMoves(8, board(), nextPositions);

        return nextPositions;
    }

    @Override
    public char icon() {
        boolean colourSwitch = pieceColor == PieceColor.BLACK;

        return colourSwitch ? '♛' : '♕';
    }

    @Override
    public int value() {
        return 10;
    }

    @Override
    public char name() {
        return 'Q';
    }
}
