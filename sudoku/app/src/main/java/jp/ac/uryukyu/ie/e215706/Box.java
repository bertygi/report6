package jp.ac.uryukyu.ie.e215706;

/**
 * 3×3の小区間クラス。
 *  int[][] boxN; //左上から右下までの順番にN番目の3×3の小区間
 */

public class Box extends Cell{
    int[][] box1 = {{cell1_1,cell1_2,cell1_3},{cell2_1,cell2_2,cell2_3},{cell3_1,cell3_2,cell3_3}};
    int[][] box2 = {{cell1_4,cell1_5,cell1_6},{cell2_4,cell2_5,cell2_6},{cell3_4,cell3_5,cell3_6}};
    int[][] box3 = {{cell1_7,cell1_8,cell1_9},{cell2_7,cell2_8,cell2_9},{cell3_7,cell3_8,cell3_9}};
    int[][] box4 = {{cell4_1,cell4_2,cell4_3},{cell5_1,cell5_2,cell5_3},{cell6_1,cell6_2,cell6_3}};
    int[][] box5 = {{cell4_4,cell4_5,cell4_6},{cell5_4,cell5_5,cell5_6},{cell6_4,cell6_5,cell6_6}};
    int[][] box6 = {{cell4_7,cell4_8,cell4_9},{cell5_7,cell5_8,cell5_9},{cell6_7,cell6_8,cell6_9}};
    int[][] box7 = {{cell7_1,cell7_2,cell7_3},{cell8_1,cell8_2,cell8_3},{cell9_1,cell9_2,cell9_3}};
    int[][] box8 = {{cell7_4,cell7_5,cell7_6},{cell8_4,cell8_5,cell8_6},{cell9_4,cell9_5,cell9_6}};
    int[][] box9 = {{cell7_7,cell7_8,cell7_9},{cell8_7,cell8_8,cell8_9},{cell9_7,cell9_8,cell9_9}};
    
    public Box (int cell1_1, int cell1_2, int cell1_3, int cell1_4, int cell1_5, int cell1_6, int cell1_7, int cell1_8, int cell1_9, int cell2_1, int cell2_2, int cell2_3, int cell2_4, int cell2_5, int cell2_6, int cell2_7, int cell2_8, int cell2_9, int cell3_1, int cell3_2, int cell3_3, int cell3_4, int cell3_5, int cell3_6, int cell3_7, int cell3_8, int cell3_9, int cell4_1, int cell4_2, int cell4_3, int cell4_4, int cell4_5, int cell4_6, int cell4_7, int cell4_8, int cell4_9, int cell5_1, int cell5_2, int cell5_3, int cell5_4, int cell5_5, int cell5_6, int cell5_7, int cell5_8, int cell5_9, int cell6_1, int cell6_2, int cell6_3, int cell6_4, int cell6_5, int cell6_6, int cell6_7, int cell6_8, int cell6_9, int cell7_1, int cell7_2, int cell7_3, int cell7_4, int cell7_5, int cell7_6, int cell7_7, int cell7_8, int cell7_9, int cell8_1, int cell8_2, int cell8_3, int cell8_4, int cell8_5, int cell8_6, int cell8_7, int cell8_8, int cell8_9, int cell9_1, int cell9_2, int cell9_3, int cell9_4, int cell9_5, int cell9_6, int cell9_7, int cell9_8, int cell9_9) {
        super(cell1_1, cell1_2, cell1_3, cell1_4, cell1_5, cell1_6, cell1_7, cell1_8, cell1_9, cell2_1, cell2_2, cell2_3, cell2_4, cell2_5, cell2_6, cell2_7, cell2_8, cell2_9, cell3_1, cell3_2, cell3_3, cell3_4, cell3_5, cell3_6, cell3_7, cell3_8, cell3_9, cell4_1, cell4_2, cell4_3, cell4_4, cell4_5, cell4_6, cell4_7, cell4_8, cell4_9, cell5_1, cell5_2, cell5_3, cell5_4, cell5_5, cell5_6, cell5_7, cell5_8, cell5_9, cell6_1, cell6_2, cell6_3, cell6_4, cell6_5, cell6_6, cell6_7, cell6_8, cell6_9, cell7_1, cell7_2, cell7_3, cell7_4, cell7_5, cell7_6, cell7_7, cell7_8, cell7_9, cell8_1, cell8_2, cell8_3, cell8_4, cell8_5, cell8_6, cell8_7, cell8_8, cell8_9, cell9_1, cell9_2, cell9_3, cell9_4, cell9_5, cell9_6, cell9_7, cell9_8, cell9_9);
    }

    public int[][] getBox1() {
        return box1;
    }
    public int[][] getBox2() {
        return box2;
    }
    public int[][] getBox3() {
        return box3;
    }
    public int[][] getBox4() {
        return box4;
    }
    public int[][] getBox5() {
        return box5;
    }
    public int[][] getBox6() {
        return box6;
    }
    public int[][] getBox7() {
        return box7;
    }
    public int[][] getBox8() {
        return box8;
    }
    public int[][] getBox9() {
        return box9;
    }
}
