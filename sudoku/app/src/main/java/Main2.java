import jp.ac.uryukyu.ie.e215706.Sudoku;

public class Main2 {
    public static void main(String[] args) {
        Sudoku sudoku2 = new Sudoku(0, 2, 1, 6, 0, 0, 4, 9, 0, 3, 8, 0, 1, 9, 4, 0, 0, 0, 5, 0, 0, 0, 7, 0, 6, 0, 0, 0, 4, 5, 7, 0, 2, 1, 0, 0, 9, 6, 0, 0, 5, 0, 0, 7, 4, 0, 0, 2, 3, 0, 9, 8, 5, 0, 0, 0, 9, 0, 2, 0, 0, 0, 8, 0, 0, 0, 9, 3, 6, 0, 4, 5, 0, 3, 7, 0, 0, 8, 9, 6, 0);
        System.out.println("はじめ");
        sudoku2.sudokuPrint(); 
        System.out.println("結果");
        sudoku2.solveSudoku();
    }
}