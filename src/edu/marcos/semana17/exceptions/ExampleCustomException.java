package edu.marcos.semana17.exceptions;

public class ExampleCustomException {
    public static void main(String[] args) throws DivisionException {
        int[] numerator = {4,5,8,10};
        int[] denominator = {2,4,0,2,8};
    try {
        for (int i = 0; i < denominator.length; i++) {
            if (numerator[i] %2 != 0) throw new DivisionException();
            int result = numerator[i] / denominator[i];
            System.out.println(result);
        }
    }catch (ArithmeticException e) {
        System.out.println("We catch a exception" + e.getMessage() + ", " +
                "\nCan't divide by zero");
    }


        System.out.println("Continue..");

    }
}
