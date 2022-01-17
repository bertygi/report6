package jp.ac.uryukyu.ie.e215706;

import java.util.*;

/**
 * 空白の中に候補が一つであることをそのまま結果値にするクラス。
 */

public class NakedSingle extends Memo {
    public NakedSingle() {

    }

    /**
     * 空白の中に候補が一つである場合、それをそのまま結果値にするメソッド。
     */
    public void nakedSingle(int[][][] sudoku) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    if (result[i][j][k] == 0) {
                        ArrayList<ArrayList<TreeSet<Integer>>> memoBoxI = memoSudoku.get(i);
                        ArrayList<TreeSet<Integer>> memoBoxI_J = memoBoxI.get(j);
                        TreeSet<Integer> memoBoxI_J_K = memoBoxI_J.get(k);
                        if (memoBoxI_J_K.size() == 1) {
                            int memoResult = memoBoxI_J_K.first();
                            result[i][j][k] = memoResult;
                        }
                    }
                }
            }
        }
    }

    /**
     * 数独を解くメソッド。
     */
    @Override
    public void solve (int[][][] sudoku) {
        memo(sudoku);
        nakedSingle(sudoku);
    }
}