package Arrays.multiDimensional;
import java.util.Scanner;
public class PrintSpiral {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while (totalElements < r * c){
//            topRow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

//          rightCol => topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

//            bottomRow =>  rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

//            leftCol => bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int total = r*c;

        System.out.println("Enter " + total + " values : ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is the Original matrix : ");
        printMatrix(matrix);

        System.out.println("Here is the Spiral order of Matrix : ");
        printSpiralOrder(matrix, r, c);

    }
}
