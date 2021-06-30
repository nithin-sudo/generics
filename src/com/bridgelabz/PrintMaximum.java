package com.bridgelabz;
public class PrintMaximum {
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
     * Finding maximum float value among three float using compareTo method.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static Float floatMaximum(Float x,Float y,Float z) {
        Float maximum = x;
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
     * Finding maximum String among three strings using compareTo method.
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static String stringMaximum(String x,String y,String z) {
        String maximum = x;
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
        integerMaximum(firstNumber,secondNumber,thirdNumber);
        floatMaximum(firstFloat,secondFloat,thirdFloat);
        stringMaximum(firstString,secondString,thirdString);
    }
}
