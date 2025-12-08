import java.util.Scanner;

public final class function {

    public static void main(String[] args) {

        System.out.println("write a count of numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println( );
        Object toString;
        System.out.println( );
        int[] array =getArray(scanner.nextInt(), scanner);
        System.out.println(toString(array));
        System.out.println(
                toString(
                        plusTwoArrays(plusTwo(array),
                        minusTwo(array)
                )
                )
        );


        }


    public  static  int[] getArray(int  arrayLength, Scanner scanner){
            int[] array = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {

                array[i] = scanner.nextInt();


            }
            return array;

    }
        public  static  String  toString (int[]  array){
        String  answer = "(";
            for (int i  = 0;  i < array.length; i++){
                answer += array[i] + ", ";

            }
            answer += "\b\b)";
           return  answer;

   }

public  static  int[] plusTwoArrays(int[] arrayone, int[]    arrrayTwo ){
       int minlength = (arrayone.length > arrrayTwo.length) ? arrrayTwo.length :  arrayone.length;
        for (int i = 0;i <  minlength; i++){
            arrayone[i] += arrrayTwo[i];
        }
        return arrayone;
       }
   ;

    public static int[] multTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] -= 2;

        }
        return array;

    }

      public static  int[] minusTwo(int[]  array) {
            for (int i = 0; i < array.length;  i++){
                array[i] *=2;


            }
            return array;
}
    public static  int[] plusTwo(int[]  array) {
             for (int i = 0; i < array.length;  i++){
                 array[i] +=2;



             }
             return array;

        }

    }


























