package tictactoe;

import java.util.Arrays;

public class GameUtils {

    public static boolean performAllWinChecks(Board gameField, String symbol) {
        return horizontalCheck(gameField, symbol) || verticalCheck(gameField, symbol)
                || diagonalCheck(gameField, symbol);
    }

    public static boolean horizontalCheck(Board gameField, String symbol) {
        String[] pattern = {symbol, symbol, symbol};
        String[] first = {gameField.getCharacterFromIndex(0), gameField.getCharacterFromIndex(1), gameField.getCharacterFromIndex(2)};
        String[] second = {gameField.getCharacterFromIndex(3), gameField.getCharacterFromIndex(4), gameField.getCharacterFromIndex(5)};
        String[] third = {gameField.getCharacterFromIndex(6), gameField.getCharacterFromIndex(7), gameField.getCharacterFromIndex(8)};
        return (Arrays.equals(pattern, first)) || Arrays.equals(pattern, second) || Arrays.equals(pattern, third);
    }

    public static boolean verticalCheck(Board gameField, String symbol) {
        String[] pattern = {symbol, symbol, symbol};
        String[] first = {gameField.getCharacterFromIndex(0), gameField.getCharacterFromIndex(3), gameField.getCharacterFromIndex(6)};
        String[] second = {gameField.getCharacterFromIndex(1), gameField.getCharacterFromIndex(4), gameField.getCharacterFromIndex(7)};
        String[] third = {gameField.getCharacterFromIndex(2), gameField.getCharacterFromIndex(5), gameField.getCharacterFromIndex(8)};
        return (Arrays.equals(pattern, first)) || Arrays.equals(pattern, second) || Arrays.equals(pattern, third);
    }

    public static boolean diagonalCheck(Board gameField, String symbol) {
        String[] pattern = {symbol, symbol, symbol};
        String[] first = {gameField.getCharacterFromIndex(0), gameField.getCharacterFromIndex(4), gameField.getCharacterFromIndex(8)};
        String[] second = {gameField.getCharacterFromIndex(2), gameField.getCharacterFromIndex(4), gameField.getCharacterFromIndex(6)};
        return (Arrays.equals(pattern, first)) || Arrays.equals(pattern, second);

    }


}

