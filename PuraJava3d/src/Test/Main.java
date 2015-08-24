/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import SGDE.Math.AMath;
import SGDE.Math.Matrix;
import SGDE.Math.Vector3;


/**
 *
 * @author Nekel
 */
public class Main {
    
    public static float angle(Vector3 a, Vector3 b){
        return (float)Math.acos((a.dotProduct(b))/( (a.length()) * (b.length()) ));
    }
    
    public static float random(){
        float a = (float) Math.random() * 10000f;
        if(Math.random() > 0){
            a *= -1;
        }
        return a;
    }
    
    public static void main(String[] args ){
        
        double norm=0;
        double mine =0;
        for(int i=0; i<10000000; i++){
            double a = Math.random() * Double.MAX_VALUE;
            double b = Math.random() * Double.MAX_VALUE;
            
            double res=0;
            
            long start = System.nanoTime();
            res = Math.max(a, b);
            long end = System.nanoTime();
            
            norm += Math.abs(end-start);
            
            start = System.nanoTime();
            res = AMath.max(a, b);
            end = System.nanoTime();
            
            mine += Math.abs(end-start);
        }
        
        System.out.println("Normal max takes: "+(norm/10000000)+"ns");
        System.out.println("My max takes: "+(mine/10000000)+"ns");
        
//        double math =0;
//        double amath =0;
//        double diff=0;
//        
//        int numTimesInvFaster = 0;
//        int numtests = 1;
//        for (int j = 0; j < numtests; j++) {
//            for (int i = 0; i < 1000000; i++) {
//                float rando = (float) Math.random() * 100000000f;
//
//                Vector3 first = new Vector3(random(), random(), random());
//                Vector3 second = new Vector3(random(), random(), random());
//
//                long start = System.currentTimeMillis();
//            float a = (float)Math.tan(rando);
////                float a = angle(first, second);
//                long end = System.currentTimeMillis();
//
//                math += (end - start);
//
//                start = System.currentTimeMillis();
//            float b = (float)AMath.tan(rando);
////                float b = first.getAngle(second);
//                end = System.currentTimeMillis();
//
//                amath += (end - start);
//
//                diff += Math.abs(a - b);
//            }
////            numTimesInvFaster += math > amath ? 1 : 0;
////            math = 0;
////            amath = 0;
//            System.out.println("Test: "+j+" done");
//        }
////        System.out.println("InvSqrt was faster: "+numTimesInvFaster+" out of "+numtests+" times");
//        System.out.println("angle: "+math+"ms");
//        System.out.println("vector3.getAngle took: "+amath+"ms");
//        System.out.println("Average diff: "+(diff/(1000000*numtests)));
//        
////        Vector3 no = new Vector3(1,0,0);
////        double angle=0;
////        for(float i=0; i<=Math.PI; i+= (Math.PI/180)){
////            Vector3 yes = new Vector3((float)Math.cos(i),(float)Math.sin(i),0);
////            System.out.println("Angle given: "+yes.getAngle(no)+" Actual angle: "+i);
////        }
//        
//        
//        Matrix m = new Matrix(new float[][]{{2,0},{0,2}});
//        
//        double timetakenMat = 0.0f;
//        double timeTakenArr = 0.0f;
//        long matNumTimes = 100000L;
//        for(long i=0; i<matNumTimes; i++){
//            
//            int r = (int)Math.random()*100;
//            int c = (int)Math.random()*100;
//            
//            r+=1;
//            c+=1;
//            
//            float[][] a = new float[4][4];
//            float[][] b = new float[4][4];
//            
//            for(int k=0; k<4; k++){
//                for(int j=0; j<4; j++){
//                    a[k][j] = (float)Math.random()*10000;
//                    b[k][j] = (float)Math.random()*10000;
//                }
//            }
//            Matrix A = new Matrix(a);
//            Matrix B = new Matrix(b);
//            
//            Vector3 stuff = new Vector3((float)Math.random()*1000, (float)Math.random()*1000, (float)Math.random()*1000);
//            float[] vector = stuff.toArray4(1f);
//            
//            long start = System.nanoTime();
//            vector = A.vectorMult(vector);
//            long end = System.nanoTime();
//            
//            timetakenMat += end-start;
//            
//        }
//        System.out.println("Total Time Taken Mat: "+timetakenMat/(1e9));
//        System.out.println("Vector mat mult time: "+timetakenMat/matNumTimes);
//        
    }
}
