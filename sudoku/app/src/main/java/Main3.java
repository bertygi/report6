import jp.ac.uryukyu.ie.e215706.Sudoku;

public class Main3 {
    public static void main(String[] args) {
        Sudoku sudoku3 = new Sudoku(0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 2, 0, 6, 7, 0, 0, 0, 0, 8, 6, 4, 0, 9, 1, 0, 3, 7, 0, 0, 6, 3, 0, 4, 0, 7, 0, 2, 0, 8, 0, 0, 0, 6, 0, 3, 0, 4, 0, 5, 0, 6, 8, 0, 0, 4, 8, 0, 7, 6, 0, 1, 5, 9, 0, 0, 0, 0, 5, 2, 0, 6, 0, 6, 0, 0, 0, 0, 0, 3, 0, 0);
        System.out.println("はじめ");
        sudoku3.sudokuPrint(); 
        System.out.println("結果");
        sudoku3.solveSudoku();
    }
}
