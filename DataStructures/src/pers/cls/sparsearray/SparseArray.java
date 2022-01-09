package pers.cls.sparsearray;


public class SparseArray {

    public static void main(String[] args) {

        // 定义棋盘 1是白子，2是黑子
        int[][] chessArr = new int[11][11];
        // record
        int num = 0;
        // initial chess
        chessArr[2][3] = 1;
        chessArr[4][2] = 2;

        System.out.println("棋盘");
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.print(data + "\t");
                if (data != 0) {
                    num++;
                }
            }
            System.out.println();
        }

        // 转化成稀疏数组
        int[][] sparseArr = new int[num + 1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr.length;
        sparseArr[0][2] = num;
        int temp = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr.length; j++) {
                if (chessArr[i][j] != 0) {
                    temp++;
                    sparseArr[temp][0] = i;
                    sparseArr[temp][1] = j;
                    sparseArr[temp][2] = chessArr[i][j];
                }
            }
        }

        // 打印稀疏数组
        System.out.println("稀疏数组");
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.print(data + "\t");
                if (data != 0) {
                    num++;
                }
            }
            System.out.println();
        }

        //由稀疏数组还原棋盘
        int[][] reduceChessArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 0; i < sparseArr.length - 1; i++) {
            reduceChessArr[sparseArr[i + 1][0]][sparseArr[i + 1][1]] = sparseArr[i + 1][2];
        }

        // 打印还原棋盘
        System.out.println("还原棋盘");
        for (int[] row : reduceChessArr) {
            for (int data : row) {
                System.out.print(data + "\t");
                if (data != 0) {
                    num++;
                }
            }
            System.out.println();
        }

    }


}
