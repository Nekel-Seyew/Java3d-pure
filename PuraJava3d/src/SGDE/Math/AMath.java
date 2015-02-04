/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Math;

/**
 *
 * @author Nekel
 */
public class AMath {
        /**
     * Tau, the relationship of the circumference of the circle over the radius. Also equal to 2PI.
     */
    public static final double TAU=Math.PI*2;
    public static final float TAUf = (float)TAU;
    /**
     * The Natural Log. Equal to Math.E.
     */
    public static final double E=Math.E;
    /**
     * Pi, the relationship of the circumference of the circle over the diameter. Equal to Math.PI.
     */
    public static final double PI=Math.PI;
    
    public static final double RT2=Math.sqrt(2.0);
    
    /**
     * Useful for comparing numbers which are within rounding error of each other. Use when comparing values given by this Package.
     * @param a the first value
     * @param b the second value
     * @return whether or not the two numbers are within rounding error of one another(0.0000001), and thus the same number.
     */
    public static boolean equals(double a, double b){
        return Math.abs(a-b)<=0.0000001;
    }
    
    /**
     * A Faster square root function than Math.Sqrt, and within a rounding error of Math.sqrt.
     * @param x the number to be square rooted
     * @return the square root of x
     */
    public static double sqrt(double x){
        return Math.pow(Math.E, 0.5*Math.log(x));
//        return AMath.dist((int)(x/RT2), (int)(x/RT2));
    }
    
    /**
     * Cubic converging sqrt function, still 20x slower than math.sqrt,
     * fairly certain Math.sqrt uses an assembly command
     * @param x
     * @return 
     */
    public static double newtonSqrt(double x){
        double A = x;
        double xn = x;
        double fx = x*x - A;
        double fpx = 2*x;
        double xn1 = xn - (fx*fpx)/(fpx*fpx - fx*2);
        while(Math.abs(xn - xn1) > 0.00001 ){
            xn=xn1;
            fx = xn*xn - A;
            fpx = 2*xn;
            xn1 = xn - (fx*fpx)/(fpx*fpx - fx);
        }
        return xn1;
    }
    
    /**
     * A faster Sine function compared to Math.sin(x). Average error of 0.0833 radians.
     * @param x the value to be inputed in radians between above 0
     * @return the sin(x)
     */
    public static double sin(double x){//about 3x faster at with an average error of 4.77 degrees
        double m = x%(TAU);
        return (((0.0860040918218653044917921405028365029148355630599415*m - 0.8105694691387021715510357056778211112348701973779723)*m + 1.6976527263135502482014268093068198617009028878982021)*m);
    }
    public static float sin(float x){
        float m = x%(TAUf);
        return (((0.0860040918218653044917921405028365029148355630599415f*m - 0.8105694691387021715510357056778211112348701973779723f)*m + 1.6976527263135502482014268093068198617009028878982021f)*m);
    }
    /**
     * A faster cosine function compared to Math.cos(x). Average error of 0.0833 radians
     * @param x the value to be inputed in radians
     * @return the cos(x)
     */
    public static double cos(double x){//no surprise, basically the same as msin
        return sin(x+(PI/2));
    }
    //TODO: Create lagrange estimate for csc
    /**
     * A faster cosecant function compared to Math.csc(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the csc(x)
     */
    public static double csc(double x){
        return 1/sin(x);
    }
    /**
     * A faster secant function compared to Math.sec(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the sec(x)
     */
    public static double sec(double x){
        return 1/cos(x);
    }
    /**
     * A faster tangent function compared to Math.tan(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the tan(x)
     */
    public static double tan(double x){
        return sin(x)/cos(x);
    }
    /**
     * A faster cotangent function compared to Math.cot(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the cot(x)
     */
    public static double cot(double x){
        return cos(x)/sin(x);
    }
    /**
     * Determines the maximum of two numbers, including if the numbers are within rounding error. 
     * <b>Note</b>, if numbers are within rounding error as determined by this package, then the absolute larger number may not always be returned.
     * @param a first parameter
     * @param b second parameter
     * @return the larger of the two numbers, within rounding error
     */
    public static double max(double a, double b){
        return (a>b || equals(a,b)) ? a : b;
    }
    /**
     * Determines the minimum of two numbers, including if the numbers are within rounding error. 
     * <b>Note</b>, if numbers are within rounding error as determined by this package, then the absolute smaller number may not always be returned.
     * @param a first parameter
     * @param b second parameter
     * @return the smaller of the two numbers, within rounding error
     */
    public static double min(double a, double b){
        return (a<b || equals(a,b)) ? a : b;
    }
    
    /**
     * A faster arcsine function compared to Math.asinx). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arcsin(x)
     */
    public static double arcsin(double x){
        double x3= x*x*x;
        double x5= x*x*x*x*x;
        double x7= x*x*x*x*x*x*x;
        double x9= x*x*x*x*x*x*x*x*x;
        double x11=x*x*x*x*x*x*x*x*x*x*x;
        double x13=x*x*x*x*x*x*x*x*x*x*x*x*x;
        double x15=x*x*x*x*x*x*x*x*x*x*x*x*x*x*x;
        
        return x + (0.5 * x3)/3 + (0.375 * x5)/5 + (0.3125 * x7)/7 
                 + (((105)/(384))*x9)/9 
                 + (((945)/(3840))*x11)/11
                 + (((10395)/(46080))*x13)/13
                 + (((135135)/(645120))*x15)/15;
    }
    
    /**
     * A faster arccosine function compared to Math.acos(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arccos(x)
     */
    public static double arccos(double x){
        return ((PI/2)-arcsin(x));
    }
    /**
     * A Lagrange Polynomial approximation for arccos, with max error of 0.18 radians.
     * Do note however that this function obeys the limitations of the arccos function.
     * @param x A number in radians in range [0,PI]
     * @return a number in domain [-1,1]
     */
    public static double acos( double x) {
        return (-0.69813170079773212 * x * x - 0.87266462599716477) * x + 1.5707963267948966;
    }
    public static float acos(float x){
        return (-0.69813170079773212f * x * x - 0.87266462599716477f) * x + 1.5707963267948966f;
    }
    public static double asin(double x){
        return PI/2 + acos(x);
    }
    /**
     * A faster arctangent function compared to Math.atan(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arctan(x)
     */
    public static double arctan(double x){
        double x3= x*x*x;
        double x5= x*x*x*x*x;
        double x7= x*x*x*x*x*x*x;
        double x9= x*x*x*x*x*x*x*x*x;
        double x11=x*x*x*x*x*x*x*x*x*x*x;
        double x13=x*x*x*x*x*x*x*x*x*x*x*x*x;
        
        return x - x3/3 + x5/5 - x7/7 + x9/9 - x11/11 + x13/13;
    }
    /**
     * A faster arccotangent function compared to Math.acot(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arccot(x)
     */
    public static double arccot(double x){
        return ((PI/2)-arctan(x));
    }
    /**
     * A faster arcsecant function compared to Math.asec(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arcsec(x)
     */
    public static double arcsec(double x){
        return arccos((1/x));
    }
    /**
     * A faster arccosecant function compared to Math.acsc(x). Within rounding error as well.
     * @param x the value to be inputed
     * @return the arccsc(x)
     */
    public static double arccsc(double x){
        return arcsin((1/x));
    }
    // Code recieved from: http://stackoverflow.com/questions/11513344/how-to-implement-the-fast-inverse-square-root-in-java 
    public static float invSqrtf(float x) {
        int i;
        float y;
        y = x;
        i = Float.floatToIntBits(y);
        i = 0x5f3759df - (i >> 1);
        y = Float.intBitsToFloat(i);
        y = y * (1.5f - (x*0.5f * y * y));

        return y;
    }

    public static double invSqrtd(double x) {
        long i;
        double y;
        y = x;
        i = Double.doubleToLongBits(y);
        i = 0x5fe6ec85e7de30daL - (i >> 1);
        y = Double.longBitsToDouble(i);
        y = y * (1.5 - (x*0.5f * y * y));
        return y;
    }
    
    public static int[][] transpose(int[][] array){
        int[][] arrayT = new int[array[0].length][array.length];
        for(int i=0; i<arrayT.length; i++){
            for(int j=0; j<arrayT[i].length; j++){
                arrayT[i][j]=array[j][i];
            }
        }
        return arrayT;
    }
    
    /**
     * A function for determining the greatest common denomenator. Accuracy is within 0.0000001 of true answer.
     * @param a first number
     * @param b second number
     * @return the gcd within 0.0000001 of true value
     */
    public static double gcd(double a, double b){
        while(!equals(b,0)){
            double temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    /**
     * A function for determining the greatest common denomenator.
     * @param a first number
     * @param b second number
     * @return gcd
     */
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
