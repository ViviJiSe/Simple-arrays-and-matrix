import java.io.PrintStream;
import java.util.Scanner;

public class arraysSimples {
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        // Declaraciones de arrays

        int[] numbers = {23, 45, 67, 11, 56, 76, 99};

        //Esta propiedad nos dice el numero de elementos que tiene un array
//        System.out.println(numbers.length);
//
//        System.out.println(numbers[numbers.length - 1]);
//        System.out.println(numbers[numbers.length - 2]);
        System.out.println(printArray(numbers));

//        for (int counter =0;counter<1000;++counter){
//            System.out.println(counter);
//
//        }

//        for (int arrayIndex =0;arrayIndex<numbers.length;++arrayIndex){
//            System.out.println(numbers[arrayIndex]);
//
//        }
        /*
        imprime el array alreves
         */

//        for (int arrayIndex =numbers.length-1; arrayIndex>=0; --arrayIndex){
//            System.out.println(numbers[arrayIndex]);

//        }

    }

    public static String printArray(int[] numbers) {

        String result = "";

        for (int position = 0; position < numbers.length; ++position) {
            result += numbers[position] + "\n";
        }
        return result;
    }


}
