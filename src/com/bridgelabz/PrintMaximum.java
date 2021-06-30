package com.bridgelabz;
public class PrintMaximum<E extends Comparable<E>> {
    E x,y,z;
    
    public PrintMaximum(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
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
     * calling printMaximum from toPrint method.
     */
    public void toPrint(){
        printMaximum(this.x,this.y,this.z);
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
     * calling toPrint method by using object and passing arguments accordingly.
     * @param args
     */
    public static void main(String[] args) {
        Integer firstNumber=1,secondNumber=2,thirdNumber=3;
        Float firstFloat=1.11f,secondFloat=2.2f,thirdFloat=3.3f;
        String firstString="linux",secondString="windows",thirdString="fedora";
        SampleClass<Integer> sampleClass = new SampleClass<Integer>(firstNumber,secondNumber,thirdNumber);
        sampleClass.toPrint();
        SampleClass<Float> sampleClass1 = new SampleClass<Float>(firstFloat,secondFloat,thirdFloat);
        sampleClass1.toPrint();
        SampleClass<String> sampleClass2 = new SampleClass<String>(firstString,secondString,thirdString);
        sampleClass2.toPrint();
    }
}
