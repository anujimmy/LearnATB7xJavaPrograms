package July.ex_July272024_Arrays_StringBuilderStringBuffer;

public class Lab150 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        int row = array_2d.length;
        int col = array_2d[1].length;
        for (int i = 0; i < row; i++) { // Row  0,1
            for (int j = 0; j < col; j++) { // Column , 0,1,2
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
