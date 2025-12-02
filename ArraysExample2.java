import java.util.Scanner;

    class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N;
        while (true) {
            System.out.print("Введите N (1 <= N <= 50): ");
            N = scanner.nextInt();
            if (N >= 1 && N <= 50) {
                break;
            } else {
                System.out.println("Ошибка: N должно быть от 1 до 50. Попробуйте ещё раз.");
            }
        }


        int[][] matrix = new int[N][N];


        int value = 1;
        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = N - 1;

        while (value <= N * N) {

            for (int col = left; col <= right; col++) {
                matrix[top][col] = value++;
            }
            top++;


            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = value++;
            }
            right--;


            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = value++;
            }
            bottom--;


            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = value++;
            }
            left++;
        }

        
        System.out.println("Матрица " + N + "x" + N + " (спираль):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
