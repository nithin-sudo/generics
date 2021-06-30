package com.bridgelabz;
public class PrintMaximum{
    /**
     * using generic method to find the maximum values.
     * @param x
     * @param y
     * @param z
     * @param <E>
     * @return
     */
    public static <E extends Comparable> E printMaximum(E x,E y,E z) {
        E maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        printMax(x, y, z, maximum);
        return maximum;
    }
    /**
     *printing the maximum number using printMax generic method.
     * @param x
     * @param y
     * @param z
     * @param max
     * @param <E>
     */
    public static <E>void printMax(E x,E y,E z, E max) {
        System.out.println("Maximum of "+x+" ,"+y+" and "+z+"  is "+max);
    }
    /**
     * calling IntegerMaximum and floatMaximum and stringMaximum method to print the maximum value
     * @param args
     */
    public static void main(String[] args) {
        Integer firstNumber=1,secondNumber=2,thirdNumber=3;
        Float firstFloat=1.11f,secondFloat=2.2f,thirdFloat=3.3f;
        String firstString="linux",secondString="windows",thirdString="fedora";
        printMaximum(firstNumber,secondNumber,thirdNumber);
        printMaximum(firstFloat,secondFloat,thirdFloat);
        printMaximum(firstString,secondString,thirdString);
    }
}
