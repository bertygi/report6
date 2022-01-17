package jp.ac.uryukyu.ie.e215706;

import java.util.*;

/**
 * 数独を解くインタフェース。
 *  int resultCelln_m; //n行m列の結果値
 *  TreeSet setBoxN; //N番目の小区間に入っている数字の集合
 *  ArrayList setBoxes; //９つの小区間集合の配列
 *  TreeSet setRowN; //N番目の行に入っている数字の集合
 *  ArrayList setRows; //９つの行集合の配列
 *  TreeSet setColumnN;　//N番目の列に入っている数字の集合
 *  ArrayList setColumns; //９つの列集合の配列
 */

public interface Solve {
    int resultCell1_1 = 0;
    int resultCell1_2 = 0;
    int resultCell1_3 = 0;
    int resultCell1_4 = 0;
    int resultCell1_5 = 0;
    int resultCell1_6 = 0;
    int resultCell1_7 = 0;
    int resultCell1_8 = 0;
    int resultCell1_9 = 0;
    int resultCell2_1 = 0;
    int resultCell2_2 = 0;
    int resultCell2_3 = 0;
    int resultCell2_4 = 0;
    int resultCell2_5 = 0;
    int resultCell2_6 = 0;
    int resultCell2_7 = 0;
    int resultCell2_8 = 0;
    int resultCell2_9 = 0;
    int resultCell3_1 = 0;
    int resultCell3_2 = 0;
    int resultCell3_3 = 0;
    int resultCell3_4 = 0;
    int resultCell3_5 = 0;
    int resultCell3_6 = 0;
    int resultCell3_7 = 0;
    int resultCell3_8 = 0;
    int resultCell3_9 = 0;
    int resultCell4_1 = 0;
    int resultCell4_2 = 0;
    int resultCell4_3 = 0;
    int resultCell4_4 = 0;
    int resultCell4_5 = 0;
    int resultCell4_6 = 0;
    int resultCell4_7 = 0;
    int resultCell4_8 = 0;
    int resultCell4_9 = 0;
    int resultCell5_1 = 0;
    int resultCell5_2 = 0;
    int resultCell5_3 = 0;
    int resultCell5_4 = 0;
    int resultCell5_5 = 0;
    int resultCell5_6 = 0;
    int resultCell5_7 = 0;
    int resultCell5_8 = 0;
    int resultCell5_9 = 0;
    int resultCell6_1 = 0;
    int resultCell6_2 = 0;
    int resultCell6_3 = 0;
    int resultCell6_4 = 0;
    int resultCell6_5 = 0;
    int resultCell6_6 = 0;
    int resultCell6_7 = 0;
    int resultCell6_8 = 0;
    int resultCell6_9 = 0;
    int resultCell7_1 = 0;
    int resultCell7_2 = 0;
    int resultCell7_3 = 0;
    int resultCell7_4 = 0;
    int resultCell7_5 = 0;
    int resultCell7_6 = 0;
    int resultCell7_7 = 0;
    int resultCell7_8 = 0;
    int resultCell7_9 = 0;
    int resultCell8_1 = 0;
    int resultCell8_2 = 0;
    int resultCell8_3 = 0;
    int resultCell8_4 = 0;
    int resultCell8_5 = 0;
    int resultCell8_6 = 0;
    int resultCell8_7 = 0;
    int resultCell8_8 = 0;
    int resultCell8_9 = 0;
    int resultCell9_1 = 0;
    int resultCell9_2 = 0;
    int resultCell9_3 = 0;
    int resultCell9_4 = 0;
    int resultCell9_5 = 0;
    int resultCell9_6 = 0;
    int resultCell9_7 = 0;
    int resultCell9_8 = 0;
    int resultCell9_9 = 0;
    TreeSet<Integer> setBox1 = new TreeSet<Integer>();
    TreeSet<Integer> setBox2 = new TreeSet<Integer>();
    TreeSet<Integer> setBox3 = new TreeSet<Integer>();
    TreeSet<Integer> setBox4 = new TreeSet<Integer>();
    TreeSet<Integer> setBox5 = new TreeSet<Integer>();
    TreeSet<Integer> setBox6 = new TreeSet<Integer>();
    TreeSet<Integer> setBox7 = new TreeSet<Integer>();
    TreeSet<Integer> setBox8 = new TreeSet<Integer>();
    TreeSet<Integer> setBox9 = new TreeSet<Integer>();
    ArrayList<TreeSet<Integer>> setBoxes = new ArrayList<TreeSet<Integer>>(Arrays.asList(setBox1, setBox2, setBox3, setBox4, setBox5, setBox6, setBox7, setBox8, setBox9));
    TreeSet<Integer> setRow1 = new TreeSet<Integer>();
    TreeSet<Integer> setRow2 = new TreeSet<Integer>();
    TreeSet<Integer> setRow3 = new TreeSet<Integer>();
    TreeSet<Integer> setRow4 = new TreeSet<Integer>();
    TreeSet<Integer> setRow5 = new TreeSet<Integer>();
    TreeSet<Integer> setRow6 = new TreeSet<Integer>();
    TreeSet<Integer> setRow7 = new TreeSet<Integer>();
    TreeSet<Integer> setRow8 = new TreeSet<Integer>();
    TreeSet<Integer> setRow9 = new TreeSet<Integer>();
    ArrayList<TreeSet<Integer>> setRows = new ArrayList<TreeSet<Integer>>(Arrays.asList(setRow1, setRow2, setRow3, setRow4, setRow5, setRow6, setRow7, setRow8, setRow9));
    TreeSet<Integer> setColumn1 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn2 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn3 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn4 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn5 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn6 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn7 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn8 = new TreeSet<Integer>();
    TreeSet<Integer> setColumn9 = new TreeSet<Integer>();
    ArrayList<TreeSet<Integer>> setColumns = new ArrayList<TreeSet<Integer>>(Arrays.asList(setColumn1, setColumn2, setColumn3, setColumn4, setColumn5, setColumn6, setColumn7, setColumn8, setColumn9));
    int[][][] result = {{{resultCell1_1,resultCell1_2,resultCell1_3},{resultCell2_1,resultCell2_2,resultCell2_3},{resultCell3_1,resultCell3_2,resultCell3_3}},{{resultCell1_4,resultCell1_5,resultCell1_6},{resultCell2_4,resultCell2_5,resultCell2_6},{resultCell3_4,resultCell3_5,resultCell3_6}},{{resultCell1_7,resultCell1_8,resultCell1_9},{resultCell2_7,resultCell2_8,resultCell2_9},{resultCell3_7,resultCell3_8,resultCell3_9}},{{resultCell4_1,resultCell4_2,resultCell4_3},{resultCell5_1,resultCell5_2,resultCell5_3},{resultCell6_1,resultCell6_2,resultCell6_3}},{{resultCell4_4,resultCell4_5,resultCell4_6},{resultCell5_4,resultCell5_5,resultCell5_6},{resultCell6_4,resultCell6_5,resultCell6_6}},{{resultCell4_7,resultCell4_8,resultCell4_9},{resultCell5_7,resultCell5_8,resultCell5_9},{resultCell6_7,resultCell6_8,resultCell6_9}},{{resultCell7_1,resultCell7_2,resultCell7_3},{resultCell8_1,resultCell8_2,resultCell8_3},{resultCell9_1,resultCell9_2,resultCell9_3}},{{resultCell7_4,resultCell7_5,resultCell7_6},{resultCell8_4,resultCell8_5,resultCell8_6},{resultCell9_4,resultCell9_5,resultCell9_6}},{{resultCell7_7,resultCell7_8,resultCell7_9},{resultCell8_7,resultCell8_8,resultCell8_9},{resultCell9_7,resultCell9_8,resultCell9_9}}};

    /**
     * 数独を解くメソッド。
     */
    public void solve (int[][][] sudoku);
}