package M2024_02;

import java.util.Scanner;

public class BadukGame {
	
    public static final int BOARD_SIZE = 9;
    public static final char EMPTY = '-';
    public static final char BLACK_STONE = '●';
    public static final char WHITE_STONE = '○';

    private char[][] board;
    private char currentPlayer;

    public BadukGame() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
        currentPlayer = BLACK_STONE;
    }

    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        System.out.println("  A B C D E F G H I");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeStone(int row, int col) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE || board[row][col] != EMPTY) {
            return false;
        }
        board[row][col] = currentPlayer;
        return true;
    }

    public boolean checkWin(int row, int col) {
        char stone = board[row][col];
        int count = 1;

        // 가로 방향 검사
        count += countStonesInDirection(row, col, 0, 1, stone);
        count += countStonesInDirection(row, col, 0, -1, stone);

        if (count >= 5) {
            return true;
        }

        count = 1; // count 초기화

        // 세로 방향 검사
        count += countStonesInDirection(row, col, 1, 0, stone);
        count += countStonesInDirection(row, col, -1, 0, stone);

        if (count >= 5) {
            return true;
        }

        count = 1; // count 초기화

        // 대각선 방향 검사
        count += countStonesInDirection(row, col, 1, 1, stone);
        count += countStonesInDirection(row, col, -1, -1, stone);

        if (count >= 5) {
            return true;
        }

        count = 1; // count 초기화

        count += countStonesInDirection(row, col, 1, -1, stone);
        count += countStonesInDirection(row, col, -1, 1, stone);

        return count >= 5;
    }

    private int countStonesInDirection(int row, int col, int deltaRow, int deltaCol, char stone) {
        int count = 0;
        int r = row + deltaRow;
        int c = col + deltaCol;

        while (r >= 0 && r < BOARD_SIZE && c >= 0 && c < BOARD_SIZE && board[r][c] == stone) {
            count++;
            r += deltaRow;
            c += deltaCol;
        }

        return count;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == BLACK_STONE) ? WHITE_STONE : BLACK_STONE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BadukGame game = new BadukGame();

        System.out.println("바둑 게임을 시작합니다.");

        while (true) {
            game.printBoard();
            System.out.println("현재 차례: " + (game.currentPlayer == BLACK_STONE ? "흑돌" : "백돌"));
            System.out.print("돌을 놓을 위치를 입력하세요 (예: A1): ");
            String input = scanner.next().toUpperCase();
            if (input.equals("QUIT")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            char colChar = input.charAt(0);
            int row = Integer.parseInt(input.substring(1)) - 1;
            int col = colChar - 'A';

            if (game.placeStone(row, col)) {
                if (game.checkWin(row, col)) {
                    game.printBoard();
                    System.out.println("게임 종료! " + (game.currentPlayer == BLACK_STONE ? "흑돌" : "백돌") + "이 이겼습니다!");
                    break;
                }
                game.switchPlayer();
            } else {
                System.out.println("잘못된 위치입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}

