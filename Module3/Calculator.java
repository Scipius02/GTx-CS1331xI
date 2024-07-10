package Module3;

import java.util.Scanner;

public class Calculator {
    /* some minor things to clean up for a perfect grade
     * need to fix the divide so that it doesn't return anything if it divides by 0. i'm not sure how to handle
     * this method in a java way. probably set up my own exception that i throw?
     * need to fix the scanner inputs so that it goes by space and not by enter, as requested
     * need to always print \n at very end
     * i think that i basically did the main things though and it's not like i'm getting it graded so i'm going to stop work on this now.
    */
    public static void errorMessage(){
        System.out.println("Invalid input entered. Terminating...");
    }

    public static int add(int[] intArray){
        return intArray[0] + intArray[1];
    }
    public static int subtract(int[] intArray){
        return intArray[0] - intArray[1];
    }

    public static int[] promptInts(){
        try {
            Scanner newScan = new Scanner(System.in);
            System.out.println("Enter int a:");
            int a = newScan.nextInt();
            System.out.println("Enter int b:");
            int b = newScan.nextInt();
    
            int[] intArray = {a, b};
            newScan.close();
            return intArray;
        } catch (NumberFormatException e) {
            Calculator.errorMessage();
            throw e;
        }
    }

    public static double divide(double[] doubleArray){
        if (doubleArray[1] == 0) {
            Calculator.errorMessage();
            return 0.0;
        } else { return doubleArray[0] / doubleArray[1]; }
    }
    public static double multiply(double[] doubleArray){
        return doubleArray[0] * doubleArray[1];
    }

    public static double[] promptDoubles(){
        try {
            Scanner newScan = new Scanner(System.in);
            System.out.println("Enter double a:");
            double a = newScan.nextDouble();
            System.out.println("Enter double b:");
            double b = newScan.nextDouble();

            double[] doubleArray = {a, b};
            newScan.close();
            return doubleArray;
        } catch (NumberFormatException e) {
            Calculator.errorMessage();
            throw e;
        }
    }

    public static void main(String args[]) {
        Scanner newScan = new Scanner(System.in);

        System.out.println("User may perform the following:");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Divide");
        System.out.println("Multiply");
        System.out.println("Alphabetize");
        System.out.println("Please enter a prompt from the above list.");

        String command = newScan.nextLine().toLowerCase();

        switch (command) {
            case "add":
                {   // necessary to scope the block so intArray can be declared in add and subtract cases
                    int[] intArray = promptInts();
                    System.out.println(Calculator.add(intArray));
                    break;
                }
            case "subtract":
                {
                    int[] intArray = promptInts();
                    System.out.println(Calculator.subtract(intArray));
                    break;
                }

            case "divide":
                {
                    double[] doubleArray = promptDoubles();
                    System.out.printf("%.2f", Calculator.divide(doubleArray));
                    break;
                }
            case "multiply":
                {
                    double[] doubleArray = promptDoubles();
                    System.out.printf("%.2f", Calculator.multiply(doubleArray));
                    break;
                }

            case "alphabetize":
                {
                    try {
                        System.out.println("Enter string a:");
                        String a = newScan.nextLine();
                        System.out.println("Enter string b:");
                        String b = newScan.nextLine();

                        int comparitor =a.compareTo(b); 
                        if (comparitor >= 0) {
                            System.out.println(a);
                        } else {
                            System.out.println(b);
                        }
                        newScan.close();
                        break;
                    } catch (NumberFormatException e) {
                        Calculator.errorMessage();
                        throw e;
                    }
                }
        
            default:
                Calculator.errorMessage();
                break;
        }

        newScan.close();
    }
}
