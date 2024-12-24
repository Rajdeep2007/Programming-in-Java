import java.util.Scanner;

public class tictactoe {

  private static final char EMPTY = ' ';
  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';

  private char currentPlayer = PLAYER_X;
  private char[][] board = new char[3][3];

  public tictactoe() {
    clearBoard();
  }

  private void clearBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = EMPTY;
      }
    }
  }

  private void displayBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  private boolean isMoveValid(int row, int col) {
    return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
  }

  private void placeMove(int row, int col) {
    board[row][col] = currentPlayer;
  }

  private boolean checkWinner() {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer
          || board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
        return true;
      }
    }

    // Check diagonals
    if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer
        || board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
      return true;
    }

    return false;
  }

  private boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == EMPTY) {
          return false;
        }
      }
    }
    return true;
  }

  private void switchPlayer() {
    currentPlayer = currentPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
  }

  public void playGame() {
    Scanner scanner = new Scanner(System.in);
    int row, col;

    while (true) {
      displayBoard();
      System.out.println("Player " + currentPlayer + ", enter your move (row, col): ");

      do {
        row = scanner.nextInt() - 1;
        col = scanner.nextInt() - 1;
      } while (!isMoveValid(row, col));

      placeMove(row, col);

      if (checkWinner()) {
        displayBoard();
        System.out.println("Player " + currentPlayer + " wins!");
        break;
      } else if (isBoardFull()) {
        displayBoard();
        System.out.println("It's a tie!");
        break;
      }
      switchPlayer();
    }

    scanner.close();
  }

  public static void main(String[] args) {
    tictactoe game = new tictactoe();
    game.playGame();
  }
}
