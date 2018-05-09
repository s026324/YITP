import java.util.Scanner;



public class SebYITP {

    static int v;
    static int[] numbers;
    static Scanner input;

    public static void main (String[] args) {

        try {
        input = new Scanner(System.in);
        //double[] numbers =new double[n];

        System.out.print("Enter V:\n");

        v = input.nextInt();

         numbers = new int[v];

     }
     catch (Exception e) {
     }

            addToArray(numbers, v);

    }



    public static void addToArray(int[] arrayInts, int number){

try {
    if (v > 0 && v < 231) {
        // numbers = new double[skaiciai];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter N:");

            numbers[i] = input.nextInt();

            if (numbers[i] > 100000 || numbers[i] < 1) {
                System.out.println("Wrong variable");
            }

        }


    } else {
        input.close();
        System.out.println("Wrong variable");
        return;
    }
}
catch (NegativeArraySizeException e) {
    System.out.println("Can't input negative array size");

    }
    catch (Exception e ) {
        System.out.println("Can't enter letters");
}


        System.out.println(String.valueOf(findMaxLoss(numbers)));
    }


    private static int findMaxLoss(int[] numbers) {

        int maxLoss = 0, last = 0;

        for (int i = last + 1; i < numbers.length; i++) {
            int startPoint = numbers[i] - numbers[last];

            if (startPoint < 0 && startPoint < maxLoss) {
                maxLoss = startPoint;

            } else if (startPoint> 0) {
                last = i;
            }
        }

        return maxLoss;

    }

}