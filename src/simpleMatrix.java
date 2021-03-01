import java.util.Scanner;

public class simpleMatrix {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[][] matrix={
                {12, 23, 34, 45,56},
                {45, 56, 67, 23, 57},
                {78, 34, 56, 87, 49, 78},
        };
        int row=1;

//        System.out.println(matrix[1][5]);
        System.out.println(matrix[row][matrix[row].length-1]);

        int[][] emptyMatrix = new int[10][10];

        emptyMatrix[0][0]=25;
        emptyMatrix[5][7]=90;


    }


}
