import java.util.Scanner;

public class ArraysExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();

        int n = 4;
        int m = 6;


        int[][] arr = new  int[n][m];
        for (int  x = 0; x < m;  x++){
            for (int y = 0; y  < n; y++ ){
                arr[y][x]  =  + y + x;
            }


        }
        for (int[] a : arr) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println(" ");


        }
    }
}