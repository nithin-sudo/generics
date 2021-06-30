package com.bridgelabz;
public class PrintMaximum {
    /**
     * creating three variables of type Integer and calling IntegerMaximum method.
     * @param args
     */
    public static void main(String[] args) {
        Integer firstNumber=1,secondNumber=2,thirdNumber=3;
        integerMaximum(firstNumber,secondNumber,thirdNumber);
    }
    /**
     *Finding maximum integer among three integers using compareTo method.
     * @param x
     * @param y
     * @param z
     * @return
     */
    private static int integerMaximum(Integer x,Integer y,Integer z)
    {
        int maximum = x;
        if(y.compareTo(maximum) > 0)
        {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        printMax(x,y,z,maximum);
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
}
