import java.util.Scanner;

public class NQueens {

    public static final char EMPTY = '.';
    public static final char QUEEN = '♛';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the board size (N): ");
        int boardSize = scanner.nextInt();

        char[][] board = new char[boardSize][boardSize];
        initializeBoard(board);

        if (solveNQueens(board, 0)) {
            System.out.println("Solution found!");
            printBoard(board);
        } else {
            System.out.println("No solution exists for board size " + boardSize);
        }

        scanner.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public static boolean solveNQueens(char[][] board, int currentRow) {
        if (currentRow == board.length) {
            return true; // All queens placed successfully
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, currentRow, col)) {
                board[currentRow][col] = QUEEN;
                if (solveNQueens(board, currentRow + 1)) {
                    return true; // Solution found
                }
                board[currentRow][col] = EMPTY; // Backtrack
            }
        }

        return false; // No safe position found in current row
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == QUEEN || board[i][col] == QUEEN) {
                return false;
            }
        }

        // Check diagonals
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
