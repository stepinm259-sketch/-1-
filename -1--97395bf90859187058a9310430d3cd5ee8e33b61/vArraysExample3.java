import java.util.Scanner;

public class vArraysExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


          int n =  10 ;
          int m =  10;



          int[][] arr = new  int[n][m];
          for (int  x = 0; x < m;  x++){
              for (int y = 0; y  < n; y++ ){
                  arr[y][x]  =  + 0;


              }

          }
           for (int[]  a : arr){
               for (int x  : a ){
                   System.out.print(x  +  " ");
               }
               System.out.println(" ");




           }





    }





}
