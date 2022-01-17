package jp.ac.uryukyu.ie.e215706;

import java.util.*;

/**
 * 空白に入る候補のメモをとるクラス。
 *  TreeSet memon_m;　//n行m列のメモ
 *  ArrayList memoBoxN_n; //N番目の小区間のn行のメモ
 *  ArrayList memoBoxN; //N番目の小区間のメモ
 *  ArrayList memoSudoku; //区間全体のメモ
 */

public class Memo implements Solve{
    TreeSet<Integer> memo1_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo1_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo2_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo3_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo4_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo5_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo6_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo7_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo8_9 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_1 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_2 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_3 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_4 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_5 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_6 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_7 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_8 = new TreeSet<Integer>();
    TreeSet<Integer> memo9_9 = new TreeSet<Integer>();
    ArrayList<TreeSet<Integer>> memoBox1_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo1_1,memo1_2,memo1_3));
    ArrayList<TreeSet<Integer>> memoBox1_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo2_1,memo2_2,memo2_3));
    ArrayList<TreeSet<Integer>> memoBox1_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo3_1,memo3_2,memo3_3));
    ArrayList<TreeSet<Integer>> memoBox2_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo1_4,memo1_5,memo1_6));
    ArrayList<TreeSet<Integer>> memoBox2_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo2_4,memo2_5,memo2_6));
    ArrayList<TreeSet<Integer>> memoBox2_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo3_4,memo3_5,memo3_6));
    ArrayList<TreeSet<Integer>> memoBox3_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo1_7,memo1_8,memo1_9));
    ArrayList<TreeSet<Integer>> memoBox3_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo2_7,memo2_8,memo2_9));
    ArrayList<TreeSet<Integer>> memoBox3_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo3_7,memo3_8,memo3_9));
    ArrayList<TreeSet<Integer>> memoBox4_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo4_1,memo4_2,memo4_3));
    ArrayList<TreeSet<Integer>> memoBox4_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo5_1,memo5_2,memo5_3));
    ArrayList<TreeSet<Integer>> memoBox4_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo6_1,memo6_2,memo6_3));
    ArrayList<TreeSet<Integer>> memoBox5_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo4_4,memo4_5,memo4_6));
    ArrayList<TreeSet<Integer>> memoBox5_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo5_4,memo5_5,memo5_6));
    ArrayList<TreeSet<Integer>> memoBox5_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo6_4,memo6_5,memo6_6));
    ArrayList<TreeSet<Integer>> memoBox6_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo4_7,memo4_8,memo4_9));
    ArrayList<TreeSet<Integer>> memoBox6_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo5_7,memo5_8,memo5_9));
    ArrayList<TreeSet<Integer>> memoBox6_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo6_7,memo6_8,memo6_9));
    ArrayList<TreeSet<Integer>> memoBox7_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo7_1,memo7_2,memo7_3));
    ArrayList<TreeSet<Integer>> memoBox7_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo8_1,memo8_2,memo8_3));
    ArrayList<TreeSet<Integer>> memoBox7_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo9_1,memo9_2,memo9_3));
    ArrayList<TreeSet<Integer>> memoBox8_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo7_4,memo7_5,memo7_6));
    ArrayList<TreeSet<Integer>> memoBox8_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo8_4,memo8_5,memo8_6));
    ArrayList<TreeSet<Integer>> memoBox8_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo9_4,memo9_5,memo9_6));
    ArrayList<TreeSet<Integer>> memoBox9_1 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo7_7,memo7_8,memo7_9));
    ArrayList<TreeSet<Integer>> memoBox9_2 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo8_7,memo8_8,memo8_9));
    ArrayList<TreeSet<Integer>> memoBox9_3 = new ArrayList<TreeSet<Integer>>(Arrays.asList(memo9_7,memo9_8,memo9_9));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox1 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox1_1,memoBox1_2,memoBox1_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox2 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox2_1,memoBox2_2,memoBox2_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox3 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox3_1,memoBox3_2,memoBox3_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox4 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox4_1,memoBox4_2,memoBox4_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox5 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox5_1,memoBox5_2,memoBox5_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox6 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox6_1,memoBox6_2,memoBox6_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox7 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox7_1,memoBox7_2,memoBox7_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox8 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox8_1,memoBox8_2,memoBox8_3));
    ArrayList<ArrayList<TreeSet<Integer>>> memoBox9 = new ArrayList<ArrayList<TreeSet<Integer>>>(Arrays.asList(memoBox9_1,memoBox9_2,memoBox9_3));
    ArrayList<ArrayList<ArrayList<TreeSet<Integer>>>> memoSudoku = new ArrayList<ArrayList<ArrayList<TreeSet<Integer>>>>(Arrays.asList(memoBox1,memoBox2,memoBox3,memoBox4,memoBox5,memoBox6,memoBox7,memoBox8,memoBox9));

    /**
     * コンストラクタ。
     */
    public Memo() {
        initializeMemo();
    }

    /**
     * メモを初期化するメソッド。
     */
    public void initializeMemo() {
        for (int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    TreeSet<Integer> baseBoxI = new TreeSet<Integer>();
                    baseBoxI = setBoxes.get(i);
                    baseBoxI.add(result[i][j][k]);
                    ArrayList<ArrayList<TreeSet<Integer>>> memoBoxI = memoSudoku.get(i);
                    ArrayList<TreeSet<Integer>> memoBoxI_J = memoBoxI.get(j);
                    TreeSet<Integer> memoBoxI_J_K = memoBoxI_J.get(k);
                    memoBoxI_J_K.clear();
                }
            }
        }
    }
    /**
     * 入力された数字を結果値にコピペするメソッド。
     */
    public void copy(int[][][] sudoku) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    if (sudoku[i][j][k] != 0) {
                        result[i][j][k] = sudoku[i][j][k];
                    }
                }
            }
        }
    }

    /**
     * 各小区間内の数字を比較し、空白の候補のメモをとるメソッド。
     */
    public void memoBox(int[][][] sudoku) {
        for (int x=0; x<2; x++) {
            for (int i=0; i<9; i++) {
                for (int j=0; j<3; j++) {
                    for (int k=0; k<3; k++) {
                        if (x == 0){
                            if (result[i][j][k] != 0) {
                                TreeSet<Integer> baseBoxI = new TreeSet<Integer>();
                                baseBoxI = setBoxes.get(i);
                                baseBoxI.add(result[i][j][k]);
                                ArrayList<ArrayList<TreeSet<Integer>>> memoBoxI = memoSudoku.get(i);
                                ArrayList<TreeSet<Integer>> memoBoxI_J = memoBoxI.get(j);
                                TreeSet<Integer> memoBoxI_J_K = memoBoxI_J.get(k);
                                memoBoxI_J_K.add(result[i][j][k]);
                            }
                        }
                        if (x == 1) {
                            if (result[i][j][k] == 0) {
                                ArrayList<ArrayList<TreeSet<Integer>>> memoBoxI = memoSudoku.get(i);
                                ArrayList<TreeSet<Integer>> memoBoxI_J = memoBoxI.get(j);
                                TreeSet<Integer> memoBoxI_J_K = memoBoxI_J.get(k);
                                TreeSet<Integer> full = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
                                full.removeAll(setBoxes.get(i));
                                memoBoxI_J_K.addAll(full);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * 各行内の数字を比較し、空白の候補のメモをとるメソッド。
     */
    public void memoRow(int[][][] sudoku) {
        for (int x=0; x<2; x++) {
            int n = 0;
            int z = 0;
            for (int y=0; y<3; y++){
                for (int j = 0; j<3; j++){
                    for (int i = n; i<n+3; i++) {  
                        for (int k = 0; k<3; k++) {
                            if (x == 0){
                                if (result[i][j][k] != 0) {
                                    TreeSet<Integer> baseRowI = new TreeSet<Integer>();
                                    baseRowI = setRows.get(j+z);
                                    baseRowI.add(result[i][j][k]);
                                    ArrayList<ArrayList<TreeSet<Integer>>> memoRowI = memoSudoku.get(i);
                                    ArrayList<TreeSet<Integer>> memoRowI_J = memoRowI.get(j);
                                    TreeSet<Integer> memoRowI_J_K = memoRowI_J.get(k);
                                    memoRowI_J_K.add(result[i][j][k]);
                                }
                            }
                            if (x == 1) {
                                if(result[i][j][k] == 0) {
                                    ArrayList<ArrayList<TreeSet<Integer>>> memoRowI = memoSudoku.get(i);
                                    ArrayList<TreeSet<Integer>> memoRowI_J = memoRowI.get(j);
                                    TreeSet<Integer> memoRowsI_J_K = memoRowI_J.get(k);
                                    TreeSet<Integer> full = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
                                    full.removeAll(setRows.get(j+z));
                                    memoRowsI_J_K.retainAll(full);
                                }
                            }
                        }
                    }
                }
                n += 3;
                z += 3;
            }
        }
    }

    /**
     * 各列内の数字を比較し、空白の候補のメモをとるメソッド。
     */
    public void memoColumn(int[][][] sudoku) {
        for (int x=0; x<2; x++) {
            int n = 0;
            int z = 0;
            for (int y=0; y<3; y++) {
                for (int k=0; k<3; k++) {
                    for (int i=n; i<n+7; i+=3) {
                        for (int j=0; j<3; j++) {
                            if (x == 0){
                                if (result[i][j][k] != 0) {
                                    TreeSet<Integer> baseColumnI = new TreeSet<Integer>();
                                    baseColumnI = setColumns.get(k+z);
                                    baseColumnI.add(result[i][j][k]);
                                    ArrayList<ArrayList<TreeSet<Integer>>> memoColumnI = memoSudoku.get(i);
                                    ArrayList<TreeSet<Integer>> memoColumnI_J = memoColumnI.get(j);
                                    TreeSet<Integer> memoColumnI_J_K = memoColumnI_J.get(k);
                                    memoColumnI_J_K.add(result[i][j][k]);
                                }
                            }
                            if (x == 1) {
                                if (result[i][j][k] == 0) {
                                    ArrayList<ArrayList<TreeSet<Integer>>> memoColumnI = memoSudoku.get(i);
                                    ArrayList<TreeSet<Integer>> memoColumnI_J = memoColumnI.get(j);
                                    TreeSet<Integer> memoColumnI_J_K = memoColumnI_J.get(k);
                                    TreeSet<Integer> full = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
                                    full.removeAll(setColumns.get(k+z));
                                    memoColumnI_J_K.retainAll(full);
                                }
                            }
                        }
                    }
                }
                n+=1;
                z+=3;
            }
        }
    }

    /**
     * 空白の候補のメモをとるメソッド
     */
    public void memo(int[][][] sudoku) {
        memoBox(sudoku);
        memoRow(sudoku);
        memoColumn(sudoku);
    }
    
    /**
     * 数独を解くメソッド。
     */
    @Override
    public void solve (int[][][] sudoku) {
        memo(sudoku);
    }
    
    public int getResultCell1_1() {
        return resultCell1_1;
    }

    public int getResultCell1_2() {
        return resultCell1_2;
    }

    public int getResultCell1_3() {
        return resultCell1_3;
    }

    public int getResultCell1_4() {
        return resultCell1_4;
    }

    public int getResultCell1_5() {
        return resultCell1_5;
    }

    public int getResultCell1_6() {
        return resultCell1_6;
    }

    public int getResultCell1_7() {
        return resultCell1_7;
    }

    public int getResultCell1_8() {
        return resultCell1_8;
    }

    public int getResultCell1_9() {
        return resultCell1_9;
    }

    public int getResultCell2_1() {
        return resultCell2_1;
    }

    public int getResultCell2_2() {
        return resultCell2_2;
    }

    public int getResultCell2_3() {
        return resultCell2_3;
    }

    public int getResultCell2_4() {
        return resultCell2_4;
    }

    public int getResultCell2_5() {
        return resultCell2_5;
    }

    public int getResultCell2_6() {
        return resultCell2_6;
    }

    public int getResultCell2_7() {
        return resultCell2_7;
    }

    public int getResultCell2_8() {
        return resultCell2_8;
    }

    public int getResultCell2_9() {
        return resultCell2_9;
    }

    public int getResultCell3_1() {
        return resultCell3_1;
    }

    public int getResultCell3_2() {
        return resultCell3_2;
    }

    public int getResultCell3_3() {
        return resultCell3_3;
    }

    public int getResultCell3_4() {
        return resultCell3_4;
    }

    public int getResultCell3_5() {
        return resultCell3_5;
    }

    public int getResultCell3_6() {
        return resultCell3_6;
    }

    public int getResultCell3_7() {
        return resultCell3_7;
    }

    public int getResultCell3_8() {
        return resultCell3_8;
    }

    public int getResultCell3_9() {
        return resultCell3_9;
    }

    public int getResultCell4_1() {
        return resultCell4_1;
    }

    public int getResultCell4_2() {
        return resultCell4_2;
    }

    public int getResultCell4_3() {
        return resultCell4_3;
    }

    public int getResultCell4_4() {
        return resultCell4_4;
    }

    public int getResultCell4_5() {
        return resultCell4_5;
    }

    public int getResultCell4_6() {
        return resultCell4_6;
    }

    public int getResultCell4_7() {
        return resultCell4_7;
    }

    public int getResultCell4_8() {
        return resultCell4_8;
    }

    public int getResultCell4_9() {
        return resultCell4_9;
    }

    public int getResultCell5_1() {
        return resultCell5_1;
    }

    public int getResultCell5_2() {
        return resultCell5_2;
    }

    public int getResultCell5_3() {
        return resultCell5_3;
    }

    public int getResultCell5_4() {
        return resultCell5_4;
    }

    public int getResultCell5_5() {
        return resultCell5_5;
    }

    public int getResultCell5_6() {
        return resultCell5_6;
    }

    public int getResultCell5_7() {
        return resultCell5_7;
    }

    public int getResultCell5_8() {
        return resultCell5_8;
    }

    public int getResultCell5_9() {
        return resultCell5_9;
    }

    public int getResultCell6_1() {
        return resultCell6_1;
    }

    public int getResultCell6_2() {
        return resultCell6_2;
    }

    public int getResultCell6_3() {
        return resultCell6_3;
    }

    public int getResultCell6_4() {
        return resultCell6_4;
    }

    public int getResultCell6_5() {
        return resultCell6_5;
    }

    public int getResultCell6_6() {
        return resultCell6_6;
    }

    public int getResultCell6_7() {
        return resultCell6_7;
    }

    public int getResultCell6_8() {
        return resultCell6_8;
    }

    public int getResultCell6_9() {
        return resultCell6_9;
    }

    public int getResultCell7_1() {
        return resultCell7_1;
    }

    public int getResultCell7_2() {
        return resultCell7_2;
    }

    public int getResultCell7_3() {
        return resultCell7_3;
    }

    public int getResultCell7_4() {
        return resultCell7_4;
    }

    public int getResultCell7_5() {
        return resultCell7_5;
    }

    public int getResultCell7_6() {
        return resultCell7_6;
    }

    public int getResultCell7_7() {
        return resultCell7_7;
    }

    public int getResultCell7_8() {
        return resultCell7_8;
    }

    public int getResultCell7_9() {
        return resultCell7_9;
    }

    public int getResultCell8_1() {
        return resultCell8_1;
    }

    public int getResultCell8_2() {
        return resultCell8_2;
    }

    public int getResultCell8_3() {
        return resultCell8_3;
    }

    public int getResultCell8_4() {
        return resultCell8_4;
    }

    public int getResultCell8_5() {
        return resultCell8_5;
    }

    public int getResultCell8_6() {
        return resultCell8_6;
    }

    public int getResultCell8_7() {
        return resultCell8_7;
    }

    public int getResultCell8_8() {
        return resultCell8_8;
    }

    public int getResultCell8_9() {
        return resultCell8_9;
    }

    public int getResultCell9_1() {
        return resultCell9_1;
    }

    public int getResultCell9_2() {
        return resultCell9_2;
    }

    public int getResultCell9_3() {
        return resultCell9_3;
    }

    public int getResultCell9_4() {
        return resultCell9_4;
    }

    public int getResultCell9_5() {
        return resultCell9_5;
    }

    public int getResultCell9_6() {
        return resultCell9_6;
    }

    public int getResultCell9_7() {
        return resultCell9_7;
    }

    public int getResultCell9_8() {
        return resultCell9_8;
    }

    public int getResultCell9_9() {
        return resultCell9_9;
    }

    public TreeSet<Integer> getSetBox1() {
        return setBox1;
    }

    public TreeSet<Integer> getSetBox2() {
        return setBox2;
    }

    public TreeSet<Integer> getSetBox3() {
        return setBox3;
    }

    public TreeSet<Integer> getSetBox4() {
        return setBox4;
    }

    public TreeSet<Integer> getSetBox5() {
        return setBox5;
    }

    public TreeSet<Integer> getSetBox6() {
        return setBox6;
    }

    public TreeSet<Integer> getSetBox7() {
        return setBox7;
    }

    public TreeSet<Integer> getSetBox8() {
        return setBox8;
    }

    public TreeSet<Integer> getSetBox9() {
        return setBox9;
    }

    public ArrayList<TreeSet<Integer>> getSetBoxes() {
        return setBoxes;
    }

    public TreeSet<Integer> getSetRow1() {
        return setRow1;
    }

    public TreeSet<Integer> getSetRow2() {
        return setRow2;
    }

    public TreeSet<Integer> getSetRow3() {
        return setRow3;
    }

    public TreeSet<Integer> getSetRow4() {
        return setRow4;
    }

    public TreeSet<Integer> getSetRow5() {
        return setRow5;
    }

    public TreeSet<Integer> getSetRow6() {
        return setRow6;
    }

    public TreeSet<Integer> getSetRow7() {
        return setRow7;
    }

    public TreeSet<Integer> getSetRow8() {
        return setRow8;
    }

    public TreeSet<Integer> getSetRow9() {
        return setRow9;
    }

    public ArrayList<TreeSet<Integer>> getSetRows() {
        return setRows;
    }

    public TreeSet<Integer> getSetColumn1() {
        return setColumn1;
    }

    public TreeSet<Integer> getSetColumn2() {
        return setColumn2;
    }

    public TreeSet<Integer> getSetColumn3() {
        return setColumn3;
    }

    public TreeSet<Integer> getSetColumn4() {
        return setColumn4;
    }

    public TreeSet<Integer> getSetColumn5() {
        return setColumn5;
    }

    public TreeSet<Integer> getSetColumn6() {
        return setColumn6;
    }

    public TreeSet<Integer> getSetColumn7() {
        return setColumn7;
    }

    public TreeSet<Integer> getSetColumn8() {
        return setColumn8;
    }

    public TreeSet<Integer> getSetColumn9() {
        return setColumn9;
    }

    public ArrayList<TreeSet<Integer>> getSetColumns() {
        return setColumns;
    }

    public int[][][] getResult() {
        return result;
    }

    public TreeSet<Integer> getMemo1_1() {
        return memo1_1;
    }

    public TreeSet<Integer> getMemo1_2() {
        return memo1_2;
    }

    public TreeSet<Integer> getMemo1_3() {
        return memo1_3;
    }

    public TreeSet<Integer> getMemo1_4() {
        return memo1_4;
    }

    public TreeSet<Integer> getMemo1_5() {
        return memo1_5;
    }

    public TreeSet<Integer> getMemo1_6() {
        return memo1_6;
    }

    public TreeSet<Integer> getMemo1_7() {
        return memo1_7;
    }

    public TreeSet<Integer> getMemo1_8() {
        return memo1_8;
    }

    public TreeSet<Integer> getMemo1_9() {
        return memo1_9;
    }

    public TreeSet<Integer> getMemo2_1() {
        return memo2_1;
    }

    public TreeSet<Integer> getMemo2_2() {
        return memo2_2;
    }

    public TreeSet<Integer> getMemo2_3() {
        return memo2_3;
    }

    public TreeSet<Integer> getMemo2_4() {
        return memo2_4;
    }

    public TreeSet<Integer> getMemo2_5() {
        return memo2_5;
    }

    public TreeSet<Integer> getMemo2_6() {
        return memo2_6;
    }

    public TreeSet<Integer> getMemo2_7() {
        return memo2_7;
    }

    public TreeSet<Integer> getMemo2_8() {
        return memo2_8;
    }

    public TreeSet<Integer> getMemo2_9() {
        return memo2_9;
    }

    public TreeSet<Integer> getMemo3_1() {
        return memo3_1;
    }

    public TreeSet<Integer> getMemo3_2() {
        return memo3_2;
    }

    public TreeSet<Integer> getMemo3_3() {
        return memo3_3;
    }

    public TreeSet<Integer> getMemo3_4() {
        return memo3_4;
    }

    public TreeSet<Integer> getMemo3_5() {
        return memo3_5;
    }

    public TreeSet<Integer> getMemo3_6() {
        return memo3_6;
    }

    public TreeSet<Integer> getMemo3_7() {
        return memo3_7;
    }

    public TreeSet<Integer> getMemo3_8() {
        return memo3_8;
    }

    public TreeSet<Integer> getMemo3_9() {
        return memo3_9;
    }

    public TreeSet<Integer> getMemo4_1() {
        return memo4_1;
    }

    public TreeSet<Integer> getMemo4_2() {
        return memo4_2;
    }

    public TreeSet<Integer> getMemo4_3() {
        return memo4_3;
    }

    public TreeSet<Integer> getMemo4_4() {
        return memo4_4;
    }

    public TreeSet<Integer> getMemo4_5() {
        return memo4_5;
    }

    public TreeSet<Integer> getMemo4_6() {
        return memo4_6;
    }

    public TreeSet<Integer> getMemo4_7() {
        return memo4_7;
    }

    public TreeSet<Integer> getMemo4_8() {
        return memo4_8;
    }

    public TreeSet<Integer> getMemo4_9() {
        return memo4_9;
    }

    public TreeSet<Integer> getMemo5_1() {
        return memo5_1;
    }

    public TreeSet<Integer> getMemo5_2() {
        return memo5_2;
    }

    public TreeSet<Integer> getMemo5_3() {
        return memo5_3;
    }

    public TreeSet<Integer> getMemo5_4() {
        return memo5_4;
    }

    public TreeSet<Integer> getMemo5_5() {
        return memo5_5;
    }

    public TreeSet<Integer> getMemo5_6() {
        return memo5_6;
    }

    public TreeSet<Integer> getMemo5_7() {
        return memo5_7;
    }

    public TreeSet<Integer> getMemo5_8() {
        return memo5_8;
    }

    public TreeSet<Integer> getMemo5_9() {
        return memo5_9;
    }

    public TreeSet<Integer> getMemo6_1() {
        return memo6_1;
    }

    public TreeSet<Integer> getMemo6_2() {
        return memo6_2;
    }

    public TreeSet<Integer> getMemo6_3() {
        return memo6_3;
    }

    public TreeSet<Integer> getMemo6_4() {
        return memo6_4;
    }

    public TreeSet<Integer> getMemo6_5() {
        return memo6_5;
    }

    public TreeSet<Integer> getMemo6_6() {
        return memo6_6;
    }

    public TreeSet<Integer> getMemo6_7() {
        return memo6_7;
    }

    public TreeSet<Integer> getMemo6_8() {
        return memo6_8;
    }

    public TreeSet<Integer> getMemo6_9() {
        return memo6_9;
    }

    public TreeSet<Integer> getMemo7_1() {
        return memo7_1;
    }

    public TreeSet<Integer> getMemo7_2() {
        return memo7_2;
    }

    public TreeSet<Integer> getMemo7_3() {
        return memo7_3;
    }

    public TreeSet<Integer> getMemo7_4() {
        return memo7_4;
    }

    public TreeSet<Integer> getMemo7_5() {
        return memo7_5;
    }

    public TreeSet<Integer> getMemo7_6() {
        return memo7_6;
    }

    public TreeSet<Integer> getMemo7_7() {
        return memo7_7;
    }

    public TreeSet<Integer> getMemo7_8() {
        return memo7_8;
    }

    public TreeSet<Integer> getMemo7_9() {
        return memo7_9;
    }

    public TreeSet<Integer> getMemo8_1() {
        return memo8_1;
    }

    public TreeSet<Integer> getMemo8_2() {
        return memo8_2;
    }

    public TreeSet<Integer> getMemo8_3() {
        return memo8_3;
    }

    public TreeSet<Integer> getMemo8_4() {
        return memo8_4;
    }

    public TreeSet<Integer> getMemo8_5() {
        return memo8_5;
    }

    public TreeSet<Integer> getMemo8_6() {
        return memo8_6;
    }

    public TreeSet<Integer> getMemo8_7() {
        return memo8_7;
    }

    public TreeSet<Integer> getMemo8_8() {
        return memo8_8;
    }

    public TreeSet<Integer> getMemo8_9() {
        return memo8_9;
    }

    public TreeSet<Integer> getMemo9_1() {
        return memo9_1;
    }

    public TreeSet<Integer> getMemo9_2() {
        return memo9_2;
    }

    public TreeSet<Integer> getMemo9_3() {
        return memo9_3;
    }

    public TreeSet<Integer> getMemo9_4() {
        return memo9_4;
    }

    public TreeSet<Integer> getMemo9_5() {
        return memo9_5;
    }

    public TreeSet<Integer> getMemo9_6() {
        return memo9_6;
    }

    public TreeSet<Integer> getMemo9_7() {
        return memo9_7;
    }

    public TreeSet<Integer> getMemo9_8() {
        return memo9_8;
    }

    public TreeSet<Integer> getMemo9_9() {
        return memo9_9;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox1_1() {
        return memoBox1_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox1_2() {
        return memoBox1_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox1_3() {
        return memoBox1_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox2_1() {
        return memoBox2_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox2_2() {
        return memoBox2_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox2_3() {
        return memoBox2_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox3_1() {
        return memoBox3_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox3_2() {
        return memoBox3_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox3_3() {
        return memoBox3_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox4_1() {
        return memoBox4_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox4_2() {
        return memoBox4_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox4_3() {
        return memoBox4_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox5_1() {
        return memoBox5_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox5_2() {
        return memoBox5_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox5_3() {
        return memoBox5_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox6_1() {
        return memoBox6_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox6_2() {
        return memoBox6_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox6_3() {
        return memoBox6_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox7_1() {
        return memoBox7_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox7_2() {
        return memoBox7_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox7_3() {
        return memoBox7_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox8_1() {
        return memoBox8_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox8_2() {
        return memoBox8_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox8_3() {
        return memoBox8_3;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox9_1() {
        return memoBox9_1;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox9_2() {
        return memoBox9_2;
    }

    public ArrayList<TreeSet<Integer>> getMemoBox9_3() {
        return memoBox9_3;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox1() {
        return memoBox1;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox2() {
        return memoBox2;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox3() {
        return memoBox3;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox4() {
        return memoBox4;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox5() {
        return memoBox5;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox6() {
        return memoBox6;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox7() {
        return memoBox7;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox8() {
        return memoBox8;
    }

    public ArrayList<ArrayList<TreeSet<Integer>>> getMemoBox9() {
        return memoBox9;
    }

    public ArrayList<ArrayList<ArrayList<TreeSet<Integer>>>> getMemoSudoku() {
        return memoSudoku;
    }
}