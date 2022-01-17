import jp.ac.uryukyu.ie.e215706.Sudoku;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku1 = new Sudoku(9, 8, 1, 0, 0, 3, 0, 4, 0, 0, 0, 0, 0, 7, 9, 2, 5, 0, 0, 7, 0, 1, 0, 6, 0, 8, 3, 0, 9, 0, 4, 0, 7, 5, 0, 2, 0, 0, 8, 0, 1, 0, 7, 0, 0, 7, 0, 3, 6, 0, 5, 0, 1, 0, 3, 1, 0, 7, 0, 4, 0, 9, 0, 0, 6, 9, 2, 3, 0, 0, 0, 0, 0, 5, 0, 9, 0, 0, 3, 2, 4);
        System.out.println("はじめ");
        sudoku1.sudokuPrint(); 
        System.out.println("結果");
        sudoku1.solveSudoku();
    }
}