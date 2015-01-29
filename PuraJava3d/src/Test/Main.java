/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Math.AMath;
import Math.Vector3;


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
        double math =0;
        double amath =0;
        double diff=0;
        
        int numTimesInvFaster = 0;
        int numtests = 1;
        for (int j = 0; j < numtests; j++) {
            for (int i = 0; i < 1000000; i++) {
                float rando = (float) Math.random() * 100000000f;

                Vector3 first = new Vector3(random(), random(), random());
                Vector3 second = new Vector3(random(), random(), random());

                long start = System.currentTimeMillis();
//            float a = 1/(float)Math.sqrt(rando);
                float a = angle(first, second);
                long end = System.currentTimeMillis();

                math += (end - start);

                start = System.currentTimeMillis();
//            float b = AMath.invSqrtf(rando);
                float b = first.getAngle(second);
                end = System.currentTimeMillis();

                amath += (end - start);

                diff += Math.abs(a - b);
            }
//            numTimesInvFaster += math > amath ? 1 : 0;
//            math = 0;
//            amath = 0;
            System.out.println("Test: "+j+" done");
        }
//        System.out.println("InvSqrt was faster: "+numTimesInvFaster+" out of "+numtests+" times");
        System.out.println("1/(float)Math.sqrt took: "+math+"ms");
        System.out.println("AMath.invSqrtf took: "+amath+"ms");
        System.out.println("Average diff: "+(diff/(1000000*numtests)));
        
        Vector3 no = new Vector3(1,0,0);
        double angle=0;
        for(float i=0; i<=Math.PI; i+= (Math.PI/180)){
            Vector3 yes = new Vector3((float)Math.cos(i),(float)Math.sin(i),0);
            System.out.println("Angle given: "+yes.getAngle(no)+" Actual angle: "+i);
        }
    }
}
